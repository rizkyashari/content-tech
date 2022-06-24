(ns app.generator.sbd.vocab
  (:require [clojure.string :as cs]))

(defn read-csv
  [filenamepath]
  (->> (-> (slurp (str "resources/dumps/vocabs/" filenamepath ".csv"))
           (cs/split-lines))
       (map #(cs/split % #","))
       rest))

(defn vocab-01
  []
  (let [data (read-csv "vocab01")]
    (->> (fn []
           (let [tp (rand-nth [:def :word])
                 [a b c d e :as voclist] (take 5 (shuffle data))]
             (condp = tp
               :def (merge {:q (a 2) :pb (a 0)}
                           (zipmap [:p1 :p2 :p3 :p4]
                                   (map #(% 0) [b c d e]))
                           {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                       (mapv voclist))})
               :word (merge {:q (a 0) :pb (a 2)}
                            (zipmap [:p1 :p2 :p3 :p4]
                                    (map #(% 2) [b c d e]))
                            {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                        (mapv voclist))}))))
         (repeatedly 100)
         distinct)))

(defn vocab-02
  []
  (let [data (read-csv "vocab02")]
    (->> (fn []
           (let [tp (rand-nth [:def :word])
                 [a b c d e :as voclist] (take 5 (shuffle data))]
             (condp = tp
               :def (merge {:q (a 2) :pb (a 0)}
                           (zipmap [:p1 :p2 :p3 :p4]
                                   (map #(% 0) [b c d e]))
                           {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                       (mapv voclist))})
               :word (merge {:q (a 0) :pb (a 2)}
                            (zipmap [:p1 :p2 :p3 :p4]
                                    (map #(% 2) [b c d e]))
                            {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                        (mapv voclist))}))))
         (repeatedly 100)
         distinct)))

(defn vocab-03
  []
  (let [data (read-csv "vocab03")]
    (->> (fn []
           (let [tp (rand-nth [:def :word])
                 [a b c d e :as voclist] (take 5 (shuffle data))]
             (condp = tp
               :def (merge {:q (a 2) :pb (a 0)}
                           (zipmap [:p1 :p2 :p3 :p4]
                                   (map #(% 0) [b c d e]))
                           {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                       (mapv voclist))})
               :word (merge {:q (a 0) :pb (a 2)}
                            (zipmap [:p1 :p2 :p3 :p4]
                                    (map #(% 2) [b c d e]))
                            {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                        (mapv voclist))}))))
         (repeatedly 100)
         distinct)))

(defn vocab-04
  []
  (let [data (read-csv "vocab04")]
    (->> (fn []
           (let [tp (rand-nth [:def :word])
                 [a b c d e :as voclist] (take 5 (shuffle data))]
             (condp = tp
               :def (merge {:q (a 2) :pb (a 0)}
                           (zipmap [:p1 :p2 :p3 :p4]
                                   (map #(% 0) [b c d e]))
                           {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                       (mapv voclist))})
               :word (merge {:q (a 0) :pb (a 2)}
                            (zipmap [:p1 :p2 :p3 :p4]
                                    (map #(% 2) [b c d e]))
                            {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                        (mapv voclist))}))))
         (repeatedly 100)
         distinct)))

(defn vocab-05
  []
  (let [data (read-csv "vocab05")]
    (->> (fn []
           (let [tp (rand-nth [:def :word])
                 [a b c d e :as voclist] (take 5 (shuffle data))]
             (condp = tp
               :def (merge {:q (a 2) :pb (a 0)}
                           (zipmap [:p1 :p2 :p3 :p4]
                                   (map #(% 0) [b c d e]))
                           {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                       (mapv voclist))})
               :word (merge {:q (a 0) :pb (a 2)}
                            (zipmap [:p1 :p2 :p3 :p4]
                                    (map #(% 2) [b c d e]))
                            {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                        (mapv voclist))}))))
         (repeatedly 100)
         distinct)))

(defn tester
  []
  (let [data (read-csv "vocab05")
        img {:image "FACAB50D-628D-43C0-B9D4-EF21BACB8C28.jpeg"}]
    (->> (fn []
           (let [tp (rand-nth [:def :word])
                 [a b c d e :as voclist] (take 5 (shuffle data))]
             (condp = tp
               :def (merge img
                           {:q (a 2) :pb (a 0)}
                           (zipmap [:p1 :p2 :p3 :p4]
                                   (map #(% 0) [b c d e]))
                           {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                       (mapv voclist))})
               :word (merge img
                            {:q (a 0) :pb (a 2)}
                            (zipmap [:p1 :p2 :p3 :p4]
                                    (map #(% 2) [b c d e]))
                            {:words (-> #(do {:single (% 0) :plural (% 1) :indo (% 2)})
                                        (mapv voclist))}))))
         (repeatedly 100)
         distinct)))
