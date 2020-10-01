(defn hello-world []
  (print "Hello World" ))

(hello-world)

(:name {:name "Alex", :age 50})

(take 5 (range))

(def root (js/document.querySelector "#root"))

(def today (.toDateString (new js/Date)))

(defn render []
  (set! (.-innerHTML root) (str "<h1>It's " today " today </h1>")))

(render)

(ns counter
  (:require [reagent.core :as r]
            [reagent.dom :as rd]))

(def app (js/document.querySelector "#app"))

(def counter (r/atom 0))

(defn counting-component
 []
 [:div
  "Counter: " @counter
  [:button
   {:on-click (fn [] (swap! counter inc))}
   "Increment counter"]])

(rd/render [counting-component] app)