(ns bowling.core)

(defn spare? [balls]
  (= 10 (reduce + (take 2 balls))))

(defn strike? [balls]
  (= 10 (first balls)))

(defn game-over? [balls]
  (< (count balls) 2))

(defn score-frame
  ([balls] (score-frame 2 balls))
  ([ball-thrown balls] (reduce + (take ball-thrown balls))))

(defn score-spare [balls]
  (score-frame 3 balls))

(defn score-strike [balls]
  (score-frame 3 balls))

(defn advance-frame [balls]
  (drop 2 balls))

(defn advance-frame-for-strike [balls]
  (if (= (count balls) 3) (drop 3 balls) (drop 1 balls)))

(defn score-game [rolls]
  (loop [score 0 balls rolls]
    (cond
      (game-over? balls) score
      (strike? balls) (recur
                        (+ score (score-strike balls))
                        (advance-frame-for-strike balls))
      (spare? balls) (recur
                       (+ score (score-spare balls))
                       (advance-frame balls))
      :else (recur
              (+ score (score-frame balls))
              (advance-frame balls)))))
