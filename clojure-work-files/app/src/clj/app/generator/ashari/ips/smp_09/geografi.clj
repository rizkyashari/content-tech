(ns app.generator.ashari.ips.smp_09.geografi)

(defn benua-eropa []
  (->> (for [benar ["terletak pada 9º BB – 60º BT dan 35º LS – 80º LU"
                    "seluruh wilayahnya berada di luar wilayah tropis"
                    "iklim di wilayahnya adalah subtropis dan sedang"
                    "mengalami empat musim, yaitu musim semi, panas, gugur, dan dingin"
                    "luasnya mencapai 10.355.000 km2"
                    "berbatasan dengan Samudra Arktik di utara"
                    "berbatasan dengan Laut Tengah di selatan"
                    "berbatasan dengan Samudra Atlantik di barat"
                    "berbatasan dengan Benua Asia di timur"
                    "Laut Kaspia adalah salah satu batas antara Benua Eropa dan Benua Asia"
                    "Selat Dardanella adalah salah satu batas antara Benua Eropa dan Benua Asia"]
             pertanyaan ["Berikut ini yang merupakan karakteristik geografis Benua Eropa adalah ...."
                         "Kondisi geografis Benua Eropa salah satunya adalah ...."
                         "Manakah di bawah ini yang merupakan kondisi geografis Benua Eropa?"]
             pengantar ["Benua Eropa adalah salah satu benua di dunia yang dijuluki sebagai Benua Biru."
                        "Salah satu alasan Benua Eropa dijuluki sebagai Benua Biru adalah mayoritas penduduknya memiliki iris mata berwarna biru."
                        "Salah satu alasan Benua Eropa dijuluki sebagai benua biru adalah pada zaman dahulu banyak kerajaan terkenal berada di Benua Eropa sehingga dikenal adanya istilah darah biru (bangsawan)."
                        "Benua Eropa secara fisik sebenarnya menjadi satu daratan dengan Benua Asia, tetapi karena perbedaan budaya keduanya dianggap berbeda."
                        "Benua Eropa dan Benua Asia dipisahkan oleh sebuah pegunungan, yaitu Pegunungan Ural."]]
         (let [salah ["terletak pada 17º BB – 52º BT dan 35º LU – 34º LS"
                      "dilewati garis khatulistiwa"
                      "sebagian wilayahnya beriklim tropis"
                      "bagian paling utara dan paling selatan mulai memasuki zona iklim subtropis"
                      "luasnya mencapai 30.290.000 km2"
                      "berbatasan dengan Laut Tengah di utara"
                      "berbatasan dengan Samudra Hindia di selatan"
                      "berbatasan dengan Samudra Pasifik di barat"
                      "berbatasan dengan Samudra Hindia di timur"]]
           (merge
            {:head pengantar
             :soal pertanyaan
             :pb benar}
            (zipmap [:p1 :p2 :p3] (shuffle salah)))))
       distinct shuffle (take 100) shuffle))

(defn benua-afrika []
  (->> (for [benar ["terletak pada 17º BB - 52º BT dan 35º LU - 34º LS"
                    "dilewati garis khatulistiwa"
                    "sebagian wilayahnya beriklim tropis"
                    "bagian paling utara dan paling selatan mulai memasuki zona iklim subtropis"
                    "luasnya mencapai 30.290.000 km2"
                    "berbatasan dengan Laut Tengah di utara"
                    "berbatasan dengan Samudra Hindia di selatan"
                    "berbatasan dengan Samudra Atlantik di barat"
                    "berbatasan dengan Samudra Hindia di timur"]
             pertanyaan ["Berikut ini yang merupakan karakteristik geografis Benua Afrika adalah ...."
                         "Kondisi geografis Benua Afrika salah satunya adalah ...."
                         "Manakah di bawah ini yang merupakan kondisi geografis Benua Afrika?"]
             pengantar ["Benua Afrika adalah benua yang mayoritas penduduknya berkulit hitam serta memiliki beragam kondisi geografis lainnya."
                        "Benua Afrika merupakan benua yang dijuluki sebagai Benua Hitam yang memiliki beragam kondisi geografis."
                        "Benua Afrika adalah salah satu benua dengan kondisi geografis yang beragam."
                        "Benua Afrika dikenal sebagai rumah bagi banyak satwa liar yang khas, seperti singa afrika dan gajah afrika, serta memiliki kondisi geografis yang beragam."
                        "Benua Afrika memiliki puncak tertingginya, yaitu Kilimanjaro yang berketinggian 5.895 mdpl, serta memiliki beragam kondisi geografis lainnya."
                        "Benua Afrika memiliki bagian terendah, yaitu Danau Assal dengan elevasi 158 m di bawah permukaan laut, serta memiliki beragam kondisi geografis lainnya."
                        "Benua Afrika memiliki sungai terpanjang, yaitu Sungai Nil dengan panjang 6.650 km, serta memiliki beragam kondisi geografis lainnya."
                        "Benua Afrika mempunyai danau terbesar, yaitu Danau Victoria dengan luas sebesar 68.870 km2, serta memiliki beragam kondisi geografis lainnya."]]
         (let [salah ["terletak pada 9º BB - 60º BT dan 35º LS - 80º LU"
                      "seluruh wilayahnya berada di luar wilayah tropis"
                      "iklim di wilayahnya adalah subtropis dan sedang"
                      "mengalami empat musim, yaitu musim semi, panas, gugur, dan dingin"
                      "luasnya mencapai 10.355.000 km2"
                      "berbatasan dengan Samudra Arktik di utara"
                      "berbatasan dengan Laut Tengah di selatan"
                      "berbatasan dengan Samudra Pasifik di barat"
                      "berbatasan dengan Benua Asia di timur"
                      "Laut Kaspia adalah salah satu batas antara Benua Eropa dan Benua Asia"
                      "Selat Dardanella adalah salah satu batas antara Benua Eropa dan Benua Asia"]]
           (merge
            {:head pengantar
             :soal pertanyaan
             :pb benar}
            (zipmap [:p1 :p2 :p3] (shuffle salah)))))
       distinct shuffle (take 100) shuffle))

(defn jepang []
  (->> (for [benar ["terletak pada 30º LU – 47º LU dan 128º BT – 146º BT"
                    "terletak di barat laut Samudra Pasifik"
                    "berbatasan dengan Korea Utara, Korea Selatan, dan Rusia di barat"
                    "berbatasan dengan Laut Okhstosk di utara"
                    "berbatasan dengan Samudra Pasifik di timur"
                    "berbatasan dengan Laut Cina Timur dan Laut Filipina di selatan"
                    "memiliki iklim sedang"
                    "seluruh wilayahnya berada di luar khatulistiwa"
                    "memiliki wilayah dataran sekitar 30% dari luas wilayahnya"
                    "sekitar 70–80% wilayahnya terdiri atas pegunungan"
                    "terletak pada daerah perbatasan antara lempeng Benua Asia dan Lempeng Samudra Pasifik"
                    "memiliki sumber daya mineral yang sangat terbatas"
                    "sumber daya mineral yang cukup terpenuhi dari negaranya adalah belerang"
                    "tumbuhan yang dapat dijumpai di antaranya pohon ek, bambu, mapel, birch, beech, dan poplar"
                    "hewan yang dapat ditemui di antaranya babi hutan, monyet, serigala, dan rusa"
                    "memiliki penduduk sebesar 126,9 juta jiwa (WPDS, 2015)"
                    "memiliki angka kelahiran dan pertumbuhan penduduk relatif rendah"
                    "sebagian besar penduduknya bekerja di sektor industri"
                    "memiliki angka harapan hidup yang sangat tinggi, yakni sekitar 83 tahun (WPDS, 2015)"]
             pertanyaan ["Berikut ini yang merupakan kondisi geografis Negara Jepang adalah ...."
                         "Kondisi geografis Negara Jepang salah satunya adalah ...."
                         "Di bawah ini yang termasuk kondisi geografis Negara Jepang adalah ...."]
             pengantar ["Jepang merupakan salah satu negara industri dari Asia yang produknya merambah ke berbagai belahan dunia serta memiliki kondisi geografis yang beragam."
                        "Jepang adalah salah satu negara maju dari Asia yang ibukotanya berada di Tokyo serta memiliki beragam kondisi geografis lainnya."
                        "Jepang merupakan salah satu negara maju dari Asia dengan sistem pemerintahan Kerajaan Konstitusional yang memiliki beragam kondisi geografis."
                        "Jepang adalah salah satu negara yang dipimpin oleh seorang Kaisar sebagai kepala negaranya serta memiliki beragam kondisi geografis."
                        "Jepang adalah salah satu negara yang dipimpin oleh seorang Perdana Menteri sebagai kepala pemerintahannya serta memiliki beragam kondisi geografis."
                        "Jepang adalah negara bermata uang Yen di Asia yang memiliki beragam kondisi geografis."]]
         (let [salah ["terletak pada 6º LU – 11º LS dan 95º BT – 141º BT"
                      "terletak di barat laut Benua Australia"
                      "berbatasan dengan Samudra Hindia di barat"
                      "berbatasan dengan Laut Filipina di utara"
                      "berbatasan dengan Papua Nugini di timur"
                      "berbatasan dengan Australia di selatan"
                      "memiliki iklim tropis"
                      "seluruh wilayahnya berada di garis khatulistiwa"
                      "memiliki wilayah dataran sekitar 90% dari luas wilayahnya"
                      "sebagian besar wilayahnya terdiri atas dataran rendah"
                      "terletak pada daerah perbatasan antara lempeng Benua Asia dan Lempeng Samudra Hindia"
                      "memiliki sumber daya mineral yang sangat melimpah"
                      "sumber daya mineral yang cukup terpenuhi bagi negaranya adalah batubara"
                      "tumbuhan yang dapat dijumpai antara lain jati, sonokeling, merbau, sengon, cendana, trembesi, mahoni"
                      "hewan yang dapat ditemui di antaranya badak, anoa, cendrawasih, dan trenggiling"
                      "memiliki penduduk sebesar 238,5 juta jiwa (WPDS, 2015)"
                      "memiliki angka kelahiran dan pertumbuhan penduduk relatif tinggi"
                      "sebagian besar penduduknya bekerja di sektor pertanian"
                      "memiliki angka harapan hidup yang tinggi, yakni sekitar 76 tahun (WPDS, 2015)"]]
           (merge
            {:head pengantar
             :soal pertanyaan
             :pb benar}
            (zipmap [:p1 :p2 :p3] (shuffle salah)))))
       distinct shuffle (take 100) shuffle))

(defn cakep-nggak 
  []
  (->> (fn
         []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8])
               pengantar ["Coba perhatikan kondisi kecakepan beberapa orang di bawah ini!"
                          "Perhatikan opsi-opsi terkait kecakepan orang-orang di bawah ini!"
                          "Di bawah ini adalah opsi-opsi terkait kecakepan suatu orang."]
               benar ["Ashari ganteng"
                      "Thomas ganteng"
                      "Hari ganteng"
                      "Agung ganteng"
                      "Gita cantik"]
               benar1 (rand-nth benar)
               benar2 (rand-nth (remove #{benar1} benar))
               benar3 (rand-nth (remove #{benar1 benar2} benar))
               salah ["Ashari jelek"
                      "Thomas jelek"
                      "Hari jelek"
                      "Agung jelek"
                      "Gita jelek"]
               salah1 (rand-nth salah)
               salah2 (rand-nth (remove #{salah1} salah))
               salah3 (rand-nth (remove #{salah1 salah2} salah))
               soal ["Opsi yang benar adalah ...."
                     "Fakta yang benar adalah ...."
                     "Opsi yang nggak salah ialah ...."]
               jawaban ["semuanya benar"
                        "1 dan 3"
                        "1 dan 2"
                        "2 dan 3"
                        "3 saja"
                        "1 saja"
                        "2 saja"
                        "tidak ada"]]
       (merge {}
              (condp = type-soal
                :S1 {:pengantar (rand-nth pengantar)
                     :fakta1 benar1
                     :fakta2 benar2
                     :fakta3 benar3
                     :soal (rand-nth soal)
                     :pb (jawaban 0)
                     :p1 (rand-nth jawaban)
                     :p2 (rand-nth jawaban)
                     :p3 (rand-nth jawaban)}
                :S2 {:pengantar (rand-nth pengantar)
                     :fakta1 benar1
                     :fakta2 salah2
                     :fakta3 benar3
                     :soal (rand-nth soal)
                     :pb (jawaban 1)
                     :p1 (rand-nth jawaban)
                     :p2 (rand-nth jawaban)
                     :p3 (rand-nth jawaban)}
                :S3 {:pengantar (rand-nth pengantar)
                     :fakta1 benar1
                     :fakta2 benar2
                     :fakta3 salah3
                     :soal (rand-nth soal)
                     :pb (jawaban 2)
                     :p1 (rand-nth jawaban)
                     :p2 (rand-nth jawaban)
                     :p3 (rand-nth jawaban)}
                :S4 {:pengantar (rand-nth pengantar)
                     :fakta1 salah1
                     :fakta2 benar2
                     :fakta3 benar3
                     :soal (rand-nth soal)
                     :pb (jawaban 3)
                     :p1 (rand-nth jawaban)
                     :p2 (rand-nth jawaban)
                     :p3 (rand-nth jawaban)}
                :S5 {:pengantar (rand-nth pengantar)
                     :fakta1 salah1
                     :fakta2 salah2
                     :fakta3 benar3
                     :soal (rand-nth soal)
                     :pb (jawaban 4)
                     :p1 (rand-nth jawaban)
                     :p2 (rand-nth jawaban)
                     :p3 (rand-nth jawaban)}
                :S6 {:pengantar (rand-nth pengantar)
                     :fakta1 benar1
                     :fakta2 salah2
                     :fakta3 salah3
                     :soal (rand-nth soal)
                     :pb (jawaban 5)
                     :p1 (rand-nth jawaban)
                     :p2 (rand-nth jawaban)
                     :p3 (rand-nth jawaban)}
                :S7 {:pengantar (rand-nth pengantar)
                     :fakta1 salah1
                     :fakta2 benar2
                     :fakta3 salah3
                     :soal (rand-nth soal)
                     :pb (jawaban 6)
                     :p1 (rand-nth jawaban)
                     :p2 (rand-nth jawaban)
                     :p3 (rand-nth jawaban)}
                :S8 {:pengantar (rand-nth pengantar)
                     :fakta1 salah1
                     :fakta2 salah2
                     :fakta3 salah3
                     :soal (rand-nth soal)
                     :pb (jawaban 7)
                     :p1 (rand-nth jawaban)
                     :p2 (rand-nth jawaban)
                     :p3 (rand-nth jawaban)}))))
       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn mesir
  []
  (->> (fn
         []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5 :S6 :S7 :S8])
               pengantar ["Coba perhatikan kondisi geografis suatu negara di bawah ini!"
                          "Perhatikan opsi-opsi terkait karakteristik geografis suatu negara di bawah ini!"
                          "Di bawah ini adalah opsi-opsi terkait karakteristik geografis suatu negara."]
               Mesir ["Terletak pada 25º BT – 36º BT dan 22º LU – 32º LU."
                      "Ibukota negara ini adalah Kairo."
                      "Negara ini dipimpin oleh kepala negara yang disebut Presiden."
                      "Batas utara negara ini ialah Laut Mediterania."
                      "Batas selatan negara ini ialah Sudan."
                      "Batas barat negara ini adalah Libya."
                      "Batas timur negara ini ialah Laut Merah."
                      "Luasnya mencapai 1.500.000 km2."
                      "Sebagian besar wilayahnya adalah gumuk pasir atau gurun."
                      "Gurun yang terdapat di negaranya adalah Gurun Arabia dan Gurun Libya."
                      "Terdapat Semenanjung Sinai yang terdiri atas dataran tinggi dan pegunungan."
                      "Terdapat Lembah Sungai Nil yang merupakan dataran rendah yang sangat subur."
                      "Memiliki iklim subtropis dan gurun."
                      "Memiliki musim <i>hot summer</i> dan musim <i>mild winter</i>."
                      "Curah hujannya rata-rata 20-200 mm/tahun."
                      "Wilayah utaranya memiliki curah hujan yang lebih tinggi daripada wilayah tengah dan selatan."
                      "Sekitar 43% penduduknya tinggal di perkotaan."
                      "Sekitar 2/3 penduduknya tinggal di daerah delta dan lembah yang subur."
                      "Penduduknya dapat dibagi menjadi Orang Nubian, Hamit, dan Arab."
                      "Flora yang dapat dijumpai adalah pohon lontar, (<i>papyrus</i>), palma, kayu putih, dan akasia."
                      "Fauna yang umum dijumpai adalah domba, onta, dan keledai."]
               Mesir1 (rand-nth Mesir)
               Mesir2 (rand-nth (remove #{Mesir1} Mesir))
               Mesir3 (rand-nth (remove #{Mesir1 Mesir2} Mesir))
               nonMesir ["Terletak pada 8º BB – 2º BT dan 50º LU – 60º LU."
                         "Ibukota negara ini adalah Iskandariah."
                         "Negara ini dipimpin oleh kepala negara yang disebut Raja."
                         "Batas utara negara ini ialah Samudra Atlantik."
                         "Batas selatan negara ini ialah Selat English Channel."
                         "Batas barat negara ini adalah Irlandia dan Samudra Atlantik."
                         "Batas timur negara ini ialah Laut Utara."
                         "Luasnya mencapai 244.110 km2."
                         "Bagian utaranya adalah wilayah yang bergunung-gunung."
                         "Bagian timurnya merupakan dataran rendah yang bergelombang."
                         "Bagian selatannya adalah dataran rendah yang bergelombang."
                         "Memiliki iklim sedang."
                         "Memiliki iklim tropis dan laut."
                         "Memiliki iklim laut yang sejuk dan basah."
                         "Curah hujannya rata-rata 1000 mm/tahun."
                         "Pantai baratnya memiliki curah hujan yang lebih tinggi daripada pantai timurnya."
                         "Sekitar 80% penduduknya tinggal di perkotaan."
                         "Sekitar 1/3 penduduknya tinggal di daerah delta dan lembah yang subur."
                         "Penduduknya dapat dibagi menjadi Orang Eropa, Afrika, dan Asia."
                         "Flora yang dapat dijumpai adalah pohon ek dan elm, <i>horse chestnut</i>."
                         "Fauna yang masih banyak dijumpai adalah rusa merah, rajawali emas, dan belibis merah."]
               nonMesir1 (rand-nth nonMesir)
               nonMesir2 (rand-nth (remove #{nonMesir1} nonMesir))
               nonMesir3 (rand-nth (remove #{nonMesir1 nonMesir2} nonMesir))
               soal ["Dari beberapa opsi di atas, yang termasuk kondisi geografis Mesir adalah ...."
                     "Dari beberapa pernyataan di atas, yang termasuk kondisi geografis Mesir adalah ...."
                     "Manakah dari opsi-opsi di atas yang termasuk kondisi geografis Mesir?"]
               jawaban ["semuanya benar"
                        "1 dan 3"
                        "1 dan 2"
                        "2 dan 3"
                        "3 saja"
                        "1 saja"
                        "2 saja"
                        "tidak ada"]]
           (merge {}
                  (condp = type-soal
                    :S1 {:pengantar (rand-nth pengantar)
                         :fakta1 Mesir1
                         :fakta2 Mesir2
                         :fakta3 Mesir3
                         :soal (rand-nth soal)
                         :pb (jawaban 0)
                         :p1 (rand-nth jawaban)
                         :p2 (rand-nth jawaban)
                         :p3 (rand-nth jawaban)}
                    :S2 {:pengantar (rand-nth pengantar)
                         :fakta1 Mesir1
                         :fakta2 nonMesir2
                         :fakta3 Mesir3
                         :soal (rand-nth soal)
                         :pb (jawaban 1)
                         :p1 (rand-nth jawaban)
                         :p2 (rand-nth jawaban)
                         :p3 (rand-nth jawaban)}
                    :S3 {:pengantar (rand-nth pengantar)
                         :fakta1 Mesir1
                         :fakta2 Mesir2
                         :fakta3 nonMesir3
                         :soal (rand-nth soal)
                         :pb (jawaban 2)
                         :p1 (rand-nth jawaban)
                         :p2 (rand-nth jawaban)
                         :p3 (rand-nth jawaban)}
                    :S4 {:pengantar (rand-nth pengantar)
                         :fakta1 nonMesir1
                         :fakta2 Mesir2
                         :fakta3 Mesir3
                         :soal (rand-nth soal)
                         :pb (jawaban 3)
                         :p1 (rand-nth jawaban)
                         :p2 (rand-nth jawaban)
                         :p3 (rand-nth jawaban)}
                    :S5 {:pengantar (rand-nth pengantar)
                         :fakta1 nonMesir1
                         :fakta2 nonMesir2
                         :fakta3 Mesir3
                         :soal (rand-nth soal)
                         :pb (jawaban 4)
                         :p1 (rand-nth jawaban)
                         :p2 (rand-nth jawaban)
                         :p3 (rand-nth jawaban)}
                    :S6 {:pengantar (rand-nth pengantar)
                         :fakta1 Mesir1
                         :fakta2 nonMesir2
                         :fakta3 nonMesir3
                         :soal (rand-nth soal)
                         :pb (jawaban 5)
                         :p1 (rand-nth jawaban)
                         :p2 (rand-nth jawaban)
                         :p3 (rand-nth jawaban)}
                    :S7 {:pengantar (rand-nth pengantar)
                         :fakta1 nonMesir1
                         :fakta2 Mesir2
                         :fakta3 nonMesir3
                         :soal (rand-nth soal)
                         :pb (jawaban 6)
                         :p1 (rand-nth jawaban)
                         :p2 (rand-nth jawaban)
                         :p3 (rand-nth jawaban)}
                    :S8 {:pengantar (rand-nth pengantar)
                         :fakta1 nonMesir1
                         :fakta2 nonMesir2
                         :fakta3 nonMesir3
                         :soal (rand-nth soal)
                         :pb (jawaban 7)
                         :p1 (rand-nth jawaban)
                         :p2 (rand-nth jawaban)
                         :p3 (rand-nth jawaban)}))))
       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn pengertian-interaksi
  []
  (->> (fn
         []
         (let [type-soal (rand-nth [:S1 :S2])
               soal1 ["Di bawah ini yang merupakan definisi dari interaksi antarruang adalah ...."
                      "Definisi dari interaksi antarruang adalah ...."
                      "Pengertian dari interaksi antarruang adalah ...."
                      "Maksud dari interaksi antarruang adalah ...."
                      "Interaksi antarruang adalah ...."]
               soal2 ["Di bawah ini yang <u>bukan</u> merupakan definisi dari interaksi antarruang adalah ...."
                      "Definisi yang <u>salah</u> terkait interaksi antarruang adalah ...."
                      "Pengertian yang <u>salah</u> terkait interaksi antarruang adalah ...."
                      "Maksud yang <u>salah</u> terkait interaksi antarruang adalah ...."
                      "Di bawah ini yang merupakan definisi yang <u>salah</u> terkait interaksi antarruang adalah ...."]
               benar ["pergerakan sesuatu dari satu wilayah ke wilayah lain"
                      "pergeseran sesuatu dari satu wilayah ke wilayah lain"
                      "pergerakan sesuatu dari wilayah asal ke wilayah tujuan"
                      "pergeseran sesuatu dari wilayah asal ke wilayah tujuan"
                      "pergerakan orang, barang, atau informasi dari daerah asal menuju daerah tujuan"
                      "pergerakan informasi, barang, atau orang dari satu wilayah ke wilayah lain"
                      "pergeseran barang, orang, atau informasi dari wilayah asal ke wilayah tujuan"
                      "pergerakan sesuatu dari satu ruang ke ruang lain yang bersifat timbal balik dan mempengaruhi tingkah laku"
                      "pergeseran sesuatu dari satu wilayah ke wilayah lain yang bersifat timbal balik dan mempengaruhi tingkah laku"
                      "pergerakan barang, orang, atau informasi dari satu ruang ke ruang lain yang bersifat timbal balik dan mempengaruhi tingkah laku"]
               benar1 (rand-nth benar)
               benar2 (rand-nth (remove #{benar1} benar))
               benar3 (rand-nth (remove #{benar1 benar2} benar))
               salah ["pergerakan sesuatu yang terjadi di suatu tempat"
                      "pergerakan orang, barang, atau informasi yang terjadi di suatu wilayah"
                      "pergerakan sesuatu di suatu wilayah yang tidak ada timbal balik"
                      "pergeseran sesuatu di dalam suatu wilayah yang tidak mempengaruhi tingkah laku"
                      "pergerakan orang, barang, atau informasi di dalam suatu wilayah yang tidak ada timbal balik"
                      "pergeseran orang, barang, atau informasi di dalam suatu wilayah yang tidak mempengaruhi tingkah laku"
                      "pergerakan orang, barang, atau informasi dari satu wilayah ke wilayah lain yang tidak ada timbal balik"
                      "pergeseran orang, barang, atau informasi dari satu wilayah ke wilayah lain yang tidak mempengaruhi tingkah laku"
                      "pergerakan sesuatu dari wilayah asal ke wilayah tujuan yang tidak ada timbal balik"
                      "pergeseran sesuatu dari wilayah asal ke wilayah tujuan yang tidak mempengaruhi tingkah laku"]
               salah1 (rand-nth salah)
               salah2 (rand-nth (remove #{salah1} salah))
               salah3 (rand-nth (remove #{salah1 salah2} salah))]
               
               (merge {}
                      (condp = type-soal
                        :S1 {:soal (rand-nth soal1)
                             :pb (rand-nth benar)
                             :p1 salah1
                             :p2 salah2
                             :p3 salah3}
                        :S2 {:soal (rand-nth soal2)
                             :pb (rand-nth salah)
                             :p1 benar1
                             :p2 benar2
                             :p3 benar3}))))
          (repeatedly 400)
          distinct
          shuffle
          (take 100)
          shuffle))

(defn interaksi-antarruang
  []
  (->> (fn
         []
         (let [type-soal (rand-nth [:S1])
               soal ["Di bawah ini yang merupakan faktor pendorong terjadinya perpindahan penduduk dari desa ke kota di Asia adalah ...."
                     "Salah satu faktor pendorong terjadinya interaksi keruangan berupa perpindahan penduduk dari desa ke kota di Asia adalah ...."
                     "Faktor yang menyebabkan terjadinya perpindahan penduduk dari desa ke kota di Benua Asia salah satunya adalah ...."
                     "Salah satu faktor yang mendorong terjadinya interaksi keruangan antara desa dan kota di Benua Asia salah satunya adalah ...."
                     "Di bawah ini yang merupakan faktor pendorong interaksi keruangan antara desa dan kota di Asia adalah ...."]
               correct-ans ["perkembangan ekonomi yang lebih cepat di daerah perkotaan daripada di desa"
                            "banyaknya peluang kerja di daerah perkotaan daripada di desa"
                            "besarnya kesempatan berusaha di daerah perkotaan daripada di desa"
                            "semakin terbatasnya lapangan kerja di desa"
                            "adanya bencana alam yang mendorong masyarakat keluar dari desa"
                            "adanya konflik yang menyebabkan masyarakat harus pindah dari desa"
                            "adanya intrusi air laut ke wilayah permukiman sehingga mendorong masyarakat untuk pindah dari desa"
                            "kecilnya kesempatan berusaha di desa"
                            "terbentuknya gurun (<i>desertification</i>) di desa"
                            "perkembangan ekonomi yang lambat di daerah perdesaan"]
               wrong-ans ["kondisi perekonomian yang stabil baik di desa maupun di kota"
                          "banyaknya peluang kerja baik di desa maupun di kota"
                          "semakin meluasnya lapangan kerja baik di desa maupun di kota"
                          "kondisi desa dan kota yang aman dari bencana alam"
                          "kondisi desa dan kota yang aman dari konflik sosial"]
               wrong-ans1 (rand-nth wrong-ans)
               wrong-ans2 (rand-nth (remove #{wrong-ans1} wrong-ans))
               wrong-ans3 (rand-nth (remove #{wrong-ans1 wrong-ans2} wrong-ans))]

           (merge {}
                  (condp = type-soal
                    :S1 {:soal (rand-nth soal)
                         :pb (rand-nth correct-ans)
                         :p1 wrong-ans1
                         :p2 wrong-ans2
                         :p3 wrong-ans3}))))
       (repeatedly 1000)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn sdm-australia
  []
  (->> (fn
         []
         (let [type-soal (rand-nth [:S1 :S2])
               soal1 ["Di bawah ini yang merupakan fakta terkait dinamika kependudukan di Benua Australia adalah ...."
                      "Di bawah ini yang merupakan pernyataan yang benar terkait dinamika penduduk Benua Australia adalah ...."
                      "Opsi yang benar di bawah ini terkait dinamika penduduk di Benua Australia adalah ...."
                      "Salah satu opsi yang tepat di bawah ini terkait dinamika kependudukan di Benua Australia adalah ...."
                      "Salah satu pilihan jawaban yang benar terkait dinamika kependudukan di Benua Australia di bawah ini adalah ...."]
               soal2 ["Di bawah ini yang <b>bukan</b> merupakan fakta terkait dinamika kependudukan di Benua Australia adalah ...."
                      "Di bawah ini yang <b>bukan</b> merupakan pernyataan yang benar terkait dinamika penduduk Benua Australia adalah ...."
                      "Opsi yang <b>salah</b> di bawah ini terkait dinamika penduduk di Benua Australia adalah ...."
                      "Salah satu opsi yang <b>salah</b> di bawah ini terkait dinamika kependudukan di Benua Australia adalah ...."
                      "Salah satu pilihan jawaban yang <b>salah</b> terkait dinamika kependudukan di Benua Australia di bawah ini adalah ...."]
               correct-ans ["jumlah penduduknya mencapai 23,9 juta jiwa pada tahun 2015"
                            "sekitar 85% penduduknya tinggal di kota yang berada di tepi pantai"
                            "angka kelahiran penduduknya mencapai 13 per 1000 penduduk"
                            "angka kematian penduduknya mencapai 7 per 1000 penduduk"
                            "sering dijadikan sebagai negara tujuan para migran dari negara-negara konflik"
                            "migrasi neto Australia mencapai angka 8"
                            "laju pertumbuhan penduduknya mencapai 1,6% per tahun"
                            "kualitas hidup penduduk Australia sangat tinggi"
                            "angka harapan penduduknya tergolong tinggi"
                            "angka harapan penduduknya mencapai 82 tahun"
                            "penduduknya memiliki kondisi kesehatan yang baik"
                            "pendapatan penduduknya tergolong tinggi"
                            "penduduk aslinya adalah suku Aborigin"
                            "sebagian besar penduduknya adalah keturunan ras Kaukasoid"]
               correct-ans1 (rand-nth correct-ans)
               correct-ans2 (rand-nth (remove #{correct-ans1} correct-ans))
               correct-ans3 (rand-nth (remove #{correct-ans1 correct-ans2} correct-ans))
               wrong-ans ["jumlah penduduknya mencapai 267 juta jiwa pada tahun 2015"
                          "sekitar 85% penduduknya tinggal di kota yang berada di pedalaman"
                          "angka kelahiran penduduknya mencapai 7 per 1000 penduduk"
                          "angka kematian penduduknya mencapai 13 per 1000 penduduk"
                          "jarang dijadikan sebagai negara tujuan para migran dari negara-negara konflik"
                          "migrasi neto Australia mencapai angka -8"
                          "laju pertumbuhan penduduknya mencapai 0,16% setiap tahun"
                          "kualitas hidup penduduk Australia relatif rendah"
                          "angka harapan penduduknya tergolong sedang"
                          "angka harapan penduduknya mencapai 72 tahun"
                          "penduduknya memiliki kondisi kesehatan yang buruk"
                          "pendapatan penduduknya tergolong sedang"
                          "penduduk aslinya adalah suku Indian"
                          "sebagian besar penduduknya adalah keturunan ras Negroid"]
               wrong-ans1 (rand-nth wrong-ans)
               wrong-ans2 (rand-nth (remove #{wrong-ans1} wrong-ans))
               wrong-ans3 (rand-nth (remove #{wrong-ans1 wrong-ans2} wrong-ans))]
               
               (merge {}
                      (condp = type-soal
                        :S1 {:soal (rand-nth soal1)
                             :pb (rand-nth correct-ans)
                             :p1 wrong-ans1
                             :p2 wrong-ans2
                             :p3 wrong-ans3}
                        :S2 {:soal (rand-nth soal2)
                             :pb (rand-nth wrong-ans)
                             :p1 correct-ans1
                             :p2 correct-ans2
                             :p3 correct-ans3}))))
          (repeatedly 400)
          distinct
          shuffle
          (take 120)
          shuffle))

(defn ibukota-negara []
  (->> (fn
         []
         (let [negara ["Indonesia"
                       "Malaysia"
                       "Brunei Darussalam"
                       "Singapore"
                       "Thailand"]
               ibukota ["Nusantara"
                        "Kuala Lumpur"
                        "Bandar Seri Begawan"
                        "Singapore"
                        "Bangkok"]
               kota-lain ["Perth"
                          "Old York"
                          "Antarctic City"
                          "Rapture"
                          "Rockport"]
               X (rand-nth negara)
               Y (cond
                   (= X (negara 0)) (ibukota 0)
                   (= X (negara 1)) (ibukota 1)
                   (= X (negara 2)) (ibukota 2)
                   (= X (negara 3)) (ibukota 3)
                   (= X (negara 4)) (ibukota 4))
               salah (conj (filter #(not (= % Y)) ibukota) (rand-nth kota-lain))
               salah1 (rand-nth
                       (conj
                        (filter #(not (= % Y)) ibukota) (rand-nth kota-lain)))
               salah2 (rand-nth (remove #{salah1} salah))
               salah3 (rand-nth (remove #{salah1 salah2} salah))]
           {:soal X
            :pb Y
            :p1 salah1
            :p2 salah2
            :p3 salah3}))

       (repeatedly 100)
       distinct
       shuffle
       (take 100)
       shuffle))

(defn ibukota-negara []
  (->> (fn
         []
         (let [negara ["Indonesia"
                       "Malaysia"
                       "Brunei Darussalam"
                       "Singapore"
                       "Thailand"]
               ibukota ["Nusantara"
                        "Kuala Lumpur"
                        "Bandar Seri Begawan"
                        "Singapore"
                        "Bangkok"]
               kota-lain ["Perth"
                          "Old York"
                          "Antarctic City"
                          "Rapture"
                          "Rockport"]
               X (rand-nth negara)
               Y (cond
                   (= X (negara 0)) (ibukota 0)
                   (= X (negara 1)) (ibukota 1)
                   (= X (negara 2)) (ibukota 2)
                   (= X (negara 3)) (ibukota 3)
                   (= X (negara 4)) (ibukota 4))
               salah (conj (filter #(not (= % Y)) ibukota) (rand-nth kota-lain))]

           (merge
            {:soal (apply str "Ibukota negara " X " adalah ....")
             :pb Y}
            (zipmap [:p1 :p2 :p3] (shuffle salah)))))

       (repeatedly 100)
       distinct
       shuffle
       (take 50)
       shuffle))

(defn potensi-sda-australia []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4 :S5])
               pertanian [["Salah satu hasil pertanian utama yang dihasilkan di Benua Australia adalah ...."
                           "Hasil pertanian utama yang dihasilkan di Benua Australia salah satunya adalah ...."
                           "Contoh potensi pertanian utama yang dihasilkan di kawasan Benua Australia adalah ...."]
                          ["biji-bijian"
                           "buah-buahan"
                           "gula"]
                          ["barley"
                           "tembakau"
                           "terigu"]]
               perhutanan [["Salah satu hasil perhutanan utama yang dihasilkan di Benua Australia adalah ...."
                            "Hasil perhutanan utama yang dihasilkan di Benua Australia salah satunya adalah ...."
                            "Contoh potensi perhutanan utama yang dihasilkan di kawasan Benua Australia adalah ...."]
                           ["kayu potong"
                            "kayu panel"
                            "kertas"
                            "serpih kayu"
                            "<i>eucalyptus</i>"
                            "pinus"]
                           ["rotan"
                            "bambu"
                            "kapur barus"]]
               peternakan [["Salah satu hasil peternakan utama yang dihasilkan di Benua Australia adalah ...."
                            "Hasil peternakan utama yang dihasilkan di Benua Australia salah satunya adalah ...."
                            "Contoh potensi peternakan utama yang dihasilkan di kawasan Benua Australia adalah ...."]
                           ["wol"
                            "susu"
                            "daging"]
                           ["telur"
                            "kulit"
                            "cangkang"]]
               pertambangan [["Hasil pertambangan utama di Australia adalah ...."
                              "Salah satu bahan tambang utama yang terdapat di Australia adalah ...."
                              "Contoh potensi tambang utama di Australia adalah ...."]
                             ["opal"
                              "batubara"
                              "bijih besi"
                              "nikel"
                              "uranium"
                              "intan"]
                             ["mangan"
                              "krom"
                              "minyak bumi"
                              "gas alam"]]
               kelautan [["Salah satu hasil utama Benua Australia adalah ...."
                          "Contoh hasil laut utama yang dihasilkan di Australia adalah ...."]
                         ["lobster"
                          "udang"
                          "mutiara"]
                         ["ikan bandeng"
                          "ikan lele"
                          "ikan ringau"]]]

           (merge
            (condp = type-soal
              :S1 (merge {:soal (rand-nth (pertanian 0))
                          :pb (rand-nth (pertanian 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (pertanian 2))))
              :S2 (merge {:soal (rand-nth (perhutanan 0))
                          :pb (rand-nth (perhutanan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (perhutanan 2))))
              :S3 (merge {:soal (rand-nth (peternakan 0))
                          :pb (rand-nth (peternakan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (peternakan 2))))
              :S4 (merge {:soal (rand-nth (pertambangan 0))
                          :pb (rand-nth (pertambangan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (pertambangan 2))))
              :S5 (merge {:soal (rand-nth (kelautan 0))
                          :pb (rand-nth (kelautan 1))}
                         (zipmap [:p1 :p2 :p3] (shuffle (kelautan 2))))))))

       (repeatedly 100)
       distinct
       shuffle
       (take 60)
       (shuffle)))

(defn benua-asia-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan kondisi geografis Benua Asia adalah ...."
                                 "Di bawah ini yang merupakan kondisi geografis Benua Asia adalah ...."
                                 "Salah satu kondisi geografis Benua Asia adalah ...."
                                 "Kondisi geografis Benua Asia salah satunya adalah ...."
                                 "Yang termasuk kondisi geografis Benua Asia adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan kondisi geografis Benua Asia adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan kondisi geografis Benua Asia adalah ...."
                                 "Kondisi geografis Benua Asia adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Salah satu kondisi geografis Benua Asia adalah sebagai berikut, <b><i>kecuali</i></b> ...."
                                 "Yang termasuk kondisi geografis Benua Asia adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["terletak pada 26º BT – 170º BT dan 11º LS – 80º LU"
                      "hampir seluruh wilayahnya berada di belahan bumi utara (BBU)"
                      "hanya sebagian kecil yang berada di belahan bumi selatan"
                      "batas utara benua ini ialah Samudra Arktik"
                      "batas selatan benua ini ialah Samudra Hindia"
                      "batas barat benua ini adalah Benua Eropa"
                      "batas timur benua ini ialah Selat Bering dan Samudra Pasifik"
                      "benua ini merupakan benua terluas di permukaan bumi"
                      "luasnya mencapai 44.000.000 km2 atau seperempat luas wilayah daratan dunia"
                      "wilayahnya membentang dari Turki di bagian barat sampai Rusia di bagian timur"]
               salah ["terletak pada 170º BT – 35º BB dan 55º LS – 83º LU"
                      "benua ini sering juga disebut sebagai Benua Merah"
                      "terdapat suku Indian yang mendiami benua ini"
                      "batas utara benua ini ialah Samudra Atlantik"
                      "batas selatan benua ini ialah Samudra Atlantik"
                      "batas barat benua ini adalah Samudra Pasifik"
                      "batas timur benua ini ialah Samudra Atlantik"
                      "benua ini merupakan benua terluas kedua di permukaan bumi"
                      "luasnya mencapai 42.057.100 km2"
                      "wilayahnya membentang dari Alaska di bagian utara sampai Chile di bagian selatan"]]

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
       (take 100)
       shuffle))

(defn benua-amerika-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan kondisi geografis Benua Amerika adalah ...."
                                 "Di bawah ini yang merupakan kondisi geografis Benua Amerika adalah ...."
                                 "Salah satu kondisi geografis Benua Amerika adalah ...."
                                 "Kondisi geografis Benua Amerika salah satunya adalah ...."
                                 "Yang termasuk kondisi geografis Benua Amerika adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan kondisi geografis Benua Amerika adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan kondisi geografis Benua Amerika adalah ...."
                                 "Kondisi geografis Benua Amerika adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Salah satu kondisi geografis Benua Amerika adalah sebagai berikut, <b><i>kecuali</i></b> ...."
                                 "Yang termasuk kondisi geografis Benua Amerika adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["terletak pada 170º BT – 35º BB dan 55º LS – 83º LU"
                      "benua ini sering juga disebut sebagai Benua Merah"
                      "terdapat suku Indian yang mendiami benua ini"
                      "batas utara benua ini ialah Samudra Arktik"
                      "batas selatan benua ini ialah Samudra Atlantik"
                      "batas barat benua ini adalah Samudra Pasifik"
                      "batas timur benua ini ialah Samudra Atlantik"
                      "benua ini merupakan benua terluas kedua di permukaan bumi"
                      "luasnya mencapai 42.057.100 km2"
                      "wilayahnya membentang dari Alaska di bagian utara sampai Chile di bagian selatan"]
               salah ["terletak pada 26º BT – 170º BT dan 11º LS – 80º LU"
                      "hampir seluruh wilayahnya berada di belahan bumi utara (BBU)"
                      "hanya sebagian kecil yang berada di belahan bumi selatan"
                      "batas utara benua ini ialah Samudra Hindia"
                      "batas selatan benua ini ialah Samudra Hindia"
                      "batas barat benua ini adalah Benua Eropa"
                      "batas timur benua ini ialah Selat Bering dan Samudra Pasifik"
                      "benua ini merupakan benua terluas di permukaan bumi"
                      "luasnya mencapai 44.000.000 km2 atau seperempat luas wilayah daratan dunia"
                      "wilayahnya membentang dari Turki di bagian barat sampai Rusia di bagian timur"]]

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
       (take 100)
       shuffle))

(defn benua-eropa-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan kondisi geografis suatu benua di bawah ini!"
                                    "Perhatikan opsi-opsi terkait karakteristik geografis benua di bawah ini!"
                                    "Di bawah ini adalah opsi-opsi terkait karakteristik geografis suatu benua."])
               soal (rand-nth ["Dari beberapa opsi di atas, yang termasuk kondisi geografis Benua Eropa adalah ...."
                               "Dari beberapa pernyataan di atas, yang termasuk kondisi geografis Benua Eropa adalah ...."
                               "Manakah dari opsi-opsi di atas yang termasuk kondisi geografis Benua Eropa?"])
               eropa ["Terletak pada 9º BB – 60º BT dan 35º LS – 80º LU."
                      "Seluruh wilayahnya berada di luar wilayah tropis."
                      "Iklim di wilayahnya adalah subtropis dan sedang."
                      "Mengalami empat musim, yaitu musim semi, panas, gugur, dan dingin."
                      "Luasnya mencapai 10.355.000 km2."
                      "Berbatasan dengan Samudra Arktik di utara."
                      "Berbatasan dengan Laut Tengah di selatan."
                      "Berbatasan dengan Samudra Atlantik di barat."
                      "Berbatasan dengan Benua Asia di timur."
                      "Laut Kaspia adalah salah satu batas antara Benua Eropa dan Benua Asia."
                      "Selat Dardanella adalah salah satu batas antara Benua Eropa dan Benua Asia."]
               eropa-1 (rand-nth eropa)
               eropa-2 (rand-nth (remove #{eropa-1} eropa))
               non-eropa ["Terletak pada 17º BB – 52º BT dan 35º LU – 34º LS."
                          "Dilewati garis khatulistiwa."
                          "Sebagian wilayahnya beriklim tropis."
                          "Bagian paling utara dan paling selatan mulai memasuki zona iklim subtropis."
                          "Luasnya mencapai 30.290.000 km2."
                          "Berbatasan dengan Laut Tengah di utara."
                          "Berbatasan dengan Samudra Hindia di selatan."
                          "Berbatasan dengan Samudra Pasifik di barat."
                          "Berbatasan dengan Samudra Hindia di timur."]
               non-eropa-1 (rand-nth non-eropa)
               non-eropa-2 (rand-nth (remove #{non-eropa-1} non-eropa))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 eropa-1
                          :fakta2 non-eropa-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-eropa-1
                          :fakta2 eropa-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 eropa-1
                          :fakta2 eropa-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-eropa-1
                          :fakta2 non-eropa-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn benua-afrika-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan kondisi geografis suatu benua di bawah ini!"
                                    "Perhatikan opsi-opsi terkait karakteristik geografis benua di bawah ini!"
                                    "Di bawah ini adalah opsi-opsi terkait karakteristik geografis suatu benua."])
               soal (rand-nth ["Dari beberapa opsi di atas, yang termasuk kondisi geografis Benua Afrika adalah ...."
                               "Dari beberapa pernyataan di atas, yang termasuk kondisi geografis Benua Afrika adalah ...."
                               "Manakah dari opsi-opsi di atas yang termasuk kondisi geografis Benua Afrika?"])
               afrika ["Terletak pada 17º BB – 52º BT dan 35º LU – 34º LS."
                       "Dilewati garis khatulistiwa."
                       "Sebagian wilayahnya beriklim tropis."
                       "Bagian paling utara dan paling selatan mulai memasuki zona iklim subtropis."
                       "Luasnya mencapai 30.290.000 km2."
                       "Berbatasan dengan Laut Tengah di utara."
                       "Berbatasan dengan Samudra Hindia di selatan."
                       "Berbatasan dengan Samudra Atlantik di barat."
                       "Berbatasan dengan Samudra Hindia di timur."]
               afrika-1 (rand-nth afrika)
               afrika-2 (rand-nth (remove #{afrika-1} afrika))
               non-afrika ["Terletak pada 9º BB – 60º BT dan 35º LS – 80º LU."
                           "Seluruh wilayahnya berada di luar wilayah tropis."
                           "Iklim di wilayahnya adalah subtropis dan sedang."
                           "Mengalami empat musim, yaitu musim semi, panas, gugur, dan dingin."
                           "Luasnya mencapai 10.355.000 km2."
                           "Berbatasan dengan Samudra Arktik di utara."
                           "Berbatasan dengan Laut Tengah di selatan."
                           "Berbatasan dengan Samudra Pasifik di barat."
                           "Berbatasan dengan Benua Asia di timur."
                           "Laut Kaspia adalah salah satu batas antara Benua Eropa dan Benua Asia."
                           "Selat Dardanella adalah salah satu batas antara Benua Eropa dan Benua Asia."]
               non-afrika-1 (rand-nth non-afrika)
               non-afrika-2 (rand-nth (remove #{non-afrika-1} non-afrika))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 afrika-1
                          :fakta2 non-afrika-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-afrika-1
                          :fakta2 afrika-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 afrika-1
                          :fakta2 afrika-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-afrika-1
                          :fakta2 non-afrika-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn benua-australia-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2])
               soal-1 (rand-nth ["Berikut ini yang merupakan kondisi geografis Benua Australia adalah ...."
                                 "Di bawah ini yang merupakan kondisi geografis Benua Australia adalah ...."
                                 "Salah satu kondisi geografis Benua Australia adalah ...."
                                 "Kondisi geografis Benua Australia salah satunya adalah ...."
                                 "Yang termasuk kondisi geografis Benua Australia adalah ...."])
               soal-2 (rand-nth ["Berikut ini yang <b><i>bukan</i></b> merupakan kondisi geografis Benua Australia adalah ...."
                                 "Di bawah ini yang <b><i>bukan</i></b> merupakan kondisi geografis Benua Australia adalah ...."
                                 "Kondisi geografis Benua Australia adalah berikut ini, <b><i>kecuali</i></b> ...."
                                 "Salah satu kondisi geografis Benua Australia adalah sebagai berikut, <b><i>kecuali</i></b> ...."
                                 "Yang termasuk kondisi geografis Benua Australia adalah berikut ini, <b><i>kecuali</i></b> ...."])
               benar ["terletak pada 113º BT – 155º BT dan 10º LS – 43º LS"
                      "benua ini dikenal sebagai Benua Kanguru"
                      "terdapat suku Aborigin yang mendiami benua ini"
                      "batas utara benua ini ialah Laut Timor, Laut Arafuru, dan Selat Torres"
                      "batas selatan benua ini ialah Samudra Hindia"
                      "batas barat benua ini adalah Samudra Hindia"
                      "batas timur benua ini ialah Samudra Pasifik, Laut Tasman, dan Laut Coral"
                      "benua ini merupakan benua terkecil di permukaan bumi"
                      "luasnya mencapai 8.945.000 km2"
                      "hanya ada satu negara dalam satu benua"]
               salah ["terletak pada 26º BT – 170º BT dan 11º LS – 80º LU"
                      "hampir seluruh wilayahnya berada di belahan bumi utara (BBU)"
                      "hanya sebagian kecil yang berada di belahan bumi selatan"
                      "batas utara benua ini ialah Samudra Hindia"
                      "batas selatan benua ini ialah Samudra Hindia"
                      "batas barat benua ini adalah Benua Eropa"
                      "batas timur benua ini ialah Selat Bering dan Samudra Pasifik"
                      "benua ini merupakan benua terluas di permukaan bumi"
                      "luasnya mencapai 44.000.000 km2 atau seperempat luas wilayah daratan dunia"
                      "wilayahnya membentang dari Turki di bagian barat sampai Rusia di bagian timur"]]

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
       (take 100)
       shuffle))

(defn jepang-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan kondisi geografis suatu benua di bawah ini!"
                                    "Perhatikan opsi-opsi terkait karakteristik geografis benua di bawah ini!"
                                    "Di bawah ini adalah opsi-opsi terkait karakteristik geografis suatu benua."])
               soal (rand-nth ["Dari beberapa opsi di atas, yang termasuk kondisi geografis Jepang adalah ...."
                               "Dari beberapa pernyataan di atas, yang termasuk kondisi geografis Jepang adalah ...."
                               "Manakah dari opsi-opsi di atas yang termasuk kondisi geografis Jepang?"])
               jepang ["Terletak pada 30º LU – 47º LU dan 128º BT – 146º BT."
                       "Terletak di barat laut Samudra Pasifik."
                       "Berbatasan dengan Korea Utara, Korea Selatan, dan Rusia di barat."
                       "Berbatasan dengan Laut Okhstosk di utara."
                       "Berbatasan dengan Samudra Pasifik di timur."
                       "Berbatasan dengan Laut Cina Timur dan Laut Filipina di selatan."
                       "Memiliki iklim sedang."
                       "Seluruh wilayahnya berada di luar khatulistiwa."
                       "Memiliki wilayah dataran sekitar 30% dari luas wilayahnya."
                       "Sekitar 70–80% wilayahnya terdiri atas pegunungan."
                       "Terletak pada daerah perbatasan antara lempeng Benua Asia dan Lempeng Samudra Pasifik."
                       "Memiliki sumber daya mineral yang sangat terbatas."
                       "Sumber daya mineral yang cukup terpenuhi dari negaranya adalah belerang."
                       "Tumbuhan yang dapat dijumpai di antaranya pohon ek, bambu, mapel, birch, beech, dan poplar."
                       "Hewan yang dapat ditemui di antaranya babi hutan, monyet, serigala, dan rusa."
                       "Memiliki penduduk sebesar 126,9 juta jiwa (WPDS, 2015)."
                       "Memiliki angka kelahiran dan pertumbuhan penduduk relatif rendah."
                       "Sebagian besar penduduknya bekerja di sektor industri."
                       "Memiliki angka harapan hidup yang sangat tinggi, yakni sekitar 83 tahun (WPDS, 2015)."]
               jepang-1 (rand-nth jepang)
               jepang-2 (rand-nth (remove #{jepang-1} jepang))
               non-jepang ["Terletak pada 6º LU – 11º LS dan 95º BT – 141º BT."
                           "Terletak di barat laut Benua Australia."
                           "Berbatasan dengan Samudra Hindia di barat."
                           "Berbatasan dengan Laut Filipina di utara."
                           "Berbatasan dengan Papua Nugini di timur."
                           "Berbatasan dengan Australia di selatan."
                           "Memiliki iklim tropis."
                           "Seluruh wilayahnya berada di garis khatulistiwa."
                           "Memiliki wilayah dataran sekitar 90% dari luas wilayahnya."
                           "Sebagian besar wilayahnya terdiri atas dataran rendah."
                           "Terletak pada daerah perbatasan antara lempeng Benua Asia dan Lempeng Samudra Hindia."
                           "Memiliki sumber daya mineral yang sangat melimpah."
                           "Sumber daya mineral yang cukup terpenuhi bagi negaranya adalah batubara."
                           "Tumbuhan yang dapat dijumpai antara lain jati, sonokeling, merbau, sengon, cendana, trembesi, mahoni."
                           "Hewan yang dapat ditemui di antaranya badak, anoa, cendrawasih, dan trenggiling."
                           "Memiliki penduduk sebesar 238,5 juta jiwa (WPDS, 2015)."
                           "Memiliki angka kelahiran dan pertumbuhan penduduk relatif tinggi."
                           "Sebagian besar penduduknya bekerja di sektor pertanian."
                           "Memiliki angka harapan hidup yang tinggi, yakni sekitar 76 tahun (WPDS, 2015)."]
               non-jepang-1 (rand-nth non-jepang)
               non-jepang-2 (rand-nth (remove #{non-jepang-1} non-jepang))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 jepang-1
                          :fakta2 non-jepang-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-jepang-1
                          :fakta2 jepang-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 jepang-1
                          :fakta2 jepang-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-jepang-1
                          :fakta2 non-jepang-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn tiongkok-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan kondisi geografis suatu benua di bawah ini!"
                                    "Perhatikan opsi-opsi terkait karakteristik geografis benua di bawah ini!"
                                    "Di bawah ini adalah opsi-opsi terkait karakteristik geografis suatu benua."])
               soal (rand-nth ["Dari beberapa opsi di atas, yang termasuk kondisi geografis Jepang adalah ...."
                               "Dari beberapa pernyataan di atas, yang termasuk kondisi geografis Jepang adalah ...."
                               "Manakah dari opsi-opsi di atas yang termasuk kondisi geografis Jepang?"])
               tiongkok ["Terletak pada 18º LU – 54º LU dan 73º BT – 135º BT."
                         "Sebagian besar daratannya berhadapan dengan Samudra Pasifik dan Laut Cina Selatan."
                         "Berbatasan dengan Kirgiztan, India, dan Tajikistan di sebelah barat."
                         "Berbatasan dengan Rusia, Mongolia, dan Kazakstan di sebelah utara."
                         "Berbatasan dengan Korea Utara, Laut Kuning, Laut Cina Selatan, dan Laut Cina Timur di sebelah timur."
                         "Berbatasan dengan Vietnam, Laos, Myanmar, Bhutan, Nepal, dan India di sebelah selatan."
                         "Sebagian besar wilayahnya beriklim subtropis."
                         "Sebagian wilayahnya di selatan masuk ke dalam zona tropis."
                         "Luas wilayahnya terbesar ke-4 di dunia, yakni sekitar 9,59 juta km2."
                         "Wilayah bagian barat terdapat pegunungan yang tinggi yang merupakan sambungan dari Pegunungan Himalaya."
                         "Wilayah bagian utara terdapat gurun yang bernama Gurun Gobi."
                         "Wilayah bagian selatan terdiri atas Daerah Aliran Sungai (DAS) Yangtze, Plato Yunan, dan Lembah Szechuan."
                         "Wilayah bagian timur terdapat dataran rendah yang luas tempat sunga-sungai besar bermuara, seperti Sungai Huang Ho dan Sungai Yangtze."
                         "Hutannya terdiri dari berbagai jenis, seperti hutan hujan tropis, hutan berdaun lebar, hutan gugur, hutan campuran, hutan kayu keras, dan hutan berdaun jarum."
                         "Hewan khas yang dapat ditemui di antaranya panda raksasa, panda merah, salamander raksasa, dan dugong."
                         "Jumlah penduduknya sebesar 1,402 miliar jiwa (Bank Dunia, 2020)."
                         "Mayoritas penduduknya adalah suku Han."
                         "Wilayah yang jarang penduduknya adalah wilayah barat dan utara."
                         "Memiliki angka harapan hidup yang tinggi, yakni sekitar 77,3 tahun (Kantor Informasi Dewan Negara Tiongkok, 2019)."]
               tiongkok-1 (rand-nth tiongkok)
               tiongkok-2 (rand-nth (remove #{tiongkok-1} tiongkok))
               non-tiongkok ["Terletak pada 30º LU – 47º LU dan 128º BT – 146º BT."
                             "Sebagian besar daratannya berhadapan dengan Samudra Hindia dan Laut Cina Timur."
                             "Berbatasan dengan Korea Utara, Korea Selatan, dan Rusia di sebelah barat."
                             "Berbatasan dengan Laut Okhstosk dan Jepang di sebelah utara."
                             "Berbatasan dengan Samudra Pasifik dan Indonesia di sebelah timur."
                             "Berbatasan dengan Laut Cina Timur dan Filipina di sebelah selatan."
                             "Sebagian besar wilayahnya beriklim tropis."
                             "Sebagian wilayahnya di selatan masuk ke dalam zona subtropis."
                             "Luas wilayahnya terbesar ke-1 di dunia, yakni sekitar 17,1 juta km2."
                             "Wilayah bagian barat terdapat pegunungan yang tinggi yang merupakan sambungan dari Pegunungan Alpen."
                             "Wilayah bagian utara terdapat gurun yang bernama Gurun Sahara."
                             "Wilayah bagian selatan terdiri atas Daerah Aliran Sungai (DAS) Mekong, Plato Chuo, dan Lembah Szechuan."
                             "Wilayah bagian timur terdapat dataran rendah yang luas tempat sunga-sungai besar bermuara, seperti Sungai Mekong dan Sungai Chi."
                             "Hutannya terdiri dari beberapa jenis, seperti hutan hujan tropis, hutan bakau, hutan rawa, hutan sabana, dan hutan musim."
                             "Hewan yang khas dapat ditemui di antaranya babi hutan, monyet, serigala, dan rusa."
                             "Jumlah penduduknya sebesar 1,38 miliar jiwa (Bank Dunia, 2020)."
                             "Mayoritas penduduknya adalah suku Yamato."
                             "Wilayah yang jarang penduduknya adalah wilayah timur dan selatan."
                             "Memiliki angka harapan hidup yang sangat tinggi, yakni sekitar 83 tahun (Kantor Informasi Dewan Negara Tiongkok, 2019)."]
               non-tiongkok-1 (rand-nth non-tiongkok)
               non-tiongkok-2 (rand-nth (remove #{non-tiongkok-1} non-tiongkok))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 tiongkok-1
                          :fakta2 non-tiongkok-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-tiongkok-1
                          :fakta2 tiongkok-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 tiongkok-1
                          :fakta2 tiongkok-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-tiongkok-1
                          :fakta2 non-tiongkok-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn amerika-serikat-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan kondisi geografis suatu benua di bawah ini!"
                                    "Perhatikan opsi-opsi terkait karakteristik geografis benua di bawah ini!"
                                    "Di bawah ini adalah opsi-opsi terkait karakteristik geografis suatu benua."])
               soal (rand-nth ["Dari beberapa opsi di atas, yang termasuk kondisi geografis Jepang adalah ...."
                               "Dari beberapa pernyataan di atas, yang termasuk kondisi geografis Jepang adalah ...."
                               "Manakah dari opsi-opsi di atas yang termasuk kondisi geografis Jepang?"])
               amerika-serikat ["Terletak pada 24º LU – 70º LU dan 172º BB – 67º BB."
                                "Sebagian besar daratannya berhadapan dengan Samudra Pasifik di barat dan Samudra Atlantik di timur."
                                "Berbatasan dengan Samudra Pasifik di sebelah barat."
                                "Berbatasan dengan Kanada di sebelah utara."
                                "Berbatasan dengan Samudra Atlantik di sebelah timur."
                                "Berbatasan dengan Meksiko, Teluk Meksiko, dan Kuba di sebelah selatan."
                                "Memiliki iklim yang sangat bervariasi."
                                "Memiliki curah hujan yang sangat bervariasi."
                                "Luas wilayahnya terbesar ke-3 di dunia, yakni sekitar 9,83 juta km2."
                                "Wilayah bagian barat terdapat rangkaian Pegunungan Rocky."
                                "Di bagian tengah terdapat dataran yang sangat luas bernama Great Plains."
                                "Memiliki dataran pantai barat yang sempit yang menghadap ke Samudra Pasifik."
                                "Wilayah bagian timur terdapat rangkaian Pegunungan Appalachia."
                                "Kaya sumber daya geologi seperti minyak bumi, batubara, tembaga, fosfat, dan besi."
                                "Di bagian utara banyak ditumbuhi pohon pinus."
                                "Di bagian tengah terdapat padang rumput yang luas."
                                "Di bagian tenggara terdapat hutan yang menggugurkan daunnya setiap tahun."
                                "Memiliki jenis fauna antara lain bison, antelop, dan beruang di kawasan Midwest."
                                "Memiliki jenis fauna seperti puma di kawasan pesisir pasifik."
                                "Memiliki jenis fauna seperti armadilo, selot, dan jaguar di kawasan barat daya."
                                "Memiliki jenis fauna seperti opossum, aligator, dan buaya kardinal di kawasan selatan."
                                "Penduduk aslinya adalah Suku Indian."
                                "Sebagian besar penduduknya bekerja di luar sektor pertanian."]
               amerika-serikat-1 (rand-nth amerika-serikat)
               amerika-serikat-2 (rand-nth (remove #{amerika-serikat-1} amerika-serikat))
               non-amerika-serikat ["Terletak pada 18º LU – 54º LU dan 73º BT – 135º BT."
                                    "Sebagian besar daratannya berhadapan dengan Samudra Pasifik di timur dan Samudra Atlantik di barat."
                                    "Berbatasan dengan Samudra Atlantik di sebelah barat."
                                    "Berbatasan dengan Greenland di sebelah utara."
                                    "Berbatasan dengan Samudra Pasifik di sebelah timur."
                                    "Berbatasan dengan Meksiko, Jamaika, dan Haiti di sebelah selatan."
                                    "Sebagian besar wilayahnya beriklim subtropis."
                                    "Memiliki curah hujan yang sangat rendah."
                                    "Luas wilayahnya terbesar ke-4 di dunia, yakni sekitar 9,59 juta km2."
                                    "Wilayah bagian barat terdapat rangkaian Pegunungan Appalachia."
                                    "Di bagian tengah terdapat dataran yang sempit bernama Seattle."
                                    "Memiliki dataran pantai barat yang luas yang menghadap ke Samudra Atlantik."
                                    "Wilayah bagian timur terdapat rangkaian Pegunungan Rocky."
                                    "Miskin sumber daya mineral dan energi."
                                    "Di bagian utara banyak ditumbuhi padang rumput."
                                    "Di bagian tengah terdapat hutan pinus yang luas."
                                    "Di bagian tenggara terdapat hutan hujan tropis."
                                    "Memiliki jenis fauna seperti puma di kawasan Midwest."
                                    "Memiliki jenis fauna seperti bison, antelop, dan beruang di kawasan pesisir pasifik."
                                    "Memiliki jenis fauna seperti opossum, aligator, dan buaya kardinal di kawasan barat daya."
                                    "Memiliki jenis fauna seperti armadilo, selot, dan jaguar di kawasan selatan."
                                    "Penduduk aslinya adalah Suku Aborigin."
                                    "Sebagian besar penduduknya bekerja di sektor pertanian."]
               non-amerika-serikat-1 (rand-nth non-amerika-serikat)
               non-amerika-serikat-2 (rand-nth (remove #{non-amerika-serikat-1} non-amerika-serikat))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 amerika-serikat-1
                          :fakta2 non-amerika-serikat-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-amerika-serikat-1
                          :fakta2 amerika-serikat-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 amerika-serikat-1
                          :fakta2 amerika-serikat-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-amerika-serikat-1
                          :fakta2 non-amerika-serikat-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))

(defn brasil-2 []
  (->> (fn []
         (let [type-soal (rand-nth [:S1 :S2 :S3 :S4])
               pengantar (rand-nth ["Coba perhatikan kondisi geografis suatu benua di bawah ini!"
                                    "Perhatikan opsi-opsi terkait karakteristik geografis benua di bawah ini!"
                                    "Di bawah ini adalah opsi-opsi terkait karakteristik geografis suatu benua."])
               soal (rand-nth ["Dari beberapa opsi di atas, yang termasuk kondisi geografis Jepang adalah ...."
                               "Dari beberapa pernyataan di atas, yang termasuk kondisi geografis Jepang adalah ...."
                               "Manakah dari opsi-opsi di atas yang termasuk kondisi geografis Jepang?"])
               brasil ["Terletak pada 5º LU – 34º LS dan 47º BB – 74º BB."
                       "Sebagian besar daratannya berhadapan dengan Samudra Atlantik."
                       "Berbatasan dengan Peru dan Bolivia di sebelah barat."
                       "Berbatasan dengan Samudra Atlantik, Guyana, Suriname, Venezuela, dan Kolombia di sebelah utara."
                       "Berbatasan dengan Samudra Atlantik di sebelah timur."
                       "Berbatasan dengan Paraguay, Uruguay, dan Argentina di sebelah selatan."
                       "Sebagian besar wilayahnya beriklim tropis."
                       "Sebagian kecil wilayahnya di selatan beriklim subtropis."
                       "Sebagian kecil wilayahnya di timur beriklim kering."
                       "Wilayah bagian timur dan tengah terdapat Dataran Tinggi Brasilia."
                       "Di sebelah utara Lembah Amazon terdapat Dataran Tinggi Guyana."
                       "Di sebelah selatan Lembah Amazon terdapat Dataran Tinggi Brasilia."
                       "Wilayah bagian timur terdapat Lembah Parana-Paraguay yang sempit."
                       "Memiliki hutan terkenal, yakni Hutan Amazon dengan tingkat keberagaman flora yang tinggi."
                       "Memiliki fauna khas seperti jaguar hitam, ikan piranha, anaconda, dan katak kaca."
                       "Mayoritas penduduknya adalah keturunan Portugis."
                       "Penduduknya menggunakan bahasa Portugis sebagai bahasa resmi."]
               brasil-1 (rand-nth brasil)
               brasil-2 (rand-nth (remove #{brasil-1} brasil))
               non-brasil ["Terletak pada 24º LU – 70º LU dan 172º BB – 67º BB."
                           "Sebagian besar daratannya berhadapan dengan Samudra Pasifik."
                           "Berbatasan dengan Meksiko dan Argentina di sebelah barat."
                           "Berbatasan dengan Samudra Pasifik, Haiti, Suriname, Venezuela, dan Kolombia di sebelah utara."
                           "Berbatasan dengan Samudra Pasifik di sebelah timur."
                           "Berbatasan dengan Venezuela, Kolombia, dan Peru di sebelah selatan."
                           "Sebagian besar wilayahnya beriklim subtropis."
                           "Sebagian kecil wilayahnya di selatan beriklim kering."
                           "Sebagian kecil wilayahnya di timur beriklim dingin."
                           "Wilayah bagian timur dan tengah terdapat Dataran Tinggi Great Plains."
                           "Di sebelah utara Lembah Amazon terdapat Dataran Tinggi Brasilia."
                           "Di sebelah selatan Lembah Amazon terdapat Dataran Tinggi Guyana."
                           "Wilayah bagian timur terdapat rangkaian Pegunungan Appalachia."
                           "Memiliki hutan terkenal, yakni Hutan Black Forest dengan tingkat keberagaman flora yang tinggi."
                           "Memiliki jenis fauna khas seperti puma, anoa, cendrawasih, dan komodo."
                           "Mayoritas penduduknya adalah keturunan Inggris."
                           "Penduduknya menggunakan bahasa Spanyol sebagai bahasa resmi."]
               non-brasil-1 (rand-nth non-brasil)
               non-brasil-2 (rand-nth (remove #{non-brasil-1} non-brasil))
               jawaban ["1 saja"
                        "2 saja"
                        "semuanya"
                        "tidak ada"]
               wrong (fn [z] (shuffle (filter #(not (= % z)) jawaban)))]

           (merge
            (condp = type-soal
              :S1 (merge {:pengantar pengantar
                          :fakta1 brasil-1
                          :fakta2 non-brasil-2
                          :soal soal
                          :pb (jawaban 0)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 0)))))
              :S2 (merge {:pengantar pengantar
                          :fakta1 non-brasil-1
                          :fakta2 brasil-2
                          :soal soal
                          :pb (jawaban 1)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 1)))))
              :S3 (merge {:pengantar pengantar
                          :fakta1 brasil-1
                          :fakta2 brasil-2
                          :soal soal
                          :pb (jawaban 2)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 2)))))
              :S4 (merge {:pengantar pengantar
                          :fakta1 non-brasil-1
                          :fakta2 non-brasil-2
                          :soal soal
                          :pb (jawaban 3)}
                         (zipmap [:p1 :p2 :p3] (shuffle (wrong (jawaban 3)))))))))

       (repeatedly 1000)
       distinct
       shuffle
       (take 300)
       shuffle))