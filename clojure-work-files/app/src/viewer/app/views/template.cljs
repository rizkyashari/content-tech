(ns app.views.template
  (:require
    [app.utils :as u]
    [re-frame.core :as re]
    [app.ajax :as server]
    [app.subs :as subs]
    [reagent.core :as r]
    [clojure.string :as cs]))

(defn template-panel
  []
  (fn []
    (let [templates (re/subscribe [:subs-data-templates])]
      [:div.container
       [:hr]
       (into [:div.d-grid.gap-2]
             (for [{:keys [template-id filename]} @templates]
               [:button.btn.btn-outline-primary
                {:on-click #(do (server/get-problems template-id)
                                (re/dispatch
                                 [:event-set-template
                                  (subs filename 0 (- (count filename) 5))])
                                (js/console.log template-id))}
                (subs filename 0 (- (count filename) 5))]))])))

(defn create-key-element-id []
  {:key (random-uuid)})

(defn supported-ptype? [k]
  (contains? #{"zp_problem"} k))

(defn dir-button-prop-wrapper [button-id]
  {:key            (random-uuid)
   :type           "button"
   :data-bs-toggle "collapse"
   :data-bs-target (str "#" button-id) ;; "#collapseExample"
   :aria-expanded  "false"
   :aria-controls  button-id           ;; "collapseExample"
   })

(defn collapsible-prop-wrapper [button-id]
  {:key (random-uuid)
   :id  button-id})

(defn directory-node [content-map]
  (for [[k v] (into (sorted-map) content-map)]
    (if (map? v)
      (let [button-id (str "collapse" (random-uuid))]
        [:div.container (create-key-element-id)
         [:button.btn.btn-outline-primary (dir-button-prop-wrapper button-id) (str k)] ;; button
         [:div.collapse (collapsible-prop-wrapper button-id)
          (directory-node v)]]) ;; collapsible
      (if (cs/includes? v ".edn")
        [:div.container (create-key-element-id) ;; [:div.p (str "key : " k ", this is edn node")]
         [:button.btn.btn-outline-success
          (merge (create-key-element-id) {:on-click #(do (server/get-zp-problems v) ;; (server/get-zp-problems v) ;; post : dirpath, res : updated problems
                                                       ;; (re/dispatch
                                                       ;;  [:event-set-template
                                                       ;;   (subs filename 0 (- (count filename) 5))]) ;; (re/dispatch [view legacy problem panel/modal/whatever])
                                                       (js/console.log v))})
          (str k " zp-problem.edn")]]
        [:div.container (create-key-element-id) [:div.p (str "wahbuntung nih")]]))))

(defn ensure-name-string [k]
  (if (string? k) k (str (name k))))

(defn accordion-header-prop-wrapper [element-uuid]
  {:key (random-uuid)
   :id  (str "heading" element-uuid)})

(defn accordion-button-prop-wrapper [element-uuid]
  {:key            (random-uuid)
   :type           "button"
   :data-bs-toggle "collapse"
   :data-bs-target (str "#collapse" element-uuid) ;; "#collapseOne"
   :aria-expanded  "true"
   :aria-controls  (str "collapse" element-uuid)}) ;; "collapseOne"

(defn accordion-collapse-prop-wrapper [element-uuid parent-element-uuid]
  {:key             (random-uuid)
   :id              (str "collapse" element-uuid)
   :aria-labelledby (str "heading" element-uuid)
   :data-bs-parent  (str "#" parent-element-uuid)})

(defn top-panel-accordion [my-legacy-tree]
  (let [parent-element-uuid (str "parent-" (random-uuid))]
    [:div.accordion {:id parent-element-uuid}
     (for [[k v] my-legacy-tree]
       (let [element-uuid (random-uuid)]
         [:div.accordion-item (create-key-element-id)
          [:h2.accordion-header (accordion-header-prop-wrapper element-uuid)
           [:button.accordion-button (accordion-button-prop-wrapper element-uuid)
            (ensure-name-string k)]]
          [:div.accordion-collapse.collapse (accordion-collapse-prop-wrapper element-uuid parent-element-uuid)
           [:div.accordion-body (create-key-element-id) (directory-node v)]]]))]))

(defn top-level-zp-problem-legacy-panel
  [legacy-tree]
  (fn [legacy-tree]
    [:div.container
     (top-panel-accordion legacy-tree)]))
