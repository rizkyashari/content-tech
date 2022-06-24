(ns app.generator.ashari.ips.smp_09.sejarah)

(defn masa-praaksara-7 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8])
               pengantar (rand-nth (for [a ["Perhatikan"
                                            "Cermati"]
                                         b ["pernyataan"
                                            "daftar"]
                                         c ["berikut ini"
                                            "di bawah ini"
                                            "berikut"]]
                                     (str a " " b " " c "!")))
               soal-1 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["nilai-nilai budaya pada masa praaksara"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " adalah ....")))
               soal-2 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang bukan termasuk"
                                         "yang bukan merupakan"]
                                      f ["nilai-nilai budaya pada masa praaksara"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " adalah ....")))
               benar ["Nilai kepercayaan."
                      "Nilai gotong royong."
                      "Nilai musyawarah."
                      "Nilai keadilan."
                      "Tradisi bercocok tanam."
                      "Tradisi bahari."]
               benar-1 (rand-nth benar)
               benar-2 (rand-nth (remove #{benar-1} benar))
               salah ["Nilai demokrasi."
                      "Hak asasi manusia."
                      "Nilai-nilai kebebasan."
                      "Nilai-nilai toleransi."
                      "Tradisi pandai besi."
                      "Tradisi berpolitik."
                      "Nilai-nilai kapitalis."]
               salah-1 (rand-nth salah)
               salah-2 (rand-nth (remove #{salah-1} salah))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 benar-1
                          :fakta2 salah-2
                          :soal soal-1
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 salah-1
                          :fakta2 benar-2
                          :soal soal-1
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 benar-1
                          :fakta2 benar-2
                          :soal soal-1
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 salah-1
                          :fakta2 salah-2
                          :soal soal-1
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 salah-1
                          :fakta2 benar-2
                          :soal soal-2
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 benar-1
                          :fakta2 salah-2
                          :soal soal-2
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 salah-1
                          :fakta2 salah-2
                          :soal soal-2
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 benar-1
                          :fakta2 benar-2
                          :soal soal-2
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn masa-praaksara-6 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Sejarah perkembangan bumi terbagi ke dalam beberapa periode."
                                    "Awal mula perkembangan bumi dibagi ke dalam periodisasi."
                                    "Perkembangan bumi dapat dibagi ke beberapa periode."])
               soal-1 (rand-nth (for [a ["Yang merupakan"
                                         "Yang termasuk"]
                                      b ["karakteristik"
                                         "ciri-ciri"]
                                      c ["masa arkaikum"]]
                                  (str a" "b" dari "c" adalah ....")))
               soal-2 (rand-nth (for [a ["Yang merupakan"
                                         "Yang termasuk"]
                                      b ["karakteristik"
                                         "ciri-ciri"]
                                      c ["masa paleozoikum"]]
                                  (str a " " b " dari " c " adalah ....")))
               soal-3 (rand-nth (for [a ["Yang merupakan"
                                         "Yang termasuk"]
                                      b ["karakteristik"
                                         "ciri-ciri"]
                                      c ["masa mesozoikum"]]
                                  (str a " " b " dari " c " adalah ....")))
               soal-4 (rand-nth (for [a ["Yang merupakan"
                                         "Yang termasuk"]
                                      b ["karakteristik"
                                         "ciri-ciri"]
                                      c ["masa neozoikum"]]
                                  (str a " " b " dari " c " adalah ....")))
               jawaban [["kulit bumi masih sangat panas"
                         "belum adanya tanda-tanda kehidupan"]
                        ["sudah mulai adanya tanda-tanda kehidupan"
                         "mulai munculnya mikroorganisme"]
                        ["munculnya binatang-binatang besar"
                         "munculnya dinosaurus"]
                        ["munculnya mamalia"
                         "awal dari munculnya manusia"
                         "ditandai punahnya dinosaurus"]]]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :soal soal-1
                          :pb (rand-nth (jawaban 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 1) (concat (jawaban 2) (jawaban 3))))))
              :S2 (merge {:pengantar pengantar
                          :soal soal-2
                          :pb (rand-nth (jawaban 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 2) (jawaban 3))))))
              :S3 (merge {:pengantar pengantar
                          :soal soal-3
                          :pb (rand-nth (jawaban 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 1) (jawaban 3))))))
              :S4 (merge {:pengantar pengantar
                          :soal soal-4
                          :pb (rand-nth (jawaban 3))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 1) (jawaban 2))))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 54)
       shuffle))

(defn masa-praaksara-10 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8 :S9 :S10 :S11 :S12 :S13 :S14 :S15 :S16])
               pengantar (rand-nth (for [a ["Perhatikan"
                                            "Cermati"]
                                         b ["pernyataan"
                                            "daftar"]
                                         c ["berikut ini"
                                            "di bawah ini"
                                            "berikut"]]
                                     (str a " " b " " c "!")))
               soal-1 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["arkaikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-2 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["paleozoikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-3 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["mesozoikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-4 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["neozoikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               arkaikum ["Kulit bumi masih sangat panas."
                         "Belum adanya tanda-tanda makhluk hidup."
                         "Mulai terbentuknya lempeng bumi."
                         "Mulai terbentuknya gunung api."
                         "Mulai terbentuknya lapisan bumi."]
               arkaikum-1 (rand-nth arkaikum)
               arkaikum-2 (rand-nth (remove #{arkaikum-1} arkaikum))
               paleozoikum ["Sudah muncul tanda-tanda makhluk hidup."
                            "Curah hujan masih sangat besar."
                            "Suhu di bumi menurun drastis."
                            "Munculnya daratan es."
                            "Sering disebut ice age (zaman es)"]
               paleozoikum-1 (rand-nth paleozoikum)
               paleozoikum-2 (rand-nth (remove #{paleozoikum-1} paleozoikum))
               mesozoikum ["Sudah bermunculannya binatang-binatang besar."
                           "Munculnya dinosaurus."
                           "Sudah munculnya iklim tropis."
                           "Awal berakhirnya zaman es."]
               mesozoikum-1 (rand-nth mesozoikum)
               mesozoikum-2 (rand-nth (remove #{mesozoikum-1} mesozoikum))
               neozoikum ["Mulai punahnya dinosaurus."
                          "Munculnya binatang mamalia (menyusui}."
                          "Awal mula munculnya kehidupan manusia."]
               neozoikum-1 (rand-nth neozoikum)
               neozoikum-2 (rand-nth (remove #{neozoikum-1} neozoikum))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 arkaikum-1
                          :fakta2 paleozoikum-2
                          :soal soal-1
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 mesozoikum-1
                          :fakta2 arkaikum-2
                          :soal soal-1
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 arkaikum-1
                          :fakta2 arkaikum-2
                          :soal soal-1
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 paleozoikum-1
                          :fakta2 neozoikum-2
                          :soal soal-1
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 paleozoikum-1
                          :fakta2 arkaikum-2
                          :soal soal-2
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 mesozoikum-1
                          :fakta2 paleozoikum-2
                          :soal soal-2
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 paleozoikum-1
                          :fakta2 paleozoikum-2
                          :soal soal-2
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 arkaikum-1
                          :fakta2 mesozoikum-2
                          :soal soal-2
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S9 (merge {:pengantar pengantar
                          :fakta1 mesozoikum-1
                          :fakta2 paleozoikum-2
                          :soal soal-3
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S10 (merge {:pengantar pengantar
                          :fakta1 arkaikum-1
                          :fakta2 mesozoikum-2
                          :soal soal-3
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S11 (merge {:pengantar pengantar
                          :fakta1 mesozoikum-1
                          :fakta2 mesozoikum-2
                          :soal soal-3
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S12 (merge {:pengantar pengantar
                          :fakta1 paleozoikum-1
                          :fakta2 arkaikum-2
                          :soal soal-3
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S13 (merge {:pengantar pengantar
                          :fakta1 neozoikum-1
                          :fakta2 arkaikum-2
                          :soal soal-4
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S14 (merge {:pengantar pengantar
                          :fakta1 mesozoikum-1
                          :fakta2 neozoikum-2
                          :soal soal-4
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S15 (merge {:pengantar pengantar
                          :fakta1 neozoikum-1
                          :fakta2 neozoikum-2
                          :soal soal-4
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S16 (merge {:pengantar pengantar
                          :fakta1 arkaikum-1
                          :fakta2 paleozoikum-2
                          :soal soal-4
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))
       
       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn masa-praaksara-7b []
  (->> (fn []
         (let [soal (rand-nth ["Berdasarkan temuan arkeologi, manusia masa praaksara di Indonesia dilewati oleh 2 periode, yaitu ...."
                               "Secara arkeologis, manusia masa praaksara di Indonesia dilalui oleh 2 periode, yaitu ...."
                               "Berdasarkan bukti temuan yang ada, manusia masa praaksara di Indonesia dilewati oleh 2 periode, yaitu ...."])
               benar ["zaman batu dan logam"
                      "zaman logam dan batu"]
               salah ["zaman besi dan tembaga"
                      "paleolitikum dan mesolitikum"
                      "masa prasejarah dan sejarah"
                      "masa tersier dan kuartier"
                      "zaman besi dan logam"
                      "zaman besi dan baja"
                      "masa sesudah mengenal tulisan dan sebelum mengenal tulisan"]]

           (merge {:soal soal
                   :pb (rand-nth benar)}
                  (zipmap [:p1 :p2 :p3] (shuffle salah)))))

       (repeatedly 100)
       distinct
       shuffle
       (take 20)
       shuffle))

(defn masa-praaksara []
  (->> (fn []
         (let [pengantar (rand-nth ["Kehidupan manusia Indonesia zaman batu terbagi ke dalam 4 periode."
                                    "Perkembangan kehidupan zaman batu di Indonesia terbagi ke dalam 4 periode."
                                    "Periodisasi zaman batu di Indonesia terbagi ke dalam 4 zaman."])
               soal (rand-nth ["Yang termasuk urutan periodisasi zaman batu di Indonesia adalah ...."
                               "Yang merupakan urutan periodisasi zaman batu di Indonesia adalah ...."
                               "Adapun urutan periodisasi zaman batu di Indonesia adalah ...."
                               "Adapun urutan periodisasi zaman batu di Indonesia adalah ...."])
               benar ["Paleolitikum - Mesolitikum - Neolitikum - Megalitikum"]
               salah ["Paleozoikum - Neozoikum - Mesozoikum - Arkaikum"
                      "Arkaikum - Neozoikum - Mesozoikum - Paleozoikum"
                      "Neozoikum - Mesozoikum - Paleozoikum - Arkaikum"
                      "Paleolitikum - Mesolitikum - Neolitikum - Megalitikum"
                      "Mesolitikum - Neolitikum - Paleolitikum - Megalitikum"
                      "Neolitikum - Megalitikum - Mesolitikum - Paleolitikum"]]

           (merge {:soal soal
                   :pb (rand-nth benar)}
                  (zipmap [:p1 :p2 :p3] (shuffle salah)))))

       (repeatedly 100)
       distinct
       shuffle
       (take 25)
       shuffle))

(defn masa-praaksara-8 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Zaman batu di Indonesia sendiri terbagi ke dalam 4 periode, yaitu paleolitikum, mesolitikum, neolitikum, dan megalitikum."
                                    "Zaman batu pada masa praaksara di Indonesia terbagi ke dalam 4 zaman, yaitu zaman paleolitikum, mesolitikum, neolitikum, dan megalitikum."
                                    "Secara arkeologis, zaman batu di Indonesia terbagi ke dalam 4 zaman, yaitu zaman paleolitikum, mesolitikum, neolitikum, dan megalitikum."])
               soal-1 (rand-nth (for [a ["Yang merupakan"
                                         "Yang termasuk"]
                                      b ["karakteristik"
                                         "ciri-ciri"]
                                      c ["zaman paleolitikum"]]
                                  (str a " " b " dari " c " adalah ....")))
               soal-2 (rand-nth (for [a ["Yang merupakan"
                                         "Yang termasuk"]
                                      b ["karakteristik"
                                         "ciri-ciri"]
                                      c ["zaman mesolitikum"]]
                                  (str a " " b " dari " c " adalah ....")))
               soal-3 (rand-nth (for [a ["Yang merupakan"
                                         "Yang termasuk"]
                                      b ["karakteristik"
                                         "ciri-ciri"]
                                      c ["zaman neolitikum"]]
                                  (str a " " b " dari " c " adalah ....")))
               soal-4 (rand-nth (for [a ["Yang merupakan"
                                         "Yang termasuk"]
                                      b ["karakteristik"
                                         "ciri-ciri"]
                                      c ["zaman megalitikum"]]
                                  (str a " " b " dari " c " adalah ....")))
               jawaban [["manusia masih hidup nomaden"
                         "manusia memperoleh makanan dengan berburu"
                         "manusia masih hidup berpindah-pindah"]
                        ["peralihan dari manusia nomaden ke sedenter"
                         "peninggalan berupa abris sous roche"]
                        ["manusia sudah mulai menetap"
                         "manusia sudah mulai hidup sedenter"
                         "manusia sudah mulai bercocok tanam"]
                        ["sudah adanya peninggalan batu besar"
                         "munculnya kepercayaan"]]]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :soal soal-1
                          :pb (rand-nth (jawaban 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 1) (concat (jawaban 2) (jawaban 3))))))
              :S2 (merge {:pengantar pengantar
                          :soal soal-2
                          :pb (rand-nth (jawaban 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 2) (jawaban 3))))))
              :S3 (merge {:pengantar pengantar
                          :soal soal-3
                          :pb (rand-nth (jawaban 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 1) (jawaban 3))))))
              :S4 (merge {:pengantar pengantar
                          :soal soal-4
                          :pb (rand-nth (jawaban 3))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 1) (jawaban 2))))))))))

       (repeatedly 300)
       distinct
       shuffle
       (take 120)
       shuffle))

(defn masa-praaksara-9 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8 :S9 :S10 :S11 :S12 :S13 :S14 :S15 :S16])
               pengantar (rand-nth (for [a ["Perhatikan"
                                            "Cermati"]
                                         b ["pernyataan"
                                            "daftar"]
                                         c ["berikut ini"
                                            "di bawah ini"
                                            "berikut"]]
                                     (str a " " b " " c "!")))
               soal-1 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["zaman paleolitikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-2 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["zaman mesolitikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-3 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["zaman neolitikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-4 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["zaman megalitikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               paleolitikum ["Kehidupannya masih berpindah-pindah (nomaden)."
                             "Masih berburu dan meramu"
                             "Perkakas batu masih sangat kasar dan sederhana"
                             "Awal manusia mengenal peralatan batu."
                             "Salah satu peninggalannya berupa kapak perimbas dan kapak genggam."
                             "Hasil kebudayaannya banyak ditemukan di Ngandong dan Pacitan."]
               paleolitikum-1 (rand-nth paleolitikum)
               paleolitikum-2 (rand-nth (remove #{paleolitikum-1} paleolitikum))
               mesolitikum ["Masa peralihan dari kehidupan berpindah-pindah ke menetap (semi sedenter)."
                            "Peninggalan alatnya berupa flakes dan pebble."
                            "Peninggalan kebudayaannya berupa <i>kjokkenmoddinger</i> dan <i>abris sous roche</i>."
                            "Peninggalannya banyak ditemukan di Sulawesi Selatan, Bojonegoro, dan Besuki."]
               mesolitikum-1 (rand-nth mesolitikum)
               mesolitikum-2 (rand-nth (remove #{mesolitikum-1} mesolitikum))
               neolitikum ["Awal mula kehidupan menetap (sedenter)."
                           "Awal mula kehidupan bercocok tanam."
                           "Mampu menghasilkan makanannya sendiri."
                           "Peninggalannya berupa kapak persegi dan kapak lonjong."
                           "Kehidupannya sudah mulai bergotong royong."
                           "Sudah memiliki aturan hidup bersama."]
               neolitikum-1 (rand-nth neolitikum)
               neolitikum-2 (rand-nth (remove #{neolitikum-1} neolitikum))
               megalitikum ["Munculnya sistem kepercayaan."
                            "Peninggalannya berupa bangunan batu besar."
                            "Salah satu peninggalannya berupa tugu batu, sarkofagus, dan waruga."
                            "Sudah mampu membuat monumen pemujaan."]
               megalitikum-1 (rand-nth megalitikum)
               megalitikum-2 (rand-nth (remove #{megalitikum-1} megalitikum))
               pembahasan [["Adapun karakteristik dari zaman paleolitikum di antaranya.<br>
                             <ol>
                             <li>Kehidupannya masih berpindah-pindah (nomaden).</li>
                             <li>Masih berburu dan meramu.</li>
                             <li>Perkakas batu masih sangat kasar dan sederhana.</li>
                             <li>Awal manusia mengenal peralatan batu.</li>
                             <li>Peninggalannya berupa kapak perimbas dan kapak genggam.</li>
                             <li>Hasil kebudayaannya banyak ditemukan di Ngandong dan Pacitan.</li>
                             </ol>"]
                           ["Adapun karakteristik dari zaman mesolitikum di antaranya.<br>
                             <ol>
                             <li>Masa peralihan dari kehidupan berpindah-pindah ke menetap (semi sedenter).</li>
                             <li>Peninggalan alatnya berupa flakes dan pebble.</li>
                             <li>Peninggalan kebudayaannya berupa <i>kjokkenmoddinger</i> yang merupakan sampah dapur dan <i>abris sous roche</i> yang merupakan gua untuk tempat tinggal.</li>
                             <li>Peninggalannya banyak ditemukan di daerah Sulawesi Selatan, Bojonegoro, dan Besuki.</li>
                             </ol>"]
                           ["Adapun karakteristik dari zaman neolitikum di antaranya.<br>
                             <ol>
                             <li>Awal mula dari kehidupan menetap (sedenter).</li>
                             <li>Awal mula dari kehidupan bercocok tanam (bertani).</li>
                             <li>Mampu menghasilkan makanannya sendiri.</li>
                             <li>Peninggalannya berupa kapak persegi dan kapak lonjong.</li>
                             <li>Kehidupannya sudah mulai bergotong royong.</li>
                             <li>Sudah memiliki aturan hidup bersama.</li>
                             </ol>"]
                           ["Adapun karakteristik dari zaman megalitikum di antaranya.<br>
                             <ol>
                             <li>Sudah munculnya sistem kepercayaan.</li>
                             <li>Berisikan peninggalan berupa bangunan batu besar.</li>
                             <li>Peninggalannya berupa tugu batu (menhir), kubur batu (sarkofagus), peti kubur berbentuk kecil  (waruga), meja batu (dolmen), dan punden berundak.</li>
                             <li>Sudah mampu membuat tempat atau monumen pemujaan.</li>
                             </ol>"]]
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 paleolitikum-1
                          :fakta2 mesolitikum-2
                          :soal soal-1
                          :pb (jawaban 0)
                          :pembahasan (rand-nth (pembahasan 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-1
                          :pb (jawaban 1)
                          :pembahasan (rand-nth (pembahasan 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 paleolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-1
                          :pb (jawaban 2)
                          :pembahasan (rand-nth (pembahasan 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 megalitikum-2
                          :soal soal-1
                          :pb (jawaban 3)
                          :pembahasan (rand-nth (pembahasan 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 mesolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-2
                          :pb (jawaban 0)
                          :pembahasan (rand-nth (pembahasan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 mesolitikum-2
                          :soal soal-2
                          :pb (jawaban 1)
                          :pembahasan (rand-nth (pembahasan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 mesolitikum-1
                          :fakta2 mesolitikum-2
                          :soal soal-2
                          :pb (jawaban 2)
                          :pembahasan (rand-nth (pembahasan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-2
                          :pb (jawaban 3)
                          :pembahasan (rand-nth (pembahasan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S9 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-3
                          :pb (jawaban 0)
                          :pembahasan (rand-nth (pembahasan 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S10 (merge {:pengantar pengantar
                           :fakta1 paleolitikum-1
                           :fakta2 neolitikum-2
                           :soal soal-3
                           :pb (jawaban 1)
                           :pembahasan (rand-nth (pembahasan 2))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S11 (merge {:pengantar pengantar
                           :fakta1 neolitikum-1
                           :fakta2 neolitikum-2
                           :soal soal-3
                           :pb (jawaban 2)
                           :pembahasan (rand-nth (pembahasan 2))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S12 (merge {:pengantar pengantar
                           :fakta1 paleolitikum-1
                           :fakta2 megalitikum-2
                           :soal soal-3
                           :pb (jawaban 3)
                           :pembahasan (rand-nth (pembahasan 2))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S13 (merge {:pengantar pengantar
                           :fakta1 megalitikum-1
                           :fakta2 paleolitikum-2
                           :soal soal-4
                           :pb (jawaban 0)
                           :pembahasan (rand-nth (pembahasan 3))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S14 (merge {:pengantar pengantar
                           :fakta1 mesolitikum-1
                           :fakta2 megalitikum-2
                           :soal soal-4
                           :pb (jawaban 1)
                           :pembahasan (rand-nth (pembahasan 3))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S15 (merge {:pengantar pengantar
                           :fakta1 megalitikum-1
                           :fakta2 megalitikum-2
                           :soal soal-4
                           :pb (jawaban 2)
                           :pembahasan (rand-nth (pembahasan 3))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S16 (merge {:pengantar pengantar
                           :fakta1 neolitikum-1
                           :fakta2 mesolitikum-2
                           :soal soal-4
                           :pb (jawaban 3)
                           :pembahasan (rand-nth (pembahasan 3))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn masa-praaksara-4 []
  (->> (fn []
         (let [pengantar (rand-nth ["Masa perundagian merupakan akhir dari masa praaksara di Indonesia."
                                    "Salah satu tahap dari masa praaksara di Indonesia adalah masa perundagian."
                                    "Berakhirnya masa praaksara ditandai oleh munculnya masa perundagian."])
               soal (rand-nth (for [a ["Yang dimaksud dengan"
                                       "Pengertian dari"
                                       "Definisi dari"
                                       "Yang merupakan pengertian dari"]
                                    b ["perundagian"]]
                                  (str a " " b " adalah ....")))
               benar ["sekelompok masyarakat yang sudah memiliki keahlian tertentu"
                      "sekelompok manusia yang sudah memiliki keterampilan tertentu"]
               salah ["sekelompok masyarakat yang sudah hidup berkelompok"
                      "sekelompok masyarakat yang sudah hidup bercocok tanam"
                      "sebuah kehidupan masyarakat praaksara yang sudah hidup sedenter"
                      "kebudayaan yang berpindah-pindah tempat"
                      "nilai-nilai leluhur yang dianut oleh masyarakat praaksara"
                      "sekelompok masyarakat yang sudah memiliki kepercayaan kepada roh"]]

           (merge {:pengantar pengantar
                   :soal soal
                   :pb (rand-nth benar)}
                  (zipmap [:p1 :p2 :p3] (shuffle salah)))))

       (repeatedly 100)
       distinct
       shuffle
       (take 24)
       shuffle))

(defn masa-praaksara-3 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8 :S9 :S10 :S11 :S12])
               pengantar (rand-nth (for [a ["Perhatikan"
                                            "Cermati"]
                                         b ["pernyataan"
                                            "daftar"]
                                         c ["berikut ini"
                                            "di bawah ini"
                                            "berikut"]]
                                     (str a " " b " " c "!")))
               soal-1 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["animisme"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari sistem kepercayaan " g " adalah ....")))
               soal-2 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["dinamisme"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari sistem kepercayaan " g " adalah ....")))
               soal-3 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["totemisme"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari sistem kepercayaan " g " adalah ....")))
               animisme ["Percaya kepada roh."
                         "Menganggap setiap tempat memiliki roh."
                         "Sering meminta perlindungan kepada roh."
                         "Mengadakan ritual kepada arwah atau roh."]
               animisme-1 (rand-nth animisme)
               animisme-2 (rand-nth (remove #{animisme-1} animisme))
               dinamisme ["Menganggap setiap benda memiliki kekuatan."
                          "Benda-benda dianggap suci."
                          "Mengkramatkan suatu benda."]
               dinamisme-1 (rand-nth dinamisme)
               dinamisme-2 (rand-nth (remove #{dinamisme-1} dinamisme))
               totemisme ["Memuja hewan yang dianggap suci."
                          "Berhubungan dengan pemujaan hewan."
                          "Sering menggunakan lambang atau simbol hewan."]
               totemisme-1 (rand-nth totemisme)
               totemisme-2 (rand-nth (remove #{totemisme-1} totemisme))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 animisme-1
                          :fakta2 dinamisme-2
                          :soal soal-1
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 totemisme-1
                          :fakta2 animisme-2
                          :soal soal-1
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 animisme-1
                          :fakta2 animisme-2
                          :soal soal-1
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 dinamisme-1
                          :fakta2 totemisme-2
                          :soal soal-1
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 dinamisme-1
                          :fakta2 animisme-2
                          :soal soal-2
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 totemisme-1
                          :fakta2 dinamisme-2
                          :soal soal-2
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 dinamisme-1
                          :fakta2 dinamisme-2
                          :soal soal-2
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 animisme-1
                          :fakta2 totemisme-2
                          :soal soal-2
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S9 (merge {:pengantar pengantar
                          :fakta1 totemisme-1
                          :fakta2 dinamisme-2
                          :soal soal-3
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S10 (merge {:pengantar pengantar
                           :fakta1 animisme-1
                           :fakta2 totemisme-2
                           :soal soal-3
                           :pb (jawaban 1)}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S11 (merge {:pengantar pengantar
                           :fakta1 totemisme-1
                           :fakta2 totemisme-2
                           :soal soal-3
                           :pb (jawaban 2)}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S12 (merge {:pengantar pengantar
                           :fakta1 dinamisme-1
                           :fakta2 animisme-2
                           :soal soal-3
                           :pb (jawaban 3)}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn masa-praaksara-6b []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8])
               soal-1 (rand-nth (for [a ["Berikut ini"
                                         "Di bawah ini"]
                                      b ["yang termasuk"
                                         "yang merupakan"]
                                      c ["paleolitikum"]]
                                  (str a " " b " peninggalan dari zaman " c " adalah ....")))
               soal-2 (rand-nth (for [a ["Yang termasuk"
                                         "Yang merupakan"]
                                      b ["paleolitikum"]]
                                  (str a " peninggala dari zaman " b " adalah ....")))
               soal-3 (rand-nth (for [a ["Berikut ini"
                                         "Di bawah ini"]
                                      b ["yang termasuk"
                                         "yang merupakan"]
                                      c ["mesolitikum"]]
                                  (str a " " b " peninggalan dari zaman " c " adalah ....")))
               soal-4 (rand-nth (for [a ["Yang termasuk"
                                         "Yang merupakan"]
                                      b ["mesolitikum"]]
                                  (str a " peninggala dari zaman " b " adalah ....")))
               soal-5 (rand-nth (for [a ["Berikut ini"
                                         "Di bawah ini"]
                                      b ["yang termasuk"
                                         "yang merupakan"]
                                      c ["neolitikum"]]
                                  (str a " " b " peninggalan dari zaman " c " adalah ....")))
               soal-6 (rand-nth (for [a ["Yang termasuk"
                                         "Yang merupakan"]
                                      b ["neolitikum"]]
                                  (str a " peninggala dari zaman " b " adalah ....")))
               soal-7 (rand-nth (for [a ["Berikut ini"
                                         "Di bawah ini"]
                                      b ["yang termasuk"
                                         "yang merupakan"]
                                      c ["megalitikum"]]
                                  (str a " " b " peninggalan dari zaman " c " adalah ....")))
               soal-8 (rand-nth (for [a ["Yang termasuk"
                                         "Yang merupakan"]
                                      b ["megalitikum"]]
                                  (str a " peninggala dari zaman " b " adalah ....")))
               jawaban [["kapak genggam"
                         "kapak perimbas"
                         "flakes"
                         "perkakas dari tulang"]
                        ["pebble"
                         "kapak pendek"
                         "kjokkenmodinger"
                         "lukisan dinding gua"
                         "abris sous roche"]
                        ["Kapak persegi."
                         "Kapak lonjong."
                         "Mata panah."
                         "Gerabah."
                         "Perhiasan."
                         "Alat pemukul kulit kayu."]
                        ["Sarkofagus."
                         "Dolmen."
                         "Menhir."
                         "Waruga."
                         "Arca."
                         "Punden-berundak."]]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth (jawaban 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 1) (concat (jawaban 2) (jawaban 3))))))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth (jawaban 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 1) (concat (jawaban 2) (jawaban 3))))))
              :S3 (merge {:soal soal-3
                          :pb (rand-nth (jawaban 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 2) (jawaban 3))))))
              :S4 (merge {:soal soal-4
                          :pb (rand-nth (jawaban 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 2) (jawaban 3))))))
              :S5 (merge {:soal soal-5
                          :pb (rand-nth (jawaban 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 1) (jawaban 3))))))
              :S6 (merge {:soal soal-6
                          :pb (rand-nth (jawaban 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 1) (jawaban 3))))))
              :S7 (merge {:soal soal-7
                          :pb (rand-nth (jawaban 3))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 1) (jawaban 2))))))
              :S8 (merge {:soal soal-8
                          :pb (rand-nth (jawaban 3))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (jawaban 0) (concat (jawaban 1) (jawaban 2))))))))))

       (repeatedly 300)
       distinct
       shuffle
       (take 100)
       shuffle))

(defn masa-praaksara-5 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8 :S9 :S10 :S11 :S12 :S13 :S14 :S15 :S16])
               pengantar (rand-nth (for [a ["Perhatikan"
                                            "Cermati"]
                                         b ["pernyataan"
                                            "daftar"]
                                         c ["berikut ini"
                                            "di bawah ini"
                                            "berikut"]]
                                     (str a " " b " " c "!")))
               soal-1 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["zaman paleolitikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-2 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["zaman mesolitikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-3 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["zaman neolitikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               soal-4 (rand-nth (for [b ["pernyataan"
                                         "daftar"]
                                      d ["di atas"
                                         "tersebut"]
                                      e ["yang termasuk"
                                         "yang merupakan"]
                                      f ["karakteristik"
                                         "ciri-ciri"]
                                      g ["zaman megalitikum"]]
                                  (str "Berdasarkan " b " " d ", " e " " f " dari masa " g " adalah ....")))
               paleolitikum ["Kapak genggam."
                             "Kapak perimbas."
                             "Flakes."
                             "Perkakas dari tulang."]
               paleolitikum-1 (rand-nth paleolitikum)
               paleolitikum-2 (rand-nth (remove #{paleolitikum-1} paleolitikum))
               mesolitikum ["Pebble."
                            "Kapak pendek."
                            "Kjokkenmodinger."
                            "Lukisan dinding gua."
                            "Abris sous roche."]
               mesolitikum-1 (rand-nth mesolitikum)
               mesolitikum-2 (rand-nth (remove #{mesolitikum-1} mesolitikum))
               neolitikum ["Kapak persegi."
                           "Kapak lonjong."
                           "Mata panah."
                           "Gerabah."
                           "Perhiasan."
                           "Alat pemukul kulit kayu."]
               neolitikum-1 (rand-nth neolitikum)
               neolitikum-2 (rand-nth (remove #{neolitikum-1} neolitikum))
               megalitikum ["Sarkofagus."
                            "Dolmen."
                            "Menhir."
                            "Waruga."
                            "Arca."
                            "Punden-berundak."]
               megalitikum-1 (rand-nth megalitikum)
               megalitikum-2 (rand-nth (remove #{megalitikum-1} megalitikum))
               pembahasan [["Adapun peninggalan dari zaman paleolitikum di antaranya:<br>
                             <ol>
                             <li>kapak genggam</li>
                             <li>kapak perimbas</li>
                             <li>flakes</li>
                             <li>perkakas dari tulang dan tanduk</li>
                             </ol>"]
                           ["Adapun peninggalan dari zaman mesolitikum di antaranya:<br>
                             <ol>
                             <li>pebble</li>
                             <li>kapak pendek (hache courte)</li>
                             <li>kjokkenmodinger</li>
                             <li>abris sous roche</li>
                             <li>lukisan dinding di gua</li>
                             </ol>"]
                           ["Adapun peninggalan dari zaman neolitikum di antaranya:<br>
                             <ol>
                             <li>kapak persegi</li>
                             <li>kapak lonjong</li>
                             <li>mata panah</li>
                             <li>gerabah</li>
                             <li>perhiasan</li>
                             <li>alat pemukul kulit kayu</li>
                             </ol>"]
                           ["Adapun peninggalan dari zaman megalitikum di antaranya:<br>
                             <ol>
                             <li>sarkofagus (kubur batu)</li>
                             <li>menhir (tugu batu)</li>
                             <li>waruga (kubur batu berbentuk kubus)</li>
                             <li>dolmen (meja batu)</li>
                             <li>arca (patung batu menyerupai hewan, tumbuhan, dan manusia)</li>
                             <li>punden-berundak (tempat pemujaan berbentuk kerucut dan terdapat tingkatan</li>
                             </ol>"]]
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 paleolitikum-1
                          :fakta2 mesolitikum-2
                          :soal soal-1
                          :pb (jawaban 0)
                          :pembahasan (rand-nth (pembahasan 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-1
                          :pb (jawaban 1)
                          :pembahasan (rand-nth (pembahasan 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 paleolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-1
                          :pb (jawaban 2)
                          :pembahasan (rand-nth (pembahasan 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 megalitikum-2
                          :soal soal-1
                          :pb (jawaban 3)
                          :pembahasan (rand-nth (pembahasan 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 mesolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-2
                          :pb (jawaban 0)
                          :pembahasan (rand-nth (pembahasan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 mesolitikum-2
                          :soal soal-2
                          :pb (jawaban 1)
                          :pembahasan (rand-nth (pembahasan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 mesolitikum-1
                          :fakta2 mesolitikum-2
                          :soal soal-2
                          :pb (jawaban 2)
                          :pembahasan (rand-nth (pembahasan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-2
                          :pb (jawaban 3)
                          :pembahasan (rand-nth (pembahasan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S9 (merge {:pengantar pengantar
                          :fakta1 neolitikum-1
                          :fakta2 paleolitikum-2
                          :soal soal-3
                          :pb (jawaban 0)
                          :pembahasan (rand-nth (pembahasan 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S10 (merge {:pengantar pengantar
                           :fakta1 paleolitikum-1
                           :fakta2 neolitikum-2
                           :soal soal-3
                           :pb (jawaban 1)
                           :pembahasan (rand-nth (pembahasan 2))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S11 (merge {:pengantar pengantar
                           :fakta1 neolitikum-1
                           :fakta2 neolitikum-2
                           :soal soal-3
                           :pb (jawaban 2)
                           :pembahasan (rand-nth (pembahasan 2))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S12 (merge {:pengantar pengantar
                           :fakta1 paleolitikum-1
                           :fakta2 megalitikum-2
                           :soal soal-3
                           :pb (jawaban 3)
                           :pembahasan (rand-nth (pembahasan 2))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S13 (merge {:pengantar pengantar
                           :fakta1 megalitikum-1
                           :fakta2 paleolitikum-2
                           :soal soal-4
                           :pb (jawaban 0)
                           :pembahasan (rand-nth (pembahasan 3))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S14 (merge {:pengantar pengantar
                           :fakta1 mesolitikum-1
                           :fakta2 megalitikum-2
                           :soal soal-4
                           :pb (jawaban 1)
                           :pembahasan (rand-nth (pembahasan 3))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S15 (merge {:pengantar pengantar
                           :fakta1 megalitikum-1
                           :fakta2 megalitikum-2
                           :soal soal-4
                           :pb (jawaban 2)
                           :pembahasan (rand-nth (pembahasan 3))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S16 (merge {:pengantar pengantar
                           :fakta1 neolitikum-1
                           :fakta2 mesolitikum-2
                           :soal soal-4
                           :pb (jawaban 3)
                           :pembahasan (rand-nth (pembahasan 3))}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn masa-praaksara-8b []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               coklat [["Kehidupan bercocok tanam di Zaman Neolitikum mendorong kebiasaan untuk bekerja bersama. Hal tersebut merupakan contoh dari ...."
                        "Zaman neolitikum sudah mulai munculnya koordinasi antarmasyarakat. Hal tersebut merupakan salah satu contoh dari ...."]
                       ["nilai gotong royong"]]
               ungu [["Munculnya peninggalan batu besar di Zaman Megalitikum merupakan salah satu contoh dari ...."
                      "Masyarakat mulai menafsirkan segala hal yang tidak masuk akal memiliki sangkut pautnya dengan kekuatan roh. Dapat disimpulkan bahwa masyarakat tersebut sudah memiliki ...."]
                     ["nilai kepercayaan"]]
               biru [["Pemilihan kepala suku merupakan salah satu contoh dari ...."
                      "Kesepakatan dari setiap masyarakat dalam memilih seorang kepala suku merupakan contoh dari ...."]
                     ["nilai musyawarah"]]
               abu [["Sistem pembagian kerja pada masa bercocok tanam merupakan contoh dari ...."
                     "Pembagian kerja yang ada pada Zaman Neolitikum merupakan contoh dari ...."]
                    ["nilai keadilan"]]
               salah ["nilai toleransi"
                      "nilai kesopanan"
                      "nilai kesatria"]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal (rand-nth (coklat 0))
                          :pb (rand-nth (coklat 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (ungu 1) (concat (biru 1) (concat (abu 1) salah))))))
              :S2 (merge {:soal (rand-nth (ungu 0))
                          :pb (rand-nth (ungu 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (coklat 1) (concat (biru 1) (concat (abu 1) salah))))))
              :S3 (merge {:soal (rand-nth (biru 0))
                          :pb (rand-nth (biru 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (ungu 1) (concat (coklat 1) (concat (abu 1) salah))))))
              :S4 (merge {:soal (rand-nth (abu 0))
                          :pb (rand-nth (abu 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (ungu 1) (concat (biru 1) (concat (coklat 1) salah))))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 50)
       shuffle))