(ns prime-factors.core)

(defn prime-factors
  ([n] (prime-factors n 2))
  ([n candidate]
   (cond
     (= n 1) []
     (zero? (mod n candidate)) (cons candidate (prime-factors (/ n candidate)))
     :else (prime-factors n (inc candidate)))))
