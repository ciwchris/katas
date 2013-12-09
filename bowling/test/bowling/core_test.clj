(ns bowling.core-test
  (:use midje.sweet)
  (:use [bowling.core]))

(tabular "bowling scores"
         (fact "it returs the score for the finished game"
               (score-game ?rolls) => ?score)
         ?rolls ?score
         (repeat 20 0) 0 ;all gutters
         (repeat 20 1) 20 ;no strikes or spares
         (concat [0 10] (repeat 18 1)) 29 ;spare, not in the last frame
         (concat [10] (repeat 18 1)) 30 ;strike, not in the last frame
         (concat (repeat 18 1) [0 10 1]) 29 ;spare in the last frame, extra roll
         (concat (repeat 18 1) [10 1 1]) 30 ;strike in the last frame, extra roll
         (repeat 12 10) 300) ;all strikes, two extra rolls 
