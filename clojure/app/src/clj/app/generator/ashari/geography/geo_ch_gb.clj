(ns app.generator.ashari.geography.geo_ch_gb)

(defn memahami-konsep-citra-nonfoto-1a []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang termasuk pengertian dari citra nonfoto adalah ...."
                                 "Di bawah ini yang termasuk pengertian dari citra nonfoto adalah ...."
                                 "Yang termasuk definisi dari citra nonfoto adalah ...."
                                 "Pengertian dari citra nonfoto adalah ...."
                                 "Citra nonfoto adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b>bukan</b> termasuk pengertian dari citra nonfoto adalah ...."
                                 "Di bawah ini yang <b>bukan</b> termasuk pengertian dari citra nonfoto adalah ...."
                                 "Yang termasuk definisi dari citra nonfoto adalah berikut ini, <b>kecuali</b>...."
                                 "Pengertian dari citra nonfoto adalah berikut ini, <b>kecuali</b> ...."
                                 "Definisi dari citra nonfoto adalah berikut ini, <b>kecuali</b> ...."])
               benar ["citra hasil pengindraan jauh yang dihasilkan oleh sensor nonfotografi"
                      "citra hasil pengindraan jauh yang dihasilkan oleh sensor selain kamera"
                      "citra yang dihasilkan oleh sensor nonfotografi dengan menggunakan sensor <i>scanning</i>"
                      "citra yang dihasilkan oleh sensor nonfotografi dengan menggunakan detektor pita magnetik"
                      "citra yang dihasilkan oleh sensor nonfotografi yang proses perekamannya dilakukan secara elektronik"]
               salah ["citra hasil pengindraan jauh yang dihasilkan oleh sensor fotografi"
                      "citra hasil pengindraan jauh yang dihasilkan oleh sensor kamera"
                      "citra yang dihasilkan oleh sensor nonfotografi dengan menggunakan sensor kamera"
                      "citra yang dihasilkan oleh sensor nonfotografi dengan menggunakan detektor film"
                      "citra yang dihasilkan oleh sensor nonfotografi yang proses perekamannya dilakukan secara kimiawi"]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth benar)}
                         (zipmap [:p1 :p2 :p3] (shuffle salah)))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth salah)}
                         (zipmap [:p1 :p2 :p3] (shuffle benar)))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 50)
       shuffle))
