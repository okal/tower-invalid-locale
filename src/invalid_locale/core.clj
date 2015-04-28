(ns invalid-locale.core
  (:gen-class)
  (:require [taoensso.tower :as tower]))

(def dictionary
    {:en "translations/en.clj"
     :sw "translations/sw.clj"
     :de "translations/de.clj"})

(def i18n-config {:dictionary dictionary
                  :dev-mode? true
                  :fallback-locale :en})

(def translate (tower/make-t i18n-config))

(defn -main
  [& args]
  (let [language-code (-> args first keyword)
        subject (second args)
        greeting (translate language-code :greeting subject)]
      (println greeting)))
