(ns app.generator.ashari.assessment.geo_A)

(defn pentingnya-berpikir-spasial []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               fenomena ["fenomena COVID-19"
                         "fenomena pada lapisan atmosfer"
                         "fenomena pada lapisan litosfer"
                         "fenomena pada lapisan hidrosfer"]
               pertanyaan (rand-nth 
                           ["Bagaimana ilmu geografi mengkaji "
                            "Manakah dari opsi-opsi di bawah yang merupakan contoh penerapan ilmu geografi dalam mengkaji "])
               pertanyaan-1 (str pertanyaan (fenomena 0) "?")
               pertanyaan-2 (str pertanyaan (fenomena 1) "?")
               pertanyaan-3 (str pertanyaan (fenomena 2) "?")
               pertanyaan-4 (str pertanyaan (fenomena 3) "?")
               covid [["Memetakan zona persebaran kasus COVID-19"
                       "Menganalisis lokasi yang paling sesuai untuk isolasi bagi pasien COVID-19"
                       "Menjadi bahan pertimbangan kebijakan <i>lockdown</i> berdasarkan zonasi sebaran kasus COVID-19"
                       "Menunjukkan rute terdekat ke rumah sakit khusus pasien COVID-19"
                       "Memberikan arahan berdasarkan peta zonasi terkait distribusi logistik untuk penanganan COVID-19"]
                      ["Menjelaskan dampak perubahan sosial akibat pandemi COVID-19"
                       "Mengkaji pertumbuhan ekonomi selama pandemi COVID-19"
                       "Menjelaskan pengaruh COVID-19 terhadap sistem kekebalan tubuh"
                       "Menganalisis pengaruh pandemi COVID-19 terhadap kesehatan mental masyarakat"
                       "Mengidentifikasi adanya penurunan semangat belajar siswa selama pandemi COVID-19"]]
               atmos [["Memprakirakan kondisi cuaca sebagai bahan pertimbangan dalam pelaksanaan suatu kegiatan"
                       "Mengidentifikasi arah pergerakan angin untuk membantu pelayaran"
                       "Mengetahui prakiraan cuaca untuk membantu kegiatan pertanian"
                       "Mengetahui prakiraan cuaca untuk membantu kegiatan transportasi"]
                      ["Menghentikan hujan agar tidak mengganggu jalannya acara"
                       "Mengubah arah angin agar sesuai dengan jalur pelayaran yang diinginkan"
                       "Mengubah kondisi cuaca agar kegiatan transportasi berjalan lancar"
                       "Menganalisis lahan untuk bahan pengembangan pertanian dan agroindustri"]]
               litos [["Mengidentifikasi daerah-daerah yang menjadi pusat gempa"
                       "Mengidentifikasi sumber daya tambang yang berpotensi di suatu daerah"
                       "Mengkaji perubahan tata guna lahan"]
                      ["Mengkaji pertumbuhan penduduk untuk bahan pertimbangan dalam perencanaan pembangunan"
                       "Memprakirakan kondisi cuaca sebagai bahan dalam pengembangan lahan"
                       "Mengkaji kemungkinan adanya gelombang tinggi untuk membantu kelancaran transportasi laut"
                       "Mengidentifikasi pasang surut air laut untuk membantu kegiatan nelayan"]]
               hidros [["Mengidentifikasi pasang surut air laut untuk membantu kegiatan nelayan"
                        "Menganalisis arus laut untuk membantu kegiatan pelayaran"
                        "Memantau pergerakan air tanah untuk memastikan ketersediaan air bagi penduduk"]
                       ["Mengidentifikasi daerah-daerah yang menjadi pusat gempa"
                        "Mengidentifikasi sumber daya tambang yang berpotensi di suatu daerah"
                        "Mengkaji perubahan tata guna lahan"
                        "Mengetahui prakiraan cuaca untuk membantu kegiatan transportasi laut"]]]
         
         (merge
          (condp = type-soal
            :S1 (merge {:pertanyaan pertanyaan-1
                        :pb (rand-nth (covid 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (covid 1))))
            :S2 (merge {:pertanyaan pertanyaan-2
                        :pb (rand-nth (atmos 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (atmos 1))))
            :S3 (merge {:pertanyaan pertanyaan-3
                        :pb (rand-nth (litos 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (litos 1))))
            :S4 (merge {:pertanyaan pertanyaan-4
                        :pb (rand-nth (hidros 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (hidros 1))))))))
  
  (repeatedly 100)
  distinct
  shuffle
  (take 30)
  shuffle))

(defn mengapa-perlu-belajar-geografi []
  (->> (fn []
         (let [pertanyaan ["Sebagai <i>science of where</i>, apa manfaat belajar ilmu geografi?"
                           "Manakah dari opsi-opsi di bawah ini yang merupakan manfaat belajar ilmu geografi?"
                           "Mengapa setiap orang dari berbagai profesi perlu belajar geografi?"]
               correct ["Ilmu geografi membantu kita dalam mengatasi urgensi keterbatasan lahan"
                        "Ilmu geografi membantu kita dalam mengetahui interaksi antara lingkungan dan manusia"
                        "Ilmu geografi membantu manusia dalam memanfaatkan potensi suatu wilayah berdasarkan keunikannya masing-masing"
                        "Ilmu geografi membantu nelayan dalam menentukan arah angin sebelum memutuskan untuk melaut"
                        "Ilmu geografi membantu petani mengetahui kondisi tanah yang cocok untuk pertanian"
                        "Ilmu geografi membantu perencana dalam perencanaan wilayah dan kota"
                        "Ilmu geografi membantu mengarahkan pembangunan daerah berdasarkan kondisi fisik wilayah"
                        "Ilmu geografi membantu memahami kondisi iklim wilayah dan global"
                        "Ilmu geografi membantu mitigasi bencana melalui pemetaan zona rawan bencana"
                        "Ilmu geografi dapat mengidentifikasi sumber daya alam dan energi suatu wilayah"]
               wrong ["Ilmu geografi membantu kita memberikan pemahaman atas potensi kebijakan ekonomi"
                      "Ilmu geografi membantu kita dalam mengidentifikasi perubahan sosial budaya"
                      "Ilmu geografi membantu kita dalam memahami adanya potensi suatu wabah penyakit di suatu wilayah"
                      "Ilmu geografi membantu kita dalam meningkatkan kesadaran sosial"
                      "Ilmu geografi membantu kita agar lebih kritis dan rasional dalam menanggapi gejala sosial"
                      "Ilmu geografi membantu manusia dalam mengeksploitasi sumber daya alam secara besar-besaran"
                      "Ilmu geografi membuat kita menurunkan kesadaran lingkungan"]]
         (merge
          {:pertanyaan (rand-nth pertanyaan)
           :pb (rand-nth correct)}
          (zipmap [:p1 :p2 :p3] (shuffle wrong)))))
  
  (repeatedly 100)
  distinct
  shuffle
  (take 30)
  shuffle))

(defn ruang-lingkup-geografi-1 []
  (->> (fn []
         (let [tipe-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6])
               pengantar ["Ilmu geografi mempelajari segala hal yang terjadi di bumi. Untuk memudahkan pembagian hal-hal yang dipelajari, maka dibuat ruang lingkup ilmu geografi."
                          "Sebagian besar studi geografi dimulai dengan penyebutan ruang lingkup lokasi."
                          "Ruang lingkup tempat mengacu pada aspek fisik dan manusia dari suatu lokasi."
                          "Salah satu ruang lingkup penting yang dibahas dalam geografi adalah interaksi antara manusia dan lingkungan."
                          "Bumi penuh dengan pergerakan yang didominasi manusia dan barang."
                          "Wilayah dapat diartikan sebagai satuan luas muka bumi yang memiliki karakteristik yang sama, baik karakteristik fisik atau manusianya."]
               pertanyaan [["Berikut ini yang merupakan ruang lingkup ilmu geografi adalah ...."
                            "Di antara opsi-opsi di bawah ini yang termasuk ruang lingkup yang dibahas dalam ilmu geografi adalah ...."]
                           ["Berikut ini yang merupakan contoh kasus yang berkaitan dengan lokasi adalah ...."
                            "Di bawah ini yang termasuk contoh kasus yang bisa dijelaskan dalam ruang lingkup lokasi adalah ...."]
                           ["Berikut ini yang merupakan contoh kasus yang berkaitan dengan tempat (<i>place</i>) adalah ...."
                            "Di bawah ini yang termasuk contoh kasus yang bisa dijelaskan dalam ruang lingkup tempat adalah ...."]
                           ["Berikut ini yang merupakan contoh kasus yang berkaitan dengan interaksi antara manusia dan lingkungan adalah ...."
                            "Di bawah ini yang termasuk contoh kasus yang bisa dijelaskan dalam ruang lingkup interaksi antara manusia dan lingkungan adalah ...."]
                           ["Berikut ini yang merupakan contoh kasus yang berkaitan dengan pergerakan adalah ...."
                            "Di bawah ini yang termasuk contoh kasus yang bisa dijelaskan dalam ruang lingkup pergerakan adalah ...."]
                           ["Berikut ini yang merupakan contoh kasus yang berkaitan dengan wilayah adalah ...."
                            "Di bawah ini yang termasuk contoh kasus yang bisa dijelaskan dalam ruang lingkup wilayah adalah ...."]]
               pertanyaan-1 (str (pengantar 0) " " (rand-nth (pertanyaan 0)))
               pertanyaan-2 (str (pengantar 1) " " (rand-nth (pertanyaan 1)))
               pertanyaan-3 (str (pengantar 2) " " (rand-nth (pertanyaan 2)))
               pertanyaan-4 (str (pengantar 3) " " (rand-nth (pertanyaan 3)))
               pertanyaan-5 (str (pengantar 4) " " (rand-nth (pertanyaan 4)))
               pertanyaan-6 (str (pengantar 5) " " (rand-nth (pertanyaan 5)))
               lingkup [["lokasi" "tempat" "interaksi antara manusia dan lingkungan" "pergerakan" "wilayah"]
                        ["gejala sosial" "lembaga" "institusi" "perekonomian" "tujuan negara"]]
               lokasi [["penentuan posisi suatu wilayah berdasarkan sistem koordinat tertentu" "penentuan posisi suatu objek berdasarkan posisi objek yang lain"]
                       ["toponimi atau pemberian nama pada suatu tempat" "deskripsi perbedaan dan persamaan suatu tempat berdasarkan karakteristik fisik dan manusia" "deskripsi fitur dan kondisi unik dari suatu tempat" "analisis dampak pemanasan global terhadap kehidupan makhluk hidup" "analisis dampak pencemaran lingkungan terhadap kehidupan manusia"]]
               tempat [["toponimi atau pemberian nama pada suatu tempat" "deskripsi perbedaan dan persamaan suatu tempat berdasarkan karakteristik fisik dan manusia" "deskripsi fitur dan kondisi unik dari suatu tempat"]
                       ["analisis dampak pemanasan global terhadap kehidupan makhluk hidup" "analisis dampak pencemaran lingkungan terhadap kehidupan manusia" "penentuan posisi suatu wilayah berdasarkan sistem koordinat tertentu" "penentuan posisi suatu objek berdasarkan posisi objek yang lain"]]
               interaksi [["analisis dampak pemanasan global terhadap kehidupan makhluk hidup" "analisis dampak pencemaran lingkungan terhadap kehidupan manusia" "identifikasi perubahan tata guna lahan akibat aktivitas manusia"]
                          ["pengangkutan barang dari satu tempat di bumi ke tempat yang lain" "pertukaran gagasan antara bangsa-bangsa di dunia yang memungkinkan penyatuan peradaban" "penentuan batas-batas wilayah secara formal" "pengelompokan negara-negara di suatu wilayah dengan sebutan kawasan tertentu" "penentuan batas-batas wilayah secara imajiner"]]
               movement [["pengangkutan barang dari satu tempat di bumi ke tempat yang lain" "pertukaran gagasan antara bangsa-bangsa di dunia yang memungkinkan penyatuan peradaban" "migrasi manusia dari suatu wilayah ke wilayah lain"]
                         ["penentuan batas-batas wilayah secara formal" "pengelompokan negara-negara di suatu wilayah dengan sebutan kawasan tertentu" "penentuan batas-batas wilayah secara imajiner" "analisis dampak pencemaran lingkungan terhadap kehidupan manusia"]]
               wilayah [["penentuan batas-batas wilayah secara formal" "pengelompokan negara-negara di suatu wilayah dengan sebutan kawasan tertentu" "penentuan batas-batas wilayah secara imajiner"]
                        ["pengangkutan barang dari satu tempat di bumi ke tempat yang lain" "pertukaran gagasan antara bangsa-bangsa di dunia yang memungkinkan penyatuan peradaban" "migrasi manusia dari suatu wilayah ke wilayah lain" "analisis dampak pencemaran lingkungan terhadap kehidupan manusia"]]]
         
         (merge
          (condp = tipe-soal
            :S1 (merge {:pertanyaan pertanyaan-1
                        :pb (rand-nth (lingkup 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (lingkup 1))))
            :S2 (merge {:pertanyaan pertanyaan-2
                        :pb (rand-nth (lokasi 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (lokasi 1))))
            :S3 (merge {:pertanyaan pertanyaan-3
                        :pb (rand-nth (tempat 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (tempat 1))))
            :S4 (merge {:pertanyaan pertanyaan-4
                        :pb (rand-nth (interaksi 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (interaksi 1))))
            :S5 (merge {:pertanyaan pertanyaan-5
                        :pb (rand-nth (movement 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (movement 1))))
            :S6 (merge {:pertanyaan pertanyaan-6
                        :pb (rand-nth (wilayah 0))}
                       (zipmap [:p1 :p2 :p3] (shuffle (wilayah 1))))))))
  
  (repeatedly 100)
  distinct
  shuffle
  (take 38)
  shuffle))

(defn aspek-geografi-1 []
  (->> (fn []
         (let [tipe-soal (rand-nth [:S1 :S2])
               fisik [["Fenomena geosfer berikut ini yang menunjukkan aspek fisik geografi adalah .…"
                       "Di bawah ini yang termasuk fenomena yang berkaitan dengan aspek fisik geografi adalah ...."]
                      ["terjadi sedimentasi di Sungai Musi akibat curah hujan yang tinggi"
                       "negara-negara dilintasi garis khatulistiwa umumnya beriklim tropis"
                       "persebaran flora dan fauna di Indonesia sangat beragam"
                       "laut berpotensi membawa bencana seperti tsunami dan banjir rob"
                       "kondisi tanah yang sesuai mempengaruhi hasil pertanian"
                       "terbentuknya batu jamur disebabkan oleh erosi angin"
                       "suhu dan ketinggian berpengaruh terhadap persebaran flora"
                       "gunungapi banyak ditemukan di sekitar zona subduksi"
                       "daerah karst kurang cocok dijadikan permukiman karena ketersediaan air kurang memadai"
                       "potensi pertambangan sangat tergantung dengan jenis tanah dan batuan yang ada di suatu wilayah"]
                      ["penduduk Indonesia terkenal dengan keramahannya"
                       "banyak ilmuwan yang berlomba-lomba menciptakan alat deteksi gempa"
                       "kesenjangan sosial di kota menyebabkan timbulnya permukiman kumuh"
                       "penggunaan lahan di kawasan terpencil yang masih banyak dikontrol oleh tanah adat"
                       "lokasi yang strategis dapat memberikan keuntungan bagi suatu negara"
                       "kehidupan masyarakat di daerah pesisir sangat bergantung pada laut dan perikanan"
                       "wilayah dengan kepadatan penduduk tinggi akan memiliki intensitas aktivitas yang lebih tinggi"
                       "daerah dengan penduduk yang muda cenderung menyukai aktivitas padat karya"
                       "daerah dengan penduduk tua dan non produktif cenderung menyukai aktivitas yang padat modal"
                       "piramida penduduk di tiap-tiap negara berbeda-beda"]]
              sosial [["Fenomena berikut ini yang menunjukkan aspek sosial geografi adalah .…"
                         "Di bawah ini yang termasuk fenomena yang berkaitan dengan aspek sosial geografi adalah ...."]
                        ["lahan yang subur membuat penduduk pedesaan di Indonesia berprofesi sebagai petani"
                         "adanya risiko bencana gempa bumi mendorong ilmuwan untuk menciptakan alat deteksi gempa"
                         "kesenjangan sosial di kota menyebabkan timbulnya permukiman kumuh"
                         "penggunaan lahan di kawasan terpencil yang masih banyak dikontrol oleh tanah adat"
                         "lokasi yang strategis dapat memberikan keuntungan bagi suatu negara"
                         "kehidupan masyarakat di daerah pesisir sangat bergantung pada laut dan perikanan"
                         "wilayah dengan kepadatan penduduk tinggi akan memiliki intensitas aktivitas yang lebih tinggi"
                         "daerah dengan penduduk yang muda cenderung menyukai aktivitas padat karya"
                         "daerah dengan penduduk tua dan non produktif cenderung menyukai aktivitas yang padat modal"
                         "piramida penduduk di tiap-tiap negara berbeda-beda"]
                        ["terjadi sedimentasi di Sungai Musi akibat curah hujan yang tinggi"
                         "negara-negara dilintasi garis khatulistiwa umumnya beriklim tropis"
                         "persebaran flora dan fauna di Indonesia sangat beragam"
                         "laut berpotensi membawa bencana seperti tsunami dan banjir rob"
                         "kondisi tanah yang sesuai mempengaruhi hasil pertanian"
                         "terbentuknya batu jamur disebabkan oleh erosi angin"
                         "suhu dan ketinggian berpengaruh terhadap persebaran flora"
                         "gunungapi banyak ditemukan di sekitar zona subduksi"
                         "daerah karst kurang cocok dijadikan permukiman karena ketersediaan air kurang memadai"
                         "potensi pertambangan sangat tergantung dengan jenis tanah dan batuan yang ada di suatu wilayah"]]]
         
         (merge
          (condp = tipe-soal
            :S1 (merge {:pertanyaan (rand-nth (fisik 0))
                        :pb (rand-nth (fisik 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (fisik 2))))
            :S2 (merge {:pertanyaan (rand-nth (sosial 0))
                        :pb (rand-nth (sosial 1))}
                       (zipmap [:p1 :p2 :p3] (shuffle (sosial 2))))))))
  
  (repeatedly 100)
  distinct
  shuffle
  (take 40)
  shuffle))

(defn objek-material-geografi-1 []
  (->> (fn []
         (let [type (rand-nth [:a :b :c :d :e])
               pertanyaan (rand-nth ["Objek material geografi yang dapat dikaji pada fenomena tersebut adalah ...."
                                     "Fenomena tersebut dapat dikaji berdasarkan objek material geografi ...."])
               objek-material ["atmosfer"
                               "litosfer"
                               "hidrosfer"
                               "biosfer"
                               "antroposfer"
                               "pedosfer"]
               atmosfer ["Curah hujan tinggi terjadi di beberapa negara tropis termasuk Indonesia."
                         "Pelangi biasanya muncul hujan akibat cahaya matahari yang menembus tetesan air hujan."
                         "Kabut sering terjadi di saat subuh menjelang pagi hari."
                         "Awan kumulonimbus bisa mengakibatkan angin kecang, hujan badai, dan petir."]
               litosfer ["Batuan vulkanik umumnya dijumpai di sekitar daerah gunungapi."
                         "Gempa bumi sering terjadi di daerah yang dilalui cincin api (<i>ring of fire</i>)."
                         "Gempa bumi dapat dipicu oleh patahan atau sesar."
                         "Batu jamur dapat terbentuk akibat pengaruh erosi."
                         "Persebaran tanah di Indonesia sangat beragam tergantung kepada kondisi wilayahnya."]
               hidrosfer ["Pasang surut air laut dipengaruhi oleh gaya gravitasi benda-benda langit terutama bulan dan matahari."
                          "Sungai mengalir dari tempat yang tinggi ke tempat yang lebih rendah."]
               biosfer ["Ekosistem terbentuk oleh hubungan timbal balik yang tak terpisahkan antara makhluk hidup dan lingkungannya."
                        "Hubungan timbal balik antara makhluk hidup dan lingkungannya dapat membentuk suatu ekosistem."
                        "Bioma merupakan wilayah yang memiliki sifat geografis atau iklim yang sama yang meliputi komunitas tumbuhan, hewan, organisme tanah, bakteri, dan virus."]
               antroposfer ["Persebaran penduduk di Indonesia tidak merata."
                            "Migrasi penduduk ke luar negeri menyebabkan berkurangnya penduduk suatu negara."
                            "Kota-kota besar seperti Jakarta dan Surabaya memiliki kepadatan penduduk yang tinggi daripada kota-kota kecil lainnya."]
               salah (fn [x] (shuffle (filter #(not (= % x)) objek-material)))]
         
         (merge
          (condp = type
            :a (merge {:pengantar (rand-nth atmosfer)
                       :pertanyaan pertanyaan
                       :pb (objek-material 0)}
                      (zipmap [:p1 :p2 :p3] (salah (objek-material 0))))
            :b (merge {:pengantar (rand-nth litosfer)
                       :pertanyaan pertanyaan
                       :pb (objek-material 1)}
                      (zipmap [:p1 :p2 :p3] (salah (objek-material 1))))
            :c (merge {:pengantar (rand-nth hidrosfer)
                       :pertanyaan pertanyaan
                       :pb (objek-material 2)}
                      (zipmap [:p1 :p2 :p3] (salah (objek-material 2))))
            :d (merge {:pengantar (rand-nth biosfer)
                       :pertanyaan pertanyaan
                       :pb (objek-material 3)}
                      (zipmap [:p1 :p2 :p3] (salah (objek-material 3))))
            :e (merge {:pengantar (rand-nth antroposfer)
                       :pertanyaan pertanyaan
                       :pb (objek-material 4)}
                      (zipmap [:p1 :p2 :p3] (salah (objek-material 4))))))))
  
  (repeatedly 100)
  distinct
  shuffle
  (take 34)
  shuffle))

(defn objek-material-geografi-2 []
  (->> (fn []
         (let [tipe (rand-nth [:a :b :c :d])
               pertanyaan (rand-nth ["Objek material geografi pada fenomena tersebut adalah ...."
                                     "Fenomena tersebut dapat dikaji berdasarkan objek material geografi ...."])
               pengantar-1 (rand-nth ["Perbedaan mata pencaharian penduduk dipengaruhi oleh kondisi wilayahnya. Misalnya, penduduk di dataran rendah bekerja di sektor industri dan jasa. Sementara, penduduk di dataran tinggi bekerja di sektor pertanian."
                                      "Perbedaan kondisi fisik antarwilayah dapat mendorong terjadinya perpindahan penduduk. Misalnya, penduduk yang berpindah dari suatu wilayah yang kurang subur ke wilayah lain yang lebih subur."])
               pengantar-2 (rand-nth ["Pola aliran sungai sangat dipengaruhi oleh morfologi tempat sungai tersebut mengalir. Misalnya, sungai berkelok-kelok biasanya terbentuk pada bagian hilir, tempat pengikisan ke samping dan pengendapan di bantaran sungai terjadi secara berturut-turut."
                                      "Patahan dan struktur geologi lainnya dapat mempengaruhi pola aliran sungai. Misalnya, pola aliran yang terdapat di daerah patahan biasanya membentuk sudut siku-siku yang biasa disebut pola rektangular."
                                      "Batuan sedimen dapat dijumpai di sekitar hilir sungai. Hal ini disebabkan sedimen-sedimen yang berasal dari batuan yang berada di bagian hulu terbawa oleh arus sungai sehingga terendapkan di bagian hilir."])
               pengantar-3 (rand-nth ["Cacing tanah dapat membantu menggemburkan tanah. Hal tersebut bisa terjadi karena cacing dapat menghancurkan bahan organik sehingga memperbaiki aerasi dan struktur tanah. Akibatnya, lahan menjadi subur dan penyerapan nutrisi oleh tanaman menjadi baik."
                                      "Pelapukan batuan dapat terjadi secara biologis, salah satunya oleh organisme seperti lumut. Akar lumut masuk kecelah-celah batuan. Semakin lama, lumut akan membesar sehingga akar-akarnya mampu menghancurkan batuan yang ditumbuhinya."])
               pengantar-4 (rand-nth ["Curah hujan tinggi berpotensi menyebabkan tanah longsor di daerah dengan kemiringan lereng terjal. Kondisi lereng yang terjal bisa mempengaruhi gaya pendorong yang memicu terjadinya tanah longsor."])
               benar [["litosfer dan antroposfer"
                       "pedosfer dan antroposfer"]
                      ["hidrosfer dan litosfer"
                       "litosfer dan hidrosfer"]
                      ["biosfer dan litosfer"
                       "litosfer dan biosfer"]
                      ["atmosfer dan litosfer"
                       "litosfer dan atmosfer"]]
               salah [["biosfer dan hidrosfer"
                       "atmosfer dan hidrosfer"
                       "litosfer dan hidrosfer"
                       "litosfer dan atmosfer"]
                      ["antroposfer dan biosfer"
                       "litosfer dan pedosfer"
                       "litosfer dan biosfer"
                       "antroposfer dan litosfer"]
                      ["hidrosfer dan antroposfer"
                       "litosfer dan hidrosfer"
                       "antroposfer dan litosfer"
                       "pedosfer dan antroposfer"]
                      ["hidrosfer dan antroposfer"
                       "litosfer dan biosfer"
                       "antroposfer dan litosfer"
                       "litosfer dan hidrosfer"]]]

           (merge
            (condp = tipe
              :a (merge {:pengantar pengantar-1
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 0))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 0))))
              :b (merge {:pengantar pengantar-2
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 1))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 1))))
              :c (merge {:pengantar pengantar-3
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 2))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 2))))
              :d (merge {:pengantar pengantar-4
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 3))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 3))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 36)
       shuffle))

(defn objek-material-geografi-3 []
  (->> (fn []
         (let [tipe (rand-nth [:1 :2 :3 :4 :5 :6
                               :7 :8 :9 :10 :11 :12
                               :13 :14 :15 :16 :17 :18])
               pengantar (rand-nth ["Perhatikan objek-objek material geografi berikut!"
                                    "Berikut ini adalah beberapa contoh objek material geografi:"])
               fakta ["Litosfer"
                      "Atmosfer"
                      "Hidrosfer"
                      "Biosfer"
                      "Antroposfer"]
               pertanyaan [["Jika kita ingin meneliti tingkat efektivitas Ruang Terbuka Hijau (RTH) dalam mereduksi emisi gas karbon di Kota Surabaya, objek material yang digunakan adalah nomor … karena …."]
                           ["Jika kita ingin meneliti profesi antara penduduk di dataran tinggi dan di dataran rendah, objek material yang digunakan adalah nomor ... karena ...."]
                           ["Jika kita ingin meneliti pola aliran sungai di suatu wilayah seperti daerah hulu dan hilir, objek material yang digunakan adalah nomor ... karena ...."]]
               kuning1 (rand-nth (remove #{(fakta 0) (fakta 3)} fakta))
               kuning2 (rand-nth (remove #{kuning1} fakta))
               biru1 (rand-nth (remove #{(fakta 0) (fakta 4)} fakta))
               biru2 (rand-nth (remove #{biru1} fakta))
               pink1 (rand-nth (remove #{(fakta 0) (fakta 2)} fakta))
               pink2 (rand-nth (remove #{pink1} fakta))
               jawaban1 ["1 dan 2"
                         "1 dan 3"
                         "1 dan 4"
                         "2 dan 3"
                         "2 dan 4"
                         "3 dan 4"]
               jawaban2 [["; adanya RTH merupakan bentuk pemanfaatan flora untuk mengurangi gas karbon yang ada di lapisan atmosfer"
                          "; Ruang Terbuka Hijau menggunakan flora (tumbuhan) sebagai objek yang dapat meminimalisasi gas karbon di atmosfer"]
                         ["; perbedaan bentuk lahan mempengaruhi perbedaan profesi penduduknya"
                          "; kondisi fisik wilayah mendorong penduduk untuk melakukan aktivitas mata pencaharian yang sesuai"]
                         ["; pola aliran sungai sangat dipengaruhi oleh morfologi tempat sungai tersebut mengalir"
                          "; bentuk lahan yang berbeda seperti di hulu dan hilir mempengaruhi pola aliran sungai"]]
               salah1 (for [a ["1 dan 2"
                               "1 dan 3"
                               "1 dan 4"
                               "2 dan 3"
                               "2 dan 4"
                               "3 dan 4"]
                            b ["; efektivitas RTH dipengaruhi oleh horizon tanah, sedangkan emisi gas karbon termasuk ke dalam faktor rusaknya flora"
                               "; pada RTH terdapat tumbuhan yang berperan untuk penyerapan CO2 di udara"
                               "; konsentrasi emisi gas karbon yang tinggi di udara hanya disebabkan oleh kegiatan manusia"]]
                        (str a b))
               salah2 (for [a ["1 dan 2"
                               "1 dan 3"
                               "1 dan 4"
                               "2 dan 3"
                               "2 dan 4"
                               "3 dan 4"]
                            b ["; ekosistem di dataran tinggi sangat cocok untuk bercocok tanam"
                               "; kondisi di dataran rendah sangat cocok untuk permukiman"
                               "; kondisi fisik wilayah tidak mempengaruhi perbedaan profesi penduduk"]]
                        (str a b))
               salah3 (for [a ["1 dan 2"
                               "1 dan 3"
                               "1 dan 4"
                               "2 dan 3"
                               "2 dan 4"
                               "3 dan 4"]
                            b ["; pola aliran sungai dipengaruhi oleh curah hujan di wilayah tersebut"
                               "; adanya permukiman penduduk mempengaruhi pola aliran sungai"
                               "; ekosistem sungai sangat dipengaruhi oleh pola aliran sungai"]]
                        (str a b))]
         (merge
          (condp = tipe
            :1 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 (fakta 3)
                 :fakta3 kuning1
                 :fakta4 kuning2
                 :pertanyaan (rand-nth (pertanyaan 0))
                 :pb (str (jawaban1 0) (rand-nth (jawaban2 0)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah1)))
            :2 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 kuning1
                 :fakta3 (fakta 3)
                 :fakta4 kuning2
                 :pertanyaan (rand-nth (pertanyaan 0))
                 :pb (str (jawaban1 1) (rand-nth (jawaban2 0)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah1)))
            :3 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 kuning1
                 :fakta3 kuning2
                 :fakta4 (fakta 3)
                 :pertanyaan (rand-nth (pertanyaan 0))
                 :pb (str (jawaban1 2) (rand-nth (jawaban2 0)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah1)))
            :4 (merge
                {:pengantar pengantar
                 :fakta1 kuning1
                 :fakta2 (fakta 0)
                 :fakta3 (fakta 3)
                 :fakta4 kuning2
                 :pertanyaan (rand-nth (pertanyaan 0))
                 :pb (str (jawaban1 3) (rand-nth (jawaban2 0)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah1)))
            :5 (merge
                {:pengantar pengantar
                 :fakta1 kuning1
                 :fakta2 (fakta 0)
                 :fakta3 kuning2
                 :fakta4 (fakta 3)
                 :pertanyaan (rand-nth (pertanyaan 0))
                 :pb (str (jawaban1 4) (rand-nth (jawaban2 0)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah1)))
            :6 (merge
                {:pengantar pengantar
                 :fakta1 kuning1
                 :fakta2 kuning2
                 :fakta3 (fakta 0)
                 :fakta4 (fakta 3)
                 :pertanyaan (rand-nth (pertanyaan 0))
                 :pb (str (jawaban1 5) (rand-nth (jawaban2 0)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah1)))
            :7 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 (fakta 4)
                 :fakta3 biru1
                 :fakta4 biru2
                 :pertanyaan (rand-nth (pertanyaan 1))
                 :pb (str (jawaban1 0) (rand-nth (jawaban2 1)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah2)))
            :8 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 biru1
                 :fakta3 (fakta 4)
                 :fakta4 biru2
                 :pertanyaan (rand-nth (pertanyaan 1))
                 :pb (str (jawaban1 1) (rand-nth (jawaban2 1)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah2)))
            :9 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 biru1
                 :fakta3 biru2
                 :fakta4 (fakta 4)
                 :pertanyaan (rand-nth (pertanyaan 1))
                 :pb (str (jawaban1 2) (rand-nth (jawaban2 1)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah2)))
            :10 (merge
                 {:pengantar pengantar
                  :fakta1 biru1
                  :fakta2 (fakta 0)
                  :fakta3 (fakta 4)
                  :fakta4 biru2
                  :pertanyaan (rand-nth (pertanyaan 1))
                  :pb (str (jawaban1 3) (rand-nth (jawaban2 1)))}
                 (zipmap [:p1 :p2 :p3] (shuffle salah2)))
            :11 (merge
                 {:pengantar pengantar
                  :fakta1 biru1
                  :fakta2 (fakta 0)
                  :fakta3 biru2
                  :fakta4 (fakta 4)
                  :pertanyaan (rand-nth (pertanyaan 1))
                  :pb (str (jawaban1 4) (rand-nth (jawaban2 1)))}
                 (zipmap [:p1 :p2 :p3] (shuffle salah2)))
            :12 (merge
                 {:pengantar pengantar
                  :fakta1 biru1
                  :fakta2 biru2
                  :fakta3 (fakta 0)
                  :fakta4 (fakta 4)
                  :pertanyaan (rand-nth (pertanyaan 1))
                  :pb (str (jawaban1 5) (rand-nth (jawaban2 1)))}
                 (zipmap [:p1 :p2 :p3] (shuffle salah2)))
            :13 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 (fakta 2)
                 :fakta3 pink1
                 :fakta4 pink2
                 :pertanyaan (rand-nth (pertanyaan 2))
                 :pb (str (jawaban1 0) (rand-nth (jawaban2 2)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah3)))
            :14 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 pink1
                 :fakta3 (fakta 2)
                 :fakta4 pink2
                 :pertanyaan (rand-nth (pertanyaan 2))
                 :pb (str (jawaban1 1) (rand-nth (jawaban2 2)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah3)))
            :15 (merge
                {:pengantar pengantar
                 :fakta1 (fakta 0)
                 :fakta2 pink1
                 :fakta3 pink2
                 :fakta4 (fakta 2)
                 :pertanyaan (rand-nth (pertanyaan 2))
                 :pb (str (jawaban1 2) (rand-nth (jawaban2 2)))}
                (zipmap [:p1 :p2 :p3] (shuffle salah3)))
            :16 (merge
                 {:pengantar pengantar
                  :fakta1 pink1
                  :fakta2 (fakta 0)
                  :fakta3 (fakta 2)
                  :fakta4 pink2
                  :pertanyaan (rand-nth (pertanyaan 2))
                  :pb (str (jawaban1 3) (rand-nth (jawaban2 2)))}
                 (zipmap [:p1 :p2 :p3] (shuffle salah3)))
            :17 (merge
                 {:pengantar pengantar
                  :fakta1 pink1
                  :fakta2 (fakta 0)
                  :fakta3 pink2
                  :fakta4 (fakta 2)
                  :pertanyaan (rand-nth (pertanyaan 2))
                  :pb (str (jawaban1 4) (rand-nth (jawaban2 2)))}
                 (zipmap [:p1 :p2 :p3] (shuffle salah3)))
            :18 (merge
                 {:pengantar pengantar
                  :fakta1 pink1
                  :fakta2 pink2
                  :fakta3 (fakta 0)
                  :fakta4 (fakta 2)
                  :pertanyaan (rand-nth (pertanyaan 2))
                  :pb (str (jawaban1 5) (rand-nth (jawaban2 2)))}
                 (zipmap [:p1 :p2 :p3] (shuffle salah3)))))))
  (repeatedly 100)
  distinct
  shuffle
  (take 72)
  shuffle))

(defn aspek-geografi-2 []
  (->> (fn []
         (let [tipe (rand-nth [:a :b :c :d])
               pengantar (rand-nth ["Perhatikan wacana berikut!"
                                    "Perhatikan fenomena berikut!"])
               pertanyaan (rand-nth ["Aspek geografi secara nonfisik yang tepat untuk mengkaji fenomena tersebut adalah aspek ...."
                                     "Fenomena tersebut dapat dikaji berdasarkan aspek geografi nonfisik, yaitu ...."])
               ekonomi ["Indonesia merupakan negara yang memiliki keanekaragaman barang tambang. Sebagian barang tambang Indonesia diekspor ke luar negeri. Kegiatan ekspor tersebut dapat meningkatkan devisa negara."
                        "Indonesia saat ini diketahui menjadi negara memiliki bonus demografi. Pasalnya, jumlah penduduk usia produktif lebih tinggi dibandingkan usia nonproduktif. Bonus demografi ini bisa membawa dampak positif bagi peningkatan peluang tenaga kerja."
                        "Indonesia adalah negara yang kaya akan sumber daya alam. Apabila dikelola dengan baik, kekayaan sumber daya alam tersebut bisa meningkatkan pendapatan negara."
                        "Globalisasi mendorong adanya kemudahan pertukaran barang dari suatu negara ke negara lain, yang biasanya disebut sebagai aktivitas ekspor impor. Kegiatan ekspor impor membawa dampak positif bagi peningkatan pendapatan negara maupun pemenuhan kebutuhan barang yang diperlukan oleh suatu negara."]
               sosial ["Indonesia merupakan salah satu negara dengan jumlah penduduk terbesar di dunia. Pertumbuhan penduduk Indonesia tergolong cepat. Namun, apabila tidak terkendali, hal tersebut bisa memicu adanya ledakan penduduk. Ledakan penduduk bisa berdampak ke berbagai hal, salah satunya meningkatnya kriminalitas."
                       "Urbanisasi telah terjadi di tengah-tengah masyarakat kita saat ini. Banyak penduduk desa yang berpindah ke kota dengan harapan memperoleh kehidupan dan pekerjaan yang layak daripada di kampungnya. Akan tetapi, gelombang urbanisasi yang tidak terkendali justru memicu dampak yang buruk, salah satunya munculnya banyak permukiman kumuh yang dibangun di tengah-tengah kota."]
               budaya ["Globalisasi mendorong adanya kemudahan pertukaran ide dan gagasan dari suatu negara ke negara lain. Hal tersebut bisa membawa dampak baik maupun negatif. Salah satu dampak negatif dari adanya globalisasi adalah lunturnya nasionalisme, sifat kekeluargaan, dan gotong dikarenakan pengaruh dari luar."
                       "Globalisasi mendorong adanya kemudahan perpindahan manusia dan material dari suatu negara ke negara lain. Selain itu, globalisasi juga bisa mendorong penyebaran nilai-nilai positif antarnegara sehingga saling menguntungkan."]
               politik ["Globalisasi mendorong proses integrasi internasional yang terjadi karena adanya pertukaran pandangan dunia, pemikiran, produk, dan berbagai aspek lainnya. Hal tersebut bisa berdampak pada tatanan kehidupan pada suatu negara. Salah satu dampak positifnya adalah hak asasi manusia (HAM) semakin diakui keberadaannya."
                        "Adanya globalisasi mendorong proses integrasi internasional yang terjadi karena adanya pertukaran pandangan dunia, pemikiran, produk, dan berbagai aspek lainnya. Hal tersebut bisa berdampak pada tatanan kehidupan pada suatu negara. Salah satu dampak negatifnya adalah masyarakat cenderung mementingkan kepentingan kelompok daripada kepentingan umum."]
               aspek ["ekonomi"
                      "sosial"
                      "budaya"
                      "politik"
                      "hukum"
                      "keamanan"]
               salah (fn [x] (shuffle (filter #(not (= % x)) aspek)))]
         
         (merge
          (condp = tipe
            :a (merge {:pengantar pengantar
                       :wacana (rand-nth ekonomi)
                       :pertanyaan pertanyaan
                       :pb (aspek 0)}
                      (zipmap [:p1 :p2 :p3] (shuffle (salah (aspek 0)))))
            :b (merge {:pengantar pengantar
                       :wacana (rand-nth sosial)
                       :pertanyaan pertanyaan
                       :pb (aspek 1)}
                      (zipmap [:p1 :p2 :p3] (shuffle (salah (aspek 1)))))
            :c (merge {:pengantar pengantar
                       :wacana (rand-nth budaya)
                       :pertanyaan pertanyaan
                       :pb (aspek 2)}
                      (zipmap [:p1 :p2 :p3] (shuffle (salah (aspek 2)))))
            :d (merge {:pengantar pengantar
                       :wacana (rand-nth politik)
                       :pertanyaan pertanyaan
                       :pb (aspek 3)}
                      (zipmap [:p1 :p2 :p3] (shuffle (salah (aspek 3)))))))))
  
  (repeatedly 100)
  distinct
  shuffle
  (take 40)
  shuffle))

(defn konsep-geografi-bagian-1 []
  (->> (fn []
         (let [tipe (rand-nth [:a :b :c :d])
               pertanyaan (rand-nth ["Fenomena tersebut dapat dianalisis menggunakan konsep …."
                                     "Konsep geografi yang dapat mengkaji fenomena tersebut adalah ...."])
               jarak ["Ardhito menjelaskan kepada Nikki bahwa ruang yang menghubungkan antara Kota Wakanda hingga Kota Winterfell itu dekat."
                      "Iman menerangkan kepada Yoel bahwa ruang yang menghubungkan antara Kota Jakarta dan Kota Bekasi itu jauh."
                      "Harga tanah naik jika dekat dengan pusat kota dibandingkan dengan harga tanah di pedesaan."]
               lokasi ["Seorang surveyor sedang menentukan lokasi survey dengan menggunakan sistem koordinat garis lintang dan garis bujur."
                       "Andi menjelaskan kepada Budi bahwa rumahnya berada di dekat pasar."
                       "Pada daerah yang dingin orang-orang cenderung memakai pakaian yang tebal."
                       "Jika dilihat dari denah, rumah anggota dewan itu berada di sebelah rumah seorang polisi."]
               keterjangkauan ["Yoga bisa pergi dari Jakarta ke Surabaya dengan menggunakan transportasi umum seperti kereta api."
                               "Ongkos kirim barang antara Jakarta - Solo lebih mahal daripada ongkir barang dari Jakarta ke Bekasi."
                               "Rute Jakarta - Pontianak hanya bisa ditempuh dengan menggunakan transportasi udara atau laut."
                               "Saat ini, kita belum bisa menempuh rute Banyuwangi - Bali dengan menggunakan transportasi darat karena harus melewati perairan selat."]
               pola ["Persebaran arah dan bentuk aliran sungai umumnya mengikuti struktur geologi dan jenis batuan di wilayah tersebut."
                     "Permukiman penduduk di dataran rendah umumnya memanjang di sekitar pinggiran sungai, jalan, atau menyesuaikan bentuk lahan."]
               konsep ["jarak"
                       "lokasi"
                       "keterjangkauan"
                       "pola"
                       "morfologi"
                       "aglomerasi"
                       "nilai guna"
                       "interaksi dan interdependensi"
                       "diferensiasi area"
                       "keterkaitan ruang"]
               salah (fn [x] (shuffle (filter #(not (= % x)) konsep)))]

           (merge
            (condp = tipe
              :a (merge {:fenomena (rand-nth jarak)
                         :pertanyaan pertanyaan
                         :pb (konsep 0)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 0)))))
              :b (merge {:fenomena (rand-nth lokasi)
                         :pertanyaan pertanyaan
                         :pb (konsep 1)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 1)))))
              :c (merge {:fenomena (rand-nth keterjangkauan) 
                         :pertanyaan pertanyaan
                         :pb (konsep 2)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 2)))))
              :d (merge {:fenomena (rand-nth pola)
                         :pertanyaan pertanyaan
                         :pb (konsep 3)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 3)))))))))

       (repeatedly 50)
       distinct
       shuffle
       (take 26)
       shuffle))

(defn pendekatan-geografi-1 []
  (->> (fn []
         (let [tipe (rand-nth [:a :b :c])
               pertanyaan (rand-nth ["Pendekatan geografi yang berkaitan dengan fenomena geosfer tersebut adalah pendekatan …."
                                     "Fenomena tersebut dapat dikaji dengan menggunakan pendekatan geografi ...."])
               ekologi ["Banjir bandang di Wasior Papua Barat menelan korban ratusan orang. Peristiwa itu ditengarai karena penebangan hutan oleh para pengusaha yang mengakibatkan kira-kira 30 hingga 40 persen hutan di kawasan industri mereka sudah mengalami alih fungsi dan dinyatakan rusak."
                        "Padang rumput yang ditinggalkan oleh kawanan hewan herbivora akan menyebabkan terjadinya perubahan lahan dan kompetisi penghuninya."
                        "Manusia secara besar-besaran mengeksploitasi alam dengan menggunakan teknologi yang mereka buat. Eksploitasi secara berlebihan tanpa memperhatikan dapat memicu kerusakan lingkungan."]
               spasial ["Lahan atau tanah yang subur bisa meningkatkan produktivitas pertanian sehingga harganya lebih mahal daripada tanah yang kurang subur."
                        "Lokasi yang strategis biasanya menjadi salah satu faktor dalam pemilihan lokasi bisnis dengan tujuan memaksimalkan penjualan."
                        "Hal yang harus diperhatikan dalam perencanaan pembukaan lahan untuk daerah permukiman adalah segala aspek yang terkait dengan wilayah yang akan digunakan, mulai dari kondisi morfologi terkait dengan risiko banjir, longsor, dan ketersediaan air tanah. Kondisi fisik suatu wilayah dapat mempengaruhi tingkat adaptasi manusia yang akan menempatinya sehingga hal tersebut sangat perlu dikaji."]
               regional ["Setiap wilayah memiliki kondisi yang berbeda-beda sehingga terbentuklah karakteristik wilayah. Perbedaan tersebut memicu munculnya interaksi antarwilayah dalam rangka memenuhi kebutuhan wilayahnya masing-masing."
                         "Perbedaan komoditas dan kebutuhan antara negara Inggris dan Indonesia melahirkan kegiatan perdagangan atau ekspor impor."
                         "Jakarta kekurangan lahan pertanian sehingga mendorong pemerintahnya untuk mendatangkan komoditas pertanian dari desa-desa di Pulau Jawa. Sebaliknya, pemerintah desa-desa tersebut mendatangkan peralatan elektronik dan mesin dari Jakarta untuk menunjang kehidupan di pedesaan."]
               benar [["ekologi"
                       "kelingkungan"]
                      ["keruangan"
                       "spasial"]
                      ["kompleks wilayah"
                       "regional"]]
               salah [["keruangan"
                       "spasial"
                       "regional"
                       "kompleks wilayah"]
                      ["regional"
                       "kompleks wilayah"
                       "ekologi"
                       "lingkungan"]
                      ["ekologi"
                       "lingkungan"
                       "keruangan"
                       "spasial"]]]

           (merge
            (condp = tipe
              :a (merge {:fenomena (rand-nth ekologi)
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 0))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 0))))
              :b (merge {:fenomena (rand-nth spasial)
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 1))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 1))))
              :c (merge {:fenomena (rand-nth regional)
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 2))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 2))))))))

       (repeatedly 50)
       distinct
       shuffle
       (take 36)
       shuffle))

(defn pendekatan-geografi-2 []
  (->> (fn []
         (let [tipe (rand-nth [:a :b :c])
               pertanyaan (rand-nth ["Pendekatan geografi yang berkaitan dengan fenomena geosfer tersebut adalah pendekatan …."
                                     "Pemaparan tersebut merupakan penerapan dari pendekatan ...."])
               ekologi ["Penebangan pohon yang ada di kawasan hutan di daerah Sukabumi, Jawa Barat telah menyebabkan terjadinya tanah longsor. Peristiwa tersebut menimbulkan banyak kerusakan, mulai dari permukiman, sawah, hingga banyak hewan ternak yang mati."
                        "Kebakaran hutan yang terjadi di Sumatra seringkali disebabkan oleh ulah manusia. Masyarakat di sekitar hutan biasanya membakar lahan untuk diolah menjadi perkebunan, seperti sawit, kopi, dan coklat. Awalnya mungkin masyarakat tersebut berniat untuk membakar lahan pada area yang sempit. Akan tetapi, lahan yang dibakar bisa merembet ke area hutan yang lebih luas sehingga terjadi kebakaran hutan."]
               spasial ["Gunung Sinabung (ketinggian 2.412 m) merupakan objek gunungapi di Sumatra Utara. Gunung ini terbentuk karena adanya penunjaman lempeng Indo-Australia terhadap lempeng Eurasia. Tumbukan tersebut membentuk pola gunung api yang memanjang di wilayah Sumatra, Jawa, dan Nusa Tenggara."
                        "Danau Toba merupakan salah satu danau yang berada di kaldera Gunung Supervulkan. Disebut sebagai kaldera dikarenakan danau tersebut merupakan fitur vulkanik berupa kawah yang terbentuk setelah runtuhnya batuan penyangga ke dalam dapur magma akibat letusan vulkanik. Batuan penyangga tersebut retak dikarenakan magma yang terus menerus mendesak keluar dengan volume yang sangat besar."
                        "Panas bumi merupakan salah satu energi terbarukan yang disebut ramah lingkungan. Aktivitas tektonik di dalam perut bumi memicu terbentuknya energi panas bumi. Magma di dalam perut bumi membuat lapisan batuan di atasnya mengalami peningkatan temperatur. Lapisan batuan yang bersuhu tinggi tersebut mengalami kontak dengan  air sehingga terbentuklah uap panas bertekanan tinggi yang disebut energi panas bumi. Beberapa lapangan panas bumi di Indonesia antara lain Kamojang, Lahendong, Sibayak, Sarulla, dan lain-lain."]
               regional ["Wilayah Jakarta sering dilanda banjir setiap tahunnya. Ketika dianalisis lebih lanjut, ternyata banjir di Jakarta tidak hanya disebabkan oleh faktor keruangan yang bermasalah di Jakarta saja, melainkan juga ada peran daerah yang lebih tinggi, yaitu Bogor, yang menjadi penyumbang limpasan air menuju Jakarta."
                         "Dalam perencanaan pembangunan kawasan permukiman di Pulau Sumatra, perlu dilakukan analisis kelayakan wilayah di daerah tersebut untuk lokasi transmigrasi. Langkah pertama yang bisa dikerjakan adalah identifikasi wilayah potensial yang memenuhi persyaratan minimum untuk dijadikan permukiman baru. Langkah kedua adalah identifikasi aksesibilitas wilayah yang dirumuskan untuk jangka pendek dan jangka panjang dalam rangka pengembangan kawasan tersebut."
                         "Banjir di Jakarta turut disebabkan oleh adanya alih fungsi lahan di daerah sekitar hulu sungai-sungai yang melewati Jakarta. Kawasan hutan yang berubah menjadi kawasan hunian wisata (villa) serta berbagai peruntukan lainnya mengakibatkan kawasan yang mulanya berfungsi sebagai daerah tangkapan air hujan tidak mampu meresapkan air hujan ke dalam lapisan air tanah."]
               benar [["ekologi"
                       "kelingkungan"]
                      ["keruangan"
                       "spasial"]
                      ["kompleks wilayah"
                       "regional"]]
               salah [["keruangan"
                       "spasial"
                       "regional"
                       "kompleks wilayah"]
                      ["regional"
                       "kompleks wilayah"
                       "ekologi"
                       "lingkungan"]
                      ["ekologi"
                       "lingkungan"
                       "keruangan"
                       "spasial"]]]

           (merge
            (condp = tipe
              :a (merge {:fenomena (rand-nth ekologi)
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 0))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 0))))
              :b (merge {:fenomena (rand-nth spasial)
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 1))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 1))))
              :c (merge {:fenomena (rand-nth regional)
                         :pertanyaan pertanyaan
                         :pb (rand-nth (benar 2))}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah 2))))))))

       (repeatedly 50)
       distinct
       shuffle
       (take 36)
       shuffle))

(defn konsep-geografi-bagian-2 []
  (->> (fn []
         (let [tipe (rand-nth [:a :b :c :d :e
                               :f :g :h :i :j])
               pertanyaan (rand-nth ["Fenomena tersebut dapat dianalisis menggunakan konsep …."
                                     "Konsep geografi yang dapat mengkaji fenomena tersebut adalah ...."])
               lokasi ["Konsep geografi yang membahas tentang letak atau posisi spasial dari objek tertentu adalah konsep ...."
                       "Konsep ... membahas posisi keruangan dari suatu objek."]
               jarak ["Konsep geografi yang membahas ruang yang menghubungkan antara dua lokasi disebut sebagai konsep ...."
                      "Konsep ... membahas ruang yang menghubungkan antara dua objek."]
               keterjangkauan ["Konsep geografi yang mengacu pada kemudahan untuk mencapai suatu objek yang dipengaruhi oleh kondisi geografis suatu wilayah adalah konsep ...."
                               "Konsep ... membahas kemudahan untuk mencapai suatu objek yang dipengaruhi oleh kondisi geografis suatu wilayah."]
               pola ["Konsep geografi yang mengacu pada susunan fenomena pada ruang muka bumi adalah konsep ...."
                     "Konsep ... mengacu pada penyebaran fenomena geosfer."]
               morfologi ["Konsep geografi yang menggambarkan perwujudan daratan di muka bumi yang merupakan hasil proses pengangkatan atau penurunan wilayah melalui proses geologi adalah konsep ...."
                          "Konsep ... berhubungan dengan bentuk permukaan bumi sebagai hasil proses alam dan hubungannya dengan aktivitas manusia."]
               aglomerasi ["Kecenderungan persebaran yang bersifat mengelompok pada suatu wilayah merupakan konsep ...."
                           "Konsep ... membahas kecenderungan persebaran yang bersifat mengelompok pada suatu wilayah yang relatif sempit yang disbebabkan oleh adanya faktor-faktor umum yang menguntungkan."]
               interaksi ["Konsep yang berkaitan dengan hubungan timbal balik atau saling ketergantungan antarwilayah merupakan konsep ...."
                          "Konsep ... mengacu pada hubungan saling ketergantungan atau timbal balik antara satu wilayah dengan wilayah lainnya."]
               nilai-guna ["Konsep yang mengacu pada kelebihan yang dimiliki suatu tempat atau wilayah tertentu disebut sebagai konsep ...."
                           "Konsep ... membahas kelebihan yang dipunyai oleh suatu wilayah yang berbeda-beda berdasarkan fungsinya."]
               difer-area ["Konsep yang menggambarkan keunikan atau karakteristik yang berbeda antara wilayah satu dengan yang lainnya merupakan konsep ...."
                           "Konsep ... membahas berbagai gejala dan problem geografis yang tersebar dalam ruang mempunyai karakteristik yang berbeda."]
               keterkaitan ["Konsep yang membahas adanya saling keterkaitan antar wilayah dalam memenuhi kebutuhan dan sosial penduduknya adalah konsep ...."
                            "Konsep ... menunjukkan tingkat hubungan antarwilayah."]
               konsep ["lokasi"
                       "jarak"
                       "keterjangkauan"
                       "pola"
                       "morfologi"
                       "aglomerasi"
                       "interaksi dan interdependensi"
                       "nilai guna"
                       "diferensiasi area"
                       "keterkaitan ruang"]
               salah (fn [x] (shuffle (filter #(not (= % x)) konsep)))]

           (merge
            (condp = tipe
              :a (merge {:pertanyaan (rand-nth lokasi)
                         :pb (konsep 0)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 0)))))
              :b (merge {:pertanyaan (rand-nth jarak)
                         :pb (konsep 1)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 1)))))
              :c (merge {:pertanyaan (rand-nth keterjangkauan)
                         :pb (konsep 2)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 2)))))
              :d (merge {:pertanyaan (rand-nth pola)
                         :pb (konsep 3)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 3)))))
              :e (merge {:pertanyaan (rand-nth morfologi)
                         :pb (konsep 4)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 4)))))
              :f (merge {:pertanyaan (rand-nth aglomerasi)
                         :pb (konsep 5)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 5)))))
              :g (merge {:pertanyaan (rand-nth interaksi)
                         :pb (konsep 6)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 6)))))
              :h (merge {:pertanyaan (rand-nth nilai-guna)
                         :pb (konsep 7)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 7)))))
              :i (merge {:pertanyaan (rand-nth difer-area)
                         :pb (konsep 8)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 8)))))
              :j (merge {:pertanyaan (rand-nth keterkaitan)
                         :pb (konsep 9)}
                        (zipmap [:p1 :p2 :p3] (shuffle (salah (konsep 9)))))))))

       (repeatedly 50)
       distinct
       shuffle
       (take 26)
       shuffle))

(defn komponen-peta-bagian-3-i []
  (->> (fn []
         (let [tipe (rand-nth [:a :b :c])
               soal (rand-nth ["Berikut ini yang merupakan fungsi dari"
                               "Salah satu fungsi dari"])
               komponen ["simbol"
                         "legenda"
                         "sumber dan tahun pembuatan peta"]
               pertanyaan-1 (str soal " " (komponen 0) " peta adalah ....")
               pertanyaan-2 (str soal " " (komponen 1) " peta adalah ....")
               pertanyaan-3 (str soal " " (komponen 2) " peta adalah ....")
               correct-answer [["mewakili kenampakan objek yang sebenarnya"
                                "mewakili kenampakan yang ada di permukaan bumi"
                                "memberikan tanda mengenai objek yang ingin dipetakan"
                                "memberikan tanda mengenai informasi yang ingin ditonjolkan pada peta"
                                "memberikan tanda pada peta untuk mewakili kenampakan yang ada di permukaan bumi"]
                               ["memberikan keterangan semua simbol yang ada pada peta"
                                "memberikan informasi penjelasan semua simbol yang ada pada peta agar lebih mudah dipahami"
                                "memberikan penjelasan mengenai keterangan simbol-simbol yang terdapat pada peta"
                                "memberikan keterangan lebih lanjut mengenai simbol-simbol yang ada pada peta"
                                "menjelaskan simbol-simbol yang tercantum pada peta"]
                               ["memberikan informasi tahun pembuatan peta"
                                "memberikan informasi mengenai data yang diperoleh dalam pembuatan peta"
                                "memberikan referensi data yang diperlukan dalam pembuatan peta"
                                "memberikan informasi tahun peta tersebut dibuat"
                                "memberikan keterangan mengenai data yang diperlukan dalam pembuatan peta"]]
               wrong-answer ["memberikan perbedaan objek pada peta"
                             "membedakan kenampakan suatu objek di permukaan bumi"
                             "mewakili kenampakan objek yang sebenarnya"
                             "mewakili kenampakan yang ada di permukaan bumi"
                             "memberikan tanda pada peta untuk mewakili kenampakan yang ada di permukaan bumi"
                             "mewakili kenampakan objek yang sebenarnya"
                             "mewakili kenampakan yang ada di permukaan bumi"
                             "memberikan informasi tingkatan dengan gradasi"
                             "memberikan informasi ketinggian dengan ketentuan yang sudah ditetapkan"
                             "memberikan informasi mengenai perbedaan kenampakan suatu objek"]
               salah-1 (concat wrong-answer (concat (correct-answer 1) (correct-answer 2)))
               salah-2 (concat wrong-answer (concat (correct-answer 0) (correct-answer 2)))
               salah-3 (concat wrong-answer (concat (correct-answer 0) (correct-answer 1)))
               pbhs-1 ["Simbol peta merupakan salah satu komponen penting dalam peta. Simbol peta bisa disebut juga sebagai tanda pada peta yang berfungsi untuk mewakili kenampakan objek di permukaan bumi yanh sebenarnya pada peta. Kenampakan objek tersebut meliputi kenampakan alami (sungai, danau, gunung, dan sebagainya) dan kenampakan buatan (gedung sekolah, rumah sakit, gedung pemerintah, dan lain-lain)."]
               pbhs-2 ["Legenda merupakan tabel atau daftar yang menunjukkan kumpulan simbol yang digunakan dalam peta. Kumpulan simbol tersebut biasanya disertai dengan warna dan deskripsi untuk memperjelas maksud dari simbol tersebut."]
               pbhs-3 ["Sumber peta berfungsi untuk menunjukkan kebenaran atau validitas data yang didasarkan kepada karya ilmiah atau lembaga resmi pembuat peta, misalnya mengenai lembaga penerbit peta seperti Badan Informasi Geospasial (BIG), Badan Geologi. Sumber peta tersebut umumnya disertai oleh pencantuman tahun pembuatan untuk memperlihatkan waktu pembuatan peta dan mengetahui masa kadaluwarsa peta."]]
         
         (merge
          (condp = tipe
            :a (merge {:pertanyaan pertanyaan-1
                       :pb (rand-nth (correct-answer 0))
                       :pembahasan (rand-nth pbhs-1)}
                      (zipmap [:p1 :p2 :p3] (shuffle salah-1)))
            :b (merge {:pertanyaan pertanyaan-2
                       :pb (rand-nth (correct-answer 1))
                       :pembahasan (rand-nth pbhs-2)}
                      (zipmap [:p1 :p2 :p3] (shuffle salah-2)))
            :c (merge {:pertanyaan pertanyaan-3
                       :pb (rand-nth (correct-answer 2))
                       :pembahasan (rand-nth pbhs-3)}
                      (zipmap [:p1 :p2 :p3] (shuffle salah-3)))))))
  
  (repeatedly 100)
  distinct
  shuffle
  (take 30)
  shuffle))

(defn jenis-jenis-peta []
  (->> (fn []
         (let [tipe (rand-nth [:a :b])
               soal (rand-nth ["Manakah di bawah ini yang termasuk ke dalam peta"
                               "Dari opsi-opsi berikut manakah yang merupakan contoh peta"])
               jenis [["umum"
                       "dasar"]
                      ["tematik"]]
               soal-1 (str soal " " (rand-nth (jenis 0)) "?")
               soal-2 (str soal " " (rand-nth (jenis 1)) "?")
               umum ["Peta Korografi"
                     "Peta Topografi Sumatra"
                     "Peta Wilayah"
                     "Peta Dunia"
                     "Peta Kontur Indonesia"
                     "Peta Rupa Bumi Indonesia"]
               tematik ["Peta Kepadatan Penduduk"
                        "Peta Tata Guna Lahan"
                        "Peta Sebaran Lokasi Pertambangan"
                        "Peta Kawasan Lindung"
                        "Peta Kawasan Budidaya"
                        "Peta Curah Hujan"
                        "Peta Sebaran Fauna Indonesia"]]
         
         (merge
          (condp = tipe
            :a (merge {:pertanyaan soal-1
                       :pb (rand-nth umum)}
                      (zipmap [:p1 :p2 :p3] (shuffle tematik)))
            :b (merge {:pertanyaan soal-2
                       :pb (rand-nth tematik)}
                      (zipmap [:p1 :p2 :p3] (shuffle umum)))))))
  
  (repeatedly 100)
  distinct
  shuffle
  (take 38)
  shuffle))

(defn generalisasi-dan-eksagerasi-peta []
  (->> (fn []
         (let [tipe (rand-nth [:a :b])
               benar [["Eksagerasi adalah proses untuk memilih kenampakan yang penting untuk ditonjolkan dalam peta."
                       "Eksagerasi dapat diartikan sebagai proses untuk memperjelas suatu objek dalam peta."
                       "Eksagerasi adalah teknik pembebasan dalam penyajian suatu unsur pada peta yang dihubungkan dengan ukuran sebenarnya dari suatu unsur dalam skala tertentu dari peta."
                       "Eksagerasi berfungsi untuk menonjolkan fitur-fitur tertentu untuk mempertahankan signifikansinya dalam pengurangan atau pembesaran skala."
                       "Eksagerasi ini penting untuk dilakukan jika fitur mendetail lainnya seperti bentuk halaman bangunan secara tidak sengaja disederhanakan atau hilang karena perubahan skala."]
                      ["benar"]]
               salah [["Eksagerasi diartikan sebagai proses untuk memperbesar skala pada peta."
                       "Eksagerasi diartikan sebagai proses untuk memperkecil skala pada peta."
                       "Eksagerasi adalah proses untuk menghilangkan beberapa unsur yang dianggap tidak terlalu penting dalam peta."
                       "Eksagerasi bukan merupakan bagian atau aspek dari generalisasi, melainkan sesuatu di luar generalisasi."
                       "Jika terdapat unsur yang terlalu kecil dan sulit untuk disajikan dengan detil yang cukup, maka unsur tersebut perlu disederhanakan dengan metode eksagerasi."]
                      ["salah"]]]
         (merge
          (condp = tipe
            :a {:pernyataan (rand-nth (benar 0))
                :pb (rand-nth (benar 1))
                :p1 (rand-nth (salah 1))}
            :b {:pernyataan (rand-nth (salah 0))
                :pb (rand-nth (salah 1))
                :p1 (rand-nth (benar 1))}))))
  (repeatedly 50)
  distinct
  shuffle
  (take 10)
  shuffle))

(defn apa-itu-peta-kontur []
  (->> (fn []
         (let [tipe (rand-nth [:1 :2 :3 :4 :5 :6 :7 :8])
               pengantar (rand-nth ["Perhatikan pernyataan-pernyataan berikut!"
                                    "Coba perhatikan beberapa opsi di bawah ini!"])
               soal (rand-nth ["Pernyataan yang sesuai untuk menggambarkan karakteristik garis kontur ditunjukkan oleh nomor …."
                               "Dari opsi-opsi di atas yang termasuk karakteristik atau aturan penggambaran garis kontur yang tepat adalah nomor ...."])
               benar ["Berbentuk kurva tertutup"
                      "Tidak bercabang"
                      "Tidak saling berpotongan"
                      "Semakin lebar jarak antara dua kontur semakin datar suatu daerah"
                      "Semakin rapat jarak antara dua kontur semakin terjal suatu daerah"
                      "Jika memotong sungai maka akan berbentuk V terbalik dengan arah ke hulu sungai"
                      "Jika memotong jalan maka akan berbentuk U ke arah lokasi yang lebih rendah"]
               benar1 (rand-nth benar)
               benar2 (rand-nth (remove #{benar1} benar))
               benar3 (rand-nth (remove #{benar1 benar2} benar))
               salah ["Semakin rapat jarak antargaris kontur semakin tinggi suatu daerah"
                      "Bercabang"
                      "Berpotongan"
                      "Semakin lebar jarak antara dua kontur semakin terjal suatu daerah"
                      "Semakin rapat jarak antara dua kontur semakin datar suatu daerah"
                      "Jika memotong sungai maka akan berbentuk U dengan arah ke hulu sungai"
                      "Jika memotong jalan maka akan berbentuk V terbalik ke arah lokasi yang lebih rendah"]
               salah1 (rand-nth salah)
               salah2 (rand-nth (remove #{salah1} salah))
               salah3 (rand-nth (remove #{salah1 salah2} salah))
               jawaban ["1 saja"
                        "2 saja"
                        "3 saja"
                        "1 dan 2"
                        "1 dan 3"
                        "2 dan 3"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [x] (shuffle (filter #(not (= % x)) jawaban)))]
         
         (merge
          (condp = tipe
            :1 (merge {:pengantar pengantar
                       :fakta1 benar1
                       :fakta2 salah2
                       :fakta3 salah3
                       :soal soal
                       :pb (jawaban 0)}
                      (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
            :2 (merge {:pengantar pengantar
                       :fakta1 salah1
                       :fakta2 benar2
                       :fakta3 salah3
                       :soal soal
                       :pb (jawaban 1)}
                      (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
            :3 (merge {:pengantar pengantar
                       :fakta1 salah1
                       :fakta2 salah2
                       :fakta3 benar3
                       :soal soal
                       :pb (jawaban 2)}
                      (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
            :4 (merge {:pengantar pengantar
                       :fakta1 benar1
                       :fakta2 benar2
                       :fakta3 salah3
                       :soal soal
                       :pb (jawaban 3)}
                      (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))
            :5 (merge {:pengantar pengantar
                       :fakta1 benar1
                       :fakta2 salah2
                       :fakta3 benar3
                       :soal soal
                       :pb (jawaban 4)}
                      (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 4)))))
            :6 (merge {:pengantar pengantar
                       :fakta1 salah1
                       :fakta2 benar2
                       :fakta3 benar3
                       :soal soal
                       :pb (jawaban 5)}
                      (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 5)))))
            :7 (merge {:pengantar pengantar
                       :fakta1 benar1
                       :fakta2 benar2
                       :fakta3 benar3
                       :soal soal
                       :pb (jawaban 6)}
                      (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 6)))))
            :8 (merge {:pengantar pengantar
                       :fakta1 salah1
                       :fakta2 salah2
                       :fakta3 salah3
                       :soal soal
                       :pb (jawaban 7)}
                      (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 7)))))))))
  
  (repeatedly 500)
  distinct
  shuffle
  (take 100)
  shuffle))

(defn menghitung-interval-kontur-pada-peta-kontur []
  (->> (fn []
         (let [tipe (rand-nth [:1 :2 :3 :4 :5 :6 :7 :8 :9 :10 :11])
               nama ["Harist"
                     "Hana"
                     "Aura"
                     "Dian"
                     "Ashari"
                     "Iman"
                     "Yoel"
                     "Yoga"]
               peta ["topografi"
                     "kontur"]
               jarak-peta [1 2 3 4 5 6 7 8 9 10]
               jarak-asli-0 (rand-nth (range 1 11))
               jarak-asli-1 (rand-nth (range 2 11 2))
               jarak-asli-2 (rand-nth (range 3 11 3))
               jarak-asli-3 (rand-nth (range 4 13 4))
               jarak-asli-4 (rand-nth (range 5 16 5))
               jarak-asli-5 (rand-nth (range 6 19 6))
               jarak-asli-6 (rand-nth (range 7 22 7))
               jarak-asli-7 (rand-nth (range 8 25 8))
               jarak-asli-8 (rand-nth (range 9 28 9))
               jarak-asli-9 (rand-nth (range 10 31 10))
               interval (rand-nth (range 50 501 25))
               pertanyaan-1 (rand-nth ["Berapa interval kontur pada peta tersebut?"
                                       "Peta tersebut mempunyai interval kontur sebesar ...."])
               pertanyaan-2 (rand-nth ["Skala pada peta tersebut adalah …."
                                       "Berapa skala peta tersebut?"])
               pengantar-2 (str (rand-nth nama) " mempunyai sebuah peta yang interval konturnya sebesar " interval " m.")]
         
         (merge
          (condp = tipe
            :1 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 0) " cm pada peta mewakili " jarak-asli-0 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-0 1000) (jarak-peta 0)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-0 1000) (jarak-peta 0)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-0 1000) (jarak-peta 0)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-0 1000) (jarak-peta 0)) 2000) 3)) " meter")}
            :2 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 1) " cm pada peta mewakili " jarak-asli-1 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-1 1000) (jarak-peta 1)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-1 1000) (jarak-peta 1)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-1 1000) (jarak-peta 1)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-1 1000) (jarak-peta 1)) 2000) 3)) " meter")}
            :3 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 2) " cm pada peta mewakili " jarak-asli-2 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-2 1000) (jarak-peta 2)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-2 1000) (jarak-peta 2)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-2 1000) (jarak-peta 2)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-2 1000) (jarak-peta 2)) 2000) 3)) " meter")}
            :4 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 3) " cm pada peta mewakili " jarak-asli-3 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-3 1000) (jarak-peta 3)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-3 1000) (jarak-peta 3)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-3 1000) (jarak-peta 3)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-3 1000) (jarak-peta 3)) 2000) 3)) " meter")}
            :5 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 4) " cm pada peta mewakili " jarak-asli-4 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-4 1000) (jarak-peta 4)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-4 1000) (jarak-peta 4)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-4 1000) (jarak-peta 4)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-4 1000) (jarak-peta 4)) 2000) 3)) " meter")}
            :6 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 5) " cm pada peta mewakili " jarak-asli-5 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-5 1000) (jarak-peta 5)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-5 1000) (jarak-peta 5)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-5 1000) (jarak-peta 5)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-5 1000) (jarak-peta 5)) 2000) 3)) " meter")}
            :7 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 6) " cm pada peta mewakili " jarak-asli-6 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-6 1000) (jarak-peta 6)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-6 1000) (jarak-peta 6)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-6 1000) (jarak-peta 6)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-6 1000) (jarak-peta 6)) 2000) 3)) " meter")}
            :8 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 7) " cm pada peta mewakili " jarak-asli-7 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-7 1000) (jarak-peta 7)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-7 1000) (jarak-peta 7)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-7 1000) (jarak-peta 7)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-7 1000) (jarak-peta 7)) 2000) 3)) " meter")}
            :9 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 8) " cm pada peta mewakili " jarak-asli-8 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-8 1000) (jarak-peta 8)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-8 1000) (jarak-peta 8)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-8 1000) (jarak-peta 8)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-8 1000) (jarak-peta 8)) 2000) 3)) " meter")}
            :10 {:pengantar (str (rand-nth nama) " mempunyai sebuah peta " (rand-nth peta) " yang setiap " (jarak-peta 9) " cm pada peta mewakili " jarak-asli-9 " km.")
                :pertanyaan pertanyaan-1
                :pb (str (float (/ (/ (* jarak-asli-9 1000) (jarak-peta 9)) 2000)) " meter")
                :p1 (str (float (/ (/ (* jarak-asli-9 1000) (jarak-peta 9)) 1000)) " meter")
                :p2 (str (float (/ (/ (* jarak-asli-9 1000) (jarak-peta 9)) 500)) " meter")
                :p3 (str (float (* (/ (/ (* jarak-asli-9 1000) (jarak-peta 9)) 2000) 3)) " meter")}
            :11 {:pengantar pengantar-2
                :pertanyaan pertanyaan-2
                :pb (/ 1 (* interval 2000))
                :p1 (* (/ 1 (* interval 2000)) 2)
                :p2 (* (/ 1 (* interval 2000)) 10)
                :p3 (* (/ 1 (* interval 2000)) 20)}))))
  (repeatedly 2000)
  distinct
  shuffle
  (take 200)
  shuffle))


