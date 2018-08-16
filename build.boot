(def +version+ "0.0.1-0-SNAPSHOT")

(set-env!
 :wagons '[[s3-wagon-private "1.3.1"]]
 :repositories #(conj % ["rotocode.dre"
                         {:url "s3p://rotocode.dre/repo/"
                          :no-auth true}])
 :resource-paths #{"src"}
 :dependencies '[[org.clojure/clojure "1.9.0"]
                 [org.apache.jena/apache-jena-libs "3.4.0" :extension "pom"]

                 [adzerk/bootlaces "0.1.13" :scope "test"]])

(require '[adzerk.bootlaces :refer :all])
(bootlaces! +version+)

(task-options!
 pom {:project 'dre/aristotle
      :version +version+}
 push {:repo "rotocode.dre"})

;; install with  boot pom jar install
