;; Anonymous Function

;; Elemen pertama harus function, kedua inputnya.
;; ([fungsi] [input])
;; Misal:
(defn square [x] (* x x))
(square 123); = 15129
; ([fungsi] [input or argumen])

;; Function yang tidak terdefinisi.
;; Contoh:
((fn [x] (+ x x)) 12); = 24
; ((fungsi) input)

;; Function dengan shortcut.
;; Contoh:
(#(+ % %) 5); = 10
; (#(fungsi) input)

;; Nested Expression
;; Setiap expression dalam () di-eval dulu.
;; Misal:
(* (+ 4 3) (- 5 2) (+ (* 2 3) 4))

(comment
  (* 7 3 (+ 6 4))
  (* 7 3 10)
  (210))

;; Jumlah argumen/input mengikuti jumlah variabel pada function.
;; Misal:
(#(+ (* %1 %2) %3) 2 3 4); = 10
;; Jika di-define, maka:
user=> (defn fi
         [%1 %2 %3]
         (+ (* %1 %2) %3))
user=> (fi 2 3 4)
10