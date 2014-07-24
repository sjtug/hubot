(defproject lab "0.1.0-SNAPSHOT"
  :description "sorrow17's hubot plugin lib for otrlab"
  :url "http://github.com/Sorrow17/hubot"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
  				 [org.clojure/clojurescript "0.0-2268"]]
  :plugins [[lein-cljsbuild "1.0.3"]]
  :cljsbuild {
    :builds [{
        ; The path to the top-level ClojureScript source directory:
        :source-paths ["src/cljs"]
        ; The standard ClojureScript compiler options:
        :compiler {
          :target :nodejs
          :output-to "resources/js/lab.js"
          :optimizations :simple
          :pretty-print true}}]})
