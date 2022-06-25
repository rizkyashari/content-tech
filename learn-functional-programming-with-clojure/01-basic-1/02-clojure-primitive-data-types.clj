;; Data types: primitives & complex
234
\a
\b
\e
(* (/ 121 11) 2)
(quot 20 7)
(rem 20 7)
(quot 23 7)
(rem 23 7)
true
false
(and true false)
(and false false)
(and true true)
(or true false)
(not true)
(not false)
(= 12 11)
(= 11 11)
(<= 234 234)
(> 20 19 17)
(> 20 19 21)
(pos? 12)
(neg? -1)
(zero? 0)
(str \1 \n)
(str \i \n \d \o \n \e \s \i \a)
(str \a \s \h \a \r \i)

;; 4.1. Simple Types
;; Clojure is built on top of the JVM, 
;; and as such we have access to the same standard types as any other Java application. 
;; Types are typically inferred automatically and don't need to be specified explicitly.
;; For example:

123 ; Long
1.23 ; Double
"Hello" ; String
true ; Boolean

;; We can specify some more complicated types as well, using special prefixes or suffixes:

42N ; clojure.lang.BigInt
3.14159M ; java.math.BigDecimal
1/3 ; clojure.lang.Ratio
#"[A-Za-z]+" ; java.util.regex.Pattern

;; Note that the clojure.lang.BigInt type is used instead of java.math.BigInteger. 
;; This is because the Clojure type has some minor optimizations and fixes.



