(ns prime-factors.core-test
  (:use midje.sweet)
  (:use [prime-factors.core]))

(tabular "prime-factors"
         (fact "it retun the prime factors of a number"
               (prime-factors ?int) => ?prime-factors)
         ?int  ?prime-factors
         1     []
         2     [2]
         3     [3]
         4     [2 2]
         5     [5]
         6     [2 3]
         7     [7]
         8     (repeat 3 2)
         9     [3 3]
         (* 3 5 7 11 13)  [3 5 7 11 13])
