;; Collection: List and Vector 2

;; Creating each of these can be done using a shorthand notation or using a function call:

; Vector
user=> [1 2 3]
[1 2 3]
user=> (vector 1 2 3)
[1 2 3]

; List
user=> '(1 2 3)
(1 2 3)
user=> (list 1 2 3)
(1 2 3)

;; We can, of course, assign a collection to a variable in the same way as any other value. We can also use one collection as a key or value inside another collection.

;; Lists are considered to be a seq. 
;; This means that the class implements the ISeq interface. 
;; All other collections can be converted to a seq using the seq function:

user=> (seq [1 2 3])
(1 2 3)
user=> (seq #{1 2 3})
(1 3 2)
user=> (seq {:a 1 2 3})
([:a 1] [2 3])

(def mylist '(1 2 3 4 5 6 7 8 9))
mylist
