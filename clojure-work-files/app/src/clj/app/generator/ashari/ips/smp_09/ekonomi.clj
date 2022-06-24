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
               soal2 ["Di bawah ini yang <u>bukan</u> merupakan salah satu faktor produksi adalah ...."
                      "Salah satu opsi di bawah ini yang <u>bukan</u> merupakan faktor produksi adalah ...."
                      "Contoh yang <u>bukan</u> merupakan faktor produksi di bawah ini adalah ...."
                      "Berikut ini yang <u>bukan</u> merupakan faktor produksi adalah ...."
                      "Yang <u>bukan</u> merupakan faktor produksi di bawah ini adalah ...."]
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
                                ["Di bawah ini yang <u>bukan</u> merupakan definisi distribusi adalah ...."
                                 "Berikut ini yang <u>bukan</u> merupakan pengertian dari distribusi adalah ...."
                                 "Yang <u>bukan</u> merupakan definisi distribusi adalah ...."]]
               correct-distribusi ["suatu kegiatan ekonomi yang menjembatani antara kegiatan produksi dan kegiatan konsumsi"
                                   "kegiatan pemasaran barang atau jasa dari produsen ke konsumen"
                                   "kegiatan penyampaian barang atau jasa ke konsumen sehingga penggunaannya sesuai dengan yang diperlukan"
                                   "suatu kegiatan yang dilakukan dalam rangka menyalurkan barang atau jasa dari produsen ke konsumen"
                                   "upaya penyaluran suatu benda atau jasa agar bisa sampai ke konsumen"
                                   "segala pekerjaan yang berkaitan dengan penyaluran suatu barang atau jasa dari produsen ke konsumen"]
               wrong-distribusi ["suatu kegiatan untuk menggunakan daya guna dari suatu barang atau jasa"
                                 "kegiatan untuk menambah nilai guna terhadap suatu barang atau jasa untuk memenuhi kebutuhan"
                                 "kegiatan menghasilkan barang atau jasa oleh orang atau badan tertentu"
                                 "suatu kegiatan yang dilakukan dalam rangka menggunakan suatu barang atau jasa"
                                 "upaya untuk menghasilkan suatu barang atau jasa dari produsen"
                                 "segala pekerjaan yang dapat mengurangi nilai kegunaan dari suatu barang atau jasa"]
               soal-tujuan [["Di bawah ini yang merupakan salah satu tujuan distribusi adalah ...."
                             "Salah satu tujuan distribusi adalah ...."
                             "Contoh dari tujuan distribusi adalah ...."
                             "Berikut ini yang merupakan tujuan distribusi adalah ...."
                             "Tujuan distribusi salah satunya adalah ...."]
                            ["Di bawah ini yang <u>bukan</u> merupakan salah satu tujuan distribusi adalah ...."
                             "Salah satu opsi di bawah ini yang <u>bukan</u> merupakan tujuan distribusi adalah ...."
                             "Contoh yang <u>bukan</u> merupakan dari tujuan distribusi adalah ...."
                             "Berikut ini yang <u>bukan</u> merupakan tujuan distribusi adalah ...."
                             "Yang <u>bukan</u> merupakan tujuan distribusi di bawah ini adalah ...."]]
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
               hijau [["Di bawah ini yang <u>bukan</u> merupakan definisi konsumsi adalah ...."
                       "Berikut ini yang <u>bukan</u> merupakan pengertian dari konsumsi adalah ...."
                       "Yang <u>bukan</u> merupakan definisi konsumsi  adalah ...."]
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
               biru [["Di bawah ini yang <u>bukan</u> merupakan salah satu tujuan konsumsi adalah ...."
                      "Salah satu opsi di bawah ini yang <u>bukan</u> merupakan tujuan konsumsi adalah ...."
                      "Contoh yang <u>bukan</u> merupakan dari tujuan konsumsi adalah ...."
                      "Berikut ini yang <u>bukan</u> merupakan tujuan konsumsi adalah ...."
                      "Yang <u>bukan</u> merupakan tujuan konsumsi di bawah ini adalah ...."]
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
               sekali-pakai ["makanan"
                             "minuman"
                             "obat-obatan"]
               sekali-pakai-1 (rand-nth sekali-pakai)
               sekali-pakai-2 (rand-nth (remove #{sekali-pakai-1} sekali-pakai))
               bahas-sekali-pakai (rand-nth ["Benda konsumsi yang habis dalam sekali pemakaian contohnya adalah makanan, minuman, dan obat-obatan."])
               ulang-pakai ["pakaian"
                            "tas"
                            "sepatu"
                            "perlengkapan dapur"
                            "televisi"]
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

(defn pengertian-harga []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan definisi harga adalah ...."
                                 "Definisi harga adalah ...."
                                 "Pengertian harga adalah ...."
                                 "Maksud dari harga adalah ...."
                                 "Harga adalah ...."])
               soal-2 (rand-nth ["Di bawah ini yang <u>bukan</u> merupakan definisi harga adalah ...."
                                 "Berikut ini yang <u>bukan</u> merupakan pengertian harga adalah ...."
                                 "Yang <u>bukan</u> merupakan definisi harga  adalah ...."
                                 "Berikut ini adalah definisi harga, <i>kecuali</i> ...."
                                 "Di bawah ini merupakan pengertian harga, <i>kecuali</i> ...."])
               benar ["perwujudan nilai suatu barang atau jasa dalam satuan uang"
                      "nilai yang diberikan pada barang atau jasa yang dipertukarkan"
                      "nilai tukar suatu barang atau jasa yang dinyatakan dengan uang"
                      "kemampuan membeli untuk mencapai kepuasan dan manfaat"
                      "senilai uang yang harus dibayar oleh konsumen kepada penjual untuk memperoleh barang atau jasa"]
               salah ["perwujudan jumlah suatu barang atau jasa dalam satuan kekayaan"
                      "nilai yang diberikan pada barang atau jasa yang disimpan di suatu bank"
                      "nilai jual suatu barang yang dinyatakan dengan emas"
                      "kekuatan menjual untuk memperoleh keuntungan sebanyak-banyaknya"
                      "senilai uang yang harus dibayar oleh produsen kepada konsumen untuk menghasilkan barang atau jasa"]]

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

(defn fungsi-harga []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan salah satu fungsi harga adalah ...."
                                 "Salah satu fungsi harga adalah ...."
                                 "Contoh fungsi harga adalah ...."
                                 "Berikut ini yang merupakan fungsi harga adalah ...."
                                 "Fungsi harga salah satunya adalah ...."])
               soal-2 (rand-nth ["Di bawah ini yang <u>bukan</u> merupakan fungsi harga adalah ...."
                                 "Salah satu opsi di bawah ini yang <u>bukan</u> merupakan fungsi harga adalah ...."
                                 "Di bawah ini merupakan fungsi harga, <i>kecuali</i> ...."
                                 "Berikut ini merupakan fungsi harga, <i>kecuali</i> ...."
                                 "Yang <u>bukan</u> merupakan fungsi harga adalah ...."])
               benar ["acuan nilai jual suatu barang ataupun jasa"
                      "alat pengukur dan pembeda suatu barang atau jasa"
                      "mempermudah proses jual beli"
                      "penentu keuntungan bagi penjual atau produsen"
                      "acuan konsumen dalam menilai kualitas barang atau jasa"
                      "menentukan daya beli konsumen dalam pengambilan keputusan"]
               salah ["acuan nilai jual hanya untuk barang tertentu"
                      "memperpanjang proses tawar-menawar dalam jual beli"
                      "penentu faktor produksi bagi penjual atau produsen"
                      "alat pengukur dan pembeda hanya untuk jasa tertentu"
                      "acuan konsumen dalam menentukan harga jual barang"
                      "menentukan daya jual konsumen dalam pengambilan keputusan"]]

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
       (take 60)
       shuffle))

(defn jenis-harga []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               soal (rand-nth [" adalah maksud dari jenis harga ...."
                               " merupakan pengertian dari jenis harga ...."
                               " merupakan definisi dari jenis harga ...."])
               subjektif [["Harga yang ditentukan berdasarkan opini seseorang terhadap harga pasaran barang atau jasa"
                           "Perkiraan atas harga suatu barang atau jasa yang hendak diperjualbelikan"
                           "Harga yang diperkirakan berdasarkan pendapat seseorang terhadap harga barang atau jasa yang akan dipasarkan"]
                          ["subjektif"]
                          ["Harga subjektif adalah harga yang diperkirakan berdasarkan pendapat seseorang terhadap harga barang atau jasa yang akan dipasarkan."]]
               objektif [["Harga yang sudah disepakati oleh penjual dan pembeli dalam sebuah transaksi"
                          "Harga yang telah disetujui oleh penjual dan pembeli"
                          "Hasil kesepakatan antara penjual dan pembeli terhadap harga suatu barang atau jasa"]
                         ["objektif"
                          "pasar"]
                         ["Harga objektif atau harga pasar adalah harga yang sudah disepakati oleh penjual dan pembeli dalam sebuah transaksi."]]
               pokok [["Harga asli suatu produk sebelum menentukan keuntungan"
                       "Nilai yang dikeluarkan oleh produsen dalam membuat suatu produk"
                       "Harga sebenarnya dari suatu produk sebelum produsen menjual produk tersebut ke konsumen"]
                      ["pokok"
                       "biaya produksi"]
                      ["Harga pokok atau harga biaya produksi adalah harga asli suatu produk sebelum penjual atau produsen menentukan keuntungan."]]
               jual [["Harga pokok yang sudah ditambahkan keuntungan oleh penjual"
                      "Harga biaya produksi yang sudah ditambahkan keuntungan oleh produsen"
                      "Harga suatu barang atau jasa ketika sudah dijual kepada konsumen"]
                     ["jual"]
                     ["Harga jual adalah harga pokok yang sudah ditambahkan keuntungan oleh penjual."]]
               benar-1 (rand-nth (subjektif 1))
               benar-2 (rand-nth (objektif 1))
               benar-3 (rand-nth (pokok 1))
               benar-4 (rand-nth (jual 1))
               jenis-all (concat (vector benar-1) (concat (vector benar-2) (concat (vector benar-3) (vector benar-4))))
               salah (fn [x] (shuffle (filter #(not (= % x)) jenis-all)))]

           (merge
            (condp = type-soal
              :S1 (merge {:definisi (rand-nth (subjektif 0))
                          :soal soal
                          :pb benar-1
                          :pembahasan (rand-nth (subjektif 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah benar-1))))
              :S2 (merge {:definisi (rand-nth (objektif 0))
                          :soal soal
                          :pb benar-2
                          :pembahasan (rand-nth (objektif 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah benar-2))))
              :S3 (merge {:definisi (rand-nth (pokok 0))
                          :soal soal
                          :pb benar-3
                          :pembahasan (rand-nth (pokok 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah benar-3))))
              :S4 (merge {:definisi (rand-nth (jual 0))
                          :soal soal
                          :pb benar-4
                          :pembahasan (rand-nth (jual 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah benar-4))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 54)
       shuffle))

(defn pengertian-pasar []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan definisi pasar dalam arti sempit adalah ...."
                                 "Definisi pasar dalam arti sempit adalah ...."
                                 "Pengertian pasar dalam arti sempit adalah ...."
                                 "Maksud dari pasar dalam arti sempit adalah ...."
                                 "Pasar dalam arti sempit adalah ...."])
               soal-2 (rand-nth ["Di bawah ini yang merupakan definisi pasar dalam arti luas menurut ilmu ekonomi adalah ...."
                                 "Definisi pasar dalam arti luas menurut ilmu ekonomi adalah ...."
                                 "Pengertian pasar dalam arti luas menurut ilmu ekonomi adalah ...."
                                 "Maksud dari pasar dalam arti luas menurut ilmu ekonomi adalah ...."
                                 "Pasar dalam arti luas menurut ilmu ekonomi adalah ...."])
               sempit ["tempat umum untuk menjual dan membeli barang atau jasa untuk keperluan sehari-hari"
                       "tempat berlangsungnya kegiatan jual beli barang atau jasa untuk keperluan sehari-hari"
                       "tempat bertemunya pembeli dan penjual untuk melakukan jual beli barang atau jasa untuk keperluan harian"
                       "semua tempat kegiatan penjualan dan pembelian barang atau jasa untuk keperluan harian"
                       "lokasi bertemunya penjual dan pembeli barang atau jasa"]
               luas ["bertemunya penjual dan pembeli barang atau jasa yang tidak selalu harus ada tempat secara fisik, misalnya pasar uang"
                     "proses berlangsungnya transaksi permintaan dan penawaran atas barang atau jasa"
                     "tempat bertemunya pembeli dan penjual untuk melakukan segala macam transaksi ekonomi"
                     "semua kegiatan penawaran dan permintaan untuk tenaga kerja, modal, surat berharga, dan uang"
                     "proses berlangsungnya transaksi ekonomi yang tidak merujuk pada lokasi tertentu karena tidak mempunyai batas geografis"]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth sempit)}
                         (zipmap [:p1 :p2 :p3] (shuffle luas)))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth luas)}
                         (zipmap [:p1 :p2 :p3] (shuffle sempit)))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn fungsi-pasar []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3])
               soal (rand-nth [" adalah salah satu fungsi pasar sebagai ...."
                               " merupakan salah satu fungsi pasar sebagai ...."
                               " merupakan contoh fungsi pasar sebagai ...."])
               distribusi [["Memperlancar proses penyaluran barang dan jasa dari produsen ke konsumen"
                            "Mempermudah proses penyampaian barang atau jasa"
                            "Melancarkan proses pengiriman barang atau jasa dari produsen ke konsumen"]
                           ["sarana distribusi"
                            "sarana penyaluran"]
                           ["Sebagai sarana distribusi, pasar berfungsi memperlancar proses penyaluran barang atau jasa dari produsen ke konsumen."]]
               harga [["Menetapkan harga suatu barang atau jasa tertentu sesuai dengan permintaan dan penawaran yang terjadi di pasar"
                       "Membentuk kesepakatan harga antara penjual dan pembeli"
                       "Menetapkan harga suatu barang atau jasa tertentu yang telah disepakati oleh produsen dan konsumen"]
                      ["sarana pembentuk harga"
                       "sarana dalam penetapan nilai"]
                      ["Sebagai sarana pembentuk harga, pasar berfungsi membentuk kesepakatan harga antara penjual dan pembeli."]]
               promosi [["Memperkenalkan suatu produk dari produsen kepada calon konsumen"
                         "Memperkenalkan dan menginformasikan suatu barang atau jasa ke calon pembeli"
                         "Tempat bagi produsen untuk memasarkan hasil produksi mereka kepada calon konsumen"]
                        ["sarana promosi"
                         "sarana iklan"]
                        ["Sebagai sarana promosi, pasar berfungsi sebagai tempat memperkenalkan dan menginformasikan barang atau jasa dari produsen ke calon konsumen."]]]

           (merge
            (condp = type-soal
              :S1 (merge {:fungsi (rand-nth (distribusi 0))
                          :soal soal
                          :pb (rand-nth (distribusi 1))
                          :pembahasan (rand-nth (distribusi 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (harga 1) (promosi 1)))))
              :S2 (merge {:fungsi (rand-nth (harga 0))
                          :soal soal
                          :pb (rand-nth (harga 1))
                          :pembahasan (rand-nth (harga 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (distribusi 1) (promosi 1)))))
              :S3 (merge {:fungsi (rand-nth (promosi 0))
                          :soal soal
                          :pb (rand-nth (promosi 1))
                          :pembahasan (rand-nth (promosi 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (distribusi 1) (harga 1)))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 54)
       shuffle))

(defn jenis-pasar []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               soal (rand-nth [" adalah pasar berjenis  ...."
                               " merupakan pasar berjenis ...."
                               " merupakan jenis  ...."])
               output [["Pasar yang memperjualbelikan barang dan jasa hasil dari kegiatan produksi"
                        "Pasar yang memiliki dua struktur berupa pasar persaingan sempurna dan tidak sempurna"
                        "Pasar yang menjadi tempat jual beli barang atau jasa hasil dari kegiatan produksi"]
                       ["pasar barang"
                        "pasar <i>output</i>"]
                       ["Pasar barang (<i>output</i>) adalah pasar yang memperjualbelikan barang dan jasa hasil dari kegiatan produksi. Pasar ini memiliki dua struktur, yaitu pasar persaingan sempurna dan pasar persaingan tidak sempurna."]]
               sempurna [["Pasar yang memiliki banyak pembeli dan penjual sehingga harga pasar tidak dapat dipengaruhi oleh perseorangan"
                          "Pasar yang harga pasarnya tidak dipengaruhi oleh perseorangan karena memiliki banyak pembeli dan penjual"]
                         ["pasar persaingan sempurna"]
                         ["Pasar persaingan sempurna merupakan bagian dari pasar barang. Pasar ini memiliki banyak pembeli dan penjual sehingga harga pasar tidak dapat dipengaruhi oleh perseorangan."]]
               tak-sempurna [["Pasar yang saat satu atau beberapa ciri-ciri pasar persaingan sempurna tidak terpenuhi"
                              "Pasar berbentuk seperti pasar monopoli, oligopoli, pasar persaingan monopolisitik, pasar monopsoni, dan pasar oligopsoni"]
                             ["pasar persaingan tidak sempurna"]
                             ["Pasar persaingan tidak sempurna adalah pasar yang saat satu atau beberapa ciri-ciri pasar persaingan sempurna tidak terpenuhi. Bentuk-bentuk pasar ini antara lain pasar monopoli, oligopoli, pasar persaingan monopolisitik, pasar monopsoni, dan pasar oligopsoni."]]
               input [["Pasar yang memperjualbelikan faktor produksi yang dibutuhkan oleh produsen"
                       "Pasar yang menjadi tempat jual beli faktor produksi"
                       "Pasar yang memperjualbelikan faktor produksi seperti pasar sumber daya alam, pasar sumber daya manusia, pasar sumber daya modal, dan pasar sumber daya kewirausahaan"]
                      ["pasar sumber daya"
                       "pasar <i>input</i>"]
                      ["Pasar sumber daya (<i>input</i>) adalah pasar yang memperjualbelikan faktor produksi yang dibutuhkan oleh produsen. Bentuk-bentuk pasar sumber daya antara lain pasar sumber daya alam, pasar sumber daya manusia, pasar sumber daya modal, dan pasar sumber daya kewirausahaan."]]]

           (merge
            (condp = type-soal
              :S1 (merge {:jenis (rand-nth (output 0))
                          :soal soal
                          :pb (rand-nth (output 1))
                          :pembahasan (rand-nth (output 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (sempurna 1) (concat (tak-sempurna 1) (input 1))))))
              :S2 (merge {:jenis (rand-nth (sempurna 0))
                          :soal soal
                          :pb (rand-nth (sempurna 1))
                          :pembahasan (rand-nth (sempurna 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (output 1) (concat (tak-sempurna 1) (input 1))))))
              :S3 (merge {:jenis (rand-nth (tak-sempurna 0))
                          :soal soal
                          :pb (rand-nth (tak-sempurna 1))
                          :pembahasan (rand-nth (tak-sempurna 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (output 1) (concat (sempurna 1) (input 1))))))
              :S4 (merge {:jenis (rand-nth (input 0))
                          :soal soal
                          :pb (rand-nth (input 1))
                          :pembahasan (rand-nth (input 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (concat (output 1) (concat (sempurna 1) (tak-sempurna 1))))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 48)
       distinct))

(defn perdagangan-indonesia-1 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               ekspor [["Di bawah ini yang merupakan komoditas nonmigas utama yang diekspor oleh Indonesia adalah ...."
                        "Berikut ini yang merupakan komoditas nonmigas utama yang diekspor oleh Indonesia adalah ...."
                        "Salah satu komoditas nonmigas utama yang diekspor oleh Indonesia adalah ...."
                        "Komoditas nonmigas utama yang diekspor oleh Indonesia salah satunya adalah ...."
                        "Contoh komoditas nonmigas utama yang diekspor oleh Indonesia adalah ...."]
                       ["lemak dan minyak hewan/nabati"
                        "bahan bakar mineral"
                        "besi dan baja"
                        "mesin dan peralatan elektrik"
                        "perhiasan/permata"]
                       ["bahan kimia organik"
                        "barang dari plastik"
                        "plastik"]
                       ["Berikut ini adalah komoditas nonmigas utama yang diekspor oleh Indonesia beserta nilai ekspornya pada tahun 2020.
                         <ol>
                         <li>Lemak dan minyak hewan/nabati. Nilai ekspornya sebesar 20,72 miliar USD.</li>
                         <li>Bahan bakar mineral. Nilai ekspornya sebesar 17,27 miliar USD.</li>
                         <li>Besi dan baja. Nilai ekspornya sebesar 10,85 miliar USD.</li>
                         <li>Mesin dan peralatan elektrik. Nilai ekspornya sebesar 9,23 miliar USD.</li>
                         <li>Perhiasan/permata. Nilai ekspornya sebesar 8,22 miliar USD.</li>
                         </ol>"]]
               impor [["Di bawah ini yang merupakan komoditas nonmigas utama yang diimpor oleh Indonesia adalah ...."
                       "Berikut ini yang merupakan komoditas nonmigas utama yang diimpor oleh Indonesia adalah ...."
                       "Salah satu komoditas nonmigas utama yang diimpor oleh Indonesia adalah ...."
                       "Komoditas nonmigas utama yang diimpor oleh Indonesia salah satunya adalah ...."
                       "Contoh komoditas nonmigas utama yang diimpor oleh Indonesia adalah ...."]
                      ["mesin-mesin/pesawat mekanik"
                       "peralatan listrik"
                       "plastik dan barang dari plastik"
                       "besi dan baja"
                       "bahan kimia organik"]
                      ["lemak dan minyak hewan/nabati"
                       "bahan bakar mineral"
                       "perhiasan/permata"]
                      ["Berikut ini adalah komoditas nonmigas utama yang diimpor oleh Indonesia beserta nilai impornya pada tahun 2020.
                      <ol>
                      <li>Mesin-mesin/pesawat mekanik. Nilai impornya sebesar 21,81 miliar USD.</li>
                      <li>Peralatan listrik. Nilai impornya sebesar 19,03 miliar USD.</li>
                      <li>Plastik dan barang dari plastik. Nilai impornya sebesar 7,15 miliar USD.</li>
                      <li>Besi dan baja. Nilai impornya sebesar 6,86 miliar USD.</li>
                      <li>Bahan kimia organik. Nilai impornya sebesar 5,03 miliar USD.</li>
                      </ol>"]]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal (rand-nth (ekspor 0))
                          :pb (rand-nth (ekspor 1))
                          :pembahasan (rand-nth (ekspor 3))}
                         (zipmap [:p1 :p2 :p3] (shuffle (ekspor 2))))
              :S2 (merge {:soal (rand-nth (impor 0))
                          :pb (rand-nth (impor 1))
                          :pembahasan (rand-nth (impor 3))}
                         (zipmap [:p1 :p2 :p3] (shuffle (impor 2))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn pengertian-migrasi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan definisi migrasi adalah ...."
                                 "Definisi migrasi adalah ...."
                                 "Pengertian migrasi adalah ...."
                                 "Maksud dari migrasi adalah ...."
                                 "Migrasi adalah ...."])
               soal-2 (rand-nth ["Di bawah ini yang <u>bukan</u> merupakan definisi migrasi adalah ...."
                                 "Definisi yang <u>kurang tepat</u> untuk migrasi adalah ...."
                                 "Pengertian yang <u>kurang tepat</u> untuk migrasi adalah ...."
                                 "Berikut ini adalah definisi migrasi, <i>kecuali</i> ...."
                                 "Di bawah ini merupakan pengertian dari migrasi, <i>kecuali</i> ...."])
               benar ["perpindahan penduduk dari satu wilayah ke wilayah lain dengan maksud untuk menetap di daerah tujuan"
                      "gerak penduduk melintasi batas wilayah asal menuju wilayah tujuan dengan niatan menetap"
                      "peristiwa berpindahnya penduduk dari wilayah asal ke wilayah tujuan dengan niatan untuk tinggal secara permanen"
                      "aktivitas perpindahan penduduk dari satu lokasi ke lokasi lainnya baik di satu negara maupun antarnegara secara permanen"
                      "masuk atau keluarnya penduduk dari suatu wilayah ke wilayah lain dengan tujuan menetap"]
               salah ["perpindahan penduduk dari satu wilayah ke wilayah lain dengan maksud untuk singgah sementara"
                      "gerak penduduk melintasi batas wilayah asal menuju wilayah tujuan tanpa niatan menetap"
                      "peristiwa berpindahnya penduduk dari wilayah asal ke wilayah tujuan dengan niatan untuk tinggal secara sementara"
                      "aktivitas perpindahan penduduk dari satu lokasi ke lokasi lainnya baik di satu negara maupun antarnegara yang bersifat sementara"
                      "masuk atau keluarnya penduduk dari suatu wilayah ke wilayah lain dengan tujuan melancong"]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth benar)}
                         (zipmap [:p1 :p2 :p3] (shuffle salah)))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth salah)}
                         (zipmap [:p1 :p2 :p3] (shuffle benar)))))))

       (repeatedly 300)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn jenis-migran-antardaerah []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8 :S9 :S10 :S11 :S12])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan kalimat-kalimat di bawah ini!"])
               migrasi [" semasa hidup "
                        " risen "
                        " total "]
               awalan (rand-nth ["Dari opsi-opsi di atas, yang termasuk jenis migran"
                                 "Dari beberapa kalimat di atas, yang berkaitan dengan jenis migran"
                                 "Yang termasuk jenis migran"])
               soal (fn [x] (apply str awalan x "adalah ...."))
               soal-1 (soal (migrasi 0))
               soal-2 (soal (migrasi 1))
               soal-3 (soal (migrasi 2))
               semasa-hidup ["Perpindahan dari tempat lahir ke tempat tinggal sekarang."
                             "Tempat tinggalnya sekarang bukan tempat kelahirannya."
                             "Orang-orang bermigrasi dari tempat kelahirannya."]
               semasa-hidup-1 (rand-nth semasa-hidup)
               semasa-hidup-2 (rand-nth (remove #{semasa-hidup-1} semasa-hidup))
               bahas-semasa-hidup (rand-nth ["Migran semasa hidup (<i>life time migrant</i>) adalah mereka yang pindah dari tempat lahir ke tempat tinggal sekarang, atau mereka yang tempat tinggalnya sekarang bukan di wilayah provinsi kelahirannya."])
               risen ["Perpindahan dalam kurun lima tahun terakhir sebelum perhitungan penduduk."
                      "Migrasi penduduk dalam lima tahun terakhir sebelum pencacahan penduduk."]
               risen-1 (rand-nth risen)
               risen-2 (rand-nth (remove #{risen-1} risen))
               bahas-risen (rand-nth ["Migran risen (<i>recent migrant</i>) adalah mereka yang pindah melewati batas provinsi dalam kurun waktu lima tahun terakhir sebelum pencacahan atau perhitungan penduduk."])
               total ["Pernah tinggal di tempat yang berbeda dari tempat sewaktu pengumpulan data."
                      "Mereka yang tempat tinggal sebelumnya berbeda dengan tempat sewaktu perhitungan penduduk."]
               total-1 (rand-nth total)
               total-2 (rand-nth (remove #{total-1} total))
               bahas-total (rand-nth ["Migran total adalah orang yang pernah bertempat tinggal di tempat yang berbeda dengan tempat tinggal pada waktu pengumpulan data."])
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 semasa-hidup-1
                          :fakta2 (rand-nth (concat risen total))
                          :soal soal-1
                          :pb (jawaban 0)
                          :pembahasan bahas-semasa-hidup}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 risen-1
                          :fakta2 (rand-nth (concat semasa-hidup total))
                          :soal soal-2
                          :pb (jawaban 0)
                          :pembahasan bahas-risen}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 total-1
                          :fakta2 (rand-nth (concat semasa-hidup risen))
                          :soal soal-3
                          :pb (jawaban 0)
                          :pembahasan bahas-total}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 (rand-nth (concat risen total))
                          :fakta2 semasa-hidup-2
                          :soal soal-1
                          :pb (jawaban 1)
                          :pembahasan bahas-semasa-hidup}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 (rand-nth (concat semasa-hidup total))
                          :fakta2 risen-2
                          :soal soal-2
                          :pb (jawaban 1)
                          :pembahasan bahas-risen}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 (rand-nth (concat semasa-hidup risen))
                          :fakta2 total-2
                          :soal soal-3
                          :pb (jawaban 1)
                          :pembahasan bahas-total}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 semasa-hidup-1
                          :fakta2 semasa-hidup-2
                          :soal soal-1
                          :pb (jawaban 2)
                          :pembahasan bahas-semasa-hidup}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 risen-1
                          :fakta2 risen-2
                          :soal soal-2
                          :pb (jawaban 2)
                          :pembahasan bahas-risen}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S9 (merge {:pengantar pengantar
                          :fakta1 total-1
                          :fakta2 total-2
                          :soal soal-3
                          :pb (jawaban 2)
                          :pembahasan bahas-total}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S10 (merge {:pengantar pengantar
                           :fakta1 (rand-nth risen)
                           :fakta2 (rand-nth total)
                           :soal soal-1
                           :pb (jawaban 3)
                           :pembahasan bahas-semasa-hidup}
                          (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))
              :S11 (merge {:pengantar pengantar
                           :fakta1 (rand-nth semasa-hidup)
                           :fakta2 (rand-nth total)
                           :soal soal-2
                           :pb (jawaban 3)
                           :pembahasan bahas-risen}
                          (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))
              :S12 (merge {:pengantar pengantar
                           :fakta1 (rand-nth risen)
                           :fakta2 (rand-nth semasa-hidup)
                           :soal soal-3
                           :pb (jawaban 3)
                           :pembahasan bahas-total}
                          (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn pengaruh-ketergantungan-antarruang-pada-migrasi-1 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan kalimat-kalimat di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk pengaruh positif ketergantungan antarruang pada migrasi penduduk adalah ...."
                               "Dari beberapa kalimat di atas, yang menjadi pengaruh positif ketergantungan antarruang pada migrasi penduduk adalah ...."
                               "Yang termasuk pengaruh positif ketergantungan antarruang pada migrasi penduduk dari opsi-opsi atas adalah ...."])
               positif ["Meningkatnya jumlah tenaga kerja di wilayah tujuan."
                        "Meningkatnya taraf ekonomi di wilayah tujuan."
                        "Mengurangi kepadatan penduduk di wilayah asal."
                        "Mengurangi angka pengangguran di wilayah asal."]
               positif-1 (rand-nth positif)
               positif-2 (rand-nth (remove #{positif-1} positif))
               positif-3 (rand-nth (remove #{positif-1 positif-2} positif))
               negatif ["Meningkatkan kepadatan penduduk di wilayah tujuan."
                        "Meningkatnya persaingan tenaga kerja di wilayah tujuan."
                        "Berkurangnya penduduk usia produktif di wilayah asal."
                        "Mengurangi tingkat keamanan di wilayah asal jika hanya menyisakan penduduk lanjut usia."]
               negatif-1 (rand-nth negatif)
               negatif-2 (rand-nth (remove #{negatif-1} negatif))
               negatif-3 (rand-nth (remove #{negatif-1 negatif-2} negatif))
               jawaban ["1 saja"
                        "2 saja"
                        "3 saja"
                        "1 dan 2"
                        "2 dan 3"
                        "1 dan 3"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 positif-1
                          :fakta2 negatif-2
                          :fakta3 negatif-3
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 negatif-1
                          :fakta2 positif-2
                          :fakta3 negatif-3
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 negatif-1
                          :fakta2 negatif-2
                          :fakta3 positif-3
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 positif-1
                          :fakta2 positif-2
                          :fakta3 negatif-3
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 negatif-1
                          :fakta2 positif-2
                          :fakta3 positif-3
                          :soal soal
                          :pb (jawaban 4)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 4)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 positif-1
                          :fakta2 negatif-2
                          :fakta3 positif-3
                          :soal soal
                          :pb (jawaban 5)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 5)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 positif-1
                          :fakta2 positif-2
                          :fakta3 positif-3
                          :soal soal
                          :pb (jawaban 6)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 6)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 negatif-1
                          :fakta2 negatif-2
                          :fakta3 negatif-3
                          :soal soal
                          :pb (jawaban 7)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 7)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn pengaruh-ketergantungan-antarruang-pada-migrasi-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan kalimat-kalimat di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk pengaruh negatif ketergantungan antarruang pada migrasi penduduk adalah ...."
                               "Dari beberapa kalimat di atas, yang menjadi pengaruh negatif ketergantungan antarruang pada migrasi penduduk adalah ...."
                               "Yang termasuk pengaruh negatif ketergantungan antarruang pada migrasi penduduk dari opsi-opsi atas adalah ...."])
               positif ["Meningkatnya jumlah tenaga kerja di wilayah tujuan."
                        "Meningkatnya taraf ekonomi di wilayah tujuan."
                        "Mengurangi kepadatan penduduk di wilayah asal."
                        "Mengurangi angka pengangguran di wilayah asal."]
               positif-1 (rand-nth positif)
               positif-2 (rand-nth (remove #{positif-1} positif))
               positif-3 (rand-nth (remove #{positif-1 positif-2} positif))
               negatif ["Meningkatkan kepadatan penduduk di wilayah tujuan."
                        "Meningkatnya persaingan tenaga kerja di wilayah tujuan."
                        "Berkurangnya penduduk usia produktif di wilayah asal."
                        "Mengurangi tingkat keamanan di wilayah asal karena hanya menyisakan penduduk lanjut usia."]
               negatif-1 (rand-nth negatif)
               negatif-2 (rand-nth (remove #{negatif-1} negatif))
               negatif-3 (rand-nth (remove #{negatif-1 negatif-2} negatif))
               jawaban ["1 saja"
                        "2 saja"
                        "3 saja"
                        "1 dan 2"
                        "2 dan 3"
                        "1 dan 3"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 negatif-1
                          :fakta2 positif-2
                          :fakta3 positif-3
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 positif-1
                          :fakta2 negatif-2
                          :fakta3 positif-3
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 positif-1
                          :fakta2 positif-2
                          :fakta3 negatif-3
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 negatif-1
                          :fakta2 negatif-2
                          :fakta3 positif-3
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 positif-1
                          :fakta2 negatif-2
                          :fakta3 negatif-3
                          :soal soal
                          :pb (jawaban 4)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 4)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 negatif-1
                          :fakta2 positif-2
                          :fakta3 negatif-3
                          :soal soal
                          :pb (jawaban 5)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 5)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 negatif-1
                          :fakta2 negatif-2
                          :fakta3 negatif-3
                          :soal soal
                          :pb (jawaban 6)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 6)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 positif-1
                          :fakta2 positif-2
                          :fakta3 positif-3
                          :soal soal
                          :pb (jawaban 7)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 7)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn pengertian-transportasi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan definisi transportasi adalah ...."
                                 "Arti kata transportasi adalah ...."
                                 "Pengertian transportasi adalah ...."
                                 "Maksud kata transportasi adalah ...."
                                 "Transportasi adalah ...."])
               soal-2 (rand-nth ["Di bawah ini yang <b><u>bukan</u></b> merupakan definisi transportasi adalah ...."
                                 "Definisi yang <b><u>kurang tepat</u></b> untuk kata transportasi adalah ...."
                                 "Pengertian yang <b><u>kurang tepat</u></b> untuk kata transportasi adalah ...."
                                 "Berikut ini adalah definisi transportasi, <b><i><u>kecuali</u></i></b> ...."
                                 "Di bawah ini merupakan pengertian dari kata transportasi, <b><i><u>kecuali</u></i></b> ...."])
               benar ["pengangkutan barang oleh berbagai jenis kendaraan sesuai kemajuan teknologi"
                      "pengangkutan barang atau manusia dengan kendaraan sesuai kemajuan teknologi"
                      "pemindahan manusia atau barang dengan menggunakan sebuah kendaraan yang digerakkan oleh manusia atau mesin"
                      "pemindahan manusia atau barang dari satu tempat ke tempat lainnya dengan menggunakan sebuah kendaraan"
                      "pengangkutan manusia atau barang dengan berbagai kendaraan yang digerakkan oleh manusia atau mesin"]
               salah ["perhentian sementara untuk berganti kendaraan sebelum melanjutkan perjalanan ke tempat tujuan"
                      "perpindahan sementara dengan mayoritas penumpang yang berbeda sebelum melanjutkan perjalanan ke tempat tujuan"
                      "pemberhentian sementara dengan kendaraan yang sama sebelum melanjutkan perjalanan ke tempat tujuan"
                      "perpindahan dengan kendaraan yang berbeda untuk melanjutkan perjalanan ke tempat tujuan"
                      "perjalanan kendaraan dengan mayoritas penumpang yang sama sebelum melanjutkan keberangkatan ke tempat tujuan"]]

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

(defn transportasi-indonesia-era-kolonial []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan fakta-fakta di bawah ini!"])
               soal (rand-nth ["Dari fakta-fakta di atas, yang merupakan perkembangan teknologi transportasi Indonesia di masa kolonial adalah ...."
                               "Dari beberapa fakta di atas, yang merupakan perkembangan teknologi transportasi Indonesia pada masa kolonial adalah ...."
                               "Yang merupakan perkembangan teknologi transportasi Indonesia di masa kolonial dari fakta-fakta di atas adalah ...."])
               kolonial ["Delman mulai digunakan oleh masyarakat di Batavia."
                         "Trem mulai diperkenalkan oleh Belanda."
                         "Becak mulai digunakan oleh masyarakat pada tahun 1930."]
               kolonial-1 (rand-nth kolonial)
               kolonial-2 (rand-nth (remove #{kolonial-1} kolonial))
               non-kolonial ["Oplet mulai beroperasi di Jakarta pada tahun 1960."
                             "Bemo menjadi salah satu moda transportasi populer pada tahun 1962."
                             "Metromini mulai diperkenalkan pada ajang Pekan Olahraga Nasional tahun 1962."
                             "Bajaj menjadi salah satu moda transportasi populer pada tahun 1970."
                             "Helicak diperkenalkan oleh Gubernur Ali Sadikin pada tahun 1970."
                             "Mikrolet mulai diperkenalkan pada tahun 1970."
                             "Taksi mulai diperkenalkan pada tahun 1972."
                             "Bus tingkat mulai beroperasi di Jakarta pada tahun 1985."
                             "Bus Transjakarta mulai beroperasi di Jakarta pada tahun 2004."
                             "Ojek dan taksi berbasis sistem aplikasi <i>online</i> mulai populer pada tahun 2014."
                             "<i>Mass Rapid Transit</i> (MRT) mulai beroperasi di Jakarta pada tahun 2019."]
               non-kolonial-1 (rand-nth non-kolonial)
               non-kolonial-2 (rand-nth (remove #{non-kolonial-1} non-kolonial))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 kolonial-1
                          :fakta2 non-kolonial-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-kolonial-1
                          :fakta2 kolonial-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 kolonial-1
                          :fakta2 kolonial-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-kolonial-1
                          :fakta2 non-kolonial-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn transportasi-indonesia-era-orde-lama []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pilihan di bawah ini!"
                                    "Perhatikan pernyataan di bawah ini!"])
               soal (rand-nth ["Dari pernyataan di atas, yang merupakan perkembangan teknologi transportasi Indonesia di masa Orde Lama adalah ...."
                               "Dari beberapa pernyataan di atas, yang merupakan perkembangan teknologi transportasi Indonesia pada masa Orde Lama adalah ...."
                               "Yang merupakan perkembangan teknologi transportasi Indonesia di masa Orde Lama dari pernyataan di atas adalah ...."])
               orde-lama ["Oplet mulai beroperasi di Jakarta pada tahun 1960."
                          "Bemo menjadi salah satu moda transportasi populer pada tahun 1962."
                          "Metromini mulai diperkenalkan pada ajang Pekan Olahraga Nasional tahun 1962."]
               orde-lama-1 (rand-nth orde-lama)
               orde-lama-2 (rand-nth (remove #{orde-lama-1} orde-lama))
               non-orde-lama ["Delman mulai digunakan oleh masyarakat di Batavia."
                              "Trem mulai diperkenalkan oleh Belanda."
                              "Becak mulai digunakan oleh masyarakat pada tahun 1930."
                              "Bajaj menjadi salah satu moda transportasi populer pada tahun 1970."
                              "Helicak diperkenalkan oleh Gubernur Ali Sadikin pada tahun 1970."
                              "Mikrolet mulai diperkenalkan pada tahun 1970."
                              "Taksi mulai diperkenalkan pada tahun 1972."
                              "Bus tingkat mulai beroperasi di Jakarta pada tahun 1985."
                              "Bus Transjakarta mulai beroperasi di Jakarta pada tahun 2004."
                              "Ojek dan taksi berbasis sistem aplikasi <i>online</i> mulai populer pada tahun 2014."
                              "<i>Mass Rapid Transit</i> (MRT) mulai beroperasi di Jakarta pada tahun 2019."]
               non-orde-lama-1 (rand-nth non-orde-lama)
               non-orde-lama-2 (rand-nth (remove #{non-orde-lama-1} non-orde-lama))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [y] (shuffle (filter #(not (= % y)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 orde-lama-1
                          :fakta2 non-orde-lama-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-orde-lama-1
                          :fakta2 orde-lama-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 orde-lama-1
                          :fakta2 orde-lama-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-orde-lama-1
                          :fakta2 non-orde-lama-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn transportasi-indonesia-era-orde-baru []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pilihan di bawah ini!"
                                    "Perhatikan pernyataan di bawah ini!"])
               soal (rand-nth ["Dari pernyataan di atas, yang merupakan perkembangan teknologi transportasi Indonesia di masa Orde Baru adalah ...."
                               "Dari beberapa pernyataan di atas, yang merupakan perkembangan teknologi transportasi Indonesia pada masa Orde Baru adalah ...."
                               "Yang merupakan perkembangan teknologi transportasi Indonesia di masa Orde Baru dari pernyataan di atas adalah ...."])
               orde-baru ["Bajaj menjadi salah satu moda transportasi populer pada tahun 1970."
                          "Helicak diperkenalkan oleh Gubernur Ali Sadikin pada tahun 1970."
                          "Mikrolet mulai diperkenalkan pada tahun 1970."
                          "Taksi mulai diperkenalkan pada tahun 1972."
                          "Bus tingkat mulai beroperasi di Jakarta pada tahun 1985."]
               orde-baru-1 (rand-nth orde-baru)
               orde-baru-2 (rand-nth (remove #{orde-baru-1} orde-baru))
               non-orde-baru ["Delman mulai digunakan oleh masyarakat di Batavia."
                              "Trem mulai diperkenalkan oleh Belanda."
                              "Becak mulai digunakan oleh masyarakat pada tahun 1930."
                              "Oplet mulai beroperasi di Jakarta pada tahun 1960."
                              "Bemo menjadi salah satu moda transportasi populer pada tahun 1962."
                              "Metromini mulai diperkenalkan pada ajang Pekan Olahraga Nasional tahun 1962."
                              "Bus Transjakarta mulai beroperasi di Jakarta pada tahun 2004."
                              "Ojek dan taksi berbasis sistem aplikasi <i>online</i> mulai populer pada tahun 2014."
                              "<i>Mass Rapid Transit</i> (MRT) mulai beroperasi di Jakarta pada tahun 2019."]
               non-orde-baru-1 (rand-nth non-orde-baru)
               non-orde-baru-2 (rand-nth (remove #{non-orde-baru-1} non-orde-baru))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 orde-baru-1
                          :fakta2 non-orde-baru-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-orde-baru-1
                          :fakta2 orde-baru-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 orde-baru-1
                          :fakta2 orde-baru-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-orde-baru-1
                          :fakta2 non-orde-baru-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn pendidikan-di-indonesia-1 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan pilihan di bawah ini!"
                                    "Perhatikan opsi di bawah ini!"
                                    "Perhatikan pernyataan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk ciri-ciri pendidikan umum atau kejuruan adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan ciri-ciri pendidikan umum atau kejuruan adalah ...."
                               "Yang merupakan ciri-ciri pendidikan umum atau kejuruan dari pernyataan di atas adalah ...."])
               umum ["Terbagi dari pendidikan dasar dan menengah."
                     "Mempersiapkan siswa untuk melanjutkan pendidikan ke jenjang yang lebih tinggi."
                     "Mempersiapkan siswa untuk bekerja di bidang tertentu."
                     "Mengembangkan keterampilan siswa di bidang tertentu."
                     "Memperluas pengetahuan siswa agar siap lanjut ke pendidikan selanjutnya."
                     "Contoh program pendidikan umum adalah sekolah dasar (SD)."
                     "Contoh program pendidikan umum adalah sekolah menengah atas (SMA)."
                     "Contoh program pendidikan kejuruan adalah sekolah menengah kejuruan (SMK)."
                     "Contoh program pendidikan umum adalah sekolah menengah pertama (SMP)."]
               umum-1 (rand-nth umum)
               umum-2 (rand-nth (remove #{umum-1} umum))
               non-umum ["Mengarahkan peserta didik pada penguasaan disiplin tertentu."
                         "Contoh program pendidikan umum adalah program sarjana (S-1)."
                         "Contoh program pendidikan umum adalah program pascasarjana (S-2)."
                         "Mempersiapkan peserta didik untuk memasuki bidang pekerjaan dengan persyaratan keahlian khusus."
                         "Contoh program pendidikan kejuruan adalah profesi dengan gelar akuntan (Akt.)."
                         "Contoh program pendidikan kejuruan adalah profesi dengan gelar dokter (dr.)."
                         "Termasuk ke dalam pendidikan tinggi."
                         "Mempersiapkan peserta didik untuk memasuki bidang pekerjaan dengan keahlian terapan tertentu."
                         "Contoh program pendidikan umum adalah program diploma (D-1 s.d. D-4)."
                         "Contoh program pendidikan umum adalah program diploma dengan gelar vokasi seperti ahli madya (A.Md.)."
                         "Mempersiapkan siswa untuk menguasai pengetahuan keagamaan."
                         "Menyelenggarakan pendidikan bagi peserta didik berkebutuhan khusus."]
               non-umum-1 (rand-nth non-umum)
               non-umum-2 (rand-nth (remove #{non-umum-1} non-umum))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 umum-1
                          :fakta2 non-umum-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-umum-1
                          :fakta2 umum-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 umum-1
                          :fakta2 umum-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-umum-1
                          :fakta2 non-umum-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn pendidikan-di-indonesia-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan pilihan di bawah ini!"
                                    "Perhatikan opsi di bawah ini!"
                                    "Perhatikan pernyataan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk ciri-ciri pendidikan akademik adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan ciri-ciri pendidikan akademik adalah ...."
                               "Yang merupakan ciri-ciri pendidikan akademik dari pernyataan di atas adalah ...."])
               akademik ["Mengarahkan peserta didik pada penguasaan disiplin tertentu."
                         "Contoh program pendidikan akademik adalah program sarjana (S-1)."
                         "Contoh program pendidikan akademik adalah program magister (S-2)."
                         "Termasuk ke dalam pendidikan tinggi."
                         "Contoh program pendidikan akademik adalah program doktor (S-3)."]
               akademik-1 (rand-nth akademik)
               akademik-2 (rand-nth (remove #{akademik-1} akademik))
               non-akademik ["Terbagi dari pendidikan dasar dan menengah."
                             "Mempersiapkan siswa untuk melanjutkan pendidikan ke jenjang yang lebih tinggi."
                             "Mempersiapkan siswa untuk bekerja di bidang tertentu."
                             "Mengembangkan keterampilan siswa di bidang tertentu."
                             "Mempersiapkan peserta didik untuk memasuki bidang pekerjaan dengan persyaratan keahlian khusus."
                             "Contoh program pendidikan akademik adalah profesi dengan gelar akuntan (Akt.)."
                             "Contoh program pendidikan akademik adalah profesi dengan gelar dokter (dr.)."
                             "Mempersiapkan peserta didik untuk memasuki bidang pekerjaan dengan keahlian terapan tertentu."
                             "Contoh program pendidikan umum adalah program diploma (D-1 s.d. D-4)."
                             "Contoh program pendidikan akademik adalah program diploma dengan gelar vokasi seperti ahli madya (A.Md.)."
                             "Mempersiapkan siswa untuk menguasai pengetahuan keagamaan."
                             "Menyelenggarakan pendidikan bagi peserta didik berkebutuhan khusus."]
               non-akademik-1 (rand-nth non-akademik)
               non-akademik-2 (rand-nth (remove #{non-akademik-1} non-akademik))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 akademik-1
                          :fakta2 non-akademik-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-akademik-1
                          :fakta2 akademik-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 akademik-1
                          :fakta2 akademik-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-akademik-1
                          :fakta2 non-akademik-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn pendidikan-di-dunia-1 []
  (->> (fn []
         (let [pengantar (rand-nth ["Pandemi COVID-19 telah membawa dampak yang signifikan bagi kehidupan masyarakat, salah satunya adalah pemanfaatan teknologi dalam pendidikan."
                                    "Penggunaan teknologi untuk pendidikan berkembang semakin pesat selama pandemi COVID-19 melanda dunia."
                                    "Pandemi COVID-19 telah mendorong pemanfaatan teknologi dalam bidang pendidikan secara menyeluruh."
                                    "Pemanfaatan teknologi di bidang pendidikan semakin pesat akibat diberlakukannya pembelajaran jarak jauh selama pandemi COVID-19."
                                    "Pendidikan jarak jauh selama pandemi COVID-19 mempercepat pemanfaatan teknologi untuk kegiatan pendidikan di seluruh dunia."])
               soal (rand-nth [" Berikut ini yang merupakan kelebihan penggunaan teknologi dalam pendidikan adalah ...."
                               " Di bawah ini yang merupakan kelebihan penggunaan teknologi dalam pendidikan adalah ...."
                               " Salah satu kelebihan penggunaan teknologi dalam pendidikan adalah ...."
                               " Contoh kelebihan pemanfaatan teknologi dalam pendidikan adalah ...."
                               " Kelebihan pemanfaatan teknologi dalam pendidikan salah satunya adalah ...."])
               benar ["memperkenalkan pembelajaran mandiri kepada siswa"
                      "mendorong pengembangan metode pengajaran baru"
                      "menciptakan cara belajar yang lebih efektif"
                      "mempermudah siswa untuk memperoleh beragam informasi"
                      "memberikan kenyamanan dalam belajar"]
               salah ["adanya gangguan yang dapat mengalihkan perhatian siswa"
                      "mendorong pola pikir malas akibat ketergantungan pada mesin pencari"
                      "kesulitan akses dan biaya bagi keluarga yang tidak mampu"
                      "mempermudah siswa untuk melakukan kecurangan"
                      "menimbulkan masalah kesehatan akibat terlalu lama memerhatikan gawai"]]

           (merge {:pengantar pengantar
                   :soal soal
                   :pb (rand-nth benar)}
                  (zipmap [:p1 :p2 :p3] (shuffle salah)))))

       (repeatedly 300)
       distinct
       shuffle
       (take 125)
       shuffle))

(defn pendidikan-di-dunia-2 []
  (->> (fn []
         (let [pengantar (rand-nth ["Pandemi COVID-19 telah membawa dampak yang signifikan bagi kehidupan masyarakat, salah satunya adalah pemanfaatan teknologi dalam pendidikan."
                                    "Penggunaan teknologi untuk pendidikan berkembang semakin pesat selama pandemi COVID-19 melanda dunia."
                                    "Pandemi COVID-19 telah mendorong pemanfaatan teknologi dalam bidang pendidikan secara menyeluruh."
                                    "Pemanfaatan teknologi di bidang pendidikan semakin pesat akibat diberlakukannya pembelajaran jarak jauh selama pandemi COVID-19."
                                    "Pendidikan jarak jauh selama pandemi COVID-19 mempercepat pemanfaatan teknologi untuk kegiatan pendidikan di seluruh dunia."])
               soal (rand-nth [" Berikut ini yang merupakan kekurangan penggunaan teknologi dalam pendidikan adalah ...."
                               " Di bawah ini yang merupakan kekurangan penggunaan teknologi dalam pendidikan adalah ...."
                               " Salah satu kekurangan penggunaan teknologi dalam pendidikan adalah ...."
                               " Contoh kekurangan pemanfaatan teknologi dalam pendidikan adalah ...."
                               " Kekurangan pemanfaatan teknologi dalam pendidikan salah satunya adalah ...."])
               benar ["adanya gangguan yang dapat mengalihkan perhatian siswa"
                      "mendorong pola pikir malas akibat ketergantungan pada mesin pencari"
                      "kesulitan akses dan biaya bagi keluarga yang tidak mampu"
                      "mempermudah siswa untuk melakukan kecurangan"
                      "menimbulkan masalah kesehatan akibat terlalu lama memerhatikan gawai"]
               salah ["memperkenalkan pembelajaran mandiri kepada siswa"
                      "mendorong pengembangan metode pengajaran baru"
                      "menciptakan cara belajar yang lebih efektif"
                      "mempermudah siswa untuk memperoleh beragam informasi"
                      "memberikan kenyamanan dalam belajar"]]

           (merge {:pengantar pengantar
                   :soal soal
                   :pb (rand-nth benar)}
                  (zipmap [:p1 :p2 :p3] (shuffle salah)))))

       (repeatedly 300)
       distinct
       shuffle
       (take 125)
       shuffle))

(defn pendidikan-di-dunia-3 []
  (->> (fn []
         (let [pengantar (rand-nth ["Tantangan pendidikan di Indonesia sangat kompleks dan beragam."
                                    "Pendidikan di Indonesia memiliki tantangan yang sangat rumit dan bermacam-macam."
                                    "Masalah dan tantangan pendidikan di Indonesia sangat rumit dan beragam."])
               soal (rand-nth [" Berikut ini yang merupakan salah satu tantangan pendidikan di Indonesia adalah ...."
                               " Di bawah ini yang merupakan salah satu tantangan pendidikan di Indonesia adalah ...."
                               " Salah satu tantangan pendidikan di Indonesia adalah ...."
                               " Contoh tantangan pendidikan di Indonesia adalah ...."
                               " Tantangan pendidikan di Indonesia salah satunya adalah ...."])
               benar ["infrastruktur dan sumber daya pendidikan yang belum merata"
                      "kualitas dan persebaran guru yang belum merata"
                      "kurangnya pengaturan proses dan target belajar siswa"
                      "lingkungan yang tidak mendukung siswa untuk belajar secara nyaman"
                      "rendahnya kemampuan akademis siswa-siswa di Indonesia"]
               salah ["sumber daya manusia yang sangat berkualitas"
                      "kualitas dan persebaran guru yang merata"
                      "pengaturan proses dan target belajar siswa telah ditetapkan dengan baik"
                      "budaya orang Indonesia mendukung siswa untuk belajar"
                      "tingginya kemampuan akademis siswa-siswa di Indonesia"]]

           (merge {:pengantar pengantar
                   :soal soal
                   :pb (rand-nth benar)}
                  (zipmap [:p1 :p2 :p3] (shuffle salah)))))

       (repeatedly 300)
       distinct
       shuffle
       (take 75)
       shuffle))

(defn pengaruh-ketergantungan-antarruang-pada-pendidikan []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pernyataan-pernyataan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk pengaruh ketergantungan antarruang pada pendidikan adalah ...."
                               "Dari beberapa kalimat di atas, yang menjadi pengaruh ketergantungan antarruang pada pendidikan adalah ...."
                               "Yang termasuk pengaruh ketergantungan antarruang pada pendidikan dari opsi-opsi atas adalah ...."])
               benar ["Tidak semua daerah di Indonesia yang memiliki kualitas sekolah yang baik."
                      "Penduduk desa pergi ke kota untuk memperoleh pendidikan yang baik."
                      "Sekolah-sekolah di kota memperoleh siswa-siswa tekun dari desa."
                      "Terbentuknya hubungan antara siswa di desa dan sekolah di kota."]
               benar-1 (rand-nth benar)
               benar-2 (rand-nth (remove #{benar-1} benar))
               salah ["Semua daerah di Indonesia memiliki kualitas pendidikan yang baik."
                      "Penduduk desa tidak perlu pergi ke kota karena kualitas sekolah di desanya sudah baik."
                      "Sekolah-sekolah di kota tidak memerlukan siswa-siswa dari desa."]
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
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 salah-1
                          :fakta2 benar-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 benar-1
                          :fakta2 benar-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 salah-1
                          :fakta2 salah-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn pengertian-lembaga-ekonomi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan definisi lembaga ekonomi adalah ...."
                                 "Definisi lembaga ekonomi adalah ...."
                                 "Pengertian lembaga ekonomi adalah ...."
                                 "Maksud dari lembaga ekonomi adalah ...."
                                 "Lembaga ekonomi adalah ...."])
               soal-2 (rand-nth ["Di bawah ini yang <b><u>bukan</u></b> merupakan definisi lembaga ekonomi adalah ...."
                                 "Definisi yang <b><u>kurang tepat</u></b> untuk lembaga ekonomi adalah ...."
                                 "Pengertian yang <b><u>kurang tepat</u></b> untuk lembaga ekonomi adalah ...."
                                 "Berikut ini adalah definisi lembaga ekonomi, <b><i>kecuali</i></b> ...."
                                 "Di bawah ini merupakan pengertian dari lembaga ekonomi, <b><i>kecuali</i></b> ...."])
               benar ["lembaga yang diperlukan dalam pelaksanaan kegiatan ekonomi"
                      "bagian dari lembaga sosial yang mengatur hubungan antarmanusia dalam pemenuhan kebutuhan harian"
                      "lembaga yang mengatur kegiatan produksi, distribusi, dan konsumsi bagi kelangsungan hidup masyarakat"
                      "lembaga yang mengatur cara-cara melakukan produksi, distribusi, dan konsumsi barang dan jasa"
                      "lembaga sosial yang mengatur masalah ekonomi berupa kesejahteraan material"]
               salah ["lembaga yang diperlukan dalam pelaksanaan kegiatan pengabdian masyarakat"
                      "bagian dari lembaga pemerintah yang mengatur hubungan antarmanusia dalam hal keamanan dan ketertiban"
                      "lembaga yang hanya mengatur kegiatan produksi dan konsumsi bagi kesejahteraan masyarakat"
                      "lembaga yang hanya mengatur cara-cara melakukan distribusi dan konsumsi barang dan jasa"
                      "lembaga sosial yang mengatur masalah sosial berupa kesejahteraan nonmaterial"]]

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

(defn lembaga-ekonomi-di-indonesia-1 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan contoh lembaga ekonomi di Indonesia adalah ...."
                                 "Di bawah ini yang merupakan contoh lembaga ekonomi di Indonesia adalah ...."
                                 "Salah satu lembaga ekonomi di Indonesia adalah ...."
                                 "Contoh lembaga ekonomi di Indonesia adalah ...."
                                 "Lembaga ekonomi di Indonesia salah satunya adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan contoh lembaga ekonomi di Indonesia adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan contoh lembaga ekonomi di Indonesia adalah ...."
                                 "Salah satu lembaga ekonomi di Indonesia adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Contoh lembaga ekonomi di Indonesia adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Lembaga ekonomi di Indonesia salah satunya adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar [["Badan Usaha Milik Negara"
                       "BUMN"
                       "Badan Usaha Milik Swasta"
                       "BUMS"
                       "koperasi"
                       "bank"]
                      ["pedagang"
                       "DPR"
                       "penjual makanan"
                       "yayasan sosial"
                       "panti asuhan"]]
               salah [["pedagang"
                       "DPR"
                       "penjual makanan"
                       "yayasan sosial"
                       "panti asuhan"]
                      ["Badan Usaha Milik Negara"
                       "bank"
                       "Badan Usaha Milik Swasta"
                       "koperasi"]]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth (benar 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah 0))))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth (benar 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah 1))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 55)
       shuffle))

(defn lembaga-ekonomi-di-indonesia-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan contoh-contoh di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk contoh koperasi di Indonesia adalah ...."
                               "Dari beberapa contoh di atas, yang termasuk jenis koperasi di Indonesia adalah ...."
                               "Yang termasuk contoh koperasi di Indonesia dari opsi-opsi atas adalah ...."])
               koperasi ["Koperasi konsumsi"
                         "Koperasi produksi"
                         "Koperasi simpan pinjam"
                         "Koperasi serba usaha"
                         "Koperasi jasa"]
               koperasi-1 (rand-nth koperasi)
               koperasi-2 (rand-nth (remove #{koperasi-1} koperasi))
               non-koperasi ["Koperasi kripto"
                             "Koperasi jual tanah"
                             "Koperasi serba pinjam"
                             "Koperasi simpan usaha"]
               non-koperasi-1 (rand-nth non-koperasi)
               non-koperasi-2 (rand-nth (remove #{non-koperasi-1} non-koperasi))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 koperasi-1
                          :fakta2 non-koperasi-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-koperasi-1
                          :fakta2 koperasi-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 koperasi-1
                          :fakta2 koperasi-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-koperasi-1
                          :fakta2 non-koperasi-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn lembaga-ekonomi-di-indonesia-3 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan contoh-contoh di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk contoh BUMN di Indonesia adalah ...."
                               "Dari beberapa contoh di atas, yang termasuk BUMN di Indonesia adalah ...."
                               "Yang termasuk contoh BUMN di Indonesia dari opsi-opsi atas adalah ...."])
               BUMN ["PT Pertamina (Persero)"
                     "PT Telkom Indonesia"
                     "PT Jasa Raharja"
                     "Perum Bulog"
                     "Perum Peruri"
                     "PT Pelni (Persero)"
                     "PT Bank Rakyat Indonesia"
                     "PT Bank Mandiri"
                     "Perum Damri"]
               BUMN-1 (rand-nth BUMN)
               BUMN-2 (rand-nth (remove #{BUMN-1} BUMN))
               non-BUMN ["PT Astra Internasional"
                         "PT Freeport Indonesia"
                         "PT Zona Edukasi Nusantara"
                         "PT Bank Central Asia"
                         "PT Unilever Indonesia"
                         "PT Panasonic"
                         "PT XL Axiata"
                         "PT Indofood Sukses Makmur"
                         "PT Pupuk Kaltim"]
               non-BUMN-1 (rand-nth non-BUMN)
               non-BUMN-2 (rand-nth (remove #{non-BUMN-1} non-BUMN))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 BUMN-1
                          :fakta2 non-BUMN-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-BUMN-1
                          :fakta2 BUMN-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 BUMN-1
                          :fakta2 BUMN-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-BUMN-1
                          :fakta2 non-BUMN-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn lembaga-ekonomi-di-indonesia-4 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan contoh-contoh di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk contoh BUMS di Indonesia adalah ...."
                               "Dari beberapa contoh di atas, yang termasuk BUMS di Indonesia adalah ...."
                               "Yang termasuk contoh BUMS di Indonesia dari opsi-opsi atas adalah ...."])
               BUMS ["PT Astra Internasional Indonesia"
                     "PT Freeport Indonesia"
                     "PT Zona Edukasi Nusantara"
                     "PT Bank Central Asia"
                     "PT Unilever Indonesia"
                     "PT Panasonic"
                     "PT XL Axiata"
                     "PT Indofood Sukses Makmur"
                     "PT Pupuk Kaltim"]
               BUMS-1 (rand-nth BUMS)
               BUMS-2 (rand-nth (remove #{BUMS-1} BUMS))
               non-BUMS ["PT Pertamina (Persero)"
                         "PT Telkom Indonesia"
                         "PT Jasa Raharja"
                         "Perum Bulog"
                         "Perum Peruri"
                         "PT Pelni (Persero)"
                         "PT Bank Rakyat Indonesia"
                         "PT Bank Mandiri"
                         "Perum Damri"]
               non-BUMS-1 (rand-nth non-BUMS)
               non-BUMS-2 (rand-nth (remove #{non-BUMS-1} non-BUMS))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 BUMS-1
                          :fakta2 non-BUMS-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-BUMS-1
                          :fakta2 BUMS-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 BUMS-1
                          :fakta2 BUMS-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-BUMS-1
                          :fakta2 non-BUMS-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn manfaat-pengembangan-pusat-keunggulan-ekonomi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat adalah ...."
                                 "Di bawah ini yang merupakan manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat adalah ...."
                                 "Salah satu manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat adalah ...."
                                 "Contoh manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat adalah ...."
                                 "Manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat salah satunya adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat adalah ...."
                                 "Salah satu manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Contoh manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Manfaat pengembangan pusat keunggulan ekonomi untuk kesejahteraan masyarakat salah satunya adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["penggerak utama pertumbuhan dengan menggali potensi daerah"
                      "meningkatkan keunggulan kompetitif secara nasional maupun global"
                      "membentengi negara dari serbuan produk-produk impor"
                      "menyerap berbagai jenis tenaga kerja"
                      "mempercepat pembangunan infrastruktur"
                      "mendorong masuknya investor"
                      "mengurangi tingkat kemiskinan masyarakat"
                      "meningkatkan kualitas sumber daya manusia"]
               salah ["menghapus tarif perdagangan antardaerah"
                      "menurunkan harga produk di seluruh wilayah"
                      "membentengi negara dari serbuan produk-produk ekspor"
                      "menyerap banyak tenaga kerja asing"
                      "mempercepat pembangunan kekuasaan politik"
                      "mendorong masuknya tenaga kerja dari luar negeri"
                      "meningkatkan tingkat pengangguran masyarakat"
                      "meningkatkan kualitas produk-produk impor"]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth benar)}
                         (zipmap [:p1 :p2 :p3] (shuffle salah)))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth salah)}
                         (zipmap [:p1 :p2 :p3] (shuffle benar)))))))

       (repeatedly 300)
       distinct
       shuffle
       (take 80)
       shuffle))

(defn masyarakat-ekonomi-asean-1 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan tujuan pembentukan Masyarakat Ekonomi ASEAN (MEA) adalah ...."
                                 "Di bawah ini yang merupakan tujuan pembentukan Masyarakat Ekonomi ASEAN (MEA) adalah ...."
                                 "Salah satu tujuan pembentukan Masyarakat Ekonomi ASEAN (MEA) adalah ...."
                                 "Tujuan pembentukan Masyarakat Ekonomi ASEAN (MEA) salah satunya adalah ...."
                                 "Masyarakat Ekonomi ASEAN (MEA) dibentuk dengan tujuan ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan tujuan pembentukan Masyarakat Ekonomi ASEAN (MEA) adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan tujuan pembentukan Masyarakat Ekonomi ASEAN (MEA) adalah ...."
                                 "Salah satu tujuan pembentukan Masyarakat Ekonomi ASEAN (MEA) adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Masyarakat Ekonomi ASEAN (MEA) dibentuk dengan tujuan berikut ini, <b><i>kecuali</i></b> ...."
                                 "Tujuan pembentukan Masyarakat Ekonomi ASEAN (MEA) adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["mewujudkan ASEAN sebagai kawasan pasar tunggal"
                      "mewujudkan ASEAN sebagai kawasan basis produksi"
                      "mewujudkan ASEAN sebagai kawasan berdaya saing tinggi di dunia"
                      "mewujudkan ASEAN sebagai kawasan dengan pembangunan ekonomi yang merata"
                      "mewujudkan ASEAN sebagai wilayah yang kompetitif dengan perkembangan ekonomi global"]
               salah ["mewujudkan ASEAN sebagai kawasan pasar ganda"
                      "mewujudkan ASEAN sebagai kawasan basis konsumsi"
                      "mewujudkan ASEAN sebagai kawasan berdaya saing rendah di dunia"
                      "mewujudkan ASEAN sebagai kawasan dengan pembangunan ekonomi yang tidak merata"
                      "mewujudkan ASEAN sebagai wilayah yang tidak kompetitif dengan perkembangan ekonomi global"]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth benar)}
                         (zipmap [:p1 :p2 :p3] (shuffle salah)))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth salah)}
                         (zipmap [:p1 :p2 :p3] (shuffle benar)))))))

       (repeatedly 300)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn masyarakat-ekonomi-asean-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan manfaat Masyarakat Ekonomi ASEAN bagi Indonesia adalah ...."
                                 "Di bawah ini yang merupakan manfaat Masyarakat Ekonomi ASEAN bagi Indonesia adalah ...."
                                 "Salah satu manfaat Masyarakat Ekonomi ASEAN bagi Indonesia adalah ...."
                                 "Manfaat Masyarakat Ekonomi ASEAN bagi Indonesia salah satunya adalah ...."
                                 "Contoh manfaat Masyarakat Ekonomi ASEAN (MEA) bagi Indonesia adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan manfaat Masyarakat Ekonomi ASEAN bagi Indonesia adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan manfaat Masyarakat Ekonomi ASEAN bagi Indonesia adalah ...."
                                 "Salah satu manfaat Masyarakat Ekonomi ASEAN bagi Indonesia adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Masyarakat Ekonomi ASEAN (MEA) memiliki beberapa manfaat bagi Indonesia seperti berikut ini, <b><i>kecuali</i></b> ...."
                                 "Manfaat Masyarakat Ekonomi ASEAN bagi Indonesia adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["Indonesia dapat memimpin pasar ASEAN melalui penguasaan pasar"
                      "Indonesia dapat memimpin pasar ASEAN melalui penguasaan investasi"
                      "Indonesia menjadi tujuan investasi bagi negara-negara ASEAN lainnya"
                      "pasokan barang di kawasan ASEAN lebih terjamin tanpa hambatan tarif"
                      "pelaku usaha terdorong menghasilkan barang berkualitas secara efisien"]
               salah ["Indonesia dapat memonopoli pasar ASEAN melalui penguasaan pasar"
                      "Indonesia dapat menguasai seluruh pasar ASEAN karena tidak ada pesaing"
                      "Indonesia menjadi tujuan migrasi bagi negara-negara ASEAN lainnya"
                      "pasokan barang di kawasan ASEAN lebih terjamin dengan adanya tarif"
                      "pelaku usaha terdorong untuk mengurangi produksi barang"]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth benar)}
                         (zipmap [:p1 :p2 :p3] (shuffle salah)))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth salah)}
                         (zipmap [:p1 :p2 :p3] (shuffle benar)))))))

       (repeatedly 300)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn kelangkaan-sebagai-permasalahan-ekonomi-1 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan definisi kelangkaan adalah ...."
                                 "Definisi kelangkaan adalah ...."
                                 "Pengertian kelangkaan adalah ...."
                                 "Maksud dari kelangkaan adalah ...."
                                 "Kelangkaan adalah ...."])
               soal-2 (rand-nth ["Di bawah ini yang <b><u>bukan</u></b> merupakan definisi kelangkaan adalah ...."
                                 "Definisi yang <b><u>kurang tepat</u></b> untuk kelangkaan adalah ...."
                                 "Pengertian yang <b><u>kurang tepat</u></b> untuk kelangkaan adalah ...."
                                 "Berikut ini adalah definisi kelangkaan, <b><i>kecuali</i></b> ...."
                                 "Di bawah ini merupakan pengertian dari kelangkaan, <b><i>kecuali</i></b> ...."])
               benar ["ketidakseimbangan antara kebutuhan dan ketersediaan alat pemuas kebutuhan"
                      "kesenjangan antara sumber daya ekonomi yang terbatas dengan jumlah kebutuhan yang tidak terbatas"
                      "ketidakseimbangan antara ketersediaan barang dan kebutuhan hidup manusia"
                      "kesenjangan antara jumlah kebutuhan yang tidak terbatas dan jumlah alat pemuas kebutuhan yang terbatas"
                      "ketidakseimbangan antara ketersediaan barang pemuas yang terbatas dan kebutuhan manusia yang tak terbatas"]
               salah ["keseimbangan antara kebutuhan dan ketersediaan alat pemuas kebutuhan"
                      "kesenjangan antara sumber daya ekonomi yang tak terbatas dengan jumlah kebutuhan yang terbatas"
                      "keseimbangan antara ketersediaan barang dan kebutuhan hidup manusia"
                      "kesenjangan antara jumlah kebutuhan yang terbatas dan jumlah alat pemuas kebutuhan yang tak terbatas"
                      "ketidakseimbangan antara ketersediaan barang pemuas yang tak terbatas dan kebutuhan manusia yang terbatas"]]

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

(defn kelangkaan-sebagai-permasalahan-ekonomi-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan penyebab terjadinya kelangkaan adalah ...."
                                 "Di bawah ini yang merupakan penyebab terjadinya kelangkaan adalah ...."
                                 "Salah satu penyebab terjadinya kelangkaan adalah ...."
                                 "Penyebab terjadinya kelangkaan salah satunya adalah ...."
                                 "Hal yang menyebabkan terjadinya kelangkaan adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan penyebab terjadinya kelangkaan adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan penyebab terjadinya kelangkaan adalah ...."
                                 "Salah satu penyebab terjadinya kelangkaan adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Kelangkaan disebabkan oleh hal-hal berikut ini, <b><i>kecuali</i></b> ...."
                                 "Penyebab terjadinya kelangkaan adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["jumlah barang lebih sedikit daripada kebutuhan" 
                      "kebutuhan yang semakin banyak sedangkan ketersediaan barang terbatas"
                      "kebutuhan lebih banyak daripada jumlah barang yang tersedia"
                      "keterbatasan jumlah barang sedangkan kebutuhan semakin bertambah"
                      "jumlah alat pemuas kebutuhan lebih sedikit daripada kebutuhan"]
               salah ["jumlah barang lebih banyak daripada kebutuhan"
                      "jumlah barang sama dengan kebutuhan"
                      "jumlah tenaga kerja lebih sedikit daripada kebutuhan"
                      "jumlah kebutuhan lebih banyak daripada tenaga kerja"
                      "kebutuhan lebih sedikit daripada jumlah barang"]]

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

(defn faktor-yang-mempengaruhi-kebutuhan-manusia-1 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan definisi kebutuhan adalah ...."
                                 "Definisi kebutuhan adalah ...."
                                 "Pengertian kebutuhan adalah ...."
                                 "Maksud dari kebutuhan adalah ...."
                                 "Kebutuhan adalah ...."])
               soal-2 (rand-nth ["Keinginan seseorang terhadap barang dan jasa yang harus dipenuhi dan jika tidak bisa dipenuhi maka akan mengganggu kehidupan orang tersebut adalah pengertian dari ...."
                                 "Sesuatu yang mutlak harus dipenuhi dan jika tidak terpenuhi maka akan mengganggu kualitas hidup seseorang adalah definisi dari ...."
                                 "Segala sesuatu yang dibutuhkan manusia untuk mempertahankan hidup serta untuk memperoleh kesejahteraan dalam kehidupan sehari-hari adalah pengertian dari ...."
                                 "Segala sesuatu yang dibutuhkan manusia untuk mempertahankan kelangsungan hidupnya secara alamiah melalui pencapaian kesejahteraan adalah pengertian dari ...."
                                 "Sesuatu yang harus dipenuhi dan jika tidak dipenuhi maka akan mengganggu kehidupan orang tersebut adalah definisi dari ...."])
               benar [["keinginan seseorang terhadap barang dan jasa yang harus dipenuhi dan jika tidak bisa dipenuhi maka akan mengganggu kehidupan orang tersebut"
                       "sesuatu yang mutlak harus dipenuhi dan jika tidak terpenuhi maka akan mengganggu kualitas hidup seseorang"
                       "segala sesuatu yang dibutuhkan manusia untuk mempertahankan hidup serta untuk memperoleh kesejahteraan dalam kehidupan sehari-hari"
                       "segala sesuatu yang dibutuhkan manusia untuk mempertahankan kelangsungan hidupnya secara alamiah melalui pencapaian kesejahteraan"
                       "sesuatu yang harus dipenuhi dan jika tidak dipenuhi maka akan mengganggu kehidupan orang tersebut"]
                      ["kebutuhan"]]
               salah [["keinginan seseorang terhadap barang dan jasa yang harus dipenuhi yang jika tidak bisa dipenuhi maka tidak akan mengganggu kehidupan orang tersebut"
                       "sesuatu yang ingin dipenuhi dan jika tidak terpenuhi maka tidak akan mengganggu kualitas hidup seseorang"
                       "segala sesuatu yang dibutuhkan manusia untuk mengikuti perkembangan tren atau mode dunia"
                       "segala sesuatu yang dibutuhkan manusia untuk sekadar memenuhi keinginan"
                       "sesuatu yang ingin dipenuhi dan jika tidak dipenuhi maka tidak akan mengganggu kehidupan orang tersebut"]
                      ["keinginan"
                       "kesejahteraan"
                       "pendapatan"
                       "pemasukan"]]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal soal-1
                          :pb (rand-nth (benar 0))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah 0))))
              :S2 (merge {:soal soal-2
                          :pb (rand-nth (benar 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah 1))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 30)
       shuffle))

(defn faktor-yang-mempengaruhi-kebutuhan-manusia-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan faktor yang mempengaruhi kebutuhan manusia adalah ...."
                                 "Di bawah ini yang merupakan faktor yang mempengaruhi kebutuhan manusia adalah ...."
                                 "Salah satu faktor yang mempengaruhi kebutuhan manusia adalah ...."
                                 "Faktor yang mempengaruhi kebutuhan manusia salah satunya adalah ...."
                                 "Hal yang menjadi faktor yang mempengaruhi kebutuhan manusia adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan faktor yang mempengaruhi kebutuhan manusia adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan faktor yang mempengaruhi kebutuhan manusia adalah ...."
                                 "Faktor-faktor yang mempengaruhi kebutuhan manusia adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Kebutuhan manusia dipengaruhi oleh faktor-faktor berikut ini, <b><i>kecuali</i></b> ...."
                                 "Hal yang menjadi faktor yang mempengaruhi kebutuhan manusia adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["kondisi alam"
                      "kepercayaan yang dianut"
                      "adat istiadat"
                      "pekerjaan atau profesi"
                      "tingkat peradaban"
                      "penghasilan"
                      "umur"
                      "tingkat kepuasan"
                      "hobi atau kegemaran"
                      "pendidikan"
                      "jenis kelamin"]
               salah ["tren terkini"
                      "kondisi orang lain"
                      "tingkat pencemaran"
                      "kemampuan komunikasi"
                      "transportasi"]]

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
       (take 80)
       shuffle))

(defn asean-free-trade-area []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan manfaat ASEAN Free Trade Area (AFTA) adalah ...."
                                 "Di bawah ini yang merupakan manfaat ASEAN Free Trade Area (AFTA) adalah ...."
                                 "Salah satu manfaat ASEAN Free Trade Area (AFTA) adalah ...."
                                 "Manfaat ASEAN Free Trade Area (AFTA) salah satunya adalah ...."
                                 "Contoh manfaat ASEAN Free Trade Area (AFTA) adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan manfaat ASEAN Free Trade Area (AFTA) adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan manfaat ASEAN Free Trade Area (AFTA) adalah ...."
                                 "Salah satu manfaat ASEAN Free Trade Area (AFTA) adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "ASEAN Free Trade Area (AFTA) memiliki beberapa manfaat seperti berikut ini, <b><i>kecuali</i></b> ...."
                                 "Manfaat ASEAN Free Trade Area (AFTA) adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["mendorong penurunan harga produk di seluruh wilayah ASEAN dengan penghapusan tarif"
                      "mendorong kompetisi, inovasi, dan perluasan pasar regional maupun internasional"
                      "membantu produk-produk negara ASEAN memasuki pasar regional"
                      "sejumlah pabrik di negara ASEAN dapat memperoleh bahan baku yang lebih murah"
                      "menjadikan ASEAN sebagai pasar tunggal yang kuat"
                      "menarik investor dari luar negeri"
                      "pelaku usaha dapat melakukan bisnis di ASEAN secara mudah dan cepat"
                      "tenaga kerja profesional dapat memperoleh pekerjaan lebih baik di negara-negara ASEAN"]
               salah ["mendorong peningkatan harga produk di seluruh wilayah ASEAN dengan adanya tarif"
                      "meningkatkan persaingan tenaga kerja antarnegara di ASEAN"
                      "meningkatkan persaingan produk antarnegara di ASEAN"
                      "sejumlah pabrik di negara ASEAN dapat memperoleh bahan baku yang lebih mahal"
                      "menjadikan ASEAN sebagai pasar yang besar karena masyarakatnya yang konsumtif"
                      "menarik tenaga kerja asing dari luar kawasan ASEAN"
                      "pelaku usaha sulit dalam melakukan bisnis di ASEAN"
                      "tenaga kerja profesional dapat memperoleh pekerjaan lebih baik di luar kawasan ASEAN"]]

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
       (take 80)
       shuffle))

(defn asia-pacific-economic-cooperation []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8 :S9 :S10])
               pengantar (rand-nth ["Coba perhatikan negara-negara di bawah ini!"
                                    "Perhatikan negara-negara di bawah ini!"
                                    "Perhatikan daftar negara di bawah ini!"])
               soal (rand-nth ["Negara-negara anggota APEC ditunjukkan oleh nomor ...."
                               "Dari beberapa opsi di atas yang termasuk negara-negara anggota APEC adalah ...."
                               "Yang termasuk negara-negara anggota APEC dari opsi-opsi atas adalah ...."])
               APEC ["Amerika Serikat"
                     "Australia"
                     "Brunei Darussalam"
                     "Chile"
                     "Filipina"
                     "Hong Kong"
                     "Indonesia"
                     "Jepang"
                     "Kanada"
                     "Korea Selatan"
                     "Malaysia"
                     "Meksiko"
                     "Taiwan"
                     "Thailand"
                     "Tiongkok"
                     "Papua Nugini"
                     "Peru"
                     "Rusia"
                     "Selandia Baru"
                     "Singapura"
                     "Vietnam"]
               APEC-1 (rand-nth APEC)
               APEC-2 (rand-nth (remove #{APEC-1} APEC))
               non-APEC ["Zimbabwe"
                         "India"
                         "Inggris"
                         "Prancis"
                         "Jerman"
                         "Spanyol"
                         "Maroko"
                         "Mesir"
                         "Timor Leste"
                         "Portugal"
                         "Rumania"
                         "Aljazair"
                         "Kenya"
                         "Ethiopia"
                         "Turki"
                         "Arab Saudi"
                         "Yaman"
                         "Uni Emirat Arab"
                         "Qatar"
                         "Bahrain"
                         "Kuwait"]
               non-APEC-1 (rand-nth non-APEC)
               non-APEC-2 (rand-nth (remove #{non-APEC-1} non-APEC))
               non-APEC-3 (rand-nth (remove #{non-APEC-1 non-APEC-2} non-APEC))
               jawaban ["1 dan 2"
                        "1 dan 3"
                        "1 dan 4"
                        "1 dan 5"
                        "2 dan 3"
                        "2 dan 4"
                        "2 dan 5"
                        "3 dan 4"
                        "3 dan 5"
                        "4 dan 5"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 APEC-1
                          :fakta2 APEC-2
                          :fakta3 non-APEC-1
                          :fakta4 non-APEC-2
                          :fakta5 non-APEC-3
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 APEC-1
                          :fakta2 non-APEC-1
                          :fakta3 APEC-2
                          :fakta4 non-APEC-2
                          :fakta5 non-APEC-3
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 APEC-1
                          :fakta2 non-APEC-1
                          :fakta3 non-APEC-2
                          :fakta4 APEC-2
                          :fakta5 non-APEC-3
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 APEC-1
                          :fakta2 non-APEC-1
                          :fakta3 non-APEC-2
                          :fakta4 non-APEC-3
                          :fakta5 APEC-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 non-APEC-1
                          :fakta2 APEC-1
                          :fakta3 APEC-2
                          :fakta4 non-APEC-2
                          :fakta5 non-APEC-3
                          :soal soal
                          :pb (jawaban 4)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 4)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 non-APEC-1
                          :fakta2 APEC-1
                          :fakta3 non-APEC-2
                          :fakta4 APEC-2
                          :fakta5 non-APEC-3
                          :soal soal
                          :pb (jawaban 5)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 5)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 non-APEC-1
                          :fakta2 APEC-1
                          :fakta3 non-APEC-2
                          :fakta4 non-APEC-3
                          :fakta5 APEC-2
                          :soal soal
                          :pb (jawaban 6)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 6)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 non-APEC-1
                          :fakta2 non-APEC-2
                          :fakta3 APEC-1
                          :fakta4 APEC-2
                          :fakta5 non-APEC-3
                          :soal soal
                          :pb (jawaban 7)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 7)))))
              :S9 (merge {:pengantar pengantar
                          :fakta1 non-APEC-1
                          :fakta2 non-APEC-2
                          :fakta3 APEC-1
                          :fakta4 non-APEC-3
                          :fakta5 APEC-2
                          :soal soal
                          :pb (jawaban 8)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 8)))))
              :S10 (merge {:pengantar pengantar
                          :fakta1 non-APEC-1
                          :fakta2 non-APEC-2
                          :fakta3 non-APEC-3
                          :fakta4 APEC-1
                          :fakta5 APEC-2
                          :soal soal
                          :pb (jawaban 9)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 9)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn european-union []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8 :S9 :S10])
               pengantar (rand-nth ["Coba perhatikan negara-negara di bawah ini!"
                                    "Perhatikan negara-negara di bawah ini!"
                                    "Perhatikan daftar negara di bawah ini!"])
               soal (rand-nth ["Negara-negara anggota Uni Eropa ditunjukkan oleh nomor ...."
                               "Dari beberapa opsi di atas yang termasuk negara-negara anggota Uni Eropa adalah ...."
                               "Yang termasuk negara-negara anggota Uni Eropa dari opsi-opsi atas adalah ...."])
               EU ["Austria"
                   "Belanda"
                   "Belgia"
                   "Bulgaria"
                   "Siprus"
                   "Republik Ceko"
                   "Denmark"
                   "Estonia"
                   "Finlandia"
                   "Hungaria"
                   "Irlandia"
                   "Italia"
                   "Jerman"
                   "Kroasia"
                   "Latvia"
                   "Lithuania"
                   "Luksemburg"
                   "Malta"
                   "Polandia"
                   "Portugal"
                   "Prancis"
                   "Rumania"
                   "Slovakia"
                   "Slovenia"
                   "Spanyol"
                   "Swedia"
                   "Yunani"]
               EU-1 (rand-nth EU)
               EU-2 (rand-nth (remove #{EU-1} EU))
               non-EU ["Amerika Serikat"
                       "Australia"
                       "Brunei Darussalam"
                       "Chile"
                       "Filipina"
                       "Hong Kong"
                       "Indonesia"
                       "Jepang"
                       "Kanada"
                       "Korea Selatan"
                       "Malaysia"
                       "Meksiko"
                       "Taiwan"
                       "Thailand"
                       "Tiongkok"
                       "Papua Nugini"
                       "Peru"
                       "Rusia"
                       "Selandia Baru"
                       "Singapura"
                       "Vietnam"
                       "Inggris"]
               non-EU-1 (rand-nth non-EU)
               non-EU-2 (rand-nth (remove #{non-EU-1} non-EU))
               non-EU-3 (rand-nth (remove #{non-EU-1 non-EU-2} non-EU))
               jawaban ["1 dan 2"
                        "1 dan 3"
                        "1 dan 4"
                        "1 dan 5"
                        "2 dan 3"
                        "2 dan 4"
                        "2 dan 5"
                        "3 dan 4"
                        "3 dan 5"
                        "4 dan 5"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 EU-1
                          :fakta2 EU-2
                          :fakta3 non-EU-1
                          :fakta4 non-EU-2
                          :fakta5 non-EU-3
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 EU-1
                          :fakta2 non-EU-1
                          :fakta3 EU-2
                          :fakta4 non-EU-2
                          :fakta5 non-EU-3
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 EU-1
                          :fakta2 non-EU-1
                          :fakta3 non-EU-2
                          :fakta4 EU-2
                          :fakta5 non-EU-3
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 EU-1
                          :fakta2 non-EU-1
                          :fakta3 non-EU-2
                          :fakta4 non-EU-3
                          :fakta5 EU-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
              :S5 (merge {:pengantar pengantar
                          :fakta1 non-EU-1
                          :fakta2 EU-1
                          :fakta3 EU-2
                          :fakta4 non-EU-2
                          :fakta5 non-EU-3
                          :soal soal
                          :pb (jawaban 4)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 4)))))
              :S6 (merge {:pengantar pengantar
                          :fakta1 non-EU-1
                          :fakta2 EU-1
                          :fakta3 non-EU-2
                          :fakta4 EU-2
                          :fakta5 non-EU-3
                          :soal soal
                          :pb (jawaban 5)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 5)))))
              :S7 (merge {:pengantar pengantar
                          :fakta1 non-EU-1
                          :fakta2 EU-1
                          :fakta3 non-EU-2
                          :fakta4 non-EU-3
                          :fakta5 EU-2
                          :soal soal
                          :pb (jawaban 6)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 6)))))
              :S8 (merge {:pengantar pengantar
                          :fakta1 non-EU-1
                          :fakta2 non-EU-2
                          :fakta3 EU-1
                          :fakta4 EU-2
                          :fakta5 non-EU-3
                          :soal soal
                          :pb (jawaban 7)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 7)))))
              :S9 (merge {:pengantar pengantar
                          :fakta1 non-EU-1
                          :fakta2 non-EU-2
                          :fakta3 EU-1
                          :fakta4 non-EU-3
                          :fakta5 EU-2
                          :soal soal
                          :pb (jawaban 8)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 8)))))
              :S10 (merge {:pengantar pengantar
                           :fakta1 non-EU-1
                           :fakta2 non-EU-2
                           :fakta3 non-EU-3
                           :fakta4 EU-1
                           :fakta5 EU-2
                           :soal soal
                           :pb (jawaban 9)}
                          (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 9)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))