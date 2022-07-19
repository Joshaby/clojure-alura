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

(defn aplica-desconto?
  "Verifica se deve aplicar desconto"
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado1
  "Retorna valor descontado, dependendo do valor bruto"
  [valor-bruto]
  (if (aplica-desconto? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (map valor-descontado1 precos))

(println (range 10))
(println (filter even? (range 10)))

(println (filter aplica-desconto? precos))

(defn minha-soma
  [valor-1 valor-2]
  (+ valor-1 valor-2))

(println (reduce minha-soma 0 precos))

(println (reduce + 0 (range 100)))