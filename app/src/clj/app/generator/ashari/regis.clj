(ns app.generator.ashari.regis
  (:require [app.generator.ashari.ips.smp_09.geografi]
            [app.generator.ashari.ips.smp_09.sosiologi]))

(def register
  [{:folder "templates/piloting"
    :file   "geografi_benua-eropa.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.geografi/benua-eropa}
   {:folder "templates/piloting"
    :file   "geografi_benua-afrika.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.geografi/benua-afrika}
   {:folder "templates/piloting"
    :file   "geografi_jepang.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.geografi/jepang}
   {:folder "templates/piloting"
    :file   "coba_cakep-nggak.html"
    :topic  :other
    :gen-fn app.generator.ashari.ips.smp_09.geografi/cakep-nggak}
   {:folder "templates/piloting"
    :file   "geografi_mesir.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.geografi/mesir}
   {:folder "templates/ips/smp_09"
    :file   "geografi_pengertian-interaksi.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.geografi/pengertian-interaksi}
   {:folder "templates/ips/smp_09"
    :file   "geografi_interaksi-antarruang.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.geografi/interaksi-antarruang}
  ;;  {:folder "templates/piloting"
  ;;   :file   "geografi_sdm-australia.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/sdm-australia}
  ;;  {:folder "templates/piloting"
  ;;   :file   "geografi_ibukota-negara.html"
  ;;   :topic  :smp-ips
  ;;   :gen-fn app.generator.ashari.ips.smp_09.geografi/ibukota-negara}
   {:folder "templates/ips/smp_09"
    :file   "geografi_potensi-sda-australia.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.geografi/potensi-sda-australia}
   {:folder "templates/ips/smp_09"
    :file   "sosiologi_faktor-pendorong-perubahan-sosial-budaya.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.sosiologi/faktor-pendorong-perubahan-sosial-budaya}
   {:folder "templates/ips/smp_09"
    :file   "sosiologi_faktor-penghambat-perubahan-sosial-budaya.html"
    :topic  :smp-ips
    :gen-fn app.generator.ashari.ips.smp_09.sosiologi/faktor-penghambat-perubahan-sosial-budaya}])