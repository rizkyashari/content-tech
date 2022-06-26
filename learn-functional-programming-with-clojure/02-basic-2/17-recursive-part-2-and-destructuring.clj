;; Recursive - Part 2 and Destructuring

user=> (defn sum
         [xs]
         (if (empty? xs)
           0
           (+ (first xs) (sum (rest xs)))))
#'user/sum
user=> (sum (range 4))
6

(defn drop'
  [n xs]
  (cond
    (zero? n) xs
    (empty? xs) '()
    :else (drop' (- n 1) (rest xs))))

(comment
  (drop 3 [0 1 2 3 4 5 6 7 8 9])
  (drop 2 [1 2 3 4 5 6 7 8 9])
  (drop 1 [2 3 4 5 6 7 8 9])
  (drop 0 [3 4 5 6 7 8 9]) => xs)

user=> (drop' 3 (range 10))
(3 4 5 6 7 8 9)

;; Beberapa fungsi lain yang bisa dipelajari:
;; product, take, fibo,
;; map, reduce, filter, keep,
;; zipmap, merge, assoc, dissoc, dll.

;; Destructuring

user=> (let [a 1 b [2 3 4 5]] (cons a b))
(1 2 3 4 5)
user=> (let [b [1 2 3 4 5 6]] [(first b) (rest b)])
[1 (2 3 4 5 6)]
user=> (let [[a & b] [1 2 3 4 5 6]] [a b])
[1 (2 3 4 5 6)]
user=> (let [[a b c & d] [1 2 3 4 5 6 7 8]] [a b c d])
[1 2 3 (4 5 6 7 8)]
user=> (let [[a b] [1 2 3 4]] [a b])
[1 2]

user=> (defn testi [[a b]] (* a b))
#'user/testi
user=> (testi [2 3])
6
user=> (testi [1 2 3 4]) ; a = 1, b = 2, sisanya tidak dianggap.
2

user=> (defn sum'
         [[x & xs]]
         (if x (+ x (sum' xs)) 0))
#'user/sum'
user=> (sum' [0 1 2 3])
6
user=> (sum' [])
0
user=> (first [])
nil
user=> (if nil true false)
false
user=> (defn tes [[x & xs]] [x xs])
#'user/tes
user=> (tes (range 4))
[0 (1 2 3)]
user=> (let [[x & xs :as lst] [1 2 3 4 5]] [x xs lst])
[1 (2 3 4 5) (1 2 3 4 5)] 
user=> (let [[a & b :as c] ["aku" "suka" "dia"]] [a b c])
["aku" ("suka" "dia") ["aku" "suka" "dia"]]
