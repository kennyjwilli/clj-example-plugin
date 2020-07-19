(ns build.compile
  (:require
    [dev.kwill.clj-example-plugin]))

(defn -main
  [& args]
  (println "compiling...")
  (compile 'dev.kwill.clj-example-plugin))