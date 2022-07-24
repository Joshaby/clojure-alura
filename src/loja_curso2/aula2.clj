(ns loja_curso2.aula2)

(def vetor ["daniela" "guilherme" "carlos" "paulo" "ana"])

(defn conta
  [total-ate-agora elementos]
  (if (next elementos)
    (recur (inc total-ate-agora) (next elementos))
    (+ 1 total-ate-agora)))

(println (conta 0 []))

(defn conta1
  ([total-ate-agora elementos]
   (if (seq elementos)
     (recur (inc total-ate-agora) (next elementos))
     total-ate-agora))
  ([elementos] (conta1 0 elementos)))

(println (conta1 0 vetor))
(println (conta1 0 []))
(println (conta1 vetor))
(println (conta1 []))

(defn conta2
  [elementos]
  (loop [total-ate-agora 0
         elementos-restantes elementos]
    (if (seq elementos-restantes)
      (recur (inc total-ate-agora) (next elementos-restantes))
      total-ate-agora)))

(println (conta2 vetor))