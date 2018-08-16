(set-env!
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.9.0"]
                 [org.apache.jena/apache-jena-libs "3.4.0" :extension "pom"]])

(task-options!
 pom {:project 'arachne/aristotle
      :version "0.0.1-SNAPSHOT"})

;; install with  boot pom jar install
