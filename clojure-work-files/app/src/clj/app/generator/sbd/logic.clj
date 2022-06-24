(ns app.generator.sbd.logic)

(defn logic-01
  []
  (->> (for [a ["langit" "kucing" "kerupuk" "rengginang"]
             b ["berwarna biru" "berwarna coklat" "keliatan warna warni" "garing"]]
         (merge {:a a :b b}
                (let [[pa pb]
                      (rand-nth [["orang yang tingginya kurang dari 3m" "tingginya lebih dari 3m"]
                                 ["kucing yang beratnya kurang dari 1 ton" "beratnya ngga kurang dari 1 ton"]])]
                  {:pa pa :pb pb})))
       shuffle))

(defn logic-02
  []
  (->> (for [a ["pulang kampung" "baru kerja" "udah lama kerja" "baru jadi maba" "ikut internship"]
             b ["mendapat THR" "mendapat cuti" "naik gaji" "dapet upah minimal"]
             c ["Steven" "Calvin" "Oncom" "Ketoprak" "Firmino"]]
         {:a a :b b :c c})
       shuffle))

(defn logic-03
  []
  (->> (for [a ["ayam kampung" "rambutan meruyung" "serpihan jet" "kursi kaki tiga"]
             b ["berwarna hitam" "bergelar raden" "beradab" "menyukai rengginang"]]
         {:a a :b b})
       shuffle))

(defn logic-04
  []
  (->> (for [ops [:p :np :q :nq]
             pnp [["jalanan basah" "jalanan ga basah"]
                  ["hujan" "ga hujan"]
                  ["Koko mandi" "Koko ga mandi"]
                  ["UTBK dimundurin" "UTBK ga dimundurin"]
                  ["Tank berkeliaran" "Tank ga berkeliaran"]]
             qnq [["rumah jadi bener" "rumah ga jadi bener"]
                  ["TV rusak" "TV ga rusak"]
                  ["meja makan" "meja ga makan"]
                  ["air abis" "air ga abis"]
                  ["penggorengan berasap" "penggorengan ga berasap"]]]
         (merge {:p (pnp 0) :q (qnq 0)}
                (condp = ops
                  :p {:op (pnp 0) :pb (qnq 0) :p1 "Ga ada yang pasti bener" :p2 (qnq 1)}
                  :q {:op (qnq 0) :pb "Ga ada yang pasti bener" :p1 (pnp 0) :p2 (pnp 1)}
                  :np {:op (pnp 1) :pb "Ga ada yang pasti bener" :p1 (qnq 0) :p2 (qnq 1)}
                  :nq {:op (qnq 1) :pb (pnp 1) :p1 "Ga ada yang pasti bener" :p2 (pnp 0)})))
       shuffle))

(defn logic-05
  []
  (->> (for [ops [:p :np :q :nq]
             pnp [["jalanan basah" "jalanan ga basah"]
                  ["hujan" "ga hujan"]
                  ["Koko mandi" "Koko ga mandi"]
                  ["UTBK dimundurin" "UTBK ga dimundurin"]
                  ["Tank berkeliaran" "Tank ga berkeliaran"]]
             qnq [["rumah jadi bener" "rumah ga jadi bener"]
                  ["TV rusak" "TV ga rusak"]
                  ["meja makan" "meja ga makan"]
                  ["air abis" "air ga abis"]
                  ["penggorengan berasap" "penggorengan ga berasap"]]]
         (merge {:p (pnp 0) :q (qnq 0)}
                (condp = ops
                  :p {:op (pnp 0) :pb (qnq 0) :p1 "Ga ada yang pasti bener" :p2 (qnq 1)}
                  :q {:op (qnq 0) :pb "Ga ada yang pasti bener" :p1 (pnp 0) :p2 (pnp 1)}
                  :np {:op (pnp 1) :pb "Ga ada yang pasti bener" :p1 (qnq 0) :p2 (qnq 1)}
                  :nq {:op (qnq 1) :pb (pnp 1) :p1 "Ga ada yang pasti bener" :p2 (pnp 0)})))
       shuffle))

(defn logic-06
  []
  (->> (for [ops [:p :np :q :nq]
             pnp [["jalanan basah" "jalanan ga basah"]
                  ["hujan" "ga hujan"]
                  ["Koko mandi" "Koko ga mandi"]
                  ["UTBK dimundurin" "UTBK ga dimundurin"]
                  ["Tank berkeliaran" "Tank ga berkeliaran"]]
             qnq [["rumah jadi bener" "rumah ga jadi bener"]
                  ["TV rusak" "TV ga rusak"]
                  ["meja makan" "meja ga makan"]
                  ["air abis" "air ga abis"]
                  ["penggorengan berasap" "penggorengan ga berasap"]]]
         (merge {:p (pnp 0) :q (qnq 0)}
                (condp = ops
                  :p {:op (pnp 0) :pb (qnq 0) :p1 "Ga ada yang pasti bener" :p2 (qnq 1)}
                  :q {:op (qnq 0) :pb (pnp 0) :p1 "Ga ada yang pasti bener" :p2 (pnp 1)}
                  :np {:op (pnp 1) :pb (qnq 1) :p1 "Ga ada yang pasti bener" :p2 (qnq 0)}
                  :nq {:op (qnq 1) :pb (pnp 1) :p1 "Ga ada yang pasti bener" :p2 (pnp 0)})))
       shuffle))

(defn logic-07
  []
  (->> (for [ops [:p :np :q :nq :r :nr]
             pnp [["jalanan basah" "jalanan ga basah"]
                  ["hujan" "ga hujan"]
                  ["Koko mandi" "Koko ga mandi"]
                  ["UTBK dimundurin" "UTBK ga dimundurin"]
                  ["Tank berkeliaran" "Tank ga berkeliaran"]]
             qnq [["rumah jadi bener" "rumah ga jadi bener"]
                  ["TV rusak" "TV ga rusak"]
                  ["meja makan" "meja ga makan"]
                  ["air abis" "air ga abis"]
                  ["penggorengan berasap" "penggorengan ga berasap"]]
             rnr [["rotan menjadi api" "rotan ga jadi api"]
                  ["nasi menjadi bubur" "nasi ga jadi bubur"]
                  ["bathtub berbentuk lingkaran" "bathtub ga beberbentuk lingkaran"]
                  ["perseroan bangkrut" "perseroan ga bangkrut"]]]
         (merge {:p (pnp 0) :q (qnq 0) :r (rnr 0)}
                (condp = ops
                  :p {:pqr (pnp 0) :pb (rnr 0) :p1 "Ga ada yang pasti bener" :p2 (rnr 1)}
                  :q {:pqr (qnq 0) :pb "Ga ada yang pasti bener" :p1 (pnp 0) :p2 (pnp 1)}
                  :np {:pqr (pnp 1) :p1 (qnq 1) :pb "Ga ada yang pasti bener" :p2 (rnr 1)}
                  :nq {:pqr (qnq 1) :pb (pnp 1) :p1 "Ga ada yang pasti bener" :p2 (rnr 1)}
                  :r {:pqr (rnr 0) :pb "Ga ada yg pasti bener" :p1 (pnp 0) :p2 (qnq 1)}
                  :nr {:pqr (rnr 1) :pb (pnp 1) :p1 "Ga ada yg pasti bener" :p2 (qnq 0)})))
       shuffle))









