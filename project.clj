(defproject metro "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "https://github.com/tbsschroeder/clojure-webshop-app"
  :license {:name "MIT"
            :url "https://opensouArce.org/licenses/MIT"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [org.clojure/data.json "1.0.0"]

                 ;; Lifecycle
                 [com.stuartsierra/component "1.0.0"]

                 ;; HTTP abstraction
                 [ring/ring-core "1.8.1"]

                 ;; HTML in Clojure
                 [hiccup "1.0.5"]

                 ;; Database
                 [org.clojure/java.jdbc "0.7.11"]
                 [org.postgresql/postgresql "42.2.12"]
                 [org.xerial/sqlite-jdbc "3.31.1"]
                 [korma "0.4.3"]

                 ;; Web server
                 [io.pedestal/pedestal.service "0.5.7"]
                 [io.pedestal/pedestal.jetty "0.5.7"]

                 ;; SLF4J and Logging Dependencies
                 ;; Add these to resolve SLF4J version conflicts and ensure proper logging.
                 [org.slf4j/slf4j-api "1.7.32"]
                 [org.slf4j/slf4j-simple "1.7.32"]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]
  :profiles {:uberjar {:aot :all}
             :dev     {:dependencies [[io.pedestal/pedestal.service-tools "0.5.7"]]
                       :plugins      [[lein-kibit "0.1.6"]  ; Static code analyzer
                                      [lein-ancient "0.6.15"] ; Dependency checker
                                      [lein-cljfmt "0.6.0"] ; Code formatter
                                      [jonase/eastwood "0.2.9"]] ; Lint tool
                       }}
  :target-path "target/%s"
  :main ^{:skip-aot false} metro.system)
