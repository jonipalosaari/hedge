(set-env! :source-paths #{"test"}
          :resource-paths #{"src"}
          :dependencies '[[org.clojure/clojure "1.8.0"]
                          [boot/core "2.7.2" :scope "provided"]
                          [cheshire "5.8.0"]
                          [adzerk/bootlaces "0.1.13" :scope "test"]
                          [adzerk/boot-test "1.2.0" :scope "test"]])

(require '[adzerk.bootlaces :refer :all])
(require '[adzerk.boot-test :refer :all])

(def +version+ "0.0.2-SNAPSHOT")

(bootlaces! +version+)

(task-options!
 pom {:project 'siili/boot-hedge
      :version +version+
      :description "Boot tasks to build and deploy a hedge app to cloud"
      :url         "https://github.com/siilisolutions/hedge"
      :scm         {:url "https://github.com/siilisolutions/hedge.git" :dir "../"}
      :license     {"EPL" "http://www.eclipse.org/legal/epl-v10.html"}})




