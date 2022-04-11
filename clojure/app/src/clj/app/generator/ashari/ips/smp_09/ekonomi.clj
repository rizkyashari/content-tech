(ns app.generator.ashari.ips.smp_09.ekonomi)

(defn faktor-produksi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               pengantar ["Faktor produksi adalah sumber daya ekonomi yang diolah lebih lanjut dalam proses produksi. "
                          "Sumber daya ekonomi yang diolah lebih lanjut dalam proses produksi disebut sebagai faktor produksi. "
                          "Faktor produksi merupakan sumber daya ekonomi yang dalam proses produksi diolah secara lebih lanjut. "]
               soal1 ["Di bawah ini yang merupakan salah satu faktor produksi adalah ...."
                      "Salah satu faktor produksi adalah ...."
                      "Contoh faktor produksi adalah ...."
                      "Berikut ini yang merupakan faktor produksi adalah ...."
                      "Faktor produksi salah satunya adalah ...."]
               soal2 ["Di bawah ini yang <b><u>bukan</u></b> merupakan salah satu faktor produksi adalah ...."
                      "Salah satu opsi di bawah ini yang <b><u>bukan</u></b> merupakan faktor produksi adalah ...."
                      "Contoh yang <b><u>bukan</u></b> merupakan faktor produksi di bawah ini adalah ...."
                      "Berikut ini yang <b><u>bukan</u></b> merupakan faktor produksi adalah ...."
                      "Yang <b><u>bukan</u></b> merupakan faktor produksi di bawah ini adalah ...."]
               correct-ans ["sumber daya alam"
                            "kekayaan alam"
                            "tenaga kerja"
                            "sumber daya manusia"
                            "modal"
                            "kewirausahaan"]
               wrong-ans ["konsumen"
                          "pasar"
                          "distributor"
                          "alat transportasi"
                          "harga"
                          "selera"]]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar (rand-nth pengantar)
                          :soal (rand-nth soal1)
                          :pb (rand-nth correct-ans)}
                         (zipmap [:p1 :p2 :p3] (shuffle wrong-ans)))
              :S2 (merge {:pengantar (rand-nth pengantar)
                          :soal (rand-nth soal2)
                          :pb (rand-nth wrong-ans)}
                         (zipmap [:p1 :p2 :p3] (shuffle correct-ans)))))))

       (repeatedly 300)
       distinct
       shuffle
       (take 180)
       shuffle))

(defn persebaran-produksi-kedelai []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar ["Kedelai merupakan salah satu hasil pertanian di Indonesia yang banyak digunakan sebagai bahan baku industri. "
                          "Kedelai adalah salah satu hasil produksi pertanian di Indonesia yang digunakan sebagai bahan ekspor nonmigas. "
                          "Salah satu hasil produksi pertanian utama di Indonesia adalah kedelai. "]
               kuning [["Kedelai banyak dibudidayakan pada lahan yang berupa ...."
                        "Lahan yang banyak digunakan sebagai tempat pembudidayaan kedelai salah satunya adalah ...."]
                       ["ladang"
                        "sawah tadah hujan"
                        "tegalan"]
                       ["sawah irigasi"
                        "sawah lebak"
                        "sawah pasang surut"]]
               coklat [["Salah satu provinsi penghasil kedelai di Indonesia adalah ...."
                        "Penghasil kedelai di Indonesia berada di daerah ...."
                        "Provinsi penghasil kedelai di Indonesia salah satunya adalah ...."]
                       ["Jawa Tengah"
                        "Jawa Timur"
                        "Nusa Tenggara Timur"
                        "Lampung"]
                       ["Sumatra Selatan"
                        "Sumatra Utara"
                        "Kalimantan Tengah"
                        "Maluku"]]
               hijau [["Kedelai biasanya digunakan sebagai bahan baku industri ...."
                       "Industri ... biasanya menggunakan kedelai sebagai bahan bakunya."]
                      ["tempe"
                       "tahu"
                       "susu kedelai"
                       "kecap"]
                      ["minyak goreng"
                       "margarin"
                       "bumbu dapur"
                       "santan"]]
               pink [["Kedelai menjadi salah satu bahan industri yang cukup besar di Indonesia. Pada tahun 2012, produksi kedelai mencapai ...."
                      "Produksi kedelai di Indonesia pada tahun 2012 mencapai ...."]
                     ["850.000 ton"
                      "850 kiloton"
                      "850 juta kilogram"]
                     ["1 juta ton"
                      "5 juta kilogram"
                      "10.000 ton"]]]
                      
         (merge
          (condp = type-soal
            :S1 (merge {:pengantar (rand-nth pengantar)
                        :soal (rand-nth (kuning 0))
                        :pb (rand-nth (kuning 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (kuning 2))))
            :S2 (merge {:pengantar (rand-nth pengantar)
                        :soal (rand-nth (coklat 0))
                        :pb (rand-nth (coklat 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (coklat 2))))
            :S3 (merge {:pengantar (rand-nth pengantar)
                        :soal (rand-nth (hijau 0))
                        :pb (rand-nth (hijau 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (hijau 2))))
            :S4 (merge {:pengantar (rand-nth pengantar)
                        :soal (rand-nth (pink 0))
                        :pb (rand-nth (pink 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (pink 2))))))))
                       
  (repeatedly 1000)
  distinct
  shuffle
  (take 96)
  shuffle))

(defn pengertian-dan-tujuan-distribusi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               soal-distribusi [["Di bawah ini yang merupakan definisi dari distribusi adalah ...."
                                 "Definisi dari distribusi adalah ...."
                                 "Pengertian dari distribusi adalah ...."
                                 "Maksud dari distribusi adalah ...."
                                 "Distribusi adalah ...."]
                                ["Di bawah ini yang <b><u>bukan</u></b> merupakan definisi distribusi adalah ...."
                                 "Berikut ini yang <b><u>bukan</u></b> merupakan pengertian dari distribusi adalah ...."
                                 "Yang <b><u>bukan</u></b> merupakan definisi distribusi adalah ...."]]
               correct-distribusi ["suatu kegiatan ekonomi yang menjembatani antara kegiatan produksi dan kegiatan konsumsi"
                                   "kegiatan pemasaran barang atau jasa dari produsen ke konsumen"
                                   "kegiatan penyampaian barang atau jasa ke konsumen sehingga penggunaannya sesuai dengan yang diperlukan"
                                   "suatu kegiatan yang dilakukan dalam rangka menyalurkan barang atau jasa dari produsen ke konsumen"
                                   "upaya penyaluran suatu benda atau jasa agar bisa sampai ke konsumen"
                                   "segala pekerjaan yang berkaitan dengan penyaluran suatu barang atau jasa dari produsen ke konsumen"]
               wrong-distribusi ["suatu kegiatan untuk menggunakan daya guna dari suatu barang atau jasa"
                                 "kegiatan untuk menambah nilai guna terhadap suatu barang atau jasa untuk memenuhi kebutuhan"
                                 "kegiatan mengghasilkan barang atau jasa oleh orang atau badan tertentu"
                                 "suatu kegiatan yang dilakukan dalam rangka menggunakan suatu barang atau jasa"
                                 "upaya untuk menghasilkan suatu barang atau jasa dari produsen"
                                 "segala pekerjaan yang dapat mengurangi nilai kegunaan dari suatu barang atau jasa"]
               soal-tujuan [["Di bawah ini yang merupakan salah satu tujuan distribusi adalah ...."
                             "Salah satu tujuan distribusi adalah ...."
                             "Contoh dari tujuan distribusi adalah ...."
                             "Berikut ini yang merupakan tujuan distribusi adalah ...."
                             "Tujuan distribusi salah satunya adalah ...."]
                            ["Di bawah ini yang <b><u>bukan</u></b> merupakan salah satu tujuan distribusi adalah ...."
                             "Salah satu opsi di bawah ini yang <b><u>bukan</u></b> merupakan tujuan distribusi adalah ...."
                             "Contoh yang <b><u>bukan</u></b> merupakan dari tujuan distribusi adalah ...."
                             "Berikut ini yang <b><u>bukan</u></b> merupakan tujuan distribusi adalah ...."
                             "Yang <b><u>bukan</u></b> merupakan tujuan distribusi di bawah ini adalah ...."]]
               correct-tujuan ["menyampaikan barang atau jasa dari produsen ke konsumen"
                               "mempercepat sampainya hasil produksi ke tangan konsumen"
                               "tercapainya pemerataan produksi"
                               "menjaga keberlanjutan produksi"
                               "meningkatkan kualitas dan kuantitas produksi"
                               "meningkatkan nilai guna barang dan jasa"]
               wrong-tujuan ["menghasilkan barang atau jasa"
                             "meningkatkan kesejahteraan karyawan"
                             "meningkatkan kemakmuran masyarakat"
                             "meningkatkan keuntungan"
                             "memperluas lapangan usaha"
                             "menjaga kesinambungan usaha perusahaan"]]
                             
         (merge
          (condp = type-soal
            :S1 (merge {:soal (rand-nth (soal-distribusi 0))
                        :pb (rand-nth correct-distribusi)}
                       (zipmap [:p1 :p2 :p3] (shuffle wrong-distribusi)))
            :S2 (merge {:soal (rand-nth (soal-distribusi 1))
                        :pb (rand-nth wrong-distribusi)}
                       (zipmap [:p1 :p2 :p3] (shuffle correct-distribusi)))
            :S3 (merge {:soal (rand-nth (soal-tujuan 0))
                        :pb (rand-nth correct-tujuan)}
                       (zipmap [:p1 :p2 :p3] (shuffle wrong-tujuan)))
            :S4 (merge {:soal (rand-nth (soal-tujuan 1))
                        :pb (rand-nth wrong-tujuan)}
                       (zipmap [:p1 :p2 :p3] (shuffle correct-tujuan)))))))
                       
  (repeatedly 1000)
  distinct
  shuffle
  (take 108)
  shuffle))

(defn distribusi-antardaerah []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pernyataan-pernyataan di bawah ini!"])
               awalan (rand-nth ["Dari opsi-opsi di atas, yang termasuk faktor"
                                 "Dari pernyataan-pernyataan di atas, yang termasuk faktor"
                                 "Yang termasuk ke dalam faktor"])
               faktor [" pendorong " " penghambat "]
               soal (fn [x] (apply str awalan x "distribusi antardaerah adalah ...."))
               soal1 (soal (faktor 0))
               soal2 (soal (faktor 1))
               dorong ["Ketersediaan pasokan barang."
                       "Alat angkut yang memadai."
                       "Infrastruktur distribusi yang memadai."
                       "Biaya pengangkutan yang cukup terjangkau."]
               dorong1 (rand-nth dorong)
               dorong2 (rand-nth (remove #{dorong1} dorong))
               pemb-dorong ["Faktor pendorong distribusi antardaerah antara lain ketersediaan pasokan barang, alat angkut dan infrastruktur distribusi  yang memadai, serta biaya pengangkutan yang cukup terjangkau."]
               hambat ["Kekurangan pasokan barang."
                       "Faktor cuaca yang tidak mendukung."
                       "Kurangnya armada pengangkut."
                       "Biaya pengangkutan yang tidak terjangkau."
                       "Infrastruktur distribusi yang kurang baik."]
               hambat1 (rand-nth hambat)
               hambat2 (rand-nth (remove #{hambat1} hambat))
               pemb-hambat ["Faktor penghambat distribusi antardaerah antara lain kekurangan pasokan barang, faktor cuaca yang tidak mendukung, kurangnya armada pengangkut, biaya pengangkutan yang tidak terjangkau, dan infrastruktur distribusi yang kurang baik."]
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 dorong1
                          :fakta2 hambat2
                          :soal soal1
                          :pb (jawaban 0)
                          :pembahasan (rand-nth pemb-dorong)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 hambat1
                          :fakta2 dorong2
                          :soal soal2
                          :pb (jawaban 0)
                          :pembahasan (rand-nth pemb-hambat)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 hambat1
                          :fakta2 dorong2
                          :soal soal1
                          :pembahasan (rand-nth pemb-dorong)
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 dorong1
                          :fakta2 hambat2
                          :soal soal2
                          :pb (jawaban 1)
                          :pembahasan (rand-nth pemb-hambat)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 dorong1
                          :fakta2 dorong2
                          :soal soal1
                          :pembahasan (rand-nth pemb-dorong)
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 hambat1
                          :fakta2 hambat2
                          :soal soal2
                          :pb (jawaban 2)
                          :pembahasan (rand-nth pemb-hambat)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 hambat1
                          :fakta2 hambat2
                          :soal soal1
                          :pb (jawaban 3)
                          :pembahasan (rand-nth pemb-dorong)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 dorong1
                          :fakta2 dorong2
                          :soal soal2
                          :pb (jawaban 3)
                          :pembahasan (rand-nth pemb-hambat)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))
       (repeatedly 1000)
       shuffle
       distinct
       (take 300)
       shuffle))

(defn pengertian-dan-tujuan-konsumsi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               coklat [["Di bawah ini yang merupakan definisi dari konsumsi adalah ...."
                        "Definisi dari konsumsi adalah ...."
                        "Pengertian dari konsumsi adalah ...."
                        "Maksud dari konsumsi adalah ...."
                        "Konsumsi adalah ...."]
                       ["suatu kegiatan untuk menggunakan daya guna dari suatu barang atau jasa"
                        "suatu kegiatan yang dilakukan dalam rangka menggunakan serta mengurangi nilai guna suatu barang atau jasa"
                        "kegiatan mengurangi daya guna suatu barang atau jasa dengan tujuan memenuhi kebutuhan hidup"
                        "suatu kegiatan yang dilakukan dalam rangka mengurangi daya guna suatu barang atau jasa dengan tujuan menghindari kepunahan manusia"
                        "upaya penggunaan suatu benda atau jasa agar bisa manusia bisa bertahan hidup"
                        "segala pekerjaan yang dapat mengurangi nilai kegunaan dari suatu barang atau jasa"]
                       ["suatu kegiatan ekonomi yang menjembatani antara kegiatan produksi dan kegiatan konsumsi"
                        "kegiatan untuk menambah nilai guna terhadap suatu barang atau jasa untuk memenuhi kebutuhan"
                        "kegiatan menghasilkan barang atau jasa oleh orang atau badan tertentu"
                        "kegiatan pemasaran barang atau jasa dari produsen ke konsumen"
                        "upaya untuk menghasilkan suatu barang atau jasa dari produsen"
                        "segala pekerjaan yang berkaitan dengan penyaluran suatu barang atau jasa dari produsen ke konsumen"]]
               hijau [["Di bawah ini yang <b><u>bukan</u></b> merupakan definisi konsumsi adalah ...."
                       "Berikut ini yang <b><u>bukan</u></b> merupakan pengertian dari konsumsi adalah ...."
                       "Yang <b><u>bukan</u></b> merupakan definisi konsumsi  adalah ...."]
                      ["suatu kegiatan ekonomi yang menjembatani antara kegiatan produksi dan kegiatan konsumsi"
                       "kegiatan untuk menambah nilai guna terhadap suatu barang atau jasa untuk memenuhi kebutuhan"
                       "kegiatan menghasilkan barang atau jasa oleh orang atau badan tertentu"
                       "kegiatan pemasaran barang atau jasa dari produsen ke konsumen"
                       "upaya untuk menghasilkan suatu barang atau jasa dari produsen"
                       "segala pekerjaan yang berkaitan dengan penyaluran suatu barang atau jasa dari produsen ke konsumen"]
                      ["suatu kegiatan untuk menggunakan daya guna dari suatu barang atau jasa"
                       "suatu kegiatan yang dilakukan dalam rangka menggunakan serta mengurangi nilai guna suatu barang atau jasa"
                       "kegiatan mengurangi daya guna suatu barang atau jasa dengan tujuan memenuhi kebutuhan hidup"
                       "suatu kegiatan yang dilakukan dalam rangka mengurangi daya guna suatu barang atau jasa dengan tujuan menghindari kepunahan manusia"
                       "upaya penggunaan suatu benda atau jasa agar bisa manusia bisa bertahan hidup"
                       "segala pekerjaan yang dapat mengurangi nilai kegunaan dari suatu barang atau jasa"]]
               ungu [["Di bawah ini yang merupakan salah satu tujuan konsumsi adalah ...."
                      "Salah satu tujuan konsumsi adalah ...."
                      "Contoh dari tujuan konsumsi adalah ...."
                      "Berikut ini yang merupakan tujuan konsumsi adalah ...."
                      "Tujuan konsumsi salah satunya adalah ...."]
                     ["mengurangi nilai guna barang atau jasa secara bertahap"
                      "menghabiskan nilai guna barang sekaligus"
                      "memuaskan kebutuhan secara fisik"
                      "memuaskan kebutuhan secara nonfisik"
                      "menghindari kepunahan manusia"
                      "memenuhi kebutuhan hidup secara perlahan atau sekaligus"]
                     ["menghasilkan barang atau jasa"
                      "meningkatkan kesejahteraan karyawan"
                      "meningkatkan kemakmuran masyarakat"
                      "meningkatkan keuntungan"
                      "memperluas lapangan usaha"
                      "menjaga kesinambungan usaha perusahaan"]]
               biru [["Di bawah ini yang <b><u>bukan</u></b> merupakan salah satu tujuan konsumsi adalah ...."
                      "Salah satu opsi di bawah ini yang <b><u>bukan</u></b> merupakan tujuan konsumsi adalah ...."
                      "Contoh yang <b><u>bukan</u></b> merupakan dari tujuan konsumsi adalah ...."
                      "Berikut ini yang <b><u>bukan</u></b> merupakan tujuan konsumsi adalah ...."
                      "Yang <b><u>bukan</u></b> merupakan tujuan konsumsi di bawah ini adalah ...."]
                     ["menghasilkan barang atau jasa"
                      "meningkatkan kesejahteraan karyawan"
                      "meningkatkan kemakmuran masyarakat"
                      "meningkatkan keuntungan"
                      "memperluas lapangan usaha"
                      "menjaga kesinambungan usaha perusahaan"]
                     ["mengurangi nilai guna barang atau jasa secara bertahap"
                      "menghabiskan nilai guna barang sekaligus"
                      "memuaskan kebutuhan secara fisik"
                      "memuaskan kebutuhan secara nonfisik"
                      "menghindari kepunahan manusia"
                      "memenuhi kebutuhan hidup secara perlahan atau sekaligus"]]]
         
         (merge
          (condp = type-soal
            :S1 (merge {:soal (rand-nth (coklat 0))
                        :pb (rand-nth (coklat 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (coklat 2))))
            :S2 (merge {:soal (rand-nth (hijau 0))
                        :pb (rand-nth (hijau 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (hijau 2))))
            :S3 (merge {:soal (rand-nth (ungu 0))
                        :pb (rand-nth (ungu 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (ungu 2))))
            :S4 (merge {:soal (rand-nth (biru 0))
                        :pb (rand-nth (biru 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (biru 2))))))))
                       
  (repeatedly 300)
  distinct
  shuffle
  (take 108)
  shuffle))

(defn ciri-benda-konsumsi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pernyataan-pernyataan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk ciri benda konsumsi adalah ...."
                               "Dari pernyataan-pernyataan di atas, yang termasuk ciri benda konsumsi adalah ...."
                               "Yang termasuk ke dalam ciri benda konsumsi adalah ...."])
               benda-konsumsi ["Benda konsumsi langsung dapat digunakan tanpa diolah."
                               "Diperlukan pengorbanan untuk memperoleh benda konsumsi."
                               "Benda yang dikonsumsi ditujukan untuk memenuhi kebutuhan hidup."
                               "Nilai benda yang digunakan akan habis secara bertahap atau sekaligus."
                               "Benda konsumsi akan dipasarkan di pasar <i>output</i>."
                               "Benda konsumsi lebih banyak digunakan oleh konsumen."]
               benda-konsumsi-1 (rand-nth benda-konsumsi)
               benda-konsumsi-2 (rand-nth (remove #{benda-konsumsi-1} benda-konsumsi))
               bukan-benda-konsumsi ["Benda konsumsi tidak bisa langsung digunakan tanpa diolah."
                                     "Tidak diperlukan pengorbanan untuk memperoleh benda konsumsi."
                                     "Benda yang dikonsumsi ditujukan untuk menghasilkan barang atau jasa."
                                     "Nilai benda yang digunakan tidak akan habis."
                                     "Benda konsumsi akan dipasarkan di pasar <i>input</i>."
                                     "Benda konsumsi lebih banyak digunakan oleh produsen."]
               bukan-benda-konsumsi-1 (rand-nth bukan-benda-konsumsi)
               bukan-benda-konsumsi-2 (rand-nth (remove #{bukan-benda-konsumsi-1} bukan-benda-konsumsi))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]
                        
         (merge
          (condp = type-soal
            :S1 (merge {:pengantar pengantar
                        :fakta1 benda-konsumsi-1
                        :fakta2 bukan-benda-konsumsi-2
                        :soal soal
                        :pb (jawaban 0)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
            :S2 (merge {:pengantar pengantar
                        :fakta1 bukan-benda-konsumsi-1
                        :fakta2 benda-konsumsi-2
                        :soal soal
                        :pb (jawaban 1)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
            :S3 (merge {:pengantar pengantar
                        :fakta1 benda-konsumsi-1
                        :fakta2 benda-konsumsi-2
                        :soal soal
                        :pb (jawaban 2)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
            :S4 (merge {:pengantar pengantar
                        :fakta1 bukan-benda-konsumsi-1
                        :fakta2 bukan-benda-konsumsi-2
                        :soal soal
                        :pb (jawaban 3)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))
                       
  (repeatedly 1000)
  distinct
  shuffle
  (take 300)
  shuffle))

(defn pembagian-benda-konsumsi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi terkait benda konsumsi di bawah ini!"
                                    "Perhatikan opsi-opsi terkait benda konsumsi di bawah ini!"
                                    "Perhatikan contoh-contoh benda konsumsi di bawah ini!"])
               pembagian-benda-konsumsi [" benda yang habis dalam sekali pemakaian "
                                         " benda yang dapat dipakai berulang-ulang "]
               awalan (rand-nth ["Dari opsi-opsi di atas, yang termasuk"
                                 "Dari contoh-contoh benda di atas, yang termasuk"
                                 "Yang termasuk ke dalam"])
               soal (fn [x] (apply str awalan x "adalah ...."))
               soal-1 (soal (pembagian-benda-konsumsi 0))
               soal-2 (soal (pembagian-benda-konsumsi 1))
               sekali-pakai ["Makanan"
                             "Minuman"
                             "Obat-obatan"]
               sekali-pakai-1 (rand-nth sekali-pakai)
               sekali-pakai-2 (rand-nth (remove #{sekali-pakai-1} sekali-pakai))
               bahas-sekali-pakai (rand-nth ["Benda konsumsi yang habis dalam sekali pemakaian contohnya adalah makanan, minuman, dan obat-obatan."])
               ulang-pakai ["Pakaian"
                            "Tas"
                            "Sepatu"
                            "Perlengkapan dapur"
                            "Televisi"]
               ulang-pakai-1 (rand-nth ulang-pakai)
               ulang-pakai-2 (rand-nth (remove #{ulang-pakai-1} ulang-pakai))
               bahas-ulang-pakai (rand-nth ["Benda konsumsi yang dapat dipakai secara berulang-ulang contohnya adalah pakaian, tas, sepatu, televisi, perlengkapan dapur, rumah, dan lain-lain."])
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]
               
         (merge
          (condp = type-soal
            :S1 (merge {:pengantar pengantar
                        :fakta1 sekali-pakai-1
                        :fakta2 ulang-pakai-2
                        :soal soal-1
                        :pb (jawaban 0)
                        :pembahasan bahas-sekali-pakai}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
            :S2 (merge {:pengantar pengantar
                        :fakta1 ulang-pakai-1
                        :fakta2 sekali-pakai-2
                        :soal soal-2
                        :pb (jawaban 0)
                        :pembahasan bahas-ulang-pakai}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
            :S3 (merge {:pengantar pengantar
                        :fakta1 ulang-pakai-1
                        :fakta2 sekali-pakai-2
                        :soal soal-1
                        :pb (jawaban 1)
                        :pembahasan bahas-sekali-pakai}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
            :S4 (merge {:pengantar pengantar
                        :fakta1 sekali-pakai-1
                        :fakta2 ulang-pakai-2
                        :soal soal-2
                        :pb (jawaban 1)
                        :pembahasan bahas-ulang-pakai}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
            :S5 (merge {:pengantar pengantar
                        :fakta1 sekali-pakai-1
                        :fakta2 sekali-pakai-2
                        :soal soal-1
                        :pb (jawaban 2)
                        :pembahasan bahas-sekali-pakai}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
            :S6 (merge {:pengantar pengantar
                        :fakta1 ulang-pakai-1
                        :fakta2 ulang-pakai-2
                        :soal soal-2
                        :pb (jawaban 2)
                        :pembahasan bahas-ulang-pakai}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
            :S7 (merge {:pengantar pengantar
                        :fakta1 ulang-pakai-1
                        :fakta2 ulang-pakai-2
                        :soal soal-1
                        :pb (jawaban 3)
                        :pembahasan bahas-sekali-pakai}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))
            :S8 (merge {:pengantar pengantar
                        :fakta1 sekali-pakai-1
                        :fakta2 sekali-pakai-2
                        :soal soal-2
                        :pb (jawaban 3)
                        :pembahasan bahas-ulang-pakai}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))
                       
  (repeatedly 1000)
  distinct
  shuffle
  (take 300)
  shuffle))