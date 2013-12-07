(ns fizz-buzz.core-test
  (:use midje.sweet)
  (:use [fizz-buzz.core]))

(facts "fizz-buzz"
       (fact "it returns fizz for multiples of 3"
             (fizz-buzz 3) => "fizz"
             (fizz-buzz 6) => "fizz"
             (fizz-buzz 9) => "fizz")


       (fact "it returns buzz for multiples of 5"
             (fizz-buzz 5) => "buzz"
             (fizz-buzz 10) => "buzz")

       (fact "it returns fizz-buzz for multiples of 15"
             (fizz-buzz 15) => "fizz-buzz"
             (fizz-buzz 30) => "fizz-buzz"))


