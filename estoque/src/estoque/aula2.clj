(ns estoque.aula2)

(defn imprime-mensagem []
  (println "Bem-vindo ao estoque!"))

(imprime-mensagem)

(defn aplica-desconto
  "Retorna valor descontado"
  [valor-bruto]
  (* valor-bruto 0.9))

(defn aplica-desconto
  "Retorna valor descontado"
  [valor-bruto]
  (let [desconto 0.10]
    (* valor-bruto (- 1 desconto))))

(defn valor-descontado
  "Retorna valor descontado"
  [valor-bruto]
  (if (> valor-bruto 100)
    (let [taxa-de-desconto (/ 10 100) desconto (* valor-bruto taxa-de-desconto)]
      (- valor-bruto desconto))
    (println "Digite um valor maior que 100")))

(println (valor-descontado 111))