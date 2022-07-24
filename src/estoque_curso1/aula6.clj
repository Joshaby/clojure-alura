(ns estoque_curso1.aula6)

(def pedido {:mochila {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}})

(defn imprime-e-15
  [valor]
  (println valor)
  (println (class valor))
  15)

(println (map imprime-e-15 pedido))

(defn imprime
  [[chave valor]]
  (println chave "e" valor)
  (println (class chave) (class valor))
  valor)

(println (map imprime pedido))

(defn preco-dos-produtos
  [[_ valor]]
  (* (-> valor :quantidade) (-> valor :preco)))

(println (reduce + 0 (map preco-dos-produtos pedido)))

(defn total-pedido
  [pedido]
  (reduce + 0 (map preco-dos-produtos pedido)))

(println (total-pedido pedido))

; THREADING LAST
(defn total-pedido1
  [pedido]
  (->> pedido
      (map preco-dos-produtos)
      (reduce + 0)))

(println (total-pedido1 pedido))

(defn preco-dos-produtos1
  [produto]
  (* (-> produto :quantidade) (-> produto :preco)))

(defn total-pedidos2
  [pedido]
  (->> pedido
       vals
       (map preco-dos-produtos1)
       (reduce + 0)))

(println (total-pedidos2 pedido))

(def pedido {:mochila {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}
             :chaveiro {:quantidade 1}})

(defn gratuito?
  [item]
  (<= (get item :preco 0) 0))

(println (filter gratuito? (vals pedido)))

(defn gratuito1?
  [[_ item]]
  (<= (get item :preco 0) 0))

(println (filter gratuito1? pedido))
(println (filter (fn [[_ item]] (gratuito? item)) pedido))
(println (filter #(gratuito? (second %)) pedido))

(defn pago?
  [item]
  (not (gratuito? item)))

(println (pago? {:preco 50}))

(def pago1? (comp not gratuito?))

(println (pago1? {:preco 50}))

(def clientes [
               { :nome "Guilherme"
                :certificados ["Clojure" "Java" "Machine Learning"] }
               { :nome "Paulo"
                :certificados ["Java" "Ciência da Computação"] }
               { :nome "Daniela"
                :certificados ["Arquitetura" "Gastronomia"] }])

(->> clientes (map :certificados) (map count) (reduce +) println)