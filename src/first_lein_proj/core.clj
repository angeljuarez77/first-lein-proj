(ns first-lein-proj.core
  (:gen-class))

 (defn -main
  [& args]
  (print "I don't do a whole lot ... yet.")
  (print "I'm a little tea pot"))

(defn my-first-function [] (
	(if true 
		(print "This is true from the firstFunction") 
		(print "This is false from the firstFunction"))
))

; (my-first-function)