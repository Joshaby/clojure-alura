(ns loja_curso2.aula1)

(def vetor ["daniela" "guilherme" "carlos" "paulo"])

(println (first vetor))
(println (rest vetor))
(println (next vetor))

(println (rest []))
(println (next []))

(defn meu-mapa
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if (not (nil? primeiro))
      (do (funcao primeiro)
          (meu-mapa funcao (rest sequencia))))))

(meu-mapa println vetor)

(meu-mapa println (range 10000))

; Tail recursion
(defn meu-mapa1
  [funcao sequencia]
  (let [primeiro (first sequencia)]
    (if (not (nil? primeiro))
      (do (funcao primeiro)
          (recur funcao (rest sequencia))))))

(meu-mapa1 println (range 100000))
