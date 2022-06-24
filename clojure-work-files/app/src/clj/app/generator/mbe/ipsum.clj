(ns app.generator.mbe.ipsum
  (:require
   [app.utils :as utils]
   [app.generator.mbe.utils :as mutils]))

(defn ipsum-arit
  []
  (->> (for [a (range 10 13)
             b (range 8 11)
             d (range 5 8)]
         (let [p (/ 1 d)]
           {:a  a
            :p p
            :pb (str "$ " "x > " a " $")
            :p3 (str "$ " "x > " b " $")
            :p1 (str "$ " "1 < x \\leq " a " $")
            :p2 (str "$ " "1000 < x \\geq 1" " $")}))
       shuffle))

;; sample output ipsum-arit
;; {:a  12,
;;  :p  1/5,
;;  :pb "$ x > 12 $",
;;  :p1 "$ 1 < x \\leq 12 $",
;;  :p2 "$ 0 < x \\geq 1 $"}

;; (ipsum-arit)

(defn ipsum-limit
  []
  (->> (fn []
         (let [a       (rand-nth (concat (range -9 0) (range 1 10)))
               b       (rand-nth (concat (range -9 0) (range 1 10)))
               c       (rand-nth (concat (range -9 0) (range 1 10)))
               d       (rand-nth (concat (range -9 0) (range 1 10)))
               exp     (mutils/expres [a "x^2"][b "x"][c]["=\\cdots"])
               soal    (str "\\[ \\lim_{x \\to " d "}\\space " exp "\\]")
               jwb     (+ (* a d d) (* b d) c)
               pS1     (mutils/psalah1 jwb 5 1 false)
               salah-0 (pS1 0)
               salah-1 (pS1 1)
               salah-2 (pS1 2)
               salah-3 (pS1 3)]
           {:mysoal  soal
            :jwb     jwb
            :salah-0 salah-0 
            :salah-1 salah-1
            :salah-2 salah-2 
            :salah-3 salah-3}))
       (repeatedly 10)
       vec))

;; sample output ipsum-limit
;; {:mysoal  "\\[ \\lim_{x \\to 6}\\space -7x^2-3x+4=\\cdots\\]",
;;  :jwb     -266,
;;  :salah-0 -262,
;;  :salah-1 -270,
;;  :salah-2 -263,
;;  :salah-3 -269}

;; (ipsum-limit)

(defn ipsum-matrix
  []
  (->> (fn []
         (let [matrix-a           "\\begin{Bmatrix} 1 & 2 & 3\\\\ a & b & c \\end{Bmatrix}"
               mb-range-row       (range 0 8)
               mb-take-size       (+ 1 (rand 7))
               mb-matrix-1st-line (->> (take mb-take-size mb-range-row)
                                       (interpose " & ")
                                       (apply str)
                                       (#(str % "\\\\ ")))
               mb-matrix-2nd-line (->> (take mb-take-size mb-range-row)
                                       (interpose " & ")
                                       (apply str))]
           {:matrix-a       matrix-a
            :matrix-dynamic (str "\\begin{bmatrix} " mb-matrix-1st-line mb-matrix-2nd-line " \\end{bmatrix}")
            :mathjax-test   "$ 1^{ 2 } $"
            :mathjax-test2  "$ 2_{ 1 } $"}))
       (repeatedly 10)
       vec))

;; (ipsum-matrix)

(defn ipsum-image
  []
  (->> (for [a (range 10 14)
             d (range 5 9)]
         (let [p (/ 1 d)]
           {:image-ipsum1 (if (odd? a) "74b45fa1-a4a4-400f-bc5b-a8d45b98897b.jpg" "db3573ad-7fbd-496f-a573-bcb606c227e4.jpg")
            :image-ipsum2 (if (odd? d) "c99b8b13-843b-4348-89bb-9f7d59e6787c.jpg" "db3573ad-7fbd-496f-a573-bcb606c227e4.jpg")
            :image-ipsum3 "032d58eb31984de9afafdcd50f72ea06.jpg"
            :image-ipsum4 "e732f940-b874-4c27-a384-b3acab5e0d6a.png"
            :image-ipsum5 "67f2c712-bae6-4d2f-95b2-cb760abb522c.png"
            :which-image (odd? (mod a d))
            :a  a
            :p p
            :pb (str "$ " "x > " a " $")
            :p1 (str "$ " "1 < x \\leq " a " $")
            :p2 (str "$ " "1000 < x \\geq 1" " $")}))
       shuffle))

;; (ipsum-image)

;; notes: basic clojuring progen

;; (vec (repeatedly 10 (fn [] {:a 1})))

;; (defn kosong [n x]
;;   (->> (fn [] {:x x})
;;        (repeatedly n)
;;        vec))

;; (defn kosong []
;;   (->> #()
;;        (repeatedly 10)
;;        vec))

;; ((fn [x] (inc (inc x))) 1)
;; (#(inc (inc %)) 1)

;; (map str [1 2 3 4] [10 11 12 13])
;; (->> [1 2 3 4]
;;      (map str))
;; (-> str
;;     (map [1 2 3 4]))

;; (conj [] 1)
;; (->> 1
;;      (conj []))
;; (-> []
;;     (conj 1))

;; (-> []
;;     (conj 1 2 3 4 5)
;;     (#(map str %)))

;; (defn kosong
;;   ([]
;;    (->> #()
;;         (repeatedly 10)
;;         vec))
;;   ([n x]
;;    (->> (fn [] {:x x})
;;         (repeatedly n)
;;         vec)))

;; ;; (kosong)
;; ;; (kosong 10 "L")

;; (defn foo
;;   ([n] (foo n n))
;;   ([n n2] {:k n
;;            :v (inc n2)}))

;; (foo 10)
