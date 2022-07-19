(ns estoque_curso1.aula5)

(def estoque {"Mochila" 10
              "Camiseta" 5})

(defn ecamisa?
  [valor]
  (= valor "Camiseta"))

(println estoque)
(println (count estoque))
(println (filter ecamisa? (keys estoque)))
(println (keys estoque))
(println (vals estoque))

(def estoque1 {:Mochila 10
               :Camiseta 5})

(println (keys estoque1))

(println (assoc estoque1 :Cadeira 3))
(println (keys estoque1))

(println (update estoque1 :Mochila inc))

(println (dissoc estoque1 :Mochila))


(def pedido {:mochila {:quantidade 2 :preco 80}
             :camiseta {:quantidade 3 :preco 40}})

(println pedido)

(def pedido (assoc pedido :chaveiro {:quantidade 1 :preco 10}))

(println pedido)

(println (get pedido :mochila))
(println (get pedido :moc {}))
(println (:mochila pedido))
(println (:moc pedido {}))
(println (:quantidade (:mochila pedido)))

(println (update-in pedido [:mochila :quantidade] inc))

; THREADING FIRST
(println (-> pedido
             :mochila
             :quantidade))

(-> pedido
    :mochila
    :quantidade
    println)