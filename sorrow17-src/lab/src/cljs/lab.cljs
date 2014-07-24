(ns sample
	(:require [clojure.string :as string]))

(defn lab-reader [msg] 
	(let [x (get (.-match msg) 1) nums (map js/parseFloat (string/split x #"\s+"))] 
		(.send msg (/ (apply + nums) (count nums))) ))

(set! *main-cli-fn* (fn [& args] nil))
(aset js/module "exports" (fn [robot] (.respond robot #"(?i)lab\s+(.*)" lab-reader)))