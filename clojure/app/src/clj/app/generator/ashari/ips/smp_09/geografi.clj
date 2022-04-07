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