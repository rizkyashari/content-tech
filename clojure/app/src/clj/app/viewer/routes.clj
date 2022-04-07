(ns app.viewer.routes
  (:require
    [compojure.core :refer [GET POST context routes]]
    [compojure.route :refer [resources files not-found]]
    [ring.util.response :as resp]
    [cheshire.core :as cc]
    [app.legacy.producer :as lproducer]
    [app.utils :refer :all]
    [app.viewer.pages :as page]
    [noir.response :as nresp]))

(declare front-routes api-routes other-routes)

(defn main-routes
  [producer]
  (routes (front-routes producer)
          (context "/api" req (api-routes producer))
          (other-routes)))

(defn other-routes
  []
  (routes
   (resources "/")
   (not-found "<center><h1>Nothing to see here</h1></center>")))

(defn front-routes
  [producer]
  (routes
   (GET "/" req (page/home))
   (GET "/viewer" req (page/viewer producer))))

(defn api-routes
  [producer]
  (routes
   (GET "/param/:mesakeh" req
        (do (pres req)
            (nresp/edn req)))
   (GET "/get-templates" req
        (nresp/edn (get-in producer [:templates])))
   (GET "/get-problems-by-id/:template-id" [template-id]
        (let [dor (get-in producer [:problem-map template-id])]
          (nresp/edn dor)))
   (GET "/get-zp-problem-tree/:level" [level]
        (let [res (get-in producer [:zp-problem-tree level])]
          (nresp/edn res)))
   (POST "/get-zp-problem" [dir-string]
         (let [res (lproducer/get-zp-problem dir-string)]
           (nresp/edn res)))))

;; $ curl "http://localhost:4000/api/get-zp-problem?edn-dir=content-legacy/test-data.edn"
;; content-legacy/zp-problem/source/sd/05 SD Kelas 5/03 Bahasa Inggris Kelas 5/02 What Day Is It Today/02 Weekly Basis/zp_problem/03/zp-problem.edn
