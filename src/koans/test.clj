(def test-address
  {:street-address "123 Test Lane"
   :city "Testerville"
   :state "TX"})

((fn [[a b]] (str a " " b)) ["Test" "Testerson"]test-address)

"Test Testerson, 123 Test Lane, Testerville, TX"
 
(___ ["Test" "Testerson"] test-address))

(let [{:keys [street-address :city :state]} test-address]
       (str street-address ", " city ", " state)))