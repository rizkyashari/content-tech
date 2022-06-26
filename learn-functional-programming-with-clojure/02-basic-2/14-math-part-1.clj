;; Math - Part 1

(defn square
  [x]
  (* x x))

(defn cube 
  [x]
  (* x x x))

(defn mutlak
  [x]
  (if (pos? x) x (- x)))

(defn what-this?
  [x]
  (cond
    (pos? x) "positif"
    (neg? x) "negatif"
    :else "nol"))

user=> (square 12)
144
user=> (cube 4)
64
user=> (mutlak -30)
30
user=> (what-this? 0)
"nol"

;; Untuk referensi lebih lanjut, kamu bisa belajar melalui situs berikut:
;; https://clojuredocs.org/quickref

user=> (defn kecap
         [a b c]
         (let
          [dis (Math/sqrt (- (square b) (* 4 a c)))]
           [(/ (+ (- b) dis) (* 2 a))
            (/ (- (- b) dis) (* 2 a))]))
#'user/kecap
user=> (kecap 1 -5 6)
[3.0 2.0]

;; Konsep Let: variabel lokal, hanya bisa digunakan di dalam satu fungsi.
;; (let [] [])
;; (let [isi] [perintah])

user=> (let [x 3] [(* x x) (+ x x)])
[9 6]
user=> (let [x 3 y (+ x 2)] [x (* x y)])
[3 15]
user=> (let [x 2] (let [y 3] (/ x y)))
2/3
user=> (defn ngasal
         [x]
         (let [a (* x x)]
           (+ a x)))
#'user/ngasal
user=> (ngasal 10)
110
user=> (defn ngasal1
         [x]
         (let [a (* x x)]
           (let [b (+ a a)]
             (+ a b x))))
#'user/ngasal1
user=> (ngasal1 10)
310

