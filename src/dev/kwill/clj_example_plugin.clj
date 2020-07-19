(ns dev.kwill.clj-example-plugin
  (:gen-class
    :name dev.kwill.clj-example-plugin.Main
    :extends org.bukkit.plugin.java.JavaPlugin))

(defn -onEnable
  [this]
  (let [port 7888]
    (println "launching nrepl server on port" port)
    (@(requiring-resolve 'nrepl.server/start-server) :port port)))

(defn -onDisable
  [this]
  (println "plugin disable..."))