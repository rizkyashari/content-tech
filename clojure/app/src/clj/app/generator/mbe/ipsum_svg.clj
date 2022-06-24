(ns app.generator.mbe.ipsum-svg
  (:require [app.generator.mbe.utils.venn :as venn]))

(defn contoh-venn-1
  []
  (->> (for [_ (range 25)]
         (let [dali-sample   (venn/test-render-soal-1)
               dali-reformat (venn/dali->xml-string dali-sample)
               sample        (venn/wrap-venn-soal dali-reformat)
               image         (:image sample)
               sets          (:sets sample)
               soal          "Apa isi himpunan dari $ %s $?\n"
               ops           [:union :intersection :difference]
               dit           (->> (keys sets) (shuffle) (take 2)
                                  ((fn [[a b]] [a (rand-nth ops) b])))
               str-dit       ((fn [[a op b]] (str (name a) " " (venn/venn-operation op) " " (name b))) dit)
               jawaban       ((fn [[a op b]]
                                (case op
                                  :union        (clojure.set/union (a sets) (b sets))
                                  :intersection (clojure.set/intersection (a sets) (b sets))
                                  :difference   (clojure.set/difference (a sets) (b sets)))) dit)]
           {:svg  image
            :soal (format soal str-dit)
            :pb   (venn/print-set jawaban)
            :p1   "Salah"}))))

(comment
  (venn/test-render-soal-1)
  {:venn-dali
   [:dali/page
    {:width 300, :height 250, :viewBox [0 0 300 250]}
    [:rect {:stroke :black, :fill "none"} [0.5 0.5] [299 249]]
    [:rect {:stroke :black, :fill "none"} [0.5 0.5] [35 40]]
    [:text
     {:x 10,
      :y 30,
      :font-family "Times New Roman",
      :font-size 24,
      :fill "black"}
     "S"]
    [:text
     {:id "venn104112.57312",
      :x 104,
      :y 112.573,
      :font-family "Times New Roman",
      :font-size 18}
     "•12"]
    [:text
     {:id "venn14392.57321",
      :x 143,
      :y 92.5732,
      :font-family "Times New Roman",
      :font-size 18}
     "•1"]
    [:text
     {:id "venn84179.5734",
      :x 84,
      :y 179.573,
      :font-family "Times New Roman",
      :font-size 18}
     "•4"]
    [:text
     {:id "venn96200.57314",
      :x 96,
      :y 200.573,
      :font-family "Times New Roman",
      :font-size 18}
     "•14"]
    [:text
     {:id "venn221217.57313",
      :x 221,
      :y 217.573,
      :font-family "Times New Roman",
      :font-size 18}
     "•13"]
    [:text
     {:id "venn192196.5735",
      :x 192,
      :y 196.573,
      :font-family "Times New Roman",
      :font-size 18}
     "•5"]
    [:text
     {:id "venn16858.57322",
      :x 168,
      :y 58.5732,
      :font-family "Times New Roman",
      :font-size 18}
     "•2"]
    [:text
     {:id "venn196106.5737",
      :x 196,
      :y 106.573,
      :font-family "Times New Roman",
      :font-size 18}
     "•7"]
    [:ellipse
     {:id "venn37.7243.54A",
      :transform "rotate(41.830000, 111.895003, 137.434997)",
      :cx 111.89500305175781,
      :cy 137.4349966430664,
      :rx 74.175,
      :ry 93.895,
      :stroke "black",
      :fill "none"}]
    [:text
     {:id "venn4576.0977A",
      :x 45,
      :y 76.0977,
      :font-family "Times New Roman",
      :font-size 24}
     "A"]
    [:ellipse
     {:id "venn72158C",
      :transform "rotate(-0.000000, 104.000000, 188.000000)",
      :cx 104.0,
      :cy 188.0,
      :rx 32.0,
      :ry 30.0,
      :stroke "black",
      :fill "none"}]
    [:text
     {:id "venn51193.098C",
      :x 51,
      :y 193.098,
      :font-family "Times New Roman",
      :font-size 24}
     "C"]
    [:ellipse
     {:id "venn179.1162.34D",
      :transform "rotate(172.130000, 227.695001, 195.630001)",
      :cx 227.69500122070312,
      :cy 195.63000091552735,
      :rx 48.595,
      :ry 33.29,
      :stroke "black",
      :fill "none"}]
    [:text
     {:id "venn166229.098D",
      :x 166,
      :y 229.098,
      :font-family "Times New Roman",
      :font-size 24}
     "D"]],
   :items
   {:A {12 [104 112.573], 1 [143 92.5732]},
    :C {4 [84 179.573], 14 [96 200.573]},
    :D {13 [221 217.573], 5 [192 196.573]},
    :S {2 [168 58.5732], 7 [196 106.573]}}})
