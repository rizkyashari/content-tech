(ns app.ajax
  (:require
    [re-frame.core :as re]
    [app.utils :as u :refer [info]]
    [ajax.core :as ajax :refer [GET POST ajax-request]]
    [ajax.edn :as edn]))

(defn get-zp-tree-sda
  ""
  []
  (->> {:uri           "/api/get-zp-problem-tree/sda"
        :handler       (fn [[_ data]]
                         (re/dispatch [:event-set-zp-tree-sda data]))
        :error-handler (fn [[_ msg]] (set! (.-location js/window) "/"))}
       (merge (u/ajax-edn :get))
       ajax-request))

(defn get-zp-tree-smp
  ""
  []
  (->> {:uri           "/api/get-zp-problem-tree/smp"
        :handler       (fn [[_ data]]
                         (re/dispatch [:event-set-zp-tree-smp data]))
        :error-handler (fn [[_ msg]] (set! (.-location js/window) "/"))}
       (merge (u/ajax-edn :get))
       ajax-request))

(defn get-zp-tree-sma
  ""
  []
  (->> {:uri           "/api/get-zp-problem-tree/sma"
        :handler       (fn [[_ data]]
                         (re/dispatch [:event-set-zp-tree-sma data]))
        :error-handler (fn [[_ msg]] (set! (.-location js/window) "/"))}
       (merge (u/ajax-edn :get))
       ajax-request))

(defn get-zp-tree []
  (do (get-zp-tree-sda)
      (get-zp-tree-smp)
      (get-zp-tree-sma)))

(defn get-templates
  "Update all content by sending a request for update to the server."
  []
  (->> {:uri           "/api/get-templates"
        :handler       (fn [[_ data]]
                         (re/dispatch [:event-set-templates data]))
        :error-handler (fn [[_ msg]] (set! (.-location js/window) "/"))}
       (merge (u/ajax-edn :get))
       ajax-request))

(defn get-problems
  "Update all content by sending a request for update to the server."
  [template-id]
  (->> {:uri           (str "/api/get-problems-by-id/" template-id)
        :handler       (fn [[_ data]]
                         (re/dispatch [:event-set-problems data]))
        :error-handler (fn [[_ msg]] (set! (.-location js/window) "/"))}
       (merge (u/ajax-edn :get))
       ajax-request))

(defn get-zp-problems
  "Update all content by sending a request for update to the server."
  [dir-string]
  (->> {:uri           "/api/get-zp-problem"
        :handler       (fn [[_ data]]
                         (re/dispatch [:event-set-zp-problems data]))
        :error-handler (fn [[_ msg]] (set! (.-location js/window) "/"))
        :body (doto (js/FormData.) (.append "dir-string" dir-string))}
       (merge (u/ajax-edn :post))
       ajax-request))


