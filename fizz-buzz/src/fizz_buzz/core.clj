(ns fizz-buzz.core)

(defn fizz-buzz [n]
  (cond
    (zero? (mod n 15)) "fizz-buzz" 
    (zero? (mod n 5)) "buzz" 
    (zero? (mod n 3)) "fizz"))
