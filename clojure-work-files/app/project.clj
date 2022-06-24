(defproject app "0.1.0"
  :dependencies
  [[org.clojure/clojure "1.10.1"]
   [org.clojure/clojurescript "1.10.773"]
   [com.stuartsierra/component "1.0.0"]

   ;; html
   [selmer "1.12.31" :exclusions [commons-codec]]

   ;; cljs
   [reagent "0.10.0"]
   [re-frame "1.1.1"]
   [cljs-ajax "0.8.1"]

   ;; basic web setup
   [compojure "1.6.2" :exclusions [commons-codec]]
   [org.immutant/web "2.1.10"
    :exclusions [commons-codec]]
   [lib-noir "0.9.9" :exclusions [commons-codec]]
   [ring/ring-defaults "0.3.2" :exclusions [commons-codec]]
   [ring "1.8.2" :exclusions [commons-codec]]

   ;; standard web utilities & database
   [com.taoensso/timbre "5.1.0"]
   [environ "1.2.0"]
   [com.taoensso/carmine "3.1.0"]

   ;; utilities
   [clojure.java-time "0.3.2"]
   [prismatic/schema "1.1.12"]
   [clj-commons/fs "1.6.307"]
   [danlentz/clj-uuid "0.1.9"]
   [org.clojure/tools.namespace "1.0.0"]
   [dk.ative/docjure "1.14.0"]
   [pjstadig/humane-test-output "0.10.0"]
   [ring/ring-mock "0.4.0"]
   
   ;; SVG
   [dali "1.0.2"]
   
   ;; JSON Bourne
   [cheshire "5.10.0"]

   ;; CLJS Tools
   [re-frisk "1.5.1"]]
  

  :injections [(require 'pjstadig.humane-test-output)
               (pjstadig.humane-test-output/activate!)]

  :uberjar-name "apps.jar"
  :jar-name "appstore.jar"

  :min-lein-version "2.5.3"

  :source-paths ["src/clj"
                 "dev"
                 ".lein-git-deps/test-library/src"]

  :resource-paths ["resources"]

  :repl-options {:init-ns user}

  :plugins [[lein-cljsbuild "1.1.8"]
            [lein-cloverage "1.2.1"]
            [lein-git-deps "0.0.1-SNAPSHOT"]]
   
  :git-dependencies [["git@progen.gitlab.zeniusnet.com:libraries/test-library.git"]]

  :cljsbuild
  {:builds
   [{:id           "viewer"
     :source-paths ["src/viewer"]
     :compiler     {:main            app.core
                    :output-dir      "resources/public/js/compiled/out-viewer"
                    :output-to       "resources/public/js/viewer.js"
                    :closure-defines {"goog.DEBUG" false}
                    :optimizations   :whitespace
                    :pretty-print    false}}]}

  :profiles {}
  :clean-targets ^{:protect false} ["resources/public/js/compiled" "target"]
  :figwheel {:css-dirs ["resources/public/vendors"]})
