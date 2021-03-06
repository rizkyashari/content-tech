(ns app.events
  (:require
    [re-frame.core :as re]
    [app.db :as db]
    [app.utils :as u :refer [info]]
    [ajax.core :as ajax :refer [GET POST ajax-request]]
    [ajax.edn :as edn]
    [app.ajax :as server]))

(re/reg-event-db
  :event-initialize-db
  (fn [_ _] db/default-db))

(def set-zp-tree-sda
  (fn [db [_ data]]
    (re/dispatch [:event-set-legacy-panel :legacy-templates])
    (update-in db [:zp-tree] #(assoc % :sda-tree data))))

(re/reg-event-db :event-set-zp-tree-sda set-zp-tree-sda)

(def set-zp-tree-smp
  (fn [db [_ data]]
    (re/dispatch [:event-set-legacy-panel :legacy-templates])
    (update-in db [:zp-tree] #(assoc % :smp-tree data))))

(re/reg-event-db :event-set-zp-tree-smp set-zp-tree-smp)

(def set-zp-tree-sma
  (fn [db [_ data]]
    (re/dispatch [:event-set-legacy-panel :legacy-templates])
    (update-in db [:zp-tree] #(assoc % :sma-tree data))))

(re/reg-event-db :event-set-zp-tree-sma set-zp-tree-sma)

(def set-zp-problem
  (fn [db [_ data]]
    (re/dispatch [:event-set-main-panel :panel-zp-problems]) ;; todo assign panel
    (-> db
        (assoc :zp-data-templates (dissoc data :pre-generated))
        (assoc :zp-data-problems (:pre-generated data)))))

(re/reg-event-db :event-set-zp-problems set-zp-problem)

(def set-templates
  (fn [db [_ data]]
    (re/dispatch [:event-set-main-panel :panel-templates])
    (assoc db :data-templates data)))

(re/reg-event-db :event-set-templates set-templates)

(def set-template
  (fn [db [_ data]]
    (assoc db :template-name data)))

(re/reg-event-db :event-set-template set-template)

(def set-problems
  (fn [db [_ data]]
    (re/dispatch [:event-set-main-panel :panel-problems])
    (assoc db :data-problems data)))

(re/reg-event-db :event-set-problems set-problems)

(def set-main-panel
  (fn [db [_ main-panel]]
    (assoc db :view-main-panel main-panel)))

(re/reg-event-db :event-set-main-panel set-main-panel)

(def set-legacy-panel
  (fn [db [_ main-panel]]
    (assoc db :view-legacy-panel main-panel)))

(re/reg-event-db :event-set-legacy-panel set-legacy-panel)
