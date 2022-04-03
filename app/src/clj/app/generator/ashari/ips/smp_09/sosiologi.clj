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