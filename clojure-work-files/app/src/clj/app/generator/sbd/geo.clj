(ns app.generator.sbd.geo)

(defn geo-01
  []
  (->> (for [n (range 6 20)
             m (range 2 (- n 2))]
         (let [ct (inc (- n m))
               sqr #(* % %)
               pils (->> (range (- ct 2) (+ ct 4))
                         (remove #(= ct %))
                         (map sqr)
                         shuffle
                         (take 3))]
           (merge {:n n :m m :pb (sqr ct)
                   :check (count (set (conj pils (sqr ct))))}
                  (zipmap [:p1 :p2 :p3] pils))))
       (remove #(< (:check %) 4))
       shuffle))

