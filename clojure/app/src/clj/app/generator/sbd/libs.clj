(ns app.generator.sbd.libs
  (:require [clojure.string :as cs]))

(defn abs
  [num]
  (if (neg? num) (- num) num))

(defn p+
  "Addition of two polinomials"
  ([p] p)
  ([p q]
   (let [pt (group-by second p)
         qt (group-by second q)
         res (merge-with #(let [fp (first %1) fq (first %2)]
                            [(+ (fp 0) (fq 0)) (fp 1) (fp 2)]) pt qt)]
     (->> (vals res)
          (map #(if (vector? (first %)) (first %) %))
          (remove #(zero? (% 0)))
          (sort-by second >)
          vec))))

(defn p-
  "Subtraction of two polinomials"
  ([p] [(- (p 0)) (p 1) (p 2)])
  ([p q]
   (let [pt (group-by second p)
         qt (group-by second q)
         res (merge-with #(let [fp (first %1) fq (first %2)]
                            [(- (fp 0) (fq 0)) (fp 1) (fp 2)]) pt qt)]
     (->> (vals res)
          (map #(if (vector? (first %)) (first %) %))
          (remove #(zero? (% 0)))
          (sort-by second >)
          vec))))

(defn p*
  "Multiplication of two polinomials"
  [p q]
  (let [hasil (for [pe p qe q]
                [(* (pe 0) (qe 0))
                 (+ (pe 1) (qe 1))
                 (pe 2)])
        grouped (group-by second hasil)]
    (->> (vals grouped)
         (mapcat #(if (= 1 (count %)) % (reduce p+ (mapv vector %))))
         (sort-by second >)
         (remove #(zero? (% 0))))))

(defn prespelp
  "Print one element of polinomials"
  [elp]
  (let [neg (neg? (elp 0))
        one (= 1 (abs (elp 0)))
        nol (= 0 (elp 1))
        !pone (not= 1 (elp 1))]
    (if neg
      (if nol
        (str " - " (if one "" (abs (elp 0))))
        (str " - " (if one "" (abs (elp 0)))
             (elp 2)
             (when !pone
               (str "<sup>" (elp 1) "</sup>"))))
      (if nol
        (str " + " (if one "" (abs (elp 0))))
        (str " + " (if one "" (abs (elp 0)))
             (elp 2)
             (when !pone
               (str "<sup>" (elp 1) "</sup>")))))))

(defn presp
  "Print the whole polinomials"
  [pol]
  (let [poli (sort-by second > pol)]
    (let [res (->> (remove #(zero? (% 0)) poli)
                   (map prespelp)
                   (apply str))]
      (if (= \+ (get res 1))
        (subs res 3 (count res))
        res))))


