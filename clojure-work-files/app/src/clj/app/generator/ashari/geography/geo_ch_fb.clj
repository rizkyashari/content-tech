(ns app.generator.ashari.geography.geo_ch_fb)

(defn proyeksi-peta-1a []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan konsep proyeksi yang tepat adalah ...."
                                 "Di bawah ini yang merupakan konsep proyeksi yang tepat adalah ...."
                                 "Salah satu konsep proyeksi yang tepat adalah ...."
                                 "Konsep proyeksi yang tepat salah satunya adalah ...."
                                 "Yang termasuk konsep proyeksi yang tepat adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang merupakan konsep proyeksi yang <b>kurang tepat</b> adalah ...."
                                 "Di bawah ini yang merupakan konsep proyeksi yang <b>kurang tepat</b> adalah ...."
                                 "Salah satu konsep proyeksi yang tepat adalah berikut ini, <b>kecuali</b> ...."
                                 "Konsep proyeksi yang tepat salah satunya adalah .berikut ini, <b>kecuali</b>..."
                                 "Yang termasuk konsep proyeksi yang <b>kurang tepat</b> adalah ...."])
               benar ["pencerminan bidang ke bidang datar"
                      "pencerminan bidang ke proyeksitor"
                      "pencerminan garis ke bidang datar"
                      "pencerminan garis ke garis datar"
                      "pencerminan garis ke proyeksitor"
                      "pencerminan proyeksian ke proyeksitor"
                      "pencerminan titik ke bidang datar"
                      "pencerminan titik ke garis datar"
                      "pencerminan titik ke proyeksitor"]
               salah ["pencerminan bidang ke titik"
                      "pencerminan garis ke titik"
                      "pencerminan garis proyektor ke bidang datar"
                      "pencerminan garis proyektor ke proyeksian"
                      "pencerminan garis proyektor ke titik"
                      "pencerminan hasil proyeksi ke bidang datar"
                      "pencerminan hasil proyeksi ke proyeksian"
                      "pencerminan hasil proyeksi ke titik"
                      "pencerminan proyeksitor ke proyeksian"
                      "pencerminan titik ke titik"]]

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
       (take 95)
       shuffle))

(defn proyeksi-peta-3a []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang termasuk pengertian dari proyeksian adalah ...."
                                 "Di bawah ini yang termasuk pengertian dari proyeksian adalah ...."
                                 "Yang termasuk definisi dari proyeksian adalah ...."
                                 "Pengertian dari proyeksian salah satunya adalah ...."
                                 "Proyeksian adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b>bukan</b> termasuk pengertian dari proyeksian adalah ...."
                                 "Di bawah ini yang <b>bukan</b> termasuk pengertian dari proyeksian adalah ...."
                                 "Yang termasuk definisi dari proyeksian adalah berikut ini, <b>kecuali</b>...."
                                 "Pengertian dari proyeksian adalah berikut ini, <b>kecuali</b> ...."
                                 "Definisi dari proyeksian adalah berikut ini, <b>kecuali</b> ...."])
               benar ["titik yang diproyeksikan"
                      "garis yang diproyeksikan"
                      "bidang yang diproyeksikan"
                      "titik, garis, atau bidang yang diproyeksikan"]
               salah ["objek berupa garis datar yang dituju"
                      "garis yang mencerminkan proyeksian ke proyeksitor"
                      "bayangan yang dihasilkan dari suatu objek yang diproyeksikan"
                      "garis pada bidang proyeksi yang berpotongan tegak lurus terhadap garis proyektor"]]

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

(defn proyeksi-peta-3b []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang termasuk pengertian dari proyeksitor adalah ...."
                                 "Di bawah ini yang termasuk pengertian dari proyeksitor adalah ...."
                                 "Yang termasuk definisi dari proyeksitor adalah ...."
                                 "Pengertian dari proyeksitor salah satunya adalah ...."
                                 "Proyeksitor adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b>bukan</b> termasuk pengertian dari proyeksitor adalah ...."
                                 "Di bawah ini yang <b>bukan</b> termasuk pengertian dari proyeksitor adalah ...."
                                 "Yang termasuk definisi dari proyeksitor adalah berikut ini, <b>kecuali</b>...."
                                 "Pengertian dari proyeksitor adalah berikut ini, <b>kecuali</b> ...."
                                 "Definisi dari proyeksitor adalah berikut ini, <b>kecuali</b> ...."])
               benar ["objek berupa garis yang dituju"
                      "objek berupa bidang datar yang dituju"
                      "objek berupa garis atau bidang datar yang dituju"]
               salah ["titik, garis, atau bidang yang diproyeksikan"
                      "garis yang mencerminkan proyeksian ke proyeksitor"
                      "bayangan yang dihasilkan dari suatu objek yang diproyeksikan"
                      "garis pada bidang proyeksi yang berpotongan tegak lurus terhadap garis proyektor"]]

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
       (take 35)
       shuffle))

(defn proyeksi-peta-3c []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang termasuk pengertian dari garis proyektor adalah ...."
                                 "Di bawah ini yang termasuk pengertian dari garis proyektor adalah ...."
                                 "Yang termasuk definisi dari garis proyektor adalah ...."
                                 "Pengertian dari garis proyektor salah satunya adalah ...."
                                 "Garis proyektor adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b>bukan</b> termasuk pengertian dari garis proyektor adalah ...."
                                 "Di bawah ini yang <b>bukan</b> termasuk pengertian dari garis proyektor adalah ...."
                                 "Yang termasuk definisi dari garis proyektor adalah berikut ini, <b>kecuali</b>...."
                                 "Pengertian dari garis proyektor adalah berikut ini, <b>kecuali</b> ...."
                                 "Definisi dari garis proyektor adalah berikut ini, <b>kecuali</b> ...."])
               benar ["garis yang mencerminkan proyeksian ke proyeksitor"
                      "garis yang mencerminkan titik ke objek yang dituju"
                      "garis yang mencerminkan garis ke objek yang dituju"
                      "garis yang mencerminkan bidang ke objek yang dituju"]
               salah ["titik, garis, atau bidang yang diproyeksikan"
                      "objek berupa garis atau bidang datar yang dituju"
                      "bayangan yang dihasilkan dari suatu objek yang diproyeksikan"
                      "garis pada bidang proyeksi yang berpotongan tegak lurus terhadap garis proyektor"]]

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

(defn proyeksi-peta-3d []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang termasuk pengertian dari hasil proyeksi adalah ...."
                                 "Di bawah ini yang termasuk pengertian dari hasil proyeksi adalah ...."
                                 "Yang termasuk definisi dari hasil proyeksi adalah ...."
                                 "Pengertian dari hasil proyeksi salah satunya adalah ...."
                                 "Hasil proyeksi adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b>bukan</b> termasuk pengertian dari hasil proyeksi adalah ...."
                                 "Di bawah ini yang <b>bukan</b> termasuk pengertian dari hasil proyeksi adalah ...."
                                 "Yang termasuk definisi dari hasil proyeksi adalah berikut ini, <b>kecuali</b>...."
                                 "Pengertian dari hasil proyeksi adalah berikut ini, <b>kecuali</b> ...."
                                 "Definisi dari hasil proyeksi adalah berikut ini, <b>kecuali</b> ...."])
               benar ["bayangan yang dihasilkan dari suatu objek yang diproyeksikan"
                      "bayangan yang dihasilkan dari suatu proyeksian"
                      "bayangan yang dihasilkan dari suatu bidang yang diproyeksikan"
                      "bayangan yang dihasilkan dari suatu titik yang diproyeksikan"
                      "bayangan yang dihasilkan dari suatu garis yang diproyeksikan"]
               salah ["titik, garis, atau bidang yang diproyeksikan"
                      "objek berupa garis atau bidang datar yang dituju"
                      "garis yang mencerminkan bidang ke objek yang dituju"
                      "garis pada bidang proyeksi yang berpotongan tegak lurus terhadap garis proyektor"]]

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
       (take 45)
       shuffle))

(defn proyeksi-peta-3e []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang termasuk pengertian dari garis hasil proyeksi adalah ...."
                                 "Di bawah ini yang termasuk pengertian dari garis hasil proyeksi adalah ...."
                                 "Yang termasuk definisi dari garis hasil proyeksi adalah ...."
                                 "Pengertian dari garis hasil proyeksi salah satunya adalah ...."
                                 "Garis hasil proyeksi adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b>bukan</b> termasuk pengertian dari garis hasil proyeksi adalah ...."
                                 "Di bawah ini yang <b>bukan</b> termasuk pengertian dari garis hasil proyeksi adalah ...."
                                 "Yang termasuk definisi dari garis hasil proyeksi adalah berikut ini, <b>kecuali</b>...."
                                 "Pengertian dari garis hasil proyeksi adalah berikut ini, <b>kecuali</b> ...."
                                 "Definisi dari garis hasil proyeksi adalah berikut ini, <b>kecuali</b> ...."])
               benar ["garis pada bidang proyeksi yang berpotongan tegak lurus terhadap garis proyektor"
                      "garis pada bidang proyeksi yang membentuk sudut 90 derajat terhadap garis proyektor"
                      "garis yang membentang pada bidang proyeksi"]
               salah ["titik, garis, atau bidang yang diproyeksikan"
                      "objek berupa garis atau bidang datar yang dituju"
                      "garis yang mencerminkan bidang ke objek yang dituju"
                      "bayangan yang dihasilkan dari suatu objek yang diproyeksikan"]]

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
       (take 35)
       shuffle))

(defn proyeksi-peta-5a []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang termasuk pengertian dari sistem proyeksi peta adalah ...."
                                 "Di bawah ini yang termasuk pengertian dari sistem proyeksi peta adalah ...."
                                 "Yang termasuk definisi dari sistem proyeksi peta adalah ...."
                                 "Pengertian dari sistem proyeksi peta salah satunya adalah ...."
                                 "Sistem proyeksi peta adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b>bukan</b> termasuk pengertian dari sistem proyeksi peta adalah ...."
                                 "Di bawah ini yang <b>bukan</b> termasuk pengertian dari sistem proyeksi peta adalah ...."
                                 "Yang termasuk definisi dari sistem proyeksi peta adalah berikut ini, <b>kecuali</b>...."
                                 "Pengertian dari sistem proyeksi peta adalah berikut ini, <b>kecuali</b> ...."
                                 "Definisi dari sistem proyeksi peta adalah berikut ini, <b>kecuali</b> ...."])
               benar ["cara memindahkan sistem paralel dari globe ke bidang datar"
                      "cara menggambarkan sistem garis lintang dari globe ke permukaan datar"
                      "cara mencerminkan sistem meridian dari globe ke bidang datar"
                      "cara memproyeksikan sistem garis bujur dari globe ke permukaan datar"
                      "proses dan aturan matematis yang digunakan untuk memindahkan sistem paralel dari globe ke bidang datar"]
               salah ["cara memindahkan sistem paralel dari globe ke bangun ruang"
                      "cara menggambarkan sistem garis lintang dari globe ke bidang lengkung"
                      "cara mencerminkan sistem meridian dari globe ke bidang tiga dimensi"
                      "cara memproyeksikan sistem garis bujur berbentuk segitiga ke bidang datar"
                      "proses dan aturan matematis yang digunakan untuk memindahkan sistem paralel berbentuk persegi ke bangun ruang"]]

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

(defn proyeksi-peta-6a []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang termasuk pengertian dari distorsi dalam sistem proyeksi peta adalah ...."
                                 "Di bawah ini yang termasuk pengertian dari distorsi dalam sistem proyeksi peta adalah ...."
                                 "Yang termasuk definisi dari distorsi dalam sistem proyeksi peta adalah ...."
                                 "Pengertian dari distorsi dalam sistem proyeksi peta adalah ...."
                                 "Yang dimaksud distorsi dalam sistem proyeksi peta adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b>bukan</b> termasuk pengertian dari distorsi dalam sistem proyeksi peta adalah ...."
                                 "Di bawah ini yang <b>bukan</b> termasuk pengertian dari distorsi dalam sistem proyeksi peta adalah ...."
                                 "Yang termasuk definisi dari distorsi dalam sistem proyeksi peta adalah berikut ini, <b>kecuali</b>...."
                                 "Pengertian dari distorsi dalam sistem proyeksi peta adalah berikut ini, <b>kecuali</b> ...."
                                 "Definisi dari distorsi dalam sistem proyeksi peta adalah berikut ini, <b>kecuali</b> ...."])
               benar ["perubahan arah, luas, atau jarak suatu hasil pengukuran terhadap bentuk aslinya"
                      "penyimpangan jarak, luas, atau arah dari suatu hasil pengukuran terhadap bentuk aslinya"
                      "perubahan arah suatu hasil pengukuran terhadap arah aslinya"
                      "penyimpangan jarak suatu hasil pengukuran terhadap jarak aslinya"
                      "penyimpangan luas suatu hasil pengukuran terhadap luas aslinya"]
               salah ["perubahan fungsi suatu pengukuran terhadap fungsi aslinya"
                      "penyimpangan sifat suatu pengukuran terhadap sifat aslinya"
                      "perubahan arah suatu hasil pengukuran terhadap jarak aslinya"
                      "penyimpangan jarak suatu hasil pengukuran terhadap luas aslinya"
                      "penyimpangan arah suatu hasil pengukuran terhadap luas aslinya"]]

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

(defn proyeksi-peta-7 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6])
               tipe ["Mercator" "Gall-Peters" "Robinson"]
               jnis ["rendah" "tinggi"]
               merc [["A" "B"] ["C" "D" "E" "F"]]
               gall [["C" "D"] ["A" "B" "E" "F"]]
               robi [["A" "B" "C" "D"] ["E" "F"]]]
           (merge
            (condp = type-soal
              :S1 (merge {:image "3658293c-a122-11ec-b909-0242ac120002_Distorsi1Enhanced.png"
                          :tipe (tipe 0)
                          :jnis (jnis 0)
                          :pb (rand-nth (merc 0))}
                         (zipmap [:p1 :p2] (shuffle (merc 1))))
              :S2 (merge {:image "3658293c-a122-11ec-b909-0242ac120002_Distorsi1Enhanced.png"
                          :tipe (tipe 0)
                          :jnis (jnis 1)
                          :pb (rand-nth (merc 1))}
                         (zipmap [:p1 :p2] (shuffle (merc 0))))
              :S3 (merge {:image "1384d914-a122-11ec-b909-0242ac120002_Distorsi2Enhanced.png"
                          :tipe (tipe 1)
                          :jnis (jnis 0)
                          :pb (rand-nth (gall 0))}
                         (zipmap [:p1 :p2] (shuffle (gall 1))))
              :S4 (merge {:image "1384d914-a122-11ec-b909-0242ac120002_Distorsi2Enhanced.png"
                          :tipe (tipe 1)
                          :jnis (jnis 1)
                          :pb (rand-nth (gall 1))}
                         (zipmap [:p1 :p2] (shuffle (gall 0))))
              :S5 (merge {:image "46127d8c-a122-11ec-b909-0242ac120002_Distorsi3Enhanced.png"
                          :tipe (tipe 2)
                          :jnis (jnis 0)
                          :pb (rand-nth (robi 0))}
                         (zipmap [:p1 :p2] (shuffle (robi 1))))
              :S6 (merge {:image "46127d8c-a122-11ec-b909-0242ac120002_Distorsi3Enhanced.png"
                          :tipe (tipe 2)
                          :jnis (jnis 1)
                          :pb (rand-nth (robi 1))}
                         (zipmap [:p1 :p2] (shuffle (robi 0))))))))
                         
  (repeatedly 20)
  distinct
  shuffle
  (take 18)
  shuffle))