(ns app.generator.sbd.arit
  (:require [clojure.set :as cset]))

(defn parti
  [num]
  (->> (str num)
       (into [])
       reverse
       (partition-all 3)
       (map #(apply str (reverse %)))
       (interpose ".")
       reverse
       (apply str)))

(defn rand+
  [x]
  (let [choices (->> (range (- x 3) (+ x 3))
                     (remove #(= x %))
                     shuffle
                     (take 4))]
    (zipmap [:p1 :p2 :p3 :p4] choices)))

(defn rand*
  [a b]
  (let [choices (->> (range (- a 2) (+ a 2))
                     (map #(* % b))
                     (concat (range (- (* a b) 3) (+ (* a b) 3)))
                     (remove #(= (* a b) %))
                     shuffle
                     distinct
                     (take 4))]
    (zipmap [:p1 :p2 :p3 :p4] choices)))

(defn arit-01
  []
  (->> (for [b (range 10 50)
             a (range (+ b 2) 50)
             blank [:a :b :c]]
         (let [ab a bb b cb (+ a b)
               mapi {:ab ab :bb bb :cb cb :a a :b b :c cb}]
           (condp = blank
             :a (merge mapi {:a "___" :pb a} (rand+ a))
             :b (merge mapi {:b "___" :pb b} (rand+ b))
             :c (merge mapi {:c "___" :pb cb} (rand+ cb)))))
       (shuffle)
       (take 100)))

(defn arit-02
  []
  (->> (for [a (range 2 20)
             b (range 1 10)]
         (let [pb (+ a b)]
           (merge {:a a :b b :pb pb}
                  (rand+ pb))))
       shuffle))

(defn arit-03
  []
  (->> (for [a (range 5 20)
             b (take-while #(< % 10) (range 1 a))]
         (let [pb (- a b)]
           (merge {:a a :b b :pb pb}
                  (rand+ pb))))
       shuffle))

(defn arit-04
  []
  (->> (for [a (range 2 10)
             b (range 2 10)]
         (let [pb (* a b)]
           (merge {:a a :b b :pb pb}
                  (rand* a b))))
       shuffle))

(defn arit-05
  []
  (->> (for [a (range 2 10)
             b (range 13 25)]
         (let [pb (- b a)]
           (merge {:a a :b b :pb pb}
                  (rand+ pb))))
       shuffle))

(defn arit-06
  []
  (->> (for [a (range 2 10)
             b (range 13 25)]
         (let [pb (- b a)]
           (merge {:a a :b b :pb pb}
                  (rand+ pb))))
       shuffle))

(defn arit-07
  []
  (->> (fn []
         (let [a (rand-nth (range 20 80))
               b (rand-nth (range 210 290))]
           (merge {:a a :b b :pb (* a b) :pbmod (mod (* a b) 10)}
                  (let [ab (* a b)
                        p (range (- ab 3) (+ 4 ab))]
                    (zipmap [:p1 :p2 :p3] (->> (remove #{ab} p)
                                               (take 3)))))))
       (repeatedly 100)))

(defn arit-08
  []
  (->> (for [a (range 30 60)
             b (range 4 10)]
         (let [divab (quot a b)
               modab (rem a b)]
           {:a  a :b b :pab [divab modab]
            :p1 [(inc divab) modab]
            :p2 [divab (inc modab)]
            :p3 [(dec divab) modab]}))
       shuffle))

(defn arit-09
  []
  (->> (for [a (range 3 15)]
         (let [res (map #(* % a) (range 3 9))]
           (merge {:a a :pb (seq (shuffle res))}
                  {:p1 (conj (rest (shuffle res)) (- (* a 6) 2))
                   :p2 (conj (rest (shuffle res)) (- (* a 4) 2))
                   :p3 (conj (rest (shuffle res)) (- (* a 7) 2))})))
       shuffle))

(defn perpecah
  [rat]
  (if (int? rat)
    (str rat " %")
    (let [a (numerator rat)
          b (denominator rat)]
      (str (quot a b) " " (rem a b) "/" b " %"))))

(defn arit-10
  []
  (->> (for [a (range 4 15)
             b (range 2 8)]
         (let [s (rand-nth (range 1 a))
               ab (* a b)]
           (merge {:a (+ ab s) :b a :pb (str b " " (/ s a))}
                  (zipmap [:p1 :p2 :p3]
                          (->> [(str (inc b) " " (/ s a))
                                (str (dec b) " " (/ s a))
                                (str b " " (/ (inc s) a))
                                (str b " " (/ (dec s) a))]
                               shuffle
                               (take 3))))))
       shuffle))

(defn arit-11
  []
  (->> (for [m (range 2 10)
             n (range 1 m)]
         (let [a (/ n m)
               pn (* 100 n)]
           (merge {:a a :pb (perpecah (/ pn m))}
                  (zipmap [:p1 :p2 :p3]
                          (->> [(perpecah (/ (* 100 (inc n)) m))
                                (perpecah (/ pn (inc m)))
                                (perpecah (/ pn (dec m)))
                                (perpecah (/ (* 100 (dec n)) m))
                                (perpecah (/ (* (inc n) 100) (inc m)))
                                (perpecah (/ (* (dec n) 100) (dec m)))]
                               (remove #{"0 %"})
                               shuffle
                               (take 3))))))
       shuffle))

(defn arit-12
  []
  (->> (for [a (range 10 60 10)
             b (range 30 300 20)]
         (let [ab (* a b)]
           (merge {:a a :b b :pb (parti ab)}
                  (zipmap [:p1 :p2 :p3]
                          (->> [(parti (* (+ 10 a) b))
                                (parti (quot ab 10))
                                (parti (* 10 ab))
                                (parti (* a (+ 10 b)))]
                               shuffle
                               (take 3))))))
       shuffle))

(defn bilbul?
  [num]
  (zero? (rem num 1)))

(defn decper
  "Convert decimals into percentage string"
  [num]
  (if (bilbul? num)
    (str num "%")
    (let [a (str (/ num 1.0))]
      (if (< (count a) 5)
        (str (subs a 0 4) "%")
        (str (subs a 0 5) "%")))))

(defn arit-13
  []
  (->> (for [m (range 2 10)
             n (range 1 m)]
         (let [a (/ n m)
               pn (* 100 n)]
           (merge {:a a :pb (decper (/ pn m))}
                  (zipmap [:p1 :p2 :p3]
                          (->> [(decper (/ (* 100 (inc n)) m))
                                (decper (/ pn (inc m)))
                                (decper (/ pn (dec m)))
                                (decper (/ (* 100 (dec n)) m))
                                (decper (/ (* (inc n) 100) (inc m)))
                                (decper (/ (* (dec n) 100) (dec m)))]
                               (remove #{"0 %"})
                               shuffle
                               (take 3))))))
       shuffle))

(defn arit-14
  []
  (->> (for [a (range 100 600 100)
             b (range 300 3000 100)]
         (let [ab (* a b)]
           (merge {:a a :b b :pb (parti ab)}
                  (zipmap [:p1 :p2 :p3]
                          (->> [(parti (* (+ 10 a) b))
                                (parti (quot ab 10))
                                (parti (* 10 ab))
                                (parti (* a (+ 10 b)))]
                               shuffle
                               (take 3))))))
       shuffle))

(defn arit-15
  []
  (->> (for [a (range 4 60 4)
             b [5 15 25]]
         (let [ab (* a b)]
           (merge {:a a :b b :pb ab}
                  (zipmap [:p1 :p2 :p3]
                          (->> [(* b (+ a 2))
                                (* b (+ a 4))
                                (* b (- a 4))
                                (* b (- a 2))
                                (* (+ 10 b) a)]
                               (remove zero?)
                               shuffle
                               (take 3))))))
       shuffle))

(defn arit-16
  []
  (->> (for [a (range 3 15)
             b (range 2 20)]
         (let [ab (* a b)]
           (merge {:ab ab :b b :pb a}
                  (zipmap [:p1 :p2 :p3]
                          (->> (conj (range (- a 2) (+ a 4)) (inc (* 10 (dec a))))
                               (remove #(or (zero? %) (= a %))))))))
       shuffle))

(defn arit-17
  []
  (->> (for [m (range 2 9) p (range 3 9)
             n (range 1 m) q (range 1 p)]
         (let [a (/ n m) b (/ q p)
               pb (+ a b) pils (->> [(/ (+ n q) (+ m p))
                                     (/ (* n q) (+ m p))
                                     (/ (+ (* m n) (* p q)))
                                     (/ (+ (* n p) q) (* m p))
                                     (/ (+ (* n p) (* q (inc n)))
                                        (* m p))]
                                    shuffle
                                    (take 3))]
           (merge {:a a :b b :pb pb}
                  (zipmap [:p1 :p2 :p3] pils)
                  {:check (count (set (conj pils pb)))})))
       (remove #(< (:check %) 4))
       shuffle
       (take 300)))

(defn arit-18
  []
  (->> (for [m (range 2 9) p (range 3 9)
             n (range 1 m) q (range 1 p)
             :when (not= m p)]
         (let [a (/ n m) b (/ q p)
               pb (- a b) pils (->> [(/ (- n q) (- m p))
                                     (/ (* n q) (+ m p))
                                     (/ (+ (* m n) (* p q)))
                                     (/ (- (* n p) q) (* m p))
                                     (/ (- (* n p) (* q (inc n)))
                                        (* m p))]
                                    shuffle
                                    (take 3))]
           (merge {:a a :b b :pb pb}
                  (zipmap [:p1 :p2 :p3] pils)
                  {:check (count (set (conj pils pb)))})))
       (filter #(> (:a %) (:b %)))
       (remove #(< (:check %) 4))
       shuffle
       (take 300)))

(defn arit-19
  []
  (->> (for [m (range 2 8) p (range 3 9)
             n (range 1 m) q (range 1 p)]
         (let [a (/ n m) b (/ q p)]
           (merge {:a a :b b :pb (* a b)}
                  (zipmap [:p1 :p2 :p3]
                          (->> [(/ (* n q) (+ m p))
                                (/ (* (inc n) q) (* m p))
                                (/ (* n q) (* (inc m) p))
                                (/ (* m q) (* n p))]
                               shuffle
                               (take 3))))))
       shuffle
       (take 200)))

(defn norm
  [num]
  (if (bilbul? num)
    (int num)
    (rationalize num)))

(defn arit-20
  []
  (->> (for [m (range 2 8) p (range 3 9)
             n (range 1 m) q (range 1 p)]
         (let [a (/ n m) b (/ q p)
               pb (norm (/ a b))
               pils (mapv norm [(/ b a) (/ (/ m n) (/ q p)) (* a b)])]
           (merge {:a a :b b :pb pb :check (count (set (conj pils pb)))}
                  (zipmap [:p1 :p2 :p3] pils))))
       (remove #(< (:check %) 4))
       shuffle))

(comment )

(defn campur
  [rat]
  (if (int? rat)
    rat
    (if (< rat 1)
      rat
      (let [a (numerator rat)
            b (denominator rat)]
        (str (quot a b) " " (rem a b) "/" b)))))

(defn arit-21
  []
  (->> (for [a (range 2 10)
             q (range 2 8)
             p (range 1 q)]
         (let [b (norm (/ p q))]
           (merge {:a a :b b :pb (campur (norm (* a b)))}
                  (zipmap [:p1 :p2 :p3 :p4]
                          (->> [(campur (norm (/ a b)))
                                (campur (norm (/ b a)))
                                (campur (norm (* (inc a) b)))
                                (campur (norm (* a (+ 1 b))))
                                (campur (norm (* a (+ b (/ 1 q)))))
                                (campur (norm (* a (- b (/ 1 q)))))]
                               (remove #(= % "0"))
                               shuffle
                               (take 4))))))
       shuffle
       (take 200)))

(defn arit-22
  []
  (->> (for [a (range 10 100) b (range 10 100) ops ["+" "-"]]
         (condp = ops
           "+" (let [op +]
                 (merge {:a a :b b :op ops :pb (op a b)}
                        (zipmap [:p1 :p2 :p3 :p4]
                                (->> [(+ 4 a b)
                                      (+ 2 a b)
                                      (- (op a b) 2)
                                      (- (op a b) 4)
                                      (- (op a b) 10)
                                      (op a b 10)]
                                     shuffle
                                     (take 4)))))
           "-" (let [op -]
                 (merge {:a a :b b :op ops :pb (op a b)}
                        (zipmap [:p1 :p2 :p3 :p4]
                                (->> [(+ 4 a b)
                                      (+ 2 a b)
                                      (- (op a b) 2)
                                      (- (op a b) 4)
                                      (+ (op a b) 10)
                                      (op a b 10)]
                                     shuffle
                                     (take 4)))))))
       shuffle
       (take 500)))

(defn arit-23
  []
  (->> (for [b [5 15 25 50 75]
             plier (range 10 30)]
         (let [ab (* b plier)]
           (merge {:ab ab :b b :pb plier}
                  (zipmap [:p1 :p2 :p3]
                          (->> [(inc plier)
                                (dec plier)
                                (+ plier 2)
                                (- plier 2)]
                               shuffle
                               (take 3))))))
       shuffle))

(defn arit-24
  []
  (->> (fn [] (let [pb (rand-nth (range 10 21))
                    b (rand-nth [(dec pb) pb (inc pb)])]
                (condp = b
                  (dec pb)
                  (let [d (rand-nth (range -6 0))]
                    (merge {:a (+ pb d) :b b :c (+ pb 1 (- d)) :pb pb}
                           (zipmap [:p1 :p2]
                                   (shuffle [(- pb 2) b (inc pb) (+ pb 2)]))))
                  pb
                  (let [d (rand-nth (range -6 0))]
                    (merge {:a (+ pb d) :b b :c (+ pb (- d)) :pb pb}
                           (zipmap [:p1 :p2]
                                   (shuffle [(- pb 2) (dec pb) (inc pb) (+ pb 2)]))))
                  (inc pb)
                  (let [d (rand-nth (range -6 0))]
                    (merge {:a (+ pb d) :b b :c (+ pb (- d)) :pb pb}
                           (zipmap [:p1 :p2]
                                   (shuffle [(- pb 2) (dec pb) (inc pb) (+ pb 2)])))))))
       (repeatedly 300)
       distinct))

(defn arit-25
  []
  (->> (for [a (take 50 (shuffle (range -500 500)))
             b (take 50 (shuffle (range -500 500)))]
         (merge {:a a :b b}
                (cond
                  (= a b) {:pb "=" :p1 ">" :p2 "<"}
                  (> a b) {:pb ">" :p1 "=" :p2 "<"}
                  (< a b) {:pb "<" :p1 "=" :p2 ">"})))
       shuffle
       (take 500)
       distinct
       vec))

(defn arit-26
  []
  (let [bahan (concat (range -10 -1) (range 2 11))]
    (->> (for [aa (remove zero? (range -9 10))
               ab (remove zero? (range -9 10))
               ba bahan
               bb bahan]
           (let [a (/ aa ba) b (/ ab bb)]
             (merge {:a a :b b}
                    (cond
                      (= a b) {:pb "=" :p1 ">" :p2 "<"}
                      (> a b) {:pb ">" :p1 "=" :p2 "<"}
                      (< a b) {:pb "<" :p1 "=" :p2 ">"}))))
         shuffle
         (take 500)
         distinct
         vec)))

(defn exp
  [a b]
  (reduce * (repeat b a)))

(defn arit-27
  []
  (let [bahan (concat (range -10 -1) (range 2 11))]
    (->> (for [aa (remove zero? (range 1 5))
               ab (remove zero? (range 1 5))
               ba bahan
               bb bahan]
           (let [a (exp ba aa) b (exp bb ab)]
             (merge {:a (str ba "^" aa) :b (str bb "^" ab)}
                    (cond
                      (= a b) {:pb "=" :p1 ">" :p2 "<"}
                      (> a b) {:pb ">" :p1 "=" :p2 "<"}
                      (< a b) {:pb "<" :p1 "=" :p2 ">"}))))
         shuffle
         (take 500)
         distinct
         vec)))


































