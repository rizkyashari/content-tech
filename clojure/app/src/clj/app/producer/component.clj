(ns app.producer.component
  (:require
    [com.stuartsierra.component :as component]
    [app.producer.register :as regis]
    [app.producer.producer :as producer]
    [clojure.edn :as edn]
    [clojure.java.io :as io]
    [clojure.string :as cs]
    [app.utils :refer :all]
    [cheshire.core :as che]
    [app.legacy.producer :as lproducer]))

(declare grab-produce store grab)

(defrecord Producer [source target zp-problem-source mode target-sys-img-url]
  component/Lifecycle
  (start [this]
    (let [all-data (regis/soal-map)
          content  (grab-produce source target all-data mode target-sys-img-url)
          zp-tree  (if (= mode :legacy)
                     {:zp-problem-tree {"sda" (->> zp-problem-source :sda lproducer/create-tree-dir)
                                        "smp" (->> zp-problem-source :smp lproducer/create-tree-dir)
                                        "sma" (->> zp-problem-source :sma lproducer/create-tree-dir)}}
                     {:zp-problem-tree nil})]
      (merge this content zp-tree)))
  (stop [this]
    (dissoc this :templates :problem-map :zp-problem-tree)))

(defn make [content-config]
  (map->Producer content-config))

(defn- grab-produce
  "Grabbing problems based on source & registered problems"
  [source target all-data mode target-sys-img-url]
  (let [problem-metas         (mapv #(grab source %) all-data)
        check-critical-config (fn [] (if target-sys-img-url target-sys-img-url (throw (Exception. "target-sys-img-url missing"))))
        generated-problems    (if (= mode :generate)
                                (do (check-critical-config)
                                    (mapv #(producer/generate-production % target-sys-img-url) problem-metas))
                                (mapv producer/generate problem-metas))
        templates             (->> (mapv #(dissoc % :gen-fn :soal :bahasan) problem-metas)
                                   (mapv #(assoc % :template-id (get-in % [:meta :template-id]))))
        results               (mapv #(merge %1 {:problems %2})
                                    (mapv #(dissoc % :gen-fn :soal :bahasan) problem-metas)
                                    generated-problems)
        problem-map           (-> #(get-in % [:meta :template-id])
                                  (map problem-metas)
                                  (zipmap generated-problems))
        all-results           {:templates   templates
                               :problem-map problem-map}]
    ;; only produce files when in :generate mode
    (when (= mode :generate)
      (do (let [filepath (str target "problems.edn")]
            (io/make-parents filepath)
            (cspit filepath
                   (->> (mapv #(dissoc % :problems) results)
                        (mapv #(merge % (:meta %)))
                        (mapv #(assoc % :edn-file (str (:template-id %) ".edn")))
                        (mapv #(dissoc % :meta :file :generated?)))))
          (doseq [{:keys [meta problems] :as d} results]
            (let [edn-name        (str (:template-id meta) ".edn")
                  json-name       (str (:template-id meta) ".json")
                  merged-problems (->> (mapv #(merge % (:meta %)) problems)
                                       (mapv #(dissoc % :meta)))]
              (time (do (info (:filename d))
                        (let [filepath (str target "results/edn/" edn-name)]
                          (io/make-parents filepath)
                          (cspit filepath merged-problems))
                        (let [filepath (str target "results/json/" json-name)]
                          (io/make-parents filepath)
                          (spit filepath (che/generate-string merged-problems {:pretty true})))))))))
    (info "There are in total " (count results) " templates")
    (info "Generating in total " (apply + (map #(count (:problems %)) results)) " problems")
    all-results))

(defn- grab
  "Grab the file for one problem template, and process it"
  [source {:keys [folder file gen-fn topic]}]
  (let [res-folder (str source folder "/" file)
        problem-string (slurp res-folder)
        problem-strings (cs/split problem-string #"==sepa==")
        mapi {:gen-fn   gen-fn
              :file     res-folder
              :topic    topic
              :filename file}]
    (pres mapi)
    (if (= 2 (count problem-strings))
      (let [problem-meta {:template-id (uuid)
                          :topic       topic}
            new-problem-string (str "\n" (cstr problem-meta) "\n"
                                    "==sepa==" "\n"
                                    problem-string)]
        (spit res-folder new-problem-string)
        (merge mapi
               {:meta    problem-meta
                :soal    (problem-strings 0)
                :bahasan (problem-strings 1)}))
      (merge mapi
             {:meta    (assoc (edn/read-string (problem-strings 0)) :topic topic)
              :soal    (problem-strings 1)
              :bahasan (problem-strings 2)}))))




