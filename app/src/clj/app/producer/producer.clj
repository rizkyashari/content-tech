(ns app.producer.producer
  (:require
   [selmer.parser :as selmer]
   [selmer.util :refer [without-escaping]]
   [clojure.string :as cs]
   [app.utils :refer :all]
   [clojure.edn :as edn])
  (:import [javax.imageio ImageIO])
  (:import [java.io File]))

(declare process-one-soal)

(defn get-width [path]
  (let [img (ImageIO/read (File. path))]
    (.getWidth img)))

(defn insert-uri
  "configuring image url, Allows width less than 300"
  [image-path c s]
  (let [current-img-file (c s)
        local-image-path (str "resources/public/img/" current-img-file)
        image-width      (get-width local-image-path) 
        res              (if image-width
                           (if (<= image-width 300)
                             (str "<img src=\"" image-path current-img-file "\" width=\""image-width"\" >") 
                             (str "<img src=\"" image-path current-img-file "\" width=\"300\" >")))] 
    res))

(defn promage
  "Processing image in each map of gen-data"
  [mapi target-sys-img-url]
  (let [image-path   target-sys-img-url
        imgks        (->> (filter #(>= (count (name %)) 5) (keys mapi))
                          (filter #(= "image" (subs (name %) 0 5))))
        replaced-uri (map #(insert-uri image-path mapi %) imgks)
        res          (->> replaced-uri
                          (zipmap imgks)
                          (merge mapi))]
    res))

(defn promage-meta-production [mapi]
  (let [imgks (->> (filter #(>= (count (name %)) 5) (keys mapi))
                   (filter #(= "image" (subs (name %) 0 5))))]
    (->> imgks
         (map #(mapi %))
         distinct
         vec)))

(defn get-image [s]
  (last (cs/split s #"/")))

(defn get-image-url [s]
  (mapv get-image (re-seq #"http.*(?:png|jpg)" s)))

(defn promage-meta-production-v2 [injected-soal injected-bahasan]
  (let [soal-images (get-image-url injected-soal)
        bahas-images (get-image-url injected-bahasan)]
    (vec (distinct (concat soal-images bahas-images)))))

(defn have-double-answer? [soal]
  (let [base-opts (mapv #(cs/trim (nth % 1)) (:options (:soal soal)))
        distinct-opts (distinct base-opts)]
    (not= base-opts distinct-opts)))

(defn generate
  [{:keys [meta topic gen-fn soal bahasan filename]}]
  (let [gen-data          (mapv #(promage % "/img/") (gen-fn))
        injected-soals    (mapv #(without-escaping (selmer/render soal %)) gen-data)
        injected-bahasans (mapv #(without-escaping (selmer/render bahasan %)) gen-data)
        maps              (for [i (range (count gen-data))]
                            (merge meta {:problem-id (uuid)}))
        soals             (mapv process-one-soal injected-soals)
        res               (-> #(do {:soal %1 :bahas %2 :meta %3})
                              (mapv soals injected-bahasans maps)
                              distinct)
        filtered-doubles  (remove have-double-answer? res)]
    (println topic " :: " filename " :: gen-data : " (count gen-data) " :: unique-soals : " (count filtered-doubles))
    filtered-doubles))

(defn generate-production
  [{:keys [meta topic gen-fn soal bahasan filename]} target-sys-img-url]
  (let [gen-data          (mapv #(promage % target-sys-img-url) (gen-fn))
        injected-soals    (mapv #(without-escaping (selmer/render soal %)) gen-data)
        injected-bahasans (mapv #(without-escaping (selmer/render bahasan %)) gen-data)
        maps              (for [i (range (count gen-data))]
                            (merge meta {:problem-id (uuid)}))
        soals             (mapv process-one-soal injected-soals)
        unique-images     (mapv promage-meta-production-v2 injected-soals injected-bahasans)
        res               (-> #(do {:soal %1 :bahas %2 :meta %3 :images %4})
                              (mapv soals injected-bahasans maps unique-images))
        filtered-doubles  (remove have-double-answer? res)]
    (println topic " :: " filename " :: gen-data : " (count gen-data) " :: unique-soals : " (count filtered-doubles))
    filtered-doubles))

(defn- process-opt-bool [anskey]
  (let [ans-read (edn/read-string anskey)]
    (if (= java.lang.Boolean (type ans-read))
      ans-read
      (throw (Exception. (str "TYPO IN OPTIONS " ans-read))))))

(defn- process-one-option
  [ikey option]
  (let [[anskey text] (cs/split option #"::")]
    [(process-opt-bool anskey) text ikey]))

(defn- process-one-soal
  [soal-string]
  (let [[text options]    (cs/split soal-string #"==options==")
        the-options       (-> (cs/trim options)
                              (cs/split #"==")
                              (shuffle))
        processed-options (map-indexed process-one-option the-options)
        [_ _ ikey]        (first (filter #(true? (first %)) processed-options))]
    {:soal-text text
     :options   (vec processed-options)
     :jawaban   (["A" "B" "C" "D" "E" "F" "G" "H" "I" "J"] ikey)}))
