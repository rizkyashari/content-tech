(ns app.viewersys.config
  (:require
    [app.utils :refer :all]))

(defn config
  "Reading the config, either intra-project or extra-project"
  []
  (cslurp "resources/config.edn"))
