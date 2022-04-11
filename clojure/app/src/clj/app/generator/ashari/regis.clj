(ns app.generator.ashari.regis
  (:require [app.generator.ashari.ips.smp_09.geografi]
            [app.generator.ashari.ips.smp_09.sosiologi]
            [app.generator.ashari.ips.smp_09.ekonomi]))

(def register
  [;;  {:folder "templates/piloting"
  ;;   :file   "geografi_benua-eropa.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/benua-eropa}
  ;;  {:folder "templates/piloting"
  ;;   :file   "geografi_benua-afrika.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/benua-afrika}
  ;;  {:folder "templates/piloting"
  ;;   :file   "geografi_jepang.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/jepang}
  ;;  {:folder "templates/piloting"
  ;;   :file   "coba_cakep-nggak.html"
  ;;   :topic  :other
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/cakep-nggak}
  ;;  {:folder "templates/piloting"
  ;;   :file   "geografi_mesir.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/mesir}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "geografi_pengertian-interaksi.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/pengertian-interaksi}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "geografi_interaksi-antarruang.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/interaksi-antarruang}
  ;;  {:folder "templates/piloting"
  ;;   :file   "geografi_sdm-australia.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/sdm-australia}
  ;;  {:folder "templates/piloting"
  ;;   :file   "geografi_ibukota-negara.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/ibukota-negara}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "geografi_potensi-sda-australia.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/potensi-sda-australia}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_faktor-pendorong-perubahan-sosial-budaya.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/faktor-pendorong-perubahan-sosial-budaya}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_faktor-penghambat-perubahan-sosial-budaya.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/faktor-penghambat-perubahan-sosial-budaya}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_faktor-pendorong-perubahan-sosial-budaya.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/faktor-pendorong-perubahan-sosial-budaya}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_pengertian-globalisasi.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/pengertian-globalisasi}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_ciri-ciri-globalisasi.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/ciri-ciri-globalisasi}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_bentuk-globalisasi-budaya-dan-ekonomi.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/bentuk-globalisasi-budaya-dan-ekonomi}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_upaya-menghadapi-globalisasi-budaya.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/upaya-menghadapi-globalisasi-budaya}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_upaya-menghadapi-globalisasi-iptek.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/upaya-menghadapi-globalisasi-iptek}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "sosiologi_upaya-menghadapi-globalisasi-ekonomi.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.sosiologi/upaya-menghadapi-globalisasi-ekonomi}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "ekonomi_faktor-produksi.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.ekonomi/faktor-produksi}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "ekonomi_persebaran-produksi-kedelai.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.ekonomi/persebaran-produksi-kedelai}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "ekonomi_pengertian-dan-tujuan-distribusi.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.ekonomi/pengertian-dan-tujuan-distribusi}
  ;;  {:folder "templates/ips/smp_09"
  ;;   :file   "ekonomi_distribusi-antardaerah.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.ekonomi/distribusi-antardaerah}
   {:folder "templates/ips/smp_09"
    :file   "ekonomi_pengertian-dan-tujuan-konsumsi.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.ekonomi/pengertian-dan-tujuan-konsumsi}
   {:folder "templates/ips/smp_09"
    :file   "ekonomi_ciri-benda-konsumsi.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.ekonomi/ciri-benda-konsumsi}
   {:folder "templates/ips/smp_09"
    :file   "ekonomi_pembagian-benda-konsumsi.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.ekonomi/pembagian-benda-konsumsi}])