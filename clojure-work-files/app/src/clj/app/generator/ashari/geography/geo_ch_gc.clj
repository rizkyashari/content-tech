(ns app.generator.ashari.geography.geo_ch_gc)

(defn langkah-interpretasi-citra-1a []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan urutan langkah interpretasi citra yang tepat adalah ...."
                                 "Di bawah ini yang merupakan urutan langkah interpretasi citra yang tepat adalah ...."
                                 "Urutan langkah interpretasi citra yang tepat adalah ...."
                                 "Yang merupakan urutan langkah interpretasi citra yang tepat adalah ...."
                                 "Yang termasuk urutan langkah interpretasi citra yang tepat adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang merupakan urutan langkah interpretasi citra yang <b>kurang tepat</b> adalah ...."
                                 "Di bawah ini yang merupakan urutan langkah interpretasi citra yang <b>kurang tepat</b> adalah ...."
                                 "Urutan langkah interpretasi citra yang tepat adalah berikut ini, <b>kecuali</b> ...."
                                 "Yang merupakan urutan langkah interpretasi citra yang tepat adalah berikut ini, <b>kecuali</b>..."
                                 "Yang termasuk urutan langkah interpretasi citra yang <b>kurang tepat</b> adalah ...."])
               benar ["mendeteksi objek - mengidentifikasi objek - menganalisis objek - melakukan deduksi terkait objek"
                      "mencari objek - mengenali objek - mengelompokkan data terkait objek - menyimpulkan jenis objek"
                      "memastikan keberadaan objek - mencatat objek - menelaah objek - menyimpulkan jenis objek"
                      "menemukan objek - menandai objek - mengelompokkan objek - menarik kesimpulan terkait objek"]
               salah ["mengidentifikasi objek - mendeteksi objek - menganalisis objek - melakukan deduksi terkait objek"
                      "mengelompokkan data terkait objek - mengenali objek - mencari objek - menyimpulkan jenis objek"
                      "memastikan keberadaan objek - menelaah objek - mencatat objek - menyimpulkan jenis objek"
                      "menemukan objek - menandai objek - menarik kesimpulan terkait objek - mengelompokkan objek"]]

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
       (take 40)
       shuffle))
