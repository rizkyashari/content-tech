;; Collection: Set and Map
;; ; Set
user=> #{1 2 3}
#{1 3 2}
user=> (hash-set 1 2 3)
#{1 3 2}

; Map
user=> {:a 1 :b 2}
{:a 1, :b 2}
user=> (hash-map :a 1 :b 2)
{:b 2, :a 1}

;; Notice that the Set and Map examples don't return the values in the same order. 
;; This is because these collections are inherently unordered, 
;; and what we see depends on how they are represented in memory.

;; We can also see that the syntax for creating a list is very similar to 
;; the standard Clojure syntax for expressions. 
;; A Clojure expression is, in fact, a list that gets evaluated, 
;; whereas the apostrophe character here indicates that we want the actual 
;; list of values instead of evaluating it.

user=> {1 2 3 4}
{1 2, 3 4} ; {key value, key value}
user=> (hash-map 1 2 3 4)
{1 2, 3 4}
user=> (def mset {1 1 2 2 3 3 4 4})
#'user/mset
user=> mset
user=> (def popo (hash-map :a 1 :b 2 :c 3))
#'user/popo
user=> popo
{:c 3, :b 2, :a 1}
user=> (popo :a)
1
user=> (popo :c)
3
user=> (count popo)

;; Operasi pada map

user=> (assoc popo :d 4)
{:c 3, :b 2, :d 4, :a 1}
user=> (def popo1 (merge popo {:d 4 :e 5}))
#'user/popo1
user=> popo1
{:e 5, :c 3, :b 2, :d 4, :a 1}
user=> (merge {:a 1 :b 2} {:a 2 :b 3 :c 4})
{:a 2. :b 3, :c 4} ; yang terakhir me-replace yang duluan

user=> (vals popo)
(3 2 1)
user=> (keys popo)
(:c :b :a)

