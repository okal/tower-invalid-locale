(defproject invalid-locale "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [com.taoensso/tower "3.1.0-beta2"]]
  :main ^:skip-aot invalid-locale.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})