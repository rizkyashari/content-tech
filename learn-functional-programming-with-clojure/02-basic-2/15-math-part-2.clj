;; Math - Part 2

user=> (defn kecap2
         [a b c x?]
         (let [adis (Math/sqrt (- (square b) (* 4 a c)))]
           (/ (+ (- b) (if (= x? 1) adis (- adis)))
              (* 2 a))))
#'user/kecap2
user=> (kecap2 1 -5 6 1)
3.0
user=> (kecap2 1 -5 6 2)
2.0

user=> (defn say
         [nama]
         (str "Hello, " nama " !"))
#'user/say
user=> (say "David")
"Hello, David !"
user=> (#(str "Hello, " %"!") "Rhea")
"Hello, Rhea!"