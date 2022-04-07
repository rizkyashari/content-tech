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
               kuning [["Manakah di antara opsi-opsi di bawah ini yang merupakan kata-kata yang sesuai untuk melengkapi kalimat rumpang di atas?"
                        "Berdasarkan definisi globalisasi, manakah kata-kata yang tepat untuk melengkapi kalimat rumpang di atas?"]
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
               hijau [["Manakah kata-kata yang tepat untuk melengkapi kalimat terkait globalisasi di atas?"
                       "Manakah di antara opsi-opsi di bawah ini yang sesuai untuk melengkapi kalimat rumpang di atas?"]
                      ["Globalisasi menjadikan seluruh bangsa dan negara di dunia semakin ... serta mewujudkan suatu tatanan kehidupan baru dengan ... batas geografis, ekonomi, sosial, dan budaya."
                       "Globalisasi membuat seluruh bangsa di dunia semakin ... dan mewujudkan tatanan baru dengan ... batas geografis, ekonomi, sosial, dan budaya."
                       "Globalisasi membuat seluruh negara di dunia semakin ... serta ... batas geografis, ekonomi, sosial, dan budaya."]
                      ["terkait, meniadakan"
                       "terhubung, menghilangkan"
                       "terikat, menghilangkan"
                       "terhubung, meniadakan"]
                      ["terpisah, mengadakan"
                       "terkait, mengadakan"
                       "terpisah, menghilangkan"
                       "terhubung, mengadakan"]]
               ungu [["Manakah kata-kata di bawah ini yang cocok untuk melengkapi kalimat rumpang di atas?"
                      "Manakah di antara opsi-opsi di bawah ini yang tepat untuk melengkapi kalimat rumpang terkait globalisasi di atas?"
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
                      "terdisintegrasi, kemandirian"
                      "terdisintegrasi, individualisme"]]]

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
               pengantar ["Coba perhatikan opsi-opsi di bawah ini!"
                          "Perhatikan opsi-opsi di bawah ini!"
                          "Perhatikan pernyataan-pernyataan di bawah ini!"]
               soal ["Dari opsi-opsi di atas, yang termasuk ciri-ciri globalisasi adalah ...."
                     "Dari kedua pernyataan di atas, yang termasuk ciri-ciri globalisasi adalah ...."
                     "Yang termasuk ciri-ciri globalisasi dari kedua opsi di atas adalah ...."]
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
                        "Penggunaan Bahasa Inggris sebagai bahasa internasional "
                        "Gaya hidup masyarakat bergeser ke arah yang lebih modern "
                        "Masyarakat lebih memilih bekerja di sektor industri "
                        "Masyarakat meminati tren mode dan budaya internasional "
                        "Nilai-nilai lokal yang tergerus oleh pengaruh budaya asing "]
                       ["budaya"
                        "kultur"]
                       ["Globalisasi budaya adalah bentuk globalisasi yang berpengaruh terhadap kebudayaan manusia. Kebudayaan suatu wilayah lebih cepat masuk dan diterima di wilayah lain akibat dampak globalisasi. Contoh bentuk globalisasi dalam bidang budaya (kultur) antara lain kebudayaan asing lebih mudah masuk ke dalam negeri, gaya hidup masyarakat bergeser ke arah yang lebih modern, tren mode dan budaya internasional yang semakin diminati, dan sebagainya."]]
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
               pengantar ["Coba perhatikan opsi-opsi di bawah ini!"
                          "Perhatikan opsi-opsi di bawah ini!"
                          "Perhatikan pernyataan-pernyataan di bawah ini!"]
               soal ["Dari opsi-opsi di atas, yang termasuk cara untuk menghadapi globalisasi budaya adalah ...."
                     "Dari pernyataan-pernyataan di atas, yang termasuk upaya menghadapi globalisasi budaya adalah ...."
                     "Yang termasuk upaya menghadapi globalisasi budaya adalah ...."]
               upaya-budaya ["Menyaring setiap budaya asing yang masuk ke Indonesia."
                             "Mempromosikan budaya asli Indonesia ke kancah internasional."
                             "Menyukai dan menggunakan produk-produk asli Indonesia."
                             "Memperkuat persatuan antarwarga Indonesia yang memiliki budaya beragam."
                             "Mematenkan dan memublikasikan setiap budaya Indonesia."
                             "Memupuk rasa kebhinekaan."
                             "Berpegang teguh pada nilai spiritual."
                             "Meningkatkan kualitas nilai moralitas masyarakat."]
               upaya-budaya1 (rand-nth upaya-budaya)
               upaya-budaya2 (rand-nth (remove #{upaya-budaya1} upaya-budaya))
               non-upaya-budaya ["Berkompetisi dalam kemajuan iptek."
                                 "Meningkatkan motif untuk terus berprestasi."
                                 "Meningkatkan kualitas sumber daya manusia."
                                 "Selalu berorientasi ke masa depan."
                                 "Meningkatkan penguasaan terhadap teknologi modern di segala bidang."]
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
               pengantar ["Coba perhatikan opsi-opsi di bawah ini!"
                          "Perhatikan opsi-opsi di bawah ini!"
                          "Perhatikan pernyataan-pernyataan di bawah ini!"]
               soal ["Dari opsi-opsi di atas, yang termasuk cara untuk menghadapi globalisasi iptek adalah ...."
                     "Dari pernyataan-pernyataan di atas, yang termasuk upaya menghadapi globalisasi iptek adalah ...."
                     "Yang termasuk upaya menghadapi globalisasi iptek adalah ...."]
               upaya-iptek ["Berkompetisi dalam kemajuan iptek."
                            "Meningkatkan motif untuk terus berprestasi."
                            "Meningkatkan kualitas sumber daya manusia."
                            "Selalu berorientasi ke masa depan."
                            "Meningkatkan penguasaan terhadap teknologi modern di segala bidang."]
               upaya-iptek1 (rand-nth upaya-iptek)
               upaya-iptek2 (rand-nth (remove #{upaya-iptek1} upaya-iptek))
               non-upaya-iptek ["Menghilangkan praktik-praktik korupsi."
                                "Menghilangkan praktik-praktik kolusi."
                                "Menghilangkan praktik-praktik nepotisme dan manipulasi."
                                "Menyiapkan sumber daya manusia yang kompeten dalam menghadapi kompetisi ekonomi global."
                                "Mendorong pengusaha-pengusaha lokal untuk berkompetisi secara sehat."
                                "Mendorong munculnya produk-produk-produk kreatif dan inovatif dari masyarakat."]
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
               soal2 ["Di bawah ini yang merupakan salah satu upaya yang <b><u>kurang tepat</u></b> untuk menghadapi globalisasi ekonomi adalah ...."
                      "Salah satu cara yang <b><u>kurang tepat</u></b> untuk menghadapi globalisasi ekonomi adalah ...."
                      "Contoh upaya yang <b><u>kurang tepat</u></b> untuk menghadapi globalisasi ekonomi adalah ...."
                      "Berikut ini yang merupakan cara yang <b><u>kurang tepat</u></b> untuk menghadapi globalisasi ekonomi adalah ...."
                      "Upaya yang <b><u>kurang tepat</u></b> untuk menghadapi globalisasi ekonomi salah satunya adalah ...."]
               benar ["menghilangkan praktik-praktik korupsi"
                      "menghilangkan praktik-praktik kolusi"
                      "menghilangkan praktik-praktik nepotisme"
                      "menghilangkan praktik-praktik manipulasi"
                      "menyiapkan sumber daya manusia yang kompeten dalam menghadapi kompetisi ekonomi global"
                      "mendorong pengusaha-pengusaha lokal untuk berkompetisi secara sehat"
                      "mendorong pengusaha kecil dan menengah untuk berkompetisi secara sehat"
                      "mendorong munculnya produk-produk-produk kreatif dan inovatif dari masyarakat"
                      "melaksanakan standarisasi bagi perusahaan dan lembaga pemerintah"
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