;; Collection: List and Vector (Part 1)

;; So far, we've been mostly interacting with simple values. 
;; We have seen lists as well, but nothing more. 
;; Clojure does have a full set of collections that can be used, though, 
;; consisting of lists, vectors, maps, and sets:

;; 1. A vector [] is an ordered list of values – any arbitrary value can be put into a vector, including other collections.
;; 2. A set #{} is an unordered collection of values, and can never contain the same value more than once.
;; 3. A map {} is a simple set of key/value pairs. It's very common to use keywords as the keys in a map, but we can use any value we like, including other collections.
;; 4. A list '() is very similar to a vector. The difference is similar to that between an ArrayList and a LinkedList in Java. Typically, a vector is preferred, but a list is better if we want to be adding elements to the start, or if we only ever want to access the elements in sequential order.

;; List
'(1 2 3 4 5 6 7 8 9)
(def mylist '(1 2 3 4 5 6 7 8 9))
mylist
(take 4 mylist)
(drop 3 mylist)
(first mylist)
(second mylist)
(rest mylist)
(cons 0 mylist)
(last mylist)
(butlast mylist)
(nth mylist 0)
(nth mylist 2)
(count mylist)

;; Vector
[1 2 3 4 5 6 7 8 9]
(def myvec [1 2 3 4 5 6 7 8 9])
(nth myvec 0)
(nth myvec 2)
(take 5 myvec)
(drop 3 myvec)
(cons 10 myvec)
(conj myvec 10)
(concat mylist myvec)
(concat [1 2 3] [4 5 6])
(concat #{1 2 3} '(1 2 3))
(seq {1 2 3 4 5 6})
(count '())
(count [])
(rest [1])
(rest '(100))
(cons :a '(:b :c :d :e))
(conj '(:a :b :c :d) :e)
(peek '(:a :b :c :d :e))
(pop '(:a :b :c :d :e))
(range 1 10)
(range 10)
(range 1 10 2)
(repeat 5 7)

