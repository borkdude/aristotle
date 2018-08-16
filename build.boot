(def +version+ "0.0.1")

(set-env!
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.9.0"]
                 [org.apache.jena/apache-jena-libs "3.4.0" :extension "pom"]

                 [adzerk/bootlaces "0.1.13" :scope "test"]])

(require '[adzerk.bootlaces :refer :all])
(bootlaces! +version+)

(task-options!
 pom {:project 'org.clojars.borkdude/aristotle
      :version +version+})

;; install with  boot pom jar install
