(ns estoque.aula3)

; Predicate
(defn aplica-desconto?
  "Verifica se deve aplicar desconto"
  [valor-bruto]
  (if (> valor-bruto 100)
    true
    false))

(defn aplica-desconto1?
  "Verifica se deve aplicar desconto"
  [valor-bruto]
  (when (> valor-bruto 100)
    true))

(defn aplica-desconto2?
  "Verifica se deve aplicar desconto"
  [valor-bruto]
  (> valor-bruto 100))

(defn valor-descontado
  "Retorna valor descontado, dependendo do valor bruto"
  [valor-bruto]
  (if (aplica-desconto1? valor-bruto)
    (let [taxa-de-desconto (/ 10 100)
          desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    valor-bruto))

(println (valor-descontado 101))
(println (valor-descontado 100))
