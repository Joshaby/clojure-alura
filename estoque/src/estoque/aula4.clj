(ns estoque.aula4)

(def precos [30 700 1000])

(println (precos 0))
(println (get precos 10))
(println (precos 1))

(println (conj precos 45))
(println precos)

(println (inc 5))
(println (update precos 0 inc))
(println (update precos 1 dec))

(defn soma
  [valor]
  (+ valor 1))

(println (update precos 0 soma))