(ns app.generator.ashari.ips.smp_09.sosiologi)

(defn faktor-pendorong-perubahan-sosial-budaya []
  (->> (fn []
         (let [soal ["Di bawah ini yang merupakan salah satu faktor pendorong perubahan sosial budaya adalah ...."
                     "Salah satu faktor pendorong perubahan sosial budaya adalah ...."
                     "Contoh faktor pendorong perubahan sosial budaya adalah ...."
                     "Berikut ini yang merupakan salah satu faktor pendorong perubahan sosial budaya adalah ...."
                     "Faktor pendorong perubahan sosial budaya salah satunya adalah ...."]
               correct-ans ["kontak dengan kebudayaan lain"
                            "sistem pendidikan yang maju"
                            "sikap menghargai hasil karya seseorang"
                            "keinginan untuk maju"
                            "toleransi terhadap hal-hal baru yang bersifat positif"
                            "stratifikasi yang terbuka"
                            "masyarakat yang heterogen"
                            "ketidakpuasan masyarakat terhadap bidang-bidang kehidupan tertentu"
                            "orientasi ke masa depan"
                            "nilai bahwa manusia harus senantiasa berikhtiar untuk memperbaiki hidupnya"]
               wrong-ans ["kehidupan masyarakat yang terasing"
                          "lambatnya perkembangan ilmu pengetahuan"
                          "sikap masyarakat yang sangat tradisional"
                          "prasangka buruk terhadap hal-hal baru atau asing"
                          "pengaruh adat istiadat yang turun temurun"
                          "sikap yang tertutup"
                          "hambatan-hambatan yang bersifat ideologis"
                          "rasa takut akan terjadinya kegoyahan pada integrasi kebudayaan"
                          "kurangnya hubungan dengan masyarakat lain"
                          "adanya kepentingan yang telah tertanam dengan kuat"]]
           (merge
            {:soal (rand-nth soal)
             :pb (rand-nth correct-ans)}
            (zipmap [:p1 :p2 :p3] (shuffle wrong-ans)))))
                         
       (repeatedly 50)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn faktor-penghambat-perubahan-sosial-budaya []
  (->> (fn []
         (let [soal ["Di bawah ini yang merupakan salah satu faktor penghambat perubahan sosial budaya adalah ...."
                     "Salah satu faktor penghambat perubahan sosial budaya adalah ...."
                     "Contoh faktor penghambat perubahan sosial budaya adalah ...."
                     "Berikut ini yang merupakan salah satu faktor penghambat perubahan sosial budaya adalah ...."
                     "Faktor penghambat perubahan sosial budaya salah satunya adalah ...."]
               correct-ans ["kehidupan masyarakat yang terasing"
                            "lambatnya perkembangan ilmu pengetahuan"
                            "sikap masyarakat yang sangat tradisional"
                            "prasangka buruk terhadap hal-hal baru atau asing"
                            "pengaruh adat istiadat yang turun temurun"
                            "sikap yang tertutup"
                            "hambatan-hambatan yang bersifat ideologis"
                            "rasa takut akan terjadinya kegoyahan pada integrasi kebudayaan"
                            "kurangnya hubungan dengan masyarakat lain"
                            "adanya kepentingan yang telah tertanam dengan kuat"]
               wrong-ans ["kontak dengan kebudayaan lain"
                          "sistem pendidikan yang maju"
                          "sikap menghargai hasil karya seseorang"
                          "keinginan untuk maju"
                          "toleransi terhadap hal-hal baru yang bersifat positif"
                          "stratifikasi yang terbuka"
                          "masyarakat yang heterogen"
                          "ketidakpuasan masyarakat terhadap bidang-bidang kehidupan tertentu"
                          "orientasi ke masa depan"
                          "nilai bahwa manusia harus senantiasa berikhtiar untuk memperbaiki hidupnya"]]
           (merge
            {:soal (rand-nth soal)
             :pb (rand-nth correct-ans)}
            (zipmap [:p1 :p2 :p3] (shuffle wrong-ans)))))

       (repeatedly 100)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn pengertian-globalisasi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3])
               kuning [["Manakah di antara opsi di bawah ini yang merupakan kata-kata yang sesuai untuk melengkapi kalimat rumpang di atas?"
                        "Berdasarkan definisi globalisasi, manakah kata yang tepat untuk melengkapi kalimat rumpang di atas?"]
                       ["Globalisasi adalah suatu proses sosial yang di dalamnya ... terhadap pengaturan sosial dan budaya menjadi ...."
                        "Globalisasi merupakan suatu proses sosial berupa kondisi ketika ... terhadap pengaturan sosial dan budaya menjadi ...."
                        "Suatu proses sosial yang di dalamnya ... terhadap pengaturan sosial dan budaya menjadi ... adalah definisi dari globalisasi."
                        "Proses sosial berupa kondisi saat ... terhadap pengaturan sosial dan budaya menjadi ... adalah pengertian dari globalisasi."
                        "Suatu proses sosial berupa situasi ketika ... terhadap pengaturan sosial dan budaya menjadi ... adalah pengertian dari globalisasi."]
                       ["kendala geografi, surut"
                        "hambatan geografi, surut"
                        "rintangan geografi, surut"
                        "halangan geografi, berkurang"
                        "kendala geografi, berkurang"]
                       ["kendala geografi, bertambah"
                        "kendala geografi, meluas"
                        "dorongan geografi, bertambah"
                        "dukungan geografi, berkurang"
                        "dukungan geografi, bertambah"]]
               hijau [["Manakah kata yang tepat untuk melengkapi kalimat terkait globalisasi di atas?"
                       "Manakah di antara opsi di bawah ini yang sesuai untuk melengkapi kalimat rumpang di atas?"]
                      ["Globalisasi menjadikan seluruh bangsa dan negara di dunia semakin ... serta mewujudkan suatu tatanan kehidupan baru dengan ... batas geografis, ekonomi, sosial, dan budaya."
                       "Globalisasi membuat seluruh bangsa di dunia semakin ... dan mewujudkan tatanan baru dengan ... batas geografis, ekonomi, sosial, serta budaya."
                       "Globalisasi membuat seluruh negara di dunia semakin ... serta ... batas geografis, ekonomi, sosial, dan budaya."]
                      ["terkait, meniadakan"
                       "terhubung, menghilangkan"
                       "terikat, menghilangkan"
                       "terhubung, meniadakan"]
                      ["terpisah, mengadakan"
                       "terkait, mengadakan"
                       "terpisah, menghilangkan"
                       "terhubung, mengadakan"]]
               ungu [["Manakah kata di bawah ini yang cocok untuk melengkapi kalimat rumpang di atas?"
                      "Manakah di antara opsi di bawah ini yang tepat untuk melengkapi kalimat rumpang terkait globalisasi di atas?"
                      "Manakah kata-kata di bawah ini yang sesuai untuk melengkapi kalimat rumpang di atas?"]
                     ["Globalisasi mengubah dunia menjadi ... yang terwujud dalam bentuk ... antarbangsa dan antarmanusia."
                      "Globalisasi menjadikan dunia menjadi ... yang berupa ... antarbangsa dan antarmanusia."
                      "Globalisasi membuat dunia menjadi ... yang berbentuk ... antarbangsa dan antarmanusia."]
                     ["satu kesatuan, keterkaitan"
                      "satu kesatuan, ketergantungan"
                      "terintegrasi, keterhubungan"
                      "terintegrasi, keterkaitan"]
                     ["kelompok terpisah, kemandirian"
                      "bagian-bagian terpisah, kemandirian"
                      "disintegrasi, kemandirian"
                      "disintegrasi, individualisme"]]]

           (merge
            (condp = type-soal
              :S1 (merge {:kalimat-rumpang (rand-nth (kuning 1))
                          :soal (rand-nth (kuning 0))
                          :pb (rand-nth (kuning 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (kuning 3))))
              :S2 (merge {:kalimat-rumpang (rand-nth (hijau 1))
                          :soal (rand-nth (hijau 0))
                          :pb (rand-nth (hijau 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (hijau 3))))
              :S3 (merge {:kalimat-rumpang (rand-nth (ungu 1))
                          :soal (rand-nth (ungu 0))
                          :pb (rand-nth (ungu 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (ungu 3))))))))

  (repeatedly 300)
  distinct
  shuffle
  (take 101)
  shuffle))

(defn ciri-ciri-globalisasi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar ["Coba perhatikan opsi di bawah ini!"
                          "Perhatikan opsi di bawah ini!"
                          "Perhatikan pernyataan di bawah ini!"]
               soal ["Dari opsi di atas yang termasuk ciri-ciri globalisasi adalah ...."
                     "Dari kedua pernyataan di atas yang termasuk ciri-ciri globalisasi adalah ...."
                     "Merujuk pada opsi di atas yang termasuk ciri-ciri globalisasi adalah ...."]
               globalisasi ["Adanya perubahan dalam memaknai ruang dan waktu."
                            "Terjadinya pertukaran informasi yang cepat melalui media sosial."
                            "Meningkatnya masalah bersama."
                            "Ketergantungan antarnegara dalam bidang ekonomi."
                            "Ketergantungan antarnegara dalam bidang perdagangan."
                            "Berkembangnya pertukaran kebudayaan internasional."
                            "Meningkatnya interaksi kultural."]
               globalisasi1 (rand-nth globalisasi)
               globalisasi2 (rand-nth (remove #{globalisasi1} globalisasi))
               non-globalisasi ["Adanya perubahan ruang dan waktu."
                                "Terhambatnya pertukaran informasi melalui media sosial."
                                "Masalah sosial semakin berkurang."
                                "Kemandirian setiap bangsa dalam bidang ekonomi."
                                "Kemandirian setiap negara dalam bidang perdagangan."
                                "Berkurangnya pertukaran kebudayaan internasional."
                                "Interaksi budaya semakin terhambat."]
               non-globalisasi1 (rand-nth non-globalisasi)
               non-globalisasi2 (rand-nth (remove #{non-globalisasi1} non-globalisasi))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]
         (merge
          (condp = type-soal
            :S1 (merge {:pengantar (rand-nth pengantar)
                        :fakta1 globalisasi1
                        :fakta2 non-globalisasi2
                        :soal (rand-nth soal)
                        :pb (jawaban 0)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
            :S2 (merge {:pengantar (rand-nth pengantar)
                        :fakta1 non-globalisasi1
                        :fakta2 globalisasi2
                        :soal (rand-nth soal)
                        :pb (jawaban 1)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
            :S3 (merge {:pengantar (rand-nth pengantar)
                        :fakta1 globalisasi1
                        :fakta2 globalisasi2
                        :soal (rand-nth soal)
                        :pb (jawaban 2)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
            :S4 (merge {:pengantar (rand-nth pengantar)
                        :fakta1 non-globalisasi1
                        :fakta2 non-globalisasi2
                        :soal (rand-nth soal)
                        :pb (jawaban 3)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))
  (repeatedly 1000)
  distinct
  shuffle
  (take 300)
  shuffle))

(defn bentuk-globalisasi-budaya-dan-ekonomi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal [" merupakan contoh bentuk globalisasi di bidang ...."
                     " adalah salah satu bentuk globalisasi di bidang ...."
                     " merupakan contoh bentuk globalisasi .... "
                     " adalah salah satu bentuk globalisasi ...."]
               kuning [["Kebudayaan asing lebih mudah masuk ke dalam negeri "
                        "Penggunaan bahasa Inggris sebagai bahasa internasional "
                        "Gaya hidup masyarakat bergeser ke arah yang lebih modern "
                        "Masyarakat lebih memilih bekerja di sektor industri "
                        "Masyarakat meminati tren mode dan budaya internasional "
                        "Nilai-nilai lokal yang tergerus oleh pengaruh budaya asing "]
                       ["budaya"
                        "kultur"]
                       ["Globalisasi budaya adalah bentuk globalisasi yang berpengaruh terhadap kebudayaan manusia. Kebudayaan suatu wilayah lebih cepat masuk dan diterima di wilayah lain akibat dampak globalisasi. Contoh bentuk globalisasi dalam bidang budaya (kultur) adalah kebudayaan asing lebih mudah masuk ke dalam negeri, gaya hidup masyarakat bergeser ke arah yang lebih modern, tren mode dan budaya internasional yang semakin diminati, dan sebagainya."]]
               hijau [["Masyarakat membeli barang dengan kartu kredit "
                       "Masyarakat melakukan jual beli barang secara daring melalui <i>e-commerce</i> "
                       "Masyarakat membayar barang yang dibeli dengan aplikasi dompet digital "
                       "Masyarakat melunasi tagihan listrik dan air secara daring "
                       "Kegiatan ekspor dan impor dari satu negara ke negara lain menjadi lebih mudah "
                       "Adanya kerja sama di bidang ekonomi oleh negara-negara dunia "
                       "Adanya kebijakan perdagangan bebas yang memudahkan transaksi internasional "
                       "Produk-produk luar negeri banyak yang masuk ke pasar dalam negeri "]
                      ["ekonomi"]
                      ["Globalisasi ekonomi adalah proses menyatunya kegiatan ekonomi baik produksi, konsumsi, maupun investasi antarnegara yang terjadi di dunia. Globalisasi ekonomi juga bisa berarti masuknya perekonomian suatu negara pada dunia global secara lebih terbuka tanpa adanya batasan teritorial atau kewilayahan antara negara satu sama lain. Contoh-contoh bentuk globalisasi dalam bidang ekonomi adalah kegiatan ekspor dan impor dari satu negara ke negara lain menjadi lebih mudah, masyarakat membayar barang yang dibeli dengan aplikasi dompet digital, produk-produk luar negeri banyak yang masuk ke pasar dalam negeri, dan sebagainya."]]
               benar1 (rand-nth (kuning 1))
               benar2 (rand-nth (hijau 1))
               wrong-answer (concat
                             ["politik"
                              "komunikasi"
                              "iptek"
                              "transportasi"]
                             (concat (vector benar1) (vector benar2)))
               salah (fn [x] (shuffle (filter #(not (= % x)) wrong-answer)))]

           (merge
            (condp = type-soal
              :S1 (merge {:contoh (rand-nth (kuning 0))
                          :soal (rand-nth soal)
                          :pb benar1
                          :pembahasan (rand-nth (kuning 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (cond
                                                                 (= benar1 (nth (kuning 1) 0)) (nth (kuning 1) 0)
                                                                 (= benar1 (nth (kuning 1) 1)) (nth (kuning 1) 1))))))
              :S2 (merge {:contoh (rand-nth (hijau 0))
                          :soal (rand-nth soal)
                          :pb benar2
                          :pembahasan (rand-nth (hijau 2))}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah benar2))))))))
       (repeatedly 300)
       distinct
       shuffle
       (take 80)
       shuffle))

(defn upaya-menghadapi-globalisasi-budaya []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar ["Coba perhatikan opsi di bawah ini!"
                          "Perhatikan opsi di bawah ini!"
                          "Perhatikan pernyataan di bawah ini!"]
               soal ["Dari opsi di atas yang termasuk cara untuk menghadapi globalisasi budaya adalah ...."
                     "Dari pernyataan di atas yang termasuk upaya menghadapi globalisasi budaya adalah ...."
                     "Merujuk pada opsi di atas yang termasuk upaya menghadapi globalisasi budaya adalah ...."]
               upaya-budaya ["menyaring setiap budaya asing yang masuk ke Indonesia"
                             "mempromosikan budaya asli Indonesia ke kancah internasional"
                             "menyukai dan menggunakan produk-produk asli Indonesia"
                             "memperkuat persatuan antarwarga Indonesia yang memiliki budaya beragam"
                             "mematenkan dan memublikasikan setiap budaya Indonesia"
                             "memupuk rasa kebinekaan"
                             "berpegang teguh pada nilai spiritual"
                             "meningkatkan kualitas nilai moralitas masyarakat"]
               upaya-budaya1 (rand-nth upaya-budaya)
               upaya-budaya2 (rand-nth (remove #{upaya-budaya1} upaya-budaya))
               non-upaya-budaya ["berkompetisi dalam kemajuan iptek"
                                 "meningkatkan motif untuk terus berprestasi"
                                 "meningkatkan kualitas sumber daya manusia"
                                 "selalu berorientasi ke masa depan"
                                 "meningkatkan penguasaan terhadap teknologi modern di segala bidang"]
               non-upaya-budaya1 (rand-nth non-upaya-budaya)
               non-upaya-budaya2 (rand-nth (remove #{non-upaya-budaya1} non-upaya-budaya))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar (rand-nth pengantar)
                          :fakta1 upaya-budaya1
                          :fakta2 non-upaya-budaya2
                          :soal (rand-nth soal)
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar (rand-nth pengantar)
                          :fakta1 non-upaya-budaya1
                          :fakta2 upaya-budaya2
                          :soal (rand-nth soal)
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar (rand-nth pengantar)
                          :fakta1 upaya-budaya1
                          :fakta2 upaya-budaya2
                          :soal (rand-nth soal)
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar (rand-nth pengantar)
                          :fakta1 non-upaya-budaya1
                          :fakta2 non-upaya-budaya2
                          :soal (rand-nth soal)
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn upaya-menghadapi-globalisasi-iptek []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar ["Coba perhatikan opsi di bawah ini!"
                          "Perhatikan opsi di bawah ini!"
                          "Perhatikan pernyataan di bawah ini!"]
               soal ["Dari opsi di atas yang termasuk cara untuk menghadapi globalisasi iptek adalah ...."
                     "Dari pernyataan di atas yang termasuk upaya menghadapi globalisasi iptek adalah ...."
                     "Merujuk pada opsi di atas yang termasuk upaya menghadapi globalisasi iptek adalah ...."]
               upaya-iptek ["berkompetisi dalam kemajuan iptek"
                            "meningkatkan motif untuk terus berprestasi"
                            "meningkatkan kualitas sumber daya manusia"
                            "selalu berorientasi ke masa depan"
                            "meningkatkan penguasaan terhadap teknologi modern di segala bidang"]
               upaya-iptek1 (rand-nth upaya-iptek)
               upaya-iptek2 (rand-nth (remove #{upaya-iptek1} upaya-iptek))
               non-upaya-iptek ["menghilangkan praktik-praktik korupsi"
                                "menghilangkan praktik-praktik kolusi"
                                "menghilangkan praktik-praktik nepotisme dan manipulasi"
                                "menyiapkan sumber daya manusia yang kompeten dalam menghadapi kompetisi ekonomi global"
                                "mendorong pengusaha-pengusaha lokal untuk berkompetisi secara sehat"
                                "mendorong munculnya produk-produk-produk kreatif dan inovatif dari masyarakat"]
               non-upaya-iptek1 (rand-nth non-upaya-iptek)
               non-upaya-iptek2 (rand-nth (remove #{non-upaya-iptek1} non-upaya-iptek))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar (rand-nth pengantar)
                          :fakta1 upaya-iptek1
                          :fakta2 non-upaya-iptek2
                          :soal (rand-nth soal)
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar (rand-nth pengantar)
                          :fakta1 non-upaya-iptek1
                          :fakta2 upaya-iptek2
                          :soal (rand-nth soal)
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar (rand-nth pengantar)
                          :fakta1 upaya-iptek1
                          :fakta2 upaya-iptek2
                          :soal (rand-nth soal)
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar (rand-nth pengantar)
                          :fakta1 non-upaya-iptek1
                          :fakta2 non-upaya-iptek2
                          :soal (rand-nth soal)
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn upaya-menghadapi-globalisasi-ekonomi []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal1 ["Di bawah ini yang merupakan salah satu upaya menghadapi globalisasi ekonomi adalah ...."
                      "Salah satu cara untuk menghadapi globalisasi ekonomi adalah ...."
                      "Contoh upaya menghadapi globalisasi ekonomi adalah ...."
                      "Berikut ini yang merupakan salah satu cara menghadapi globalisasi ekonomi adalah ...."
                      "Upaya menghadapi globalisasi ekonomi salah satunya adalah ...."]
               soal2 ["Di bawah ini yang merupakan salah satu upaya yang <u>kurang</u> tepat untuk menghadapi globalisasi ekonomi adalah ...."
                      "Salah satu cara yang <u>kurang</u> tepat untuk menghadapi globalisasi ekonomi adalah ...."
                      "Contoh upaya yang <u>kurang</u> tepat untuk menghadapi globalisasi ekonomi adalah ...."
                      "Berikut ini yang merupakan cara yang <u>kurang</u> tepat untuk menghadapi globalisasi ekonomi adalah ...."
                      "Upaya yang <u>kurang</u> tepat untuk menghadapi globalisasi ekonomi salah satunya adalah ...."]
               benar ["menghilangkan praktik-praktik korupsi"
                      "menghilangkan praktik-praktik kolusi"
                      "menghilangkan praktik-praktik nepotisme"
                      "menghilangkan praktik-praktik manipulasi"
                      "menyiapkan sumber daya manusia yang kompeten dalam menghadapi kompetisi ekonomi global"
                      "mendorong pengusaha-pengusaha lokal untuk berkompetisi secara sehat"
                      "mendorong pengusaha kecil dan menengah untuk berkompetisi secara sehat"
                      "mendorong munculnya produk-produk kreatif dan inovatif dari masyarakat"
                      "melaksanakan standardisasi bagi perusahaan dan lembaga pemerintah"
                      "mengadakan sertifikasi bagi perusahaan dan lembaga pemerintah"]
               salah ["mengabaikan praktik-praktik korupsi"
                      "tidak peduli dengan praktik-praktik kolusi"
                      "mengabaikan praktik-praktik nepotisme"
                      "tidak peduli dengan praktik-praktik manipulasi"
                      "menelantarkan sumber daya manusia yang kompeten untuk bekerja di luar negeri"
                      "mendorong pengusaha-pengusaha lokal untuk bersaing secara tidak sehat"
                      "selalu berorientasi ke masa depan"
                      "meningkatkan motif untuk terus berprestasi"
                      "mendorong pengusaha kecil dan menengah untuk berkompetisi secara tidak sehat"
                      "menyukai dan menggunakan produk-produk asli Indonesia"]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal (rand-nth soal1)
                          :pb (rand-nth benar)}
                         (zipmap [:p1 :p2 :p3] (shuffle salah)))
              :S2 (merge {:soal (rand-nth soal2)
                          :pb (rand-nth salah)}
                         (zipmap [:p1 :p2 :p3] (shuffle benar)))))))

       (repeatedly 300)
       distinct
       shuffle
       (take 100)
       shuffle))

(defn hakikat-perubahan-sosial-budaya-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan kalimat-kalimat di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk pernyataan yang tepat terkait perubahan sosial budaya adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan pernyataan yang tepat terkait perubahan sosial budaya adalah ...."
                               "Yang merupakan pernyataan yang tepat terkait perubahan sosial budaya dari beberapa kalimat di atas adalah ...."])
               hakikat ["Perubahan sosial merupakan bagian dari perubahan kebudayaan."
                        "Perubahan kebudayaan mencakup hal-hal, seperti kesenian, ilmu pengetahuan, teknologi, dan filsafat."
                        "Perubahan sosial mencakup perubahan pada sistem sosial, struktur, dan fungsi masyarakat."
                        "Perubahan sosial budaya meliputi berbagai hal seperti cara berpikir, berperilaku, dan alat."
                        "Hal-hal yang termasuk perubahan budaya contohnya adalah perubahan pada alat transportasi dan alat komunikasi."
                        "Hal-hal yang termasuk perubahan sosial contohnya adalah perubahan nilai dan norma dalam masyarakat."
                        "Perubahan sosial dan perubahan budaya saling berkaitan."
                        "Perubahan budaya dapat menyebabkan perubahan sosial dalam masyarakat."
                        "Terdapat perubahan sosial yang dapat menyebabkan terjadinya perubahan budaya."
                        "Tidak semua perubahan budaya dapat menyebabkan perubahan sosial atau sebaliknya."
                        "Perubahan sosial budaya sejalan dengan sifat dasar manusia yang selalu ingin berubah."
                        "Perubahan sosial budaya merupakan gejala umum yang terjadi dalam setiap masyarakat."
                        "Perubahan sosial budaya merupakan penggunaan istilah yang dapat digunakan untuk mencakup kedua jenis perubahan yang terjadi."]
               hakikat-1 (rand-nth hakikat)
               hakikat-2 (rand-nth (remove #{hakikat-1} hakikat))
               non-hakikat ["Perubahan sosial tidak berkaitan dengan perubahan kebudayaan."
                            "Perubahan sosial mencakup hal-hal,  seperti kesenian, ilmu pengetahuan, teknologi, dan filsafat."
                            "Perubahan kebudayaan mencakup perubahan pada sistem sosial, struktur, dan fungsi masyarakat."
                            "Hal-hal yang termasuk perubahan sosial contohnya adalah perubahan pada alat transportasi dan alat komunikasi."
                            "Hal-hal yang termasuk perubahan budaya contohnya adalah perubahan nilai dan norma dalam masyarakat."
                            "Perubahan budaya tidak dapat menyebabkan perubahan sosial dalam masyarakat."
                            "Semua perubahan budaya dapat menyebabkan perubahan sosial atau sebaliknya."]
               non-hakikat-1 (rand-nth non-hakikat)
               non-hakikat-2 (rand-nth (remove #{non-hakikat-1} non-hakikat))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 hakikat-1
                          :fakta2 non-hakikat-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-hakikat-1
                          :fakta2 hakikat-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 hakikat-1
                          :fakta2 hakikat-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-hakikat-1
                          :fakta2 non-hakikat-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn karakteristik-perubahan-sosial-budaya-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi di bawah ini!"
                                    "Perhatikan opsi di bawah ini!"
                                    "Perhatikan pilihan di bawah ini!"])
               soal (rand-nth ["Dari opsi di atas yang termasuk karakteristik perubahan sosial budaya adalah ...."
                               "Dari beberapa pilihan di atas yang merupakan karakteristik perubahan sosial budaya adalah ...."
                               "Manakah dari beberapa pilihan di atas yang merupakan karakteristik perubahan sosial budaya?"])
               karakter ["Tidak ada masyarakat yang perkembangannya berhenti."
                         "Setiap masyarakat mengalami perubahan baik secara lambat maupun secara cepat."
                         "Perubahan pada lembaga-lembaga sosial muncul setelah terjadinya perubahan pada lembaga kemasyarakatan tertentu."
                         "Perubahan yang terjadi pada lembaga kemasyarakatan tertentu akan diikuti perubahan pada lembaga-lembaga sosial yang lain."
                         "Perubahan-perubahan yang cepat biasanya mengakibatkan kekacauan sementara."
                         "Kekacauan sementara akan diikuti oleh reorganisasi yang mencakup pemantapan kaidah-kaidah dan nilai-nilai yang baru."
                         "Perubahan-perubahan tidak dapat dibatasi pada bidang kebendaan atau bidang spiritual saja."
                         "Bidang kebendaan dan bidang spiritual saling berkaitan."]
               karakter-1 (rand-nth karakter)
               karakter-2 (rand-nth (remove #{karakter-1} karakter))
               non-karakter ["Terdapat masyarakat yang perkembangannya berhenti."
                             "Terdapat masyarakat yang tidak mengalami perubahan sama sekali."
                             "Perubahan yang terjadi pada lembaga kemasyarakatan tertentu tidak berpengaruh pada lembaga sosial lainnya."
                             "Perubahan pada lembaga-lembaga sosial muncul sebelum terjadinya perubahan pada lembaga kemasyarakatan tertentu."
                             "Perubahan-perubahan yang cepat biasanya mengakibatkan keteraturan sementara."
                             "Keteraturan sementara akan diikuti oleh kekacauan yang mencakup perubahan kaidah-kaidah dan nilai-nilai yang lama."
                             "Perubahan-perubahan dapat dibatasi pada bidang kebendaan atau bidang spiritual saja."
                             "Bidang kebendaan dan bidang spiritual tidak saling berkaitan."]
               non-karakter-1 (rand-nth non-karakter)
               non-karakter-2 (rand-nth (remove #{non-karakter-1} non-karakter))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 karakter-1
                          :fakta2 non-karakter-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-karakter-1
                          :fakta2 karakter-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 karakter-1
                          :fakta2 karakter-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-karakter-1
                          :fakta2 non-karakter-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn bentuk-perubahan-sosial-budaya-dari-waktu []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pilihan-pilihan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk bentuk perubahan sosial budaya dilihat dari waktunya adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan bentuk perubahan sosial budaya dilihat dari waktunya adalah ...."
                               "Yang termasuk bentuk perubahan sosial budaya dilihat dari waktunya dari opsi-opsi di atas adalah ...."])
               waktu ["Evolusi"
                      "Perubahan lambat"
                      "Revolusi"
                      "Perubahan cepat"]
               waktu-1 (rand-nth waktu)
               waktu-2 (rand-nth (remove #{waktu-1} waktu))
               non-waktu ["Pengaruh kecil"
                          "Pengaruh besar"
                          "<i>Low impact</i>"
                          "<i>High impact</i>"]
               non-waktu-1 (rand-nth non-waktu)
               non-waktu-2 (rand-nth (remove #{non-waktu-1} non-waktu))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 waktu-1
                          :fakta2 non-waktu-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-waktu-1
                          :fakta2 waktu-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 waktu-1
                          :fakta2 waktu-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-waktu-1
                          :fakta2 non-waktu-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn bentuk-perubahan-sosial-budaya-dari-pengaruh []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pilihan-pilihan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk bentuk perubahan sosial budaya dilihat dari pengaruhnya adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan bentuk perubahan sosial budaya dilihat dari pengaruhnya adalah ...."
                               "Yang termasuk bentuk perubahan sosial budaya dilihat dari pengaruhnya dari opsi-opsi di atas adalah ...."])
               pengaruh ["Pengaruh kecil"
                         "Pengaruh besar"
                         "<i>Low impact</i>"
                         "<i>High impact</i>"]
               pengaruh-1 (rand-nth pengaruh)
               pengaruh-2 (rand-nth (remove #{pengaruh-1} pengaruh))
               non-pengaruh ["Direncanakan"
                             "<i>Planned change</i>"
                             "Tidak direncanakan"
                             "<i>Unplanned change</i>"
                             "Dikehendaki"
                             "<i>Intended change</i>"
                             "Tidak dikehendaki"
                             "<i>Unintended change</i>"]
               non-pengaruh-1 (rand-nth non-pengaruh)
               non-pengaruh-2 (rand-nth (remove #{non-pengaruh-1} non-pengaruh))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 pengaruh-1
                          :fakta2 non-pengaruh-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-pengaruh-1
                          :fakta2 pengaruh-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 pengaruh-1
                          :fakta2 pengaruh-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-pengaruh-1
                          :fakta2 non-pengaruh-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn bentuk-perubahan-sosial-budaya-dari-perencanaan []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pilihan-pilihan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk bentuk perubahan sosial budaya dilihat dari perencanaannya adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan bentuk perubahan sosial budaya dilihat dari perencanaannya adalah ...."
                               "Yang termasuk bentuk perubahan sosial budaya dilihat dari perencanaannya dari opsi-opsi di atas adalah ...."])
               rencana ["Direncanakan"
                        "<i>Planned change</i>"
                        "Tidak direncanakan"
                        "<i>Unplanned change</i>"
                        "Dikehendaki"
                        "<i>Intended change</i>"
                        "Tidak dikehendaki"
                        "<i>Unintended change</i>"]
               rencana-1 (rand-nth rencana)
               rencana-2 (rand-nth (remove #{rencana-1} rencana))
               non-rencana ["Pengaruh kecil"
                            "Pengaruh besar"
                            "<i>Low impact</i>"
                            "<i>High impact</i>"
                            "Evolusi"
                            "Perubahan lambat"
                            "Revolusi"
                            "Perubahan cepat"]
               non-rencana-1 (rand-nth non-rencana)
               non-rencana-2 (rand-nth (remove #{non-rencana-1} non-rencana))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 rencana-1
                          :fakta2 non-rencana-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-rencana-1
                          :fakta2 rencana-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 rencana-1
                          :fakta2 rencana-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-rencana-1
                          :fakta2 non-rencana-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn faktor-penyebab-perubahan-sosial-budaya-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pilihan-pilihan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk faktor penyebab perubahan sosial budaya adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan faktor penyebab perubahan sosial budaya adalah ...."
                               "Yang merupakan faktor penyebab perubahan sosial budaya dari opsi-opsi di atas adalah ...."])
               penyebab ["Bertambahnya dan berkurangnya penduduk."
                         "Adanya penemuan baru."
                         "Adanya konflik."
                         "Terjadinya pemberontakan/revolusi."
                         "Adanya peperangan."
                         "Perubahan lingkungan alam."
                         "Pengaruh kebudayaan masyarakat lain."]
               penyebab-1 (rand-nth penyebab)
               penyebab-2 (rand-nth (remove #{penyebab-1} penyebab))
               non-penyebab ["Kehidupan masyarakat yang terasing."
                             "Perkembangan ilmu pengetahuan yang terlambat."
                             "Sikap masyarakat yang tradisional."
                             "Adanya prasangka terhadap hal-hal baru atau asing."
                             "Pengaruh adat istiadat yang turun temurun."]
               non-penyebab-1 (rand-nth non-penyebab)
               non-penyebab-2 (rand-nth (remove #{non-penyebab-1} non-penyebab))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 penyebab-1
                          :fakta2 non-penyebab-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-penyebab-1
                          :fakta2 penyebab-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 penyebab-1
                          :fakta2 penyebab-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-penyebab-1
                          :fakta2 non-penyebab-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn faktor-pendorong-perubahan-sosial-budaya-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pilihan-pilihan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk faktor pendorong perubahan sosial budaya adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan faktor pendorong perubahan sosial budaya adalah ...."
                               "Yang merupakan faktor pendorong perubahan sosial budaya dari opsi-opsi di atas adalah ...."])
               pendorong ["Kontak dengan kebudayaan lain."
                          "Sistem pendidikan yang maju."
                          "Sikap menghargai hasil karya seseorang."
                          "Keinginan untuk maju."
                          "Toleransi terhadap hal-hal baru yang bersifat positif."
                          "Stratifikasi yang terbuka."
                          "Masyarakat yang heterogen."
                          "Ketidakpuasan masyarakat terhadap bidang-bidang kehidupan tertentu."
                          "Orientasi ke masa depan."
                          "Nilai bahwa manusia harus senantiasa berikhtiar untuk memperbaiki hidupnya."]
               pendorong-1 (rand-nth pendorong)
               pendorong-2 (rand-nth (remove #{pendorong-1} pendorong))
               non-pendorong ["Kehidupan masyarakat yang terasing."
                              "Lambatnya perkembangan ilmu pengetahuan."
                              "Sikap masyarakat yang sangat tradisional."
                              "Prasangka buruk terhadap hal-hal baru atau asing."
                              "Pengaruh adat istiadat yang turun temurun."
                              "Sikap yang tertutup."
                              "Hambatan-hambatan yang bersifat ideologis."
                              "Rasa takut akan terjadinya kegoyahan pada integrasi kebudayaan."
                              "Kurangnya hubungan dengan masyarakat lain."
                              "Adanya kepentingan yang telah tertanam dengan kuat."]
               non-pendorong-1 (rand-nth non-pendorong)
               non-pendorong-2 (rand-nth (remove #{non-pendorong-1} non-pendorong))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 pendorong-1
                          :fakta2 non-pendorong-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-pendorong-1
                          :fakta2 pendorong-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 pendorong-1
                          :fakta2 pendorong-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-pendorong-1
                          :fakta2 non-pendorong-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn faktor-penghambat-perubahan-sosial-budaya-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan opsi-opsi di bawah ini!"
                                    "Perhatikan pilihan-pilihan di bawah ini!"])
               soal (rand-nth ["Dari opsi-opsi di atas, yang termasuk faktor pendorong perubahan sosial budaya adalah ...."
                               "Dari beberapa pilihan di atas, yang merupakan faktor pendorong perubahan sosial budaya adalah ...."
                               "Yang merupakan faktor pendorong perubahan sosial budaya dari opsi-opsi di atas adalah ...."])
               penghambat ["Kehidupan masyarakat yang terasing."
                           "Lambatnya perkembangan ilmu pengetahuan."
                           "Sikap masyarakat yang sangat tradisional."
                           "Prasangka buruk terhadap hal-hal baru atau asing."
                           "Pengaruh adat istiadat yang turun temurun."
                           "Sikap yang tertutup."
                           "Hambatan-hambatan yang bersifat ideologis."
                           "Rasa takut akan terjadinya kegoyahan pada integrasi kebudayaan."
                           "Kurangnya hubungan dengan masyarakat lain."
                           "Adanya kepentingan yang telah tertanam dengan kuat."]
               penghambat-1 (rand-nth penghambat)
               penghambat-2 (rand-nth (remove #{penghambat-1} penghambat))
               non-penghambat ["Kontak dengan kebudayaan lain."
                               "Sistem pendidikan yang maju."
                               "Sikap menghargai hasil karya seseorang."
                               "Keinginan untuk maju."
                               "Toleransi terhadap hal-hal baru yang bersifat positif."
                               "Stratifikasi yang terbuka."
                               "Masyarakat yang heterogen."
                               "Ketidakpuasan masyarakat terhadap bidang-bidang kehidupan tertentu."
                               "Orientasi ke masa depan."
                               "Nilai bahwa manusia harus senantiasa berikhtiar untuk memperbaiki hidupnya."]
               non-penghambat-1 (rand-nth non-penghambat)
               non-penghambat-2 (rand-nth (remove #{non-penghambat-1} non-penghambat))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 penghambat-1
                          :fakta2 non-penghambat-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-penghambat-1
                          :fakta2 penghambat-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 penghambat-1
                          :fakta2 penghambat-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-penghambat-1
                          :fakta2 non-penghambat-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn ciri-ciri-globalisasi-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Di bawah ini yang merupakan salah satu ciri-ciri globalisasi adalah ...."
                                 "Salah satu ciri-ciri globalisasi adalah ...."
                                 "Contoh ciri-ciri globalisasi adalah ...."
                                 "Berikut ini yang merupakan ciri-ciri globalisasi adalah ...."
                                 "Ciri-ciri globalisasi salah satunya adalah ...."])
               soal-2 (rand-nth ["Di bawah ini yang <b><u>bukan</u></b> merupakan ciri-ciri globalisasi adalah ...."
                                 "Salah satu opsi di bawah ini yang <b><u>bukan</u></b> merupakan ciri-ciri globalisasi adalah ...."
                                 "Di bawah ini merupakan ciri-ciri globalisasi, <b><i>kecuali</i></b> ...."
                                 "Berikut ini merupakan ciri-ciri globalisasi, <b><i>kecuali</i></b> ...."
                                 "Yang <b><u>bukan</u></b> merupakan ciri-ciri globalisasi adalah ...."])
               benar ["adanya perubahan dalam memaknai ruang dan waktu"
                      "terjadinya pertukaran informasi yang cepat melalui media sosial"
                      "meningkatnya masalah bersama"
                      "ketergantungan antarnegara dalam bidang ekonomi"
                      "ketergantungan antarnegara dalam bidang perdagangan"
                      "berkembangnya pertukaran kebudayaan internasional"
                      "meningkatnya interaksi kultural"]
               salah ["adanya perubahan ruang dan waktu"
                      "terhambatnya pertukaran informasi melalui media sosial"
                      "masalah sosial semakin berkurang"
                      "kemandirian setiap bangsa dalam bidang ekonomi"
                      "kemandirian setiap negara dalam bidang perdagangan"
                      "berkurangnya pertukaran kebudayaan internasional"
                      "interaksi budaya semakin terhambat"]]
                      
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
  (take 70)
  shuffle))

(defn bentuk-globalisasi-budaya []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan opsi di bawah ini!"
                                    "Perhatikan opsi di bawah ini!"
                                    "Perhatikan pilihan di bawah ini!"])
               soal (rand-nth ["Dari opsi di atas yang termasuk bentuk globalisasi di bidang budaya adalah ...."
                               "Dari beberapa pilihan di atas yang merupakan bentuk globalisasi di bidang budaya adalah ...."
                               "Merujuk pada opsi di atas yang termasuk bentuk globalisasi di bidang budaya adalah ...."])
               budaya ["Kebudayaan asing lebih mudah masuk ke dalam negeri."
                       "Penggunaan bahasa Inggris sebagai bahasa internasional."
                       "Gaya hidup masyarakat bergeser ke arah yang lebih modern."
                       "Masyarakat lebih memilih bekerja di sektor industri."
                       "Masyarakat meminati tren mode dan budaya internasional."
                       "Nilai-nilai lokal yang tergerus oleh pengaruh budaya asing."]
               budaya-1 (rand-nth budaya)
               budaya-2 (rand-nth (remove #{budaya-1} budaya))
               non-budaya ["Masyarakat membeli barang dengan kartu kredit."
                           "Masyarakat melakukan jual beli barang secara daring melalui <i>e-commerce</i>."
                           "Masyarakat membayar barang yang dibeli dengan aplikasi dompet digital. "
                           "Masyarakat melunasi tagihan listrik dan air secara daring."
                           "Kegiatan ekspor dan impor dari satu negara ke negara lain menjadi lebih mudah."
                           "Adanya kerja sama di bidang ekonomi oleh negara-negara dunia."
                           "Adanya kebijakan perdagangan bebas yang memudahkan transaksi internasional."
                           "Produk-produk luar negeri banyak yang masuk ke pasar dalam negeri."]
               non-budaya-1 (rand-nth non-budaya)
               non-budaya-2 (rand-nth (remove #{non-budaya-1} non-budaya))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               salah (fn [y] (shuffle (filter #(not (= % y)) jawaban)))]
               
         (merge
          (condp = type-soal
            :S1 (merge {:pengantar pengantar
                        :fakta1 budaya-1
                        :fakta2 non-budaya-2
                        :soal soal
                        :pb (jawaban 0)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 0)))))
            :S2 (merge {:pengantar pengantar
                        :fakta1 non-budaya-1
                        :fakta2 budaya-2
                        :soal soal
                        :pb (jawaban 1)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 1)))))
            :S3 (merge {:pengantar pengantar
                        :fakta1 budaya-1
                        :fakta2 budaya-2
                        :soal soal
                        :pb (jawaban 2)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 2)))))
            :S4 (merge {:pengantar pengantar
                        :fakta1 non-budaya-1
                        :fakta2 non-budaya-2
                        :soal soal
                        :pb (jawaban 3)}
                       (zipmap [:p1 :p2 :p3] (shuffle (salah (jawaban 3)))))))))
                       
  (repeatedly 1000)
  distinct
  shuffle
  (take 300)
  shuffle))
