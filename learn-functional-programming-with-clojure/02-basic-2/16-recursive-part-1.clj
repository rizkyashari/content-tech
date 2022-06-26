;; Recursive - Part 1

;; Contoh aplikasi Recursive pada Faktorial

;; n! = n * (n - 1)!
;; n! => n == 1 => n! = 1

;; Recursion harus selalu ada basis dan recurrent
;; Basis = saat beneran ngeluarin nilai
;; Recurrents = perulangannya

(comment
  n! => if n < 1 then 1 else n * (n-1)!
  4! => 4 * 3! = 4 * 6 = 24
  3! => 3 * 2! = 3 * 2 = 6
  2! => 2 * 1! = 2
  1! => 1)

user=> (defn faktorial
          [n]
          (if (<= n 1)
            1
            (* n (faktorial (dec n)))))
#'user/faktorial
user=> (faktorial 4)
24
user=> (faktorial 5)
120

(comment
  (faktorial 4) => (* 4 (faktorial 3)) => (* 4 6) = 24
  (faktorial 3) => (* 3 (faktorial 2)) => (* 3 2) = 6
  (faktorial 2) => (* 2 (faktorial 1)) => (* 2 1) = 2
  (faktorial 1) => 1)

