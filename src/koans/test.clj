(defn factorial [n]
  (loop [n n acc n]
    (if (= n 1)
      acc
      (recur (dec n) (* acc (dec n))))))

(factorial 10)
