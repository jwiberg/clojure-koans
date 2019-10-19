(let [ab-adder (partial concat [:a :b])]
  (ab-adder [[1 2] [3 4]]))