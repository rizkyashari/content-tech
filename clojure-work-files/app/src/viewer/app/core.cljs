(ns app.core
  (:require
   [reagent.dom :as rdom]
   [re-frame.core :as re]
   [app.ajax :as server]
   [app.events :as events]
   [app.views.main :as view]
   [app.utils :as u]
   [re-frisk.core :as re-frisk]))

(re-frisk/enable)

(enable-console-print!)

(def debug?
  ^boolean goog.DEBUG)

(defn dev-setup []
  (when debug?
    (println "dev mode")))

(defn ^:dev/after-load mount-root []
  (re/clear-subscription-cache!)
  (let [root-el (u/by-id "app")]
    (rdom/unmount-component-at-node root-el)
    (rdom/render [view/main-page] root-el)))

(defn init []
  (re/dispatch-sync [:event-initialize-db])
  (re/dispatch [:event-set-main-panel :panel-waiter])
  (re/dispatch [:event-set-legacy-panel :panel-waiter])
  (server/get-templates)
  (server/get-zp-tree)
  (dev-setup)
  (mount-root)
  (u/info "udah masuk kemari"))

(init)

