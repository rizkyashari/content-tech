(ns app.views.problem
  (:require
   [app.utils :as u]
   [re-frame.core :as re]
   [app.subs :as subs]
   [cljs.pprint]))

(defn problem-options
  [soal]
  (let [options ["A" "B" "C" "D" "E" "F" "G" "H"]]
    (into [:div]
          (for [[k v] (->> (map second (:options soal))
                           (map #(do [%1 %2]) options))]
            (if (= k (:jawaban soal))
              [:div [:b {:dangerouslySetInnerHTML
                         {:__html (str k ". " v)}}]]
              [:div {:dangerouslySetInnerHTML
                     {:__html (str k ". " v)}}])))))

(defn all-problems
  [problems]
  (into [:div.row]
        (for [{:keys [nomer soal bahas]}
              (-> #(assoc %2 :nomer (inc %1))
                  (map-indexed problems)
                  reverse)]
          ^{:key nomer}
          [:div
           [:h4 (str "Soal : " nomer)]
           [:h6 {:dangerouslySetInnerHTML
                 {:__html (:soal-text soal)}}]
           [problem-options soal]
           [:br]
           [:h5 (str "Pembahasan : ")]
           [:h6 {:dangerouslySetInnerHTML
                 {:__html bahas}}]
           [:br]])))

(defn problem-panel
  []
  (fn []
    (let [problems (re/subscribe [:subs-data-problems])
          template-name (re/subscribe [:subs-template-name])]
      [:div.container
       [:button {:on-click #(re/dispatch [:event-set-main-panel :panel-templates])}
        "Back to templates"]
       [:h3 @template-name]
       [all-problems @problems]
       (js/setTimeout #(u/re-render-mathjax) 30)])))

(defn zp-off-canvas [{:keys [creator pembahasan generator coder] :as template-data}]
  [:div.offcanvas.offcanvas-end {:tab-index "-1" :id "offcanvasExample" :aria-labelledby "offcanvasExampleLabel"}
   [:div.offcanvas-header
    [:h5.offcanvas-title {:id "offcanvasExampleLabel"} "Meta"]]
   [:div.card [:div.card-body
               [:div.container
                [:div.row
                 [:div.col-3 "Creator"]
                 [:div.col-9 (str ": "creator)]]
                [:div.row
                 [:div.col-3 "Coder"]
                 [:div.col-9 (str ": "coder)]]]]]
   [:div.card [:div.card-body
               [:div.pre [:div.code generator]]]]
   ;; [:div.card [:div.card-body
   ;;             [:div.pre [:div.code (str (with-out-str (cljs.pprint/pprint generator)))]]]]
   ;; [:div.card [:div.card-body
   ;;             [:div.samp "This text is meant \n to be treated as sample output from a computer program."]]]
   ])

(defn zp-basic-meta [{:keys [breadcrumb template-id title] :as template-data}]
  [:div.card [:div.card-body
              [:div.container
               [:div.row
                [:div.col-3 "Template ID"]
                [:div.col-9 (str ": "template-id)]]
               [:div.row
                [:div.col-3 "Title"]
                [:div.col-9 (str ": "title)]]
               [:div.row
                [:div.col-3 "Breadcrumb"]
                [:div.col-9 (str ": "breadcrumb)]]]
              [:div.btn.btn-primary
               {:data-bs-toggle "offcanvas" :href "#offcanvasExample" :role "button" :aria-controls "offcanvasExample"}
               "Meta & Fn"]
              [zp-off-canvas template-data]]])

(defn zp-problem-panel
  []
  (fn []
    (let [problems (re/subscribe [:subs-zp-data-problems])
          template-data (re/subscribe [:subs-zp-data-templates])
          ;; {:keys [breadcrumb template-id title]} @template-data
          ]
      [:div.container
       [:br]
       [:button {:on-click #(re/dispatch [:event-set-main-panel :panel-templates])} "Back to templates"]
       [zp-basic-meta @template-data]
       [all-problems @problems]
       (js/setTimeout #(u/re-render-mathjax) 30)])))
