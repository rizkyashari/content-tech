(ns app.generator.cania.logic
  (:require [clojure.string :as cs]))

(defn logic-001
  []
  (->> (for [a ["menjadi presiden" "menjadi pacar dia" "menjadi miss universe" "pulang kampung" "diterima di kampus impian"
                "menjadi pesulap" "menjadi penyanyi" "naik pesawat"
                "menjual sepeda" "membeli ikan cupang" "menikahi dia" "mendapatkan kulit ayam KFC gratis"]
             b ["berkulit hijau" "fans Kpop" "jago masak" "jago matematika"
                "suka nonton sinetron" "suka nonton FTV" "pernah bolos sekolah"
                "tidak pernah bohong" "makan buburnya diaduk"]
             c ["tidak pernah masuk angin" "memiliki tinggi badan 160 cm atau lebih" "tidak pernah mutusin orang dengan alasan mau fokus UN"
                "tidak tertarik dengan drakor"  "lahir di bulan Januari" "berusia 60 tahun atau lebih"
                "tidak pernah mendorong pintu bertuliskan pull" "tidak pernah sen kiri belok kanan" "tidak pernah sen kanan belok kiri"]
             x ["Oncom" "Ucup" "Maimunah" "Cendol" "Mamad" "Memed" "Hantu" "Unyil" "Momos" "Jon" "Mbakyul" "Squidward" "Nobita"]]
         {:a a :b b :c c :x x})
       shuffle
       (take 200)))

(defn logic-002
  []
  (->> (for [a ["menjadi presiden" "menjadi pacar dia" "menjadi miss universe" "pulang kampung" "diterima di kampus impian"
                "menjadi pesulap" "menjadi penyanyi" "naik pesawat"
                "menjual sepeda" "membeli ikan cupang" "menikahi dia" "mendapatkan kulit ayam KFC gratis"]
             c ["berkulit hijau" "pernah masuk angin" "jago masak" "jago matematika"
                "suka nonton sinetron" "suka nonton FTV" "pernah bolos sekolah"
                "selalu jujur" "suka makan bubur diaduk" "fans Kpop" "lahir di bulan Januari"]
             b ["memiliki tinggi badan 160 cm atau lebih" "pernah mutusin orang dengan alasan mau fokus UN"
                "berusia 60 tahun atau lebih" "tertarik dengan drakor" "pernah mendorong pintu bertuliskan pull"
                "pernah sen kiri belok kanan" "pernah sen kanan belok kiri"]
             x ["Oncom" "Ucup" "Maimunah" "Cendol" "Mamad" "Memed" "Hantu" "Unyil" "Momos" "Jon" "Mbakyul" "Squidward" "Nobita"]]
         {:a a :b b :c c :x x})
       shuffle
       (take 200)))

(defn logic-003
  []
  (->> (for [a ["menjadi gubernur" "menjadi pujaannya" "menjadi pahlawan" "pulang kampung" "diterima di ITB"
                "menjadi peternak" "menjadi orang terkenal" "naik kereta"
                "menjual cilok" "membeli rumah" "menjadi cinta sejatinya" "mendapatkan cintanya"]
             b ["tidak pernah menarik pintu bertuliskan push" "suka makan telur puyuh" "pernah ditilang polisi"
                "hafal lirik lagu Taylor Swift" "tidak pernah mutusin orang dengan alasan mau fokus UN"
                "lahir di bulan Desember" "pernah patah hati" "tidak pernah bohong" "tidak pernah memberikan harapan palsu" "punya 5 mantan atau lebih"]
             c ["setia" "pernah diputusin" "mudah baper" "mudah rindu" "berkaki lima" "memiliki rambut" "jago main bola" "jago fisika"
                "fans Black Pink" "suka Harry Potter" "bisa berenang"]
             x ["Suneo" "Sarkonah" "Bon Jovi" "Kecoa" "Pejantan Tangguh" "Mawar" "Melati" "Delima"
                "Rangga" "Momos" "Zenia" "Kelinci" "Pegasus"]]
         {:a a :b b :c c :x x})
       shuffle
       (take 200)))

(defn logic-004
  []
  (->> (for [a ["menjadi gubernur" "menjadi pujaannya" "menjadi pahlawan" "pulang kampung" "diterima di ITB" "diterima di UI"
                "menjadi peternak" "menjadi orang terkenal" "naik kereta" "menjadi Miss Indonesia"
                "menjadi artis Hollywood" "menjual cilok" "membeli rumah" "menjadi cinta sejatinya" "mendapatkan cintanya"]
             b ["setia" "mudah baper" "mudah rindu" "suka Harry Potter" "pernah diputusin" "pernah patah hati"
                "suka sate" "suka ketoprak" "punya karya" "punya becak"]
             c ["berkaki lima" "memiliki rambut" "jago main bola" "jago fisika" "fans Black Pink" "pernah ditilang"
                "takut badut" "phobia cicak" "hobi masak" "punya sepeda" "murah hati" "mempesona"]
             d ["tulus" "penuh cinta" "bucin" "suka menari" "jago main gitar" "pernah ditilang" "sayang ibu" "sayang ayah"]
             e ["pernah galau" "jago bikin meme" "hobi berenang" "sedikit bandel" "tidak merokok" "suka bubur diaduk"]
             x ["Suneo" "Sarkonah" "Bon Jovi" "Kecoa" "Pejantan Tangguh" "Mawar" "Melati" "Delima"
                "Rangga" "Momos" "Zenia" "Kelinci" "Pegasus" "Rosalinda" "Marimar" "Fernando" "Pablo"]]
         {:a a :b b :c c :x x :d d :e e})
       shuffle
       (take 200)))

(defn logic-005
  []
  (->> (for [a ["menjadi gubernur" "menjadi pujaannya" "menjadi pahlawan" "pulang kampung" "diterima di ITB" "diterima di UI"
                "menjadi peternak" "menjadi Miss Indonesia"
                "menjadi artis Hollywood" "menjual cilok" "membeli rumah" "menjadi cinta sejatinya" "mendapatkan cintanya"]
             b ["setia" "mudah baper" "mudah rindu" "suka Harry Potter" "pernah diputusin" "pernah patah hati"
                "suka sate" "suka ketoprak" "punya karya" "punya becak"]
             c ["berkaki lima" "memiliki rambut" "jago main bola" "jago fisika" "fans Black Pink" "pernah ditilang"
                "takut badut" "phobia cicak" "hobi masak" "punya sepeda" "murah hati" "mempesona"]
             d ["tulus" "penuh cinta" "bucin" "suka menari" "jago main gitar" "pernah ditilang" "sayang ibu" "sayang ayah"]
             e ["pernah galau" "jago bikin meme" "hobi berenang" "sedikit bandel" "tidak merokok" "suka bubur diaduk"]
             x ["Suneo" "Sarkonah" "Bon Jovi" "Kecoa" "Pejantan Tangguh" "Mawar" "Melati" "Delima"
                "Rangga" "Momos" "Zenia"  "Marimar" "Fernando" "Pablo"]]
         {:a a :b b :c c :x x :d d :e e})
       shuffle
       (take 200)))

(defn logic-006
  []
  (->> (for [a ["menjadi pengusaha" "menjadi pujaannya" "menjadi Superman" "merantau" "diterima di UGM" "naik gaji"
                "menjadi atlet renang" "menjadi ilmuwan" "menjadi pasangannya" "menjadi pendamping hidupnya"
                "menjadi anggota DPR" "menjadi cinta sejatinya" "memenangkan hatinya"]
             b ["seksi" "cerdas" "mudah rindu" "nonton Game of Thrones" "pernah bertepuk sebelah tangan" "sabar"
                "penyayang" "suka Shaburi" "suka nasi padang" "hobi nonton" "punya voucher MAP"]
             c ["bisa main piano" "suka warna merah" "jago main biola" "jago ngoding" "fans BTS" "pernah naksir sahabat"
                "takut kecoa""hobi main game" "punya gitar" "murah hati" "suka drakor"]
             d ["penyabar" "penuh cinta" "bucin" "sering berlayar" "pernah ke Jepang" "suka kerupuk" "punya adik" "bisa berenang"]
             e ["pernah patah hati" "jago bikin meme" "hobi bersepeda" "sedikit bandel" "punya 1000 followers" "suka gado-gado"]
             x ["Bon Jovi" "Fernando" "Pablo" "Senja" "Juan" "Isabella" "Pedro" "Ana" "Santiago" "Javier" "Esmeralda"]]
         {:a a :b b :c c :x x :d d :e e})

       shuffle
       (take 200)))

(defn logic-007
  []
  (->> (for [a ["setan" "roh jahat" "jiwa penjahat" "bisikan iblis" "dorongan setan" "sisi gelap" "sisi jahat"
                "jiwa kegelapan" "bisikan setan" "iblis" "dorongan berbuat buruk"]
             b ["waktu bikin dosa" "waktu bikin kejahatan" "waktu ngelakuin kejahatan" "momen jatuh dalem dosa"
                "kesempatan bikin dosa" "saat ngelakuin kejahatan" "kesempatan ngejahatin orang" "waktu khilaf"
                "kesempatan khilaf" "momen lepas kontrol"]]
         {:a a :b b})

       shuffle
       (take 150)))

(defn logic-008
  []
  (->> (for [a ["astronot" "guru" "ilmuwan" "kelinci" "penyanyi" "programmer" "pujangga" "penyair" "polisi" "kucing" "selebgram" "atlet"]
             b ["orang" "manusia" "mamalia" "makhluk hidup" "organisme" "perempuan" "laki-laki" "anak kecil" "binatang"
                "kekayaan bangsa" "keajaiban dunia"]
             c ["oksigen" "makanan" "minuman" "protein" "vitamin dan mineral" "buah-buahan" "sayuran" "kasih sayang" "pelukan"
                "teman hidup" "kehangatan" "uang"]
             x ["orang" "manusia"]
             d ["guru" "petani" "peternak" "pengacara" "dokter" "presiden" "seniman" "filsuf" "Youtuber"]]
         {:a a :b b :c c :x x :d d})

       shuffle
       (take 300)))

(defn logic-009
  []
  (->> (for [a ["bernapas" "bisa berenang" "bisa terbang" "bisa membaca" "melahirkan" "hamil" "bertelur" "jatuh cinta"
                "hidup" "memiliki jantung" "rindu" "memiliki insang"]
             b ["laki-laki" "buaya" "ikan" "burung" "ayam" "lumba-lumba" "orangutan" "malaikat" "dinosaurus" "hantu"]
             x ["orang" "manusia" "perempuan" "wanita" "pesawat terbang" "kapal selam"]]
         {:a a :b b :x x})

       shuffle
       (take 300)))

(defn logic-010
  []
  (->> (for [x ["aku" "dia" "mereka" "kita" "kami" "dirinya" "diriku" "orang itu" "sahabatmu" "sahabatnya"
                "kekasihnya" "pacarmu" "gebetanmu"]
             a ["tau" "cinta" "rindu" ""]
             y ["kamu" "dirimu" "Santiago" "Rangga" "Rosalinda" "Marimar" "Markonah" "Zlatan" "Jon" "anda"]
             b ["harus mau" "wajib mengencani" "boleh beli rumah" "wajib berpuisi" "boleh pulang" "harus makan"
                "harus minum" "harus melamar" "wajib menikahi" ""]
             z ["gue"]
             d ["pulang" "pergi" "merantau" "jalan-jalan" "liburan" "honeymoon" "naik gunung" "wisata ke Mars"]
             v ["elo"]
             e ["anterin" "temenin" "dampingin" "jemput" "bayarin"]]
         {:a a :b b :d d :x x :y y :z z :v v :e e})

       shuffle
       (take 300)))

(defn logic-011
  []
  (->> (for [p ["pejabat" "politisi" "ketua partai" "anak pejabat" "pembuat hukum"
                "jurnalis" "pemilik media" "pengusaha" "kapitalis" "anggota parlemen"]
             q ["maling" "koruptor" "penjahat" "penindas" "penipu" "perampok" "sumber perpecahan"
                "tukang adu domba" "pembangkang hukum"]
             r ["bisa menegakkan hukum" "bisa menyediakan sumber penghasilan rakyat" "bisa menyediakan pendidikan gratis"
                "bisa menyediakan vaksin gratis" "mau memberikan beasiswa" "mau membantu rakyat"
                "mau memberikan bantuan saat bencana" "bisa menjaga ketertiban umum" "bisa membangun fasilitas umum"]]
         {:p p :q q :r r})
       shuffle
       (take 400)))

(defn logic-012
  []
  (->> (for [a ["membaca fiksi" "membaca buku" "mendengarkan musik klasik" "pernah hidup susah"
                "membaca karya klasik" "mengerti fisika dasar" "pernah merantau" "bisa main alat musik" "membaca novel"
                "menonton film klasik" "mengerti cara kerja ekonomi" "bisa berwirausaha" "bermimpi besar"]
             b ["bisa membuat sejarah" "bisa menjadi pemimpin" "mampu mengubah peradaban" "bisa menjadi presiden"
                "sukses membangun bisnis kelas dunia" "sukses menjadi penulis besar" "mampu memahami pikiran manusia"
                "mampu mencintai dengan sungguh" "pantas menjadi pahlawan" "pantas menjadi tokoh publik"]]
         {:a a :b b})
       shuffle
       (take 200)))

(defn logic-013
  []
  (->> (for [a ["pernah jatuh cinta" "pernah kasmaran" "pernah naksir orang" "pernah suka seseorang" "pernah jatuh hati"
                "pernah merasakan sayang" "pernah mendambakan seseorang" "pernah memuja seseorang" "pernah punya gebetan"]
             b ["bisa patah hati" "bisa sakit hati" "bisa hancur hatinya" "bisa tersakiti hatinya" "bisa hancur perasaannya"
                "bisa galau berhari-hari" "pernah susah move on" "bisa merindu" "bisa ngerasain kangen"]]
         {:a a :b b})
       shuffle
       (take 200)))

(defn logic-014
  []
  (->> (for [a ["uang" "harta" "kekayaan" "rumah" "mobil" "cinta" "kasih sayang" "pacar" "gebetan"
                 "sepeda" "pulau" "jet pribadi" "internet" "kuota internet" "kecerdasan" "keahlian"
                "gelar" "piala" "sertifikat" "pencapaian"]
             b ["bahagia" "tenteram" "sejahtera" "makmur" "nyaman" "senang" "puas dengan hidup" "sukses"
                "menikmati hidup"]]
         {:a a :b b :ca (cs/capitalize a)})
       shuffle
       (take 200)))

(comment (cs/capitalize x))

(defn logic-015
  []
  (->> (for [p ["setia" "menjaga komitmen" "menjaga kesetiaan" "selalu setia" "selalu menemani" "senantiasa hadir"
                "rajin nanya kabar"]
             a ["pelukan" "hadiah" "uang" "bunga mawar" "bunga melati" "cilok" "ketoprak" "laptop baru"
                "tiket liburan" "kejutan"]
             b ["ciuman" "kecupan" "kehangatan" "pertunangan" "pesta nikah" "rumah baru" "cincin emas"
                "kalung permata" "porsche" "mini cooper"]
             x ["pasangan" "sahabat" "teman" "gebetan" "kekasih" "pacar"]]
         {:a a :b b :p p :x x :cx (cs/capitalize x)})
       shuffle
       (take 200)))

(defn logic-016
  []
  (->> (for [x ["aku" "kamu" "dia" "kita" "kami" "mereka" "dirinya" "diriku" "dirimu" "orang itu"]
             a ["mengencani" "memacari" "mencintai" "menyayangi" "merindukan" "mengidolakan"
                "mengagumi" "memuja" "menghormati" "menikahi" "melamar" "menemani" "mendampingi"]
             b ["seksi" "cerdas" "lucu" "bijak" "humoris" "makan buburnya diaduk" "rajin olah raga"
                "rasional" "logis" "bisa joget" "asik" "suka nonton" "bisa main musik" "suka Taylor Swift"
                "suka Bon Jovi" "suka Metallica" "suka The Beatles" "kocak" "setia" "jujur" "berwawasan luas"
                "open-minded" "hobi masak" "suka Liverpool" "hobi ngelukis"]
             p ["rahim" "vulva" "sel telur" "kelenjar susu" "payudara"]
             q ["hamil" "melahirkan" "beranak" "menyusui"]]
         {:a a :b b :p p :q q :x x :cx (cs/capitalize x)})
       shuffle
       (take 300)))

(defn logic-017
  []
  (->> (for [x ["orang jenius" "politisi" "cewek cakep" "cowok ganteng" "orang sexy" "orang cerdas" "politisi"
                "cewek keren" "pebisnis sukses" "pelawak" "selebgram"]
             a ["Adidas" "Nike" "Puma" "Zara" "H&M" "LV" "Hermes" "New Balance" "Coach" "Gucci" "Stradivarius"
                "Guess" "Converse" "Balenciaga" "Vans" "BATA" "Ramayana" "Levi's"]
             b ["sepatu" "baju" "tas" "celana" "aksesoris" "sandal" "tempat belanja" "brand favorit" "kemeja"
                "jaket" "baju renang" "kaos kaki" "dompet"]]
         {:a a :b b :x x})
       shuffle
       (take 300)))

(defn logic-018
  []
  (->> (for [a ["laki-laki" "cowok" "pria" "pejantan"]
             b ["perempuan" "cewek" "wanita" "betina"]]
         {:a a :b b})
       shuffle
       (take 100)))

(defn logic-019
  []
  (->> (for [x ["orang jahat" "ilmuwan" "cowok rajin" "musisi" "seniman"
                "manusia super" "bucin" "anak baik" "manusia kuat" "anak sehat" "orang malas"]
             a ["ketoprak" "gado-gado" "cilok" "bakso" "nasi goreng" "indomie goreng" "batagor" "somay"
                "bakpao" "ramen" "popmie" "indomie rebus" "sate ayam" "sop iga"]
             b ["makanan favorit" "makanan kesukaan" "cemilan favorit" "jajanan" "sarapan" "makan siang" "bekal"
                "makan malem"]]
         {:a a :b b :x x})
       shuffle
       (take 300)))

(defn logic-020
  []
  (->> (for [a ["baju" "kemeja" "sweater" "cardigan" "topi" "anting" "kalung" "gelang"
                "jepitan" "jam tangan" "cincin" "hoodie"]
             b ["kaos kaki" "celana" "rok" "legging" "sepatu" "jeans" "sepatu"
                "boots" "sandal" "sabuk"]]
         {:a a :b b })
       shuffle
       (take 200)))

(defn logic-021
  []
  (->> (for [a ["ada" "hidup di alam" "punya ruh"]
             b ["pencipta"]
             c ["pencipta pertama"]]
         {:a a :b b :c c :cc (cs/capitalize c)})
       shuffle
       (take 10)))

(defn logic-022
  []
  (->> (for [a ["punya hati" "punya perasaan" "pernah jatuh cinta" "bisa sayang" "gampang baper"
                "penuh cinta" "susah move on" "pernah menjalin asmara" "percaya cinta sejati" "pernah kasmaran"]
             b ["gampang sakit hati" "ngerti perasaan orang" "pernah naksir orang"
                "bertepuk sebelah tangan" "punya banyak mantan" "punya sedikit mantan"
                "punya cinta pertama" "suka lagu cinta" "suka baca teenlit" "suka film romance"]
             c ["orang" "manusia" "makhluk" "perempuan" "laki-laki" "pujangga" "pemuda"
                "remaja" "selebritis" "tokoh masyarakat" "pahlawan"]]
         {:a a :b b :c c :cc (cs/capitalize c)})
       shuffle
       (take 200)))

(defn logic-023
  []
  (->> (for [a ["Corona" "Influenza" "HIV" "Ebola" "Rabies" "Cacar" "DBD"]
             b ["bisa dilawan dengan elektromagnetik" "bisa dilawan oleh vaksin"
                "mati jika kena ultraviolet" "mati di dalam kulkas" "mati jika kena alkohol"]
             c ["bisa dilawan dengan air" "bisa dilawan dengan jamu" "mati jika kena air jeruk"
                "mati jika kena air belerang" "bisa dilawan dengan uap panas"]]
         {:a a :b b})
       shuffle
       (take 100)))

(defn logic-024
  []
  (->> (for [a ["jatuh cinta" "kasmaran" "naksir seseorang" "deketin seseorang" "jadian sama seseorang"
                "menemukan cinta pertama" "menemukan pujaan hati" "kangen seseorang" "bertemu idola" "menang give away"]
             b ["denger nyanyian dewi cinta" "ngeliat dunia sempurna" "merasa bahagia selalu"
                "happy terus" "demen nyanyi" "pengen joget"]
             c ["ngidam martabak" "ngidam rujak" "pengen karaokean" "butuh kehangatan" "ketagihan cokelat"
                "ketagihan durian" "ngantuk terus" "bersemangat hidup" "merasa termotivasi" "merasa tenang"]
             x ["aku" "dia" "mereka" "kita" "kami" "dirimu" "diriku" "orang itu" "sahabatmu" "sahabatnya"
                "gebetanmu" "gebetannya" "kekasihnya"]]
         {:a a :b b :c c :x x :cx (cs/capitalize x)})
       shuffle
       (take 300)))
(defn logic-025
  []
  (->> (for [a ["dekat dengan ibunya" "dekat dengan ayahnya" "berbakti sama ortu" "sayang keluarga" "rajin bantu sodara"
                "dekat dengan adeknya" "dekat dengan kakaknya" "hormat sama ortu" "selalu inget keluarga" "pernah merantau"
                "rajin pulang kampung" "inget kampung halaman" "akrab dengan tetangga" "ramah dengan siapapun"]
             b ["setia" "bertanggung jawab" "bisa dipercaya" "jujur" "disiplin" "penyayang"
                "tulus" "penyabar" "disegani" "bisa memimpin" "pendiriannya kuat" "bisa berkomitmen" "berprinsip"]
             c ["malas" "bodoh" "kurang rupawan" "kurang menarik" "kurang mapan" "dianggep freak"
                "narsis" "keras kepala" "hobi kelayapan" "rada bandel" "rada aneh" "sulit bergaul"]
             x ["cowok" "cewek" "orang" "laki-laki" "perempuan" "pemudi" "pemuda" "remaja"
                "anak muda" "mahasiswa" "pekerja" "pebisnis" "politisi" "selebriti"]]
         {:a a :b b :c c :x x :cx (cs/capitalize x)})
       shuffle
       (take 400)))

(defn logic-026
  []
  (->> (for [x ["peraih nobel" "peraih Oscar" "Miss Universe"]
             c ["suka cilok" "suka oncom" "suka ketoprak" "suka nyanyi" "hobi karaoke"
                "hobi berenang" "hobi melukis" "jago bermusik" "suka gado-gado" "suka donat"]
             b ["suka bakso" "suka bakwan" "suka tahu isi" "suka martabak" "suka rujak"
                "hobi nonton" "suka kpop" "hobi nari" "jago matematika" "suka nasi uduk" "suka rendang"]
             t ["bisa terbang" "bisa menyelam" "bisa main catur" "ber-IQ 200" "bisa ngendarain pesawat" "bisa nyetir"
                "bisa lompat jauh" "bisa ngemudiin kapal" "bisa ngemudiin kereta" "bisa menang Pemilu"]]
         {:x x :b b :c c :t t})
       shuffle
       (take 400)))
