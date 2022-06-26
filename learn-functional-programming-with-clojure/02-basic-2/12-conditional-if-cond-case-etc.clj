;; Conditional: If Cond Case

; (if () () ())
; (if kondisi true false)

user=> (if (pos? 0) "bener" "gabener")
"gabener"
user=> (if (pos? 2) "bener" "gabener")
"bener"

user=> (defn mutlak
         [x]
         (if (pos? x) x (- x)))
#'user/mutlak
user=> (mutlak -12)
12

user=> (defn apa-nih-?
         [x]
         (if (< x 0)
           "negatif"
           (if (= x 0)
             "nol"
             "positif")))
#'user/apa-nih-?
user=> (apa-nih-? -12)
"negatif"
user=> (apa-nih-? 0)
"nol"
user=> (apa-nih-? 1)
"positif"

user=> (defn apa-nih-??
         [x]
         (cond
           (> x 0) "positif"
           (= x 0) "nol"
           (< x 0) "negatif"))
#'user/apa-nih-??
user=> (apa-nih-?? 20)
"positif"
user=> (apa-nih-?? 0)
"nol"
user=> (apa-nih-?? -12)
"negatif"

user=> (defn apa-sih-?
         [x]
         (cond
           (> x 0) "positif"
           (= x 0) "nol"
           (< x -5) "negatif"
           :else "impossible"))
#'user/apa-sih-?
user=> (apa-sih-? -3)
"impossible"
