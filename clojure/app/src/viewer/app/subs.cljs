(ns app.subs
  (:require [re-frame.core :as re]))

(re/reg-sub
 :subs-zp-data-problems
 (fn [db]
   (:zp-data-problems db)))

(re/reg-sub
 :subs-zp-data-templates
 (fn [db]
   (:zp-data-templates db)))

(re/reg-sub
 :subs-zp-tree-data-legacy-panel
 (fn [db]
   (:zp-tree db)))

(re/reg-sub
 :subs-zp-legacy-off?
 (fn [db]
   (every? nil? (vals (:zp-tree db)))))

(re/reg-sub
 :subs-view-legacy-panel
 (fn [db]
   (:view-legacy-panel db)))

(re/reg-sub
  :subs-view-main-panel
  (fn [db]
    (:view-main-panel db)))

(re/reg-sub
  :subs-data-templates
  (fn [db]
    (:data-templates db)))

(re/reg-sub
  :subs-data-problems
  (fn [db]
    (:data-problems db)))

(re/reg-sub
  :subs-template-name
  (fn [db]
    (:template-name db)))




