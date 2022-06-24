(ns app.generator.mbe.utils.venn
  (:require [dali.io :as io]
            [dali
             [layout :as layout]
             [syntax :as syntax]]))

(def venn-template
  [:dali/page {:width 300 :height 250 :viewBox [0 0 300 250]}
   [:rect
    {:stroke :black :fill "none"}
    [0.5 0.5] [299 249]]
   [:rect
    {:stroke :black :fill "none"}
    [0.5 0.5] [35 40]]
   [:text
    {:x 10 :y 30 :font-family "Times New Roman" :font-size 24 :fill "black"}
    "S"]])

;; preview template
(comment
  (io/render-svg venn-template "src/clj/app/generator/mbe/ipsum-venn.svg")
  )

(defn print-set
  [set]
  (str "$ \\{" (->> set (seq) (interpose ",") (apply str)) "\\} $"))

(defn venn-operation
  [op]
  (case op
    :union "\\cup"
    :intersection "\\cap"
    :difference "-"))

(def soal-venn-1 {:items {:E #{[143 92.5732]
                               [111 85.5732]
                               [141 118.573]
                               [104 112.573]}
                          :A #{[46 153.573]
                               [59 102.573]
                               [62 129.573]
                               [86 153.573]
                               [137 174.573]}
                          :D #{[230 191.573]
                               [192 196.573]
                               [221 217.573]}
                          :B #{[168 58.5732]
                               [204 66.5732]
                               [229 85.5732]
                               [196 106.573]
                               [229 127.573]}
                          :C #{[96 200.573]
                               [84 179.573]}
                          :S #{[44 238.573]
                               [21 217.573]
                               [254 22.5732]
                               [266 44.5732]}}
                  :scope {:A #{:A :C :E :AB}
                          :B #{:B :E :AB}
                          :C #{:C}
                          :E #{:E}
                          :D #{:D}
                          :S #{:S :A :B :C :D :E}}
                  :shapes {:A [[37.72 43.54] [148.35 187.79] :rotate -41.83 :label [45 76.0977]]
                           :D [[179.1 162.34] [97.19 66.58] :rotate -172.13 :label [166 229.098]]
                           :E [[92 56] [88 81] :label [117 49.0977]]
                           :C [[72 158] [64 60] :label [51 193.098]]
                           :B [[84 35] [192 123] :label [166 28.0977]]}
                  :pattern [[:A :B]
                            [:A :D]
                            [:E :C :D]
                            [:A :B :C]
                            [:B :C]
                            [:A :C :D]
                            [:A :B :C :D]]})

(defn get-distinct-set
  [sets scopes]
  (let [temp (select-keys scopes sets)
        sample (assoc temp :S (reduce clojure.set/difference (:S scopes) (vals temp)))
        merge_keyword (fn [a b]
                        (->> (str (name a) (name b))
                             (seq)
                             (distinct)
                             (sort)
                             (reduce str)
                             (keyword)))
        check (fn [sets scopes]
                (->> (for [a sets
                           b sets
                           :let [set_a (a scopes)
                                 set_b (b scopes)
                                 intersect (clojure.set/intersection set_a set_b)]
                           :when (and (> 1 (compare (name a) (name b)))
                                      (seq intersect)
                                      (not (clojure.set/subset? set_a set_b)))]
                       (cond
                         (clojure.set/superset? set_a set_b) [:delete [a set_b]]
                         (seq intersect) [:add [(merge_keyword a b) intersect]
                                          :delete [a intersect]
                                          :delete [b intersect]]))
                     (flatten)))
        separate (fn [lst scopes]
                   (loop [[command key set & args] lst
                          result scopes]
                     (case command
                       nil result
                       :add (recur args (assoc result key set))
                       :delete (recur args (update-in result [key] clojure.set/difference set)))))
        iter (fn iter [scopes]
               (let [intersect (check (keys scopes) scopes)]
                 (cond
                   (empty? intersect) scopes
                   :else (iter (separate intersect scopes)))))]
    (iter sample)))

(defn get-set-of-numbers
  [items scopes]
  (->> (reduce (fn [res key] (assoc res key (set (keys (key res))))) items (keys items))
       ((fn [sets]
          (reduce (fn [res key]
                    (assoc res key
                           (reduce (fn [s_res scope]
                                     (clojure.set/union s_res (scope res)))
                                   (key res)
                                   (key scopes))))
                  sets
                  (keys sets))))))

(defn create-text
  [[x y] text & {:keys [size type]
                 :or   {size 18}}]
  (let [id   (str "venn" x y text)
        text (case type
               :item (str "•" text)
               (str text))]
    [:text
     {:id          id
      :x           x
      :y           y
      :font-family "Times New Roman"
      :font-size   size}
     text]))

(defn create-ellipse
  [[x y] [width height] & {:keys [rotate label text]
                           :or   {rotate 0.0}}]
  (let [id     (str "venn" x y text)
        rx     (float (/ width 2))
        ry     (float (/ height 2))
        cx     (+ x rx)
        cy     (+ y ry)
        rotate (format "rotate(%f, %f, %f)" (* -1 rotate) cx cy)]
    [[:ellipse {:id        id
                :transform rotate
                :cx        cx
                :cy        cy
                :rx        rx
                :ry        ry
                :stroke    "black"
                :fill      "none"}]
     (create-text label text :size 24)]))

(defn flatten-items 
  [items] 
  (->> (vals items)
       (seq)
       (reduce concat)))

(defn dali->xml-string [{:keys [venn-dali items]}]
  {:venn-dali (->> venn-dali
                   syntax/dali->ixml
                   layout/resolve-layout
                   syntax/ixml->xml
                   io/xml->svg-document-string)
   :items items})

(defn wrap-venn-soal [{:keys [venn-dali items]}]
  (hash-map :image venn-dali,
            :sets (get-set-of-numbers items (:scope soal-venn-1))))

(defn test-render-soal-1
  []
  (let [pattern (rand-nth (:pattern soal-venn-1))
        sets    (get-distinct-set pattern (:scope soal-venn-1))
        items   ((fn []
                   (let [set-to-items (reduce (fn [res key]
                                                (update-in res [key]
                                                           (fn [x]
                                                             (->> (map #(get-in soal-venn-1 [:items %]) (seq x))
                                                                  (reduce clojure.set/union)
                                                                  (seq)
                                                                  (shuffle)
                                                                  (take 2)))))
                                              sets
                                              (keys sets))
                         numbers      (->> (vals set-to-items) (flatten) (count) (#(take % (range 1 (inc %)))) (shuffle))
                         num-to-items (fn [items nums]
                                        (->> (reduce
                                              (fn [[res nums] key]
                                                (let [k_items   (key res)
                                                      new_items (zipmap nums k_items)]
                                                  [(assoc res key new_items) (subvec nums (count k_items))]))
                                              [items nums]
                                              (keys items))
                                             (first)))]
                     (num-to-items set-to-items numbers))))
        shapes  (for [[id props] (reduce (fn [res id] (conj res [id (get-in soal-venn-1 [:shapes id])])) [] pattern)]
                  (concat props [:text (name id)]))
        res     (-> venn-template
                    ;;  generate items
                    (into (map (fn [[text pos]]
                                 (create-text pos text :type :item))
                               (flatten-items items)))
                    ;;  generate ellipse and label
                    ((fn [venn]
                       (reduce (fn [res props]
                                 (into res (apply create-ellipse props)))
                               venn
                               shapes))))]
    {:venn-dali res
     :items     items}))

;; preview venn
(comment
  (spit "src/clj/app/generator/mbe/ipsum-venn.svg" (:image (test-render-soal-1)))
  (test-render-soal-1))


