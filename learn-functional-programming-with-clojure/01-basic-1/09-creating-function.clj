;; Creating Function 

; Look at this example:
user=> (#(* % %) 12)
144
; # di depan berfungsi sebagai fungsi, * sebagai operasi, dan % sebagai argumen.

user=> (#(* %1 %2 %3) 1 2 3)
6
user=> (def square #(* % %))
#'user/square
user=> (square 12)
144
user=> (def tambah #(+ %1 %2))
#'user/tambah
user=> (tambah 12 13)
25
user=> ((fn [x] (* x x)) 12)
144
user=> ((fn [a b] (+ a b)) 12 13)
25
user=> (defn fungsi [a b c] (* a (+ b c) b))
#'user/fungsi
user=> (fungsi 1 2 3)
10
user=> (#(* 15 %2) 1 2)
30

;; Function yang menghasilkan another function

user=> (def tambah (fn [x] (fn [y] (+ x y))))
#'user/tambah
user=> ((tambah 5) 10)
15
user=> (def persgaris (fn [m c] (fn [x] (+ (* m x) c))))
#'user/persgaris
user=> (def garis1 (persgaris 3 5))
#'user/garis1
user=> (garis1 2)
11
user=> (def pkuadrat (fn [a b c] (fn [x] (+ (* a (* x x)) (* b x) c))))
#'user/pkuadrat
user=> (def pk1 (pkuadrat 1 2 3))
#'user/pk1
user=> (pk1 2)
11
user=> (((fn [] #(+ %1 %2))) 4 5)
9

;; Function yang menerima function

user=> (def foo (fn [f] (f 3 5)))
#'user/foo
user=> (foo +)
8
user=> (foo *)
15
user=> (foo /)
3/5
user=> (foo -)
-2
user=> ((fn [f] (f 5)) (fn [n] (* n n)))
25
user=> (#(% 5) (fn [n] (* n n)))
25
user=> (#(% 5) square)
25