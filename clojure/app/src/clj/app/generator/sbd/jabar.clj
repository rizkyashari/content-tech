(ns app.generator.sbd.jabar
  (:require
    [clojure.set :as cset]
    [app.generator.sbd.libs :refer :all]
    [app.generator.sbd.arit :refer :all]
    [app.utils :refer :all]))

(defn jabar-01
  []
  (->> (for [a (range 10 30)
             d (range 5 10)]
         (let [p (/ 1 d)]
           {:a  a :p p :pb (str "x > " a)
            :p1 (str "1 < x <= " a)
            :p2 (str "0 < x <= 1")}))
       shuffle))

(defn jabar-02
  []
  (->> (for [a (range 10 30)
             d (range 5 10)]
         (let [p (/ 1 d)]
           {:a  a :p p :p1 (str "x > " a)
            :p2 (str "1 < x <= " a)
            :pb (str "0 < x <= 1")}))
       shuffle))

(defn jabar-03
  []
  (->> (fn []
         (let [ggs (rand-nth [:odd :even])
               lim (rand-nth (range 100 1000 100))
               a (rand-nth (range 5 30 2))]
           (condp = ggs
             :odd (let [b (->> (range (quot (+ lim 100) a) (quot (+ lim 200) a))
                               (drop-while even?)
                               first)
                        pils (->> (concat (->> (range 10 40 2)
                                               (map #(* % a))
                                               (drop-while #(< % lim))
                                               (take 3))
                                          (->> (range 11 40 2)
                                               reverse
                                               (map #(* % a))
                                               (drop-while #(> % lim))
                                               (take 3)))
                                  (map #(quot % a))
                                  shuffle
                                  (map #(do [a %]))
                                  (take 3))]
                    (merge {:pb    [a b] :gg "ganjil" :lim lim
                            :check (count (set (conj pils [a b])))}
                           (zipmap [:p1 :p2 :p3] pils)))
             :even (let [b (->> (range (quot (+ lim 100) a) (quot (+ lim 200) a))
                                (drop-while odd?)
                                first)
                         pils (->> (concat (->> (range 11 40 2)
                                                (map #(* % a))
                                                (drop-while #(< % lim))
                                                (take 3))
                                           (->> (range 10 40 2)
                                                reverse
                                                (map #(* % a))
                                                (drop-while #(> % lim))
                                                (take 3)))
                                   (map #(quot % a))
                                   shuffle
                                   (map #(do [a %]))
                                   (take 3))]
                     (merge {:pb    [a b] :gg "genap" :lim lim
                             :check (count (set (conj pils [a b])))}
                            (zipmap [:p1 :p2 :p3] pils))))))
       (repeatedly 300)
       (remove #(< (:check %) 4))
       distinct))

(defn jabar-04
  []
  (->> (for [p (range -9 9)
             q (range -9 9)
             :when (not= p (- q))]
         (let [b (- (+ p q)) c (* p q)
               mb (Math/abs b) sb (if (neg? b) "-" "+")
               mc (Math/abs c) sc (if (neg? c) "-" "+")
               [p1 p2 p3] (->> [[(- p) q]
                                [p (- q)]
                                [(- p) (- q)]
                                [(- p 1) (inc q)]
                                [(inc p) (dec q)]
                                [(inc p) (- q)]
                                [(- p) (inc q)]]
                               shuffle
                               (remove #(= % [p q]))
                               (take 3))]
           {:pb [p q] :p1 p1 :p2 p2 :p3 p3
            :mb (if (= 1 mb) "" mb) :mc mc
            :sb sb :sc sc :b b :c c}))
       shuffle))

(defn jabar-05
  []
  (->> (fn []
         (let [x1 (rand-nth (range -10 10))
               y1 (rand-nth (range -10 10))
               x2 (rand-nth (range -10 10))
               y2 (rand-nth (range -10 10))]
           (when (and (not= y1 y2) (not= x1 x2))
             (let [pils [(/ (- y2 y1) (- x1 x2))
                         (/ (- x1 x2) (- y1 y2))
                         (/ (- x1 x2) (- y2 y1))]
                   pb (/ (- y1 y2) (- x1 x2))]
               (merge {:x1 x1 :x2 x2 :y1 y1 :y2 y2 :pb pb}
                      (zipmap [:p1 :p2 :p3] pils)
                      {:check (count (set (conj pils pb)))})))))
       (repeatedly 300)
       (keep identity)
       (remove #(< (:check %) 4))))

(defn jabar-06
  []
  (->> (fn []
         (let [mrel (rand-nth ["sejajar" "tegak lurus"])
               x1 (rand-nth (range -10 10))
               y1 (rand-nth (range -10 10))
               x2 (rand-nth (range -10 10))
               y2 (rand-nth (range -10 10))]
           (condp = mrel
             "sejajar"
             (when (and (not= y1 y2) (not= x1 x2))
               (let [mb (/ (- y1 y2) (- x1 x2))
                     [m1 m2 m3] [(/ (- y2 y1) (- x1 x2))
                                 (/ (- x1 x2) (- y1 y2))
                                 (/ (- x1 x2) (- y2 y1))]]
                 (merge {:x1 x1 :x2 x2 :y1 y1 :y2 y2 :mrel mrel :mrol "sama"
                         :pb (str "y = " mb "x" "+" (rand-nth (range 1 10)))
                         :p1 (str "y = " m1 "x" "+" (rand-nth (range 1 10)))
                         :p2 (str "y = " m2 "x" "+" (rand-nth (range 1 10)))
                         :p3 (str "y = " m3 "x" "+" (rand-nth (range 1 10)))}
                        {:check [mb m1 m2 m3]})))
             "tegak lurus"
             (when (and (not= y1 y2) (not= x1 x2))
               (let [mb (- (/ (- x1 x2) (- y1 y2)))
                     [m1 m2 m3] [(/ (- y2 y1) (- x1 x2))
                                 (/ (- y1 y2) (- x1 x2))
                                 (/ (- x1 x2) (- y2 y1))]]
                 (merge {:x1 x1 :x2 x2 :y1 y1 :y2 y2 :mrel mrel :mrol "dikali jadi -1"
                         :pb (str "y = " mb "x" "+" (rand-nth (range 1 10)))
                         :p1 (str "y = " m1 "x" "+" (rand-nth (range 1 10)))
                         :p2 (str "y = " m2 "x" "+" (rand-nth (range 1 10)))
                         :p3 (str "y = " m3 "x" "+" (rand-nth (range 1 10)))}
                        {:check [mb m1 m2 m3]}))))))
       (repeatedly 300)
       (keep identity)
       (remove #(< (count (distinct (:check %))) 4))))

(defn jabar-07
  []
  (->> (fn []
         (let [ops (rand-nth ["+" "-"])
               la (rand-nth (range 2 5))
               lb (rand-nth (range 2 5))
               koef (range -10 10)
               pangkat (range 0 7)
               ka (take la (shuffle koef))
               pa (take la (shuffle pangkat))
               kb (take lb (shuffle koef))
               pb (take lb (shuffle pangkat))
               ca (mapv #(do [%1 %2 "x"]) ka pa)
               cb (mapv #(do [%1 %2 "x"]) kb pb)
               gca (->> [(update-in ca [0 1] dec)
                         (update-in ca [0 1] inc)
                         (update-in ca [1 1] dec)
                         (update-in ca [1 1] inc)]
                        shuffle)
               gcb (->> [(update-in cb [0 1] dec)
                         (update-in cb [0 1] inc)
                         (update-in cb [1 1] dec)
                         (update-in cb [1 1] inc)]
                        shuffle)]
           (merge {:a (presp ca) :b (presp cb) :op ops}
                  (condp = ops
                    "+" {:pb (presp (p+ ca cb))
                         :p1 (presp (p+ (gca 1) cb))
                         :p2 (presp (p+ (gca 2) cb))
                         :p3 (presp (p+ ca (gcb 1)))
                         :p4 (presp (p+ ca (gcb 2)))}
                    "-" {:pb (presp (p- ca cb))
                         :p1 (presp (p- (gca 1) cb))
                         :p2 (presp (p- (gca 2) cb))
                         :p3 (presp (p- ca (gcb 1)))
                         :p4 (presp (p- ca (gcb 2)))}))))
       (repeatedly 400)
       distinct))



