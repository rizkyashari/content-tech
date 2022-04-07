(ns app.viewersys.system
  (:require
   [com.stuartsierra.component :as component]
   [app.viewersys.config :refer [config]]
   [clojure.tools.namespace.repl :refer [refresh]]
   [app.producer.component :as cont]
   [app.utils :refer :all]
   [app.viewersys.server :as immut]
   [app.viewersys.handler :as http]
   ;; [app.legacy.component :as legacy]
   ))

(defn create-system
  "It creates a system, and return the system, but not started yet"
  [mode]
  (let [{:keys [server content legacy]}
        (config)]
    (component/system-map
     :producer (cont/make (assoc content :mode mode))
     :handler (component/using (http/make) [:producer])
     :server (component/using (immut/make server) [:handler])
     :mode mode)))
