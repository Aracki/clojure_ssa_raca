(defproject ssa_raca "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [compojure "1.1.6"]
                 [org.clojure/java.jdbc "0.3.0-alpha5"]
                 [mysql/mysql-connector-java "5.1.25"]
                 [korma "0.4.2"]
                 [de.ubercode.clostache/clostache "1.4.0"]
                 [ring-basic-authentication "1.0.2"]
                 [cheshire "5.5.0"]
                 [clj-http "2.0.0"]
                 [incanter "1.5.6"]
                 [clojurewerkz/envision "0.1.0-SNAPSHOT"]
                 [overtone "0.9.1"]
                 ]
  :plugins [[lein-ring "0.9.6"]]
  :ring {:handler ssa_raca.core/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring-mock "0.1.5"]]}}

  )


