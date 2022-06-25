;; Intro to Clojure

;; Untuk mengetahui pengenalan seputar Clojure bisa cek di 
;; https://www.baeldung.com/clojure atau https://clojure.org/guides/getting_started
;; Cheatsheet Clojure https://clojure.org/api/cheatsheet

;; LANGUAGE BASICS

;; Bahasa Clojure terlihat sangat berbeda dari banyak bahasa berbasis Java Virtual Machine lainnya, 
;; dan mungkin akan tampak sangat tidak biasa untuk memulai. 
;; Ini dianggap sebagai dialek Lisp dan memiliki sintaks dan fungsi yang sangat mirip dengan bahasa Lisp lainnya.
;; Banyak kode yang kita tulis dalam Clojure – seperti dialek Lisp lainnya – 
;; dinyatakan dalam bentuk List. 
;; List kemudian dapat dievaluasi untuk menghasilkan hasil – 
;; baik dalam bentuk List yang lebih banyak atau nilai sederhana.
;; Sebagai contoh:

(+ 3 4) ; = 7

;; Ini adalah daftar yang terdiri dari tiga elemen. 
;; Simbol “+” menunjukkan bahwa kita sedang melakukan panggilan – penambahan. 
;; Elemen yang tersisa kemudian digunakan dengan panggilan ini. 
;; Dengan demikian, ini mengevaluasi ke "3 + 4".
;; Dengan menggunakan sintaks List di sini, 
;; ini dapat diperpanjang secara simple. Misalnya, kita dapat melakukan:

(+ 1 2 3 4 5) ; = 15
;; Dan ini dievaluasi menjadi "1 + 2 + 3 + 4 + 5".
;; Perhatikan juga karakter titik koma. 
;; Ini digunakan di Clojure untuk menunjukkan komentar dan bukan akhir dari ekspresi seperti yang kita lihat di Java.

;; ASSIGNMENT
;; Rewrite following algebraic expression as a Clojure expression!

; 2 * 3
; (58 – 2) / 8
; (7 + 3 * 4 + 5) / 10
