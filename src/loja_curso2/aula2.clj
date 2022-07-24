(ns loja_curso2.aula2)

(def vetor ["daniela" "guilherme" "carlos" "paulo" "ana"])

(defn conta
  [total-ate-agora elementos]
  (recur (inc total-ate-agora) (rest elementos)))

(println (conta 0 vetor))