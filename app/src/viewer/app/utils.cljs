(ns app.utils
  (:require
    [ajax.edn :as edn]
    [cljs.pprint :as pp]))

(defn by-id
  "Get element by id"
  [id]
  (.getElementById js/document id))

(defn by-class
  "Get element by class, result will be in js array"
  [class]
  (.getElementsByClassName js/document class))

(defn info [body]
  "Console log"
  (pp/pprint body))

(defn set-storage
  "Set something from local storage"
  [k v]
  (.setItem js/localStorage k v))

(defn get-storage
  "Get something from local storage"
  [k]
  (.getItem js/localStorage k))

(defn ajax-edn
  [method]
  {:format          (edn/edn-request-format)
   :response-format (edn/edn-response-format)
   :method          method})

(defn typeset-latex
  [latex-node]
  (.Queue js/MathJax.Hub #js ["Typeset" (.-Hub js/MathJax) latex-node]))

(defn re-render-mathjax []
    (js/MathJax.Hub.Queue (array "Typeset" js/MathJax.Hub)))

;; (fn [node]
;;   (js/MathJax.Hub.Queue #js ["Typeset" js/MathJax.Hub node])
;;   (doseq [node (array-seq (.querySelectorAll node "a"))]
;;     (.addEventListener node "click" #(.stopPropagation %))))
