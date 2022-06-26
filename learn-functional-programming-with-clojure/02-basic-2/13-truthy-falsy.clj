;; Truthy Falsy

;; Di clojure dan lisp, semua nilai selain "FALSE" dan "NIL" dianggap "TRUE".
;; Contohnya:
user=> (if 2 3 4)
3 ; 2 adalah nilai selain FALSE dan NIL, sehingga dianggap TRUE, TRUE nya adalah 3.
user=> (def popos "o")
#'user/popos
user=> (if popos 123 321)
123
user=> (cond popos false :else "231")
false