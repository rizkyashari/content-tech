(ns app.generator.sbd.mcore
  (:require
    [app.generator.sbd.arit :refer :all]
    [app.utils :refer :all]))

(defn mcore-01
  []
  (->> (fn []
         (let [a (rand-nth (range -10 11))
               t (rand-nth [:arit :geo])
               br (rand-nth (range 2 7))]
           (condp = t
             :arit (let [[p q r s t u] (range a (+ a (* br 7)) br)]
                     (merge (zipmap [:p :q :r]
                                    [p q r])
                            {:pb (str s " , " t " , " u)
                             :p1 (str (dec s) " , " (dec t) " , " (dec u))
                             :p2 (str s " , " t " , " (inc u))
                             :p3 (str (inc s) " , " t " , " (inc u))
                             :p4 (str s " , " (inc t) " , " (inc u))}))
             :geo (let [[p q r s t u v w] (take 8 (iterate #(* br %) a))]
                    (merge (zipmap [:p :q :r]
                                   [p q r])
                           {:pb (str s " , " t " , " u)
                            :p1 (str t " , " u " , " v)
                            :p2 (str s " , " t " , " v)
                            :p3 (str s " , " u " , " w)
                            :p4 (str t " , " u " , " w)})))))
       (repeatedly 500)
       distinct))

(defn mcore-02
  []
  (->> (fn []
         (let [[p q] (rand-nth (map vector (range 21) (range 21)))
               opr {:+ + :- -}
               op (rand-nth [:+ :-])
               sequ (->> (iterate #(let [[a b] %] [b ((opr op) a b)]) [p q])
                         (take 12)
                         (map first))
               pb (vec (take 3 (drop 7 sequ)))]
           (merge {:bar7 (vec (take 7 sequ)) :pb pb}
                  (zipmap [:p1 :p2 :p3]
                          [(vec (take 3 (drop 8 sequ)))
                           (vec (take-last 3 sequ))
                           (vec (take 3 (drop 6 sequ)))]))))
       (repeatedly 100)
       distinct))

(defn mcore-03
  []
  (->> (for [a (range -10 10)
             b (range -10 10)
             :when (not= 0 a)]
         (let [f1 (fn [x] (+ (* a x) b))
               sequ (map f1 (range 1 12))
               pb (vec (take 3 (drop 5 sequ)))
               pil (zipmap [:p1 :p2 :p3]
                           (->> [(vec (take 3 (drop 6 sequ)))
                                 (vec (conj (drop 1 pb) (inc (pb 0))))
                                 (conj (vec (drop-last 1 pb)) (inc (pb 2)))]))]
           (merge {:bar5 (vec (take 5 sequ))
                   :pb   pb}
                  pil
                  {:check (distinct (conj (vals pil) pb))})))
       (remove #(< (count (:check %)) 4))
       shuffle))

(defn mcore-04
  []
  (->> (for [a (range -5 5)
             b (range -10 10)
             :when (not= 0 a)]
         (let [f1 (fn [x] (+ (* a x x) b))
               sequ (map f1 (range 1 12))
               pb (vec (take 3 (drop 5 sequ)))
               pil (zipmap [:p1 :p2 :p3]
                           (->> [(vec (take 3 (drop 6 sequ)))
                                 (vec (conj (drop 1 pb) (inc (pb 0))))
                                 (conj (vec (drop-last 1 pb)) (inc (pb 2)))]))]
           (merge {:bar5 (vec (take 5 sequ))
                   :pb   pb}
                  pil
                  {:check (distinct (conj (vals pil) pb))})))
       (remove #(< (count (:check %)) 4))
       shuffle))

(defn mcore-05
  []
  (->> (for [a (range 8 81)
             d [1 2 3]]
         (let [b (- a d)
               pb (* (+ a b) (- a b))
               [p1 p2 p3 :as ps]
               (->> [(* (+ a b 1) (- a b))
                     (* (+ a b) (- a b 1))
                     (* (+ a b 2) (- a b))]
                    (remove zero?)
                    shuffle)]
           {:a a :b b :pb pb :p1 p1 :p2 p2 :p3 p3 :check (set (conj ps pb))}))
       (remove #(< (count (:check %)) 4))
       shuffle))

(defn mcore-06
  []
  (->> (for [f [(fn [a b] (* a b 2))
                (fn [a b] (+ (* 2 a) b))
                (fn [a b] (+ (* a a) b))]
             p (range -5 7) q (range -10 11)
             :when (or (zero? p) (zero? q))]
         (let [[a1 a2 a3 a4 :as as] (shuffle (range (- p 4) (+ p 6)))
               [b1 b2 b3 b4 :as bs] (shuffle (range (- q 4) (+ q 6)))
               pb (f p q) pils (->> [(f p b1) (f p b2)
                                     (f a1 q) (f a2 q)
                                     (f a3 q) (f p b3)]
                                    shuffle
                                    (take 3))]
           (merge {:p p :q q :pb pb :check (count (set (conj pils pb)))
                   :ab1 (f a1 b1) :ab2 (f a2 b2) :ab3 (f a3 b3) :ab4 (f a4 b4)}
                  (zipmap [:a1 :a2 :a3 :a4] as)
                  (zipmap [:b1 :b2 :b3 :b4] bs)
                  (zipmap [:p1 :p2 :p3] pils))))
       (remove #(< (:check %) 4))
       shuffle))






















