(ns app.legacy.producer
  (:require
   [clojure.string :as cs]
   [clojure.set :as cset]
   [app.utils :refer :all]
   [me.raynes.fs :as rfs]))

(defn accum-tree
  "Accumulates a file path into a map tree"
  [file-elem-tree path-str]
  (let [path-elems (-> (cs/split path-str #"/")
                       (nthrest 4)
                       vec)
        key-seq    (butlast path-elems)
        file-name  path-str]
    (assoc-in file-elem-tree key-seq file-name)))

(defn create-tree-dir [root-dir]
  (->> (file-seq (clojure.java.io/file root-dir))
       (map #(.getPath %))
       (filter #(cs/includes? % ".edn"))
       ((fn [my-dir]
          (if rfs/unix-root
            (identity my-dir)
            (map #(cs/replace % #"\\" "/") my-dir))))
       (reduce accum-tree {})))

(defn add-index-to-jawaban [answer]
  (mapv conj answer (range 0 (count answer))))

(defn convert-outer-zp-problem [{:keys [soal-id soal answer template-id] :as map-soal}]
  (-> map-soal
      (dissoc :template-id :answer :soal-id)
      (assoc :meta {:template-id template-id
                    :topic       :zp-problem
                    :problem-id soal-id})
      (assoc :meta {:template-id template-id
                    :topic       :zp-problem
                    :problem-id soal-id})
      (update-in [:soal] #(-> %
                              (cset/rename-keys {:text :soal-text})
                              (dissoc :choices)
                              (assoc :options (add-index-to-jawaban (:choices soal))
                                     :jawaban answer)))))

(defn convert-basic-zp-problems [map-soal]
  (-> map-soal
      (dissoc :set? :script :type :pembahasan)
      (cset/rename-keys {:header :bahas})
      convert-outer-zp-problem))

(defn adding-breadcrumb [zt]
  (-> zt
      :dir
      (cs/split #"/")
      (nthrest 9)
      (#(interpose "/" %))
      (#(apply str %))))

(defn unix->windows-path [s]
  (cs/replace s #"/" "\\"))

(defn get-zp-problem [dir-string]
  (let [unix?               rfs/unix-root
        zp-template         (cslurp dir-string)
        zt-added-breadcrumb (assoc zp-template :breadcrumb (adding-breadcrumb zp-template))
        res                 (update-in zt-added-breadcrumb [:pre-generated] #(mapv convert-basic-zp-problems %))]
    res))

(comment
  (defn test-edn []
    (cslurp "content-legacy/test-data.edn"))
  (test-edn)
  (->> "content-legacy/zp-problem/source/sd/"
       create-tree-dir)
  
  (create-tree-dir "content-legacy/zp-problem/source/sma"))
