(ns counter
  (:require [reagent.core :as r]
            [reagent.dom :as rd]))

(def root (js/document.querySelector "#root"))
(def app (js/document.querySelector "#app"))

(defn hello-world [name]
  (print "Hello" name (+ 1 3)))

(:name {:name "Alex", :age 50})

(map #(* 2 %) (filter even? (take 5 (range))))

(first `(1, 2, 3))

(def today (.toDateString (new js/Date)))

(def root (js/document.querySelector "#root"))

(defn render []
  (set! (.-innerHTML root) (str "<h1>Hello World it's " today " today </h1>")))

(def app (js/document.querySelector "#app"))


(def counter (r/atom 0))

(defn counting-component
  []
  [:div
   "Counter: " @counter
   [:button
    {:on-click (fn [] (swap! counter inc))}
    "Increment COUNTER"]])

(render)
(rd/render [counting-component] app)
