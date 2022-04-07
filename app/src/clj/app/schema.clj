(ns app.schema
  (:require [schema.core :as s]))

;; These are static content

(def TemplateIds [s/Str])
;; Available on redis

(def Template
  "Map for each template"
  {:template-id s/Str
   :edn-file s/Str
   :filename s/Str
   :topic s/Keyword})


(def Problem
  "Map of each problem"
  {:soal        {:soal-text s/Str
                 :options   [s/Any]
                 :jawaban   s/Str}
   :bahas       s/Str
   :template-id s/Str :problem-id s/Str :topic s/Keyword})
































