(ns loja-curso2.aula3
  (:require [loja-curso2.db :as l.db]))

(def total-de-pedidos (l.db/todos-os-pedidos))

(println total-de-pedidos)

(println (group-by :usuario total-de-pedidos))

(defn minha-funcao-de-agrupamente
  [elemento]
  (println "Elemento" elemento)
  (:usuario elemento))

(println (group-by minha-funcao-de-agrupamente total-de-pedidos))

(println (map count (vals (group-by :usuario total-de-pedidos))))

(defn conta-total-usuario
  [[usuario pedidos]]
  [usuario (count pedidos)])

(->> total-de-pedidos
     (group-by :usuario)
     (map conta-total-usuario)
     println)

(defn conta-total-usuario
  [[usuario pedidos]]
  {:usuario-id usuario
   :total-de-pedidos (count pedidos)})

(->> total-de-pedidos
     (group-by :usuario)
     (map conta-total-usuario)
     println)

(defn total-do-item
  [[_ detalhes]]
  (* (get detalhes :quantidade 0) (get detalhes :preco-unitario 0)))

(defn total-do-pedidos
  [pedido]
  (reduce + (map total-do-item pedido)))

(defn total-dos-pedidos
  [pedidos]
  (->> pedidos
       (map :itens)
       (map total-do-pedidos)
       (reduce +)))

(defn quantia-de-pedido-e-gasto-total-por-usuario
  [[usuario pedidos]]
  {:usuario-id usuario
   :total-de-pedidos (count pedidos)
   :preco-total (total-dos-pedidos pedidos)})

(->> total-de-pedidos
     (group-by :usuario)
     (map quantia-de-pedido-e-gasto-total-por-usuario)
     println)