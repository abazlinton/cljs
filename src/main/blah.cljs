(defn hello-world [name]
  (print "Hello World" name (+ 2 1)))

(hello-world "Alex")

(:name {:name "Alex", :age 50})

(map (fn [x] (* 2 x)) (filter even? (take 5 (range))))

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
