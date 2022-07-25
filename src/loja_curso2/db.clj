(ns loja-curso2.db)

(def pedido0 {:usuario 14
              :itens {:mochila {:id :mochila :quantidade 4 :preco-unitario 80}
                      :camiseta {:id :camiseta :quantidade 6 :preco-unitario 40}
                      :tenis {:id :tenis :quantidade 2}}})

(def pedido4 {:usuario 14
              :itens {:mochila {:id :mochila :quantidade 4 :preco-unitario 80}
                      :camiseta {:id :camiseta :quantidade 6 :preco-unitario 40}
                      :tenis {:id :tenis :quantidade 2}}})

(def pedido1 {:usuario 15
              :itens {:mochila {:id :mochila :quantidade 2 :preco-unitario 80}
                      :camiseta {:id :camiseta :quantidade 3 :preco-unitario 40}
                      :tenis {:id :tenis :quantidade 1}}})

(def pedido2 {:usuario 16
              :itens {:mochila {:id :mochila :quantidade 2 :preco-unitario 80}
                      :camiseta {:id :camiseta :quantidade 3 :preco-unitario 40}
                      :tenis {:id :tenis :quantidade 1}}})

(def pedido3 {:usuario 17
              :itens {:mochila {:id :mochila :quantidade 2 :preco-unitario 80}
                      :camiseta {:id :camiseta :quantidade 3 :preco-unitario 40}
                      :tenis {:id :tenis :quantidade 1}}})

(defn todos-os-pedidos []
  [pedido0, pedido1, pedido2, pedido3, pedido4])