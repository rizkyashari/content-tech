(ns app.generator.mbe.utils)

(defn exp [x n]
  (reduce *' (repeat n x)))

(def m-fib
  (memoize (fn [n]
             (case n
               0 0
               1 1
               2 1
               (+' (m-fib (-' n 1)) (m-fib (-' n 2)))))))

(def m-is-prime?
  (memoize (fn [n] (not-any? zero? (map #(rem n %) (range 2 n))))))

(def m-next-prime
  (memoize (fn [n]
             (if (<= n 1)
               2
               (let [next-n (inc' n)]
                 (if (m-is-prime? next-n)
                   next-n
                   (m-next-prime next-n)))))))

(defn expres
  "Create Expression
  (expres [2 'x^2'][3 'x'][-5]['='][0]) ==> '2x^2+3x-5=0'
  (expres [1 'x^2'][0 'x'][-5]['='][0]) ==> 'x^2-5=0'
  (expres [2 'C_2H_6'][3 'H_2O']['\\to '][4 'CO_2'][6 'O_2']) ==> '2C_2H_6+3H_2O\\to 4CO_2+6O_2'"
  [vek & more]
  (let [av   (vec (cons vek more))
        cs   (fn [vs] (apply str vs))
        ang? (fn [x] (or (integer? x) (ratio? x) (float? x)))]
    (loop [lat "" sg true i 0]
      (if (= i (count av))
        lat
        (let [c    (count (av i))
              favi (first (av i))
              nstr (if (> c 1)
                     (cond
                       (== favi 1)  (cs (rest (av i)))
                       (== favi -1) (str "-" (cs (rest (av i))))
                       (== favi 0)  ""
                       :else        (cs (av i)))
                     (cs (av i)))]
          (recur
           (cond
             sg          (str lat nstr)
             (ang? favi) (if (> favi 0) (str lat "+" nstr) (if (= favi 0) lat (str lat nstr)))
             :else       (str lat nstr))
           (if (ang? favi)
             (if (and (> c 1) (= favi 0)) sg false)
             true)
           (inc i)))))))

(defn psalah1
  "Provide wrong choices at a range
  jbenar => jumlah benar
  rng => range
  delta => differences beetwen value
  flag => true (negative number and zero not included)
  (psalah1 5 6 1 false) => [2 -1 4 10 0 7 3 9 6 1 8]
  (psalah1 5 6 1 true) => [2 4 10 7 3 9 6 1 8]"

  [jbenar rng delta flag]
  (if flag
    (->> (concat (range (- jbenar rng) jbenar delta)
                 (range (+ jbenar delta) (+ jbenar rng) delta))
          (filter #(> % 0))
          shuffle
          vec)
    (->> (concat (range (- jbenar rng) jbenar delta)
                 (range (+ jbenar delta) (+ jbenar rng) delta))
          shuffle
          vec)))


