(ns app.generator.sbd.grammar
  (:require [clojure.set :as cset]
            [clojure.string :as cs]))

(defn male-subjects
  []
  ["Steven" "Calvin" "Firmino" "Roberto" "Ronaldo"])

(defn pronouns
  []
  {:male         ["he" "him" "his" "his"]
   :female       ["she" "her" "her" "his"]
   :second       ["you" "you" "your" "yours"]
   :first-single ["I" "me" "my" "mine"]
   :first-plural ["we" "us" "our" "ours"]
   :third-plural ["they" "them" "their" "theirs"]
   :thing        ["it" "it" "its" "its"]})

(defn grammar-01
  []
  (let [k1s ["the morning flight" "the morning train" "the early bus"]
        k2s ["the wedding" "the meeting" "the presentation" "the movie's premier" "the football game"]
        s1s (male-subjects)
        pros ["pertama" "ketiga"]]
    (->> (for [k1 k1s k2 k2s s1 s1s pro pros]
           (if (= "pertama" pro)
             {:k1 k1 :k2 k2 :pro pro :s1 s1 :s2 "I"
              :pb "us" :p1 "him" :p2 "them" :p3 "me"}
             {:k1 k1 :k2 k2 :pro pro :s1 s1 :s2 (rand-nth (vec (cset/difference (set s1s) #{s1})))
              :pb "them" :p1 "him" :p2 "us" :p3 "he"}))
         shuffle
         (take 30))))

(defn grammar-02
  []
  (->> (for [tense [:simple :cont]
             verb [:watch :teach :play :have]
             subject ["He" "I" "She"]
             clue (vec (range 4))]
         (let [[p1 p2 p3] (condp = tense
                            :simple (cond (#{"He" "She"} subject)
                                          ({:watch ["watch movie" "is watching movie" "watchs movie"]
                                            :teach ["teach the class" "teachs the class" "is teaching the class"]
                                            :play  ["play badminton" "is playing badminton" "playing badminton"]
                                            :have  ["have a standup meeting" "is having a standup meeting" "having a standup meeting"]}
                                           verb)
                                          :others
                                          ({:watch ["watches movie" "am watching movie" "watching movie"]
                                            :teach ["teaches the class" "teachs the class" "am teaching the class"]
                                            :play  ["plays badminton" "am playing badminton" "playing badminton"]
                                            :have  ["has a standup meeting" "am having a standup meeting" "having a standup meeting"]}
                                           verb))
                            :cont (cond (#{"He" "She"} subject)
                                        ({:watch ["watches movie" "watching movie" "are watching movie"]
                                          :teach ["teaches the class" "are teaching the class" "teaching the class"]
                                          :play  ["plays badminton" "are playing badminton" "playing badminton"]
                                          :have  ["has a standup meeting" "are having a standup meeting" "having a standup meeting"]}
                                         verb)
                                        :others
                                        ({:watch ["watch movie" "is watching movie" "watching movie"]
                                          :teach ["teaches the class" "teach the class" "is teaching the class"]
                                          :play  ["play badminton" "is playing badminton" "playing badminton"]
                                          :have  ["have a standup meeting" "is having a standup meeting" "having a standup meeting"]}
                                         verb)))
               sisa {:tense          ({:simple "simple present tense"
                                       :cont   "present continous tense"} tense)
                     :formula        ({:simple "S + V1"
                                       :cont   "S + am/is/are + Ving"} tense)
                     :bentuk-subject (if (= "I" subject)
                                       "ganti pertama tunggal"
                                       "ganti ketiga tunggal")}]
           (merge sisa
                  (condp = tense
                    :simple (cond
                              (#{"He" "She"} subject)
                              {:subject subject
                               :clue    (["every Friday" "at 11 am everyday" "every weekend" "every morning"] clue)
                               :pb      ({:watch "watches movie"
                                          :teach "teaches the class"
                                          :play  "plays badminton"
                                          :have  "has a standup meeting"} verb)
                               :p1      p1 :p2 p2 :p3 p3}
                              :others
                              {:subject subject
                               :clue    (["every Friday" "at 11 am everyday" "every weekend" "every morning"] clue)
                               :pb      ({:watch "watch movie"
                                          :teach "teach the class"
                                          :play  "play badminton"
                                          :have  "have a standup meeting"} verb)
                               :p1      p1 :p2 p2 :p3 p3})
                    :cont (cond
                            (#{"He" "She"} subject)
                            {:subject subject
                             :clue    (["now" "at the moment" "at this hour" "right now"] clue)
                             :pb      ({:watch "is watching movie"
                                        :teach "is teaching the class"
                                        :play  "is playing badminton"
                                        :have  "is having a standup meeting"} verb)
                             :p1      p1 :p2 p2 :p3 p3}
                            :others
                            {:subject subject
                             :clue    (["now" "at the moment" "at this hour" "right now"] clue)
                             :pb      ({:watch "am watching movie"
                                        :teach "am teaching the class"
                                        :play  "am playing badminton"
                                        :have  "am having a standup meeting"} verb)
                             :p1      p1 :p2 p2 :p3 p3})))))
       shuffle))

(defn grammar-03
  []
  (for [pair [["register my passport today" "registered"]
              ["go the post office" "posted for you"]
              ["do this my self" "done for you"]
              ["deliver the package myself" "delivered for you"]
              ["personally take the award" "taken for you"]]]
    (merge {:a1 (pair 0) :a2 (pair 1) :pb "have it"}
           {:p1 "has it" :p2 "be" :p3 "have"})))

(defn grammar-04
  []
  (->> (fn []
         (let [pl (rand-nth ["singular" "plural"])
               b (rand-nth ["on the table" "on the floor" "beside that three" "in front of the door"])]
           (condp = pl
             "singular" {:pb "is" :p1 "are" :b b
                         :a  (rand-nth ["an apple" "a bowling ball" "a racket" "a cup of coffee"])}
             "plural" {:pb "are" :p1 "is" :b b
                       :a  (rand-nth ["some meatballs" "three apples" "three balls" "some boxes"])})))
       (repeatedly 50)
       distinct))

(defn grammar-05
  []
  (->> (fn []
         (let [spl (rand-nth ["singular" "plural"])
               d (rand-nth ["on the table" "on the floor" "beside that three" "in front of the door"])]
           (condp = spl
             "singular"
             (merge {:pb "that" :p1 "those" :a "is" :d d}
                    (let [ps (rand-nth [["an" "apple"]
                                        ["an" "orange"]
                                        ["a" "book"]
                                        ["a" "phone"]
                                        ["a" "pen"]
                                        ["a" "monster"]
                                        ["an" "apple pie"]
                                        ["a" "remote"]])]
                      {:b (ps 0) :c (ps 1)}))
             "plural"
             (merge {:pb "those" :p1 "that" :a "are" :d d}
                    (let [ps (rand-nth [["two" "apples"]
                                        ["three" "oranges"]
                                        ["some" "books"]
                                        ["two" "pens"]
                                        ["three" "monsters"]
                                        ["some" "apple pies"]
                                        ["a pair of" "shoes"]
                                        ["a couple of" "olives"]
                                        ["a bunch of" "CDs"]])]
                      {:b (ps 0) :c (ps 1)})))))
       (repeatedly 50)
       distinct))

(defn grammar-06
  []
  (->> (fn []
         (let [spl (rand-nth ["singular" "plural"])
               d (rand-nth ["under the table" "on top of that closet"
                            "beside that tree" "in front of the door"
                            "in the car" "on your chair"])]
           (condp = spl
             "singular"
             (merge {:pb "it" :p1 "them" :a "is" :d d}
                    (let [ps (rand-nth [["an" "apple"]
                                        ["an" "orange"]
                                        ["a" "book"]
                                        ["a" "phone"]
                                        ["a" "pen"]
                                        ["a" "monster"]
                                        ["an" "apple pie"]
                                        ["a" "remote"]])]
                      {:b (ps 0) :c (ps 1)}))
             "plural"
             (merge {:pb "them" :p1 "it" :a "are" :d d}
                    (let [ps (rand-nth [["two" "apples"]
                                        ["three" "oranges"]
                                        ["some" "books"]
                                        ["two" "pens"]
                                        ["three" "monsters"]
                                        ["some" "apple pies"]
                                        ["a pair of" "shoes"]
                                        ["a couple of" "olives"]
                                        ["a bunch of" "CDs"]])]
                      {:b (ps 0) :c (ps 1)})))))
       (repeatedly 50)
       distinct))

(defn grammar-07
  []
  (->> (fn []
         (let [spl (rand-nth ["singular" "plural"])
               apl (rand-nth [["movie" "movies"] ["guitar" "guitars"] ["painting" "paintings"]
                              ["trophy" "trophies"] ["dress" "dresses"] ["bag" "bags"]
                              ["book" "books"] ["car" "cars"] ["bike" "bikes"]])]
           (condp = spl
             "singular"
             {:a "This is" :spl spl :pb (apl 0) :p1 (apl 1)}
             "plural"
             {:a "These are" :spl spl :pb (apl 1) :p1 (apl 0)})))
       (repeatedly 30)
       distinct))

(defn grammar-08
  []
  (->> (fn []
         (let [spl (rand-nth ["noun" "adjective"])
               sps (rand-nth [["She" "is"] ["I" "am"] ["He" "is"] ["You" "are"] ["Jojoba" "is"]])]
           (condp = spl
             "noun"
             (merge {:s (sps 0) :tobe (sps 1) :p1 "Biarin kosong" :spl spl :ketjaw "pake article"}
                    (let [po (rand-nth [["a" "teacher"] ["a" "firefighter"]
                                        ["a" "coach"] ["an" "entrepreneur"]])]
                      {:v (po 1) :pb (po 0)}))
             "adjective"
             (merge {:s (sps 0) :tobe (sps 1) :pb "Biarin kosong" :spl spl :ketjaw "biarin kosong"}
                    (let [po (rand-nth [["an" "awesome"] ["a" "beautiful"] ["a" "smart"]
                                        ["an" "anxious"] ["an" "excited"]])]
                      {:v (po 1) :p1 (po 0)})))))
       (repeatedly 50)
       distinct))

(defn grammar-09
  []
  (->> (let [ops ["I am" "He is" "She is" "It is" "They are" "We are" "These are" "Those are"
                  "That is" "This is"]]
         (for [ps ops]
           (let [[s pb] (cs/split ps #" ")]
             (merge {:s s :pb pb}
                    (zipmap [:p1 :p2]
                            (->> (map #((cs/split % #" ") 1) ops)
                                 distinct
                                 (remove #{pb})
                                 shuffle))))))))

(defn grammar-10
  []
  (->> (fn []
         (let [kw (rand-nth
                    ["weekend" "Monday and Thursday" "first day of the month"
                     "Saturday" "two days"])
               [s [pb p1 p2] os]
               (rand-nth [["the physics 101 course"
                           ["is delivered" "delivered" "delivers"]
                           ["Prof. Geller" "the teacher" "the lecturer"]]
                          ["the special menu"
                           ["is served" "served" "serves"]
                           ["the chef" "the resto owner" "Chef Arnold"]]
                          ["the special metal performance"
                           ["is performed" "performs" "is performing"]
                           ["the local band" "the band from Cikunir" "Tralala band"]]
                          ["the musical drama"
                           ["is performed" "performs" "is performing"]
                           ["the drama club" "my school theater club" "the famous acting club"]]])]
           {:kw kw :s s :pb pb :p1 p1 :p2 p2 :o (rand-nth os)}))
       (repeatedly 50)
       distinct))

(defn grammar-11
  []
  (->> (fn []
         (let [ops (rand-nth [:single-1 :single-3 :others])
               kw (rand-nth ["now" "at the moment" "right now" "currently" "at this hour"])
               [ving vs v o]
               (rand-nth [["delivering" "delivers" "deliver" "pizza"]
                          ["playing" "plays" "play" "football"]
                          ["examining" "examines" "examine" "the situation"]
                          ["having" "has" "have" "a meeting"]
                          ["teaching" "teaches" "teach" "the English class"]
                          ["practicing" "practices" "practice" "the songs to be played at the concert"]])]
           (merge {:o o :kw kw}
                  (condp = ops
                    :single-1 {:s "I" :pb (str "am " ving) :p1 (str "is " ving) :p2 vs :p3 v}
                    :single-3 {:s  (rand-nth ["He" "She"])
                               :p1 (str "am " ving) :pb (str "is " ving) :p2 vs :p3 v}
                    :others {:s  (rand-nth ["You" "They" "We"])
                             :p1 (str "is " ving) :pb (str "are " ving) :p2 vs :p3 v}))))
       (repeatedly 80)
       distinct))

(defn grammar-12
  []
  (->> (fn []
         (let [ops (rand-nth [:single-1 :single-3 :others])
               kw (rand-nth ["every two hours" "every Monday" "everyday" "every end of the week"
                             "everyday at 10am"])
               [ving vs v o]
               (rand-nth [["delivering" "delivers" "deliver" "pizza"]
                          ["playing" "plays" "play" "football"]
                          ["examining" "examines" "examine" "the situation"]
                          ["having" "has" "have" "a meeting"]
                          ["teaching" "teaches" "teach" "the English class"]
                          ["practicing" "practices" "practice" "the songs to be played at the concert"]])]
           (merge {:o o :kw kw}
                  (condp = ops
                    :single-1 {:s "I" :p3 (str "am " ving) :p1 (str "is " ving) :p2 vs :pb v}
                    :single-3 {:s  (rand-nth ["He" "She"])
                               :p1 (str "am " ving) :p2 (str "is " ving) :pb vs :p3 v}
                    :others {:s  (rand-nth ["You" "They" "We"])
                             :p1 (str "is " ving) :p3 (str "are " ving) :p2 vs :pb v}))))
       (repeatedly 80)
       distinct))

(defn grammar-13
  "Testing present perfect or past based on clue"
  []
  (->> (fn []
         (let [t (rand-nth [:present :past])]
           (condp = t
             :present
             (let [[q1 q2 q3 o kw]
                   (rand-nth
                     [["haven't eaten" "didn't eat" "hadn't eaten" "anything" "since yesterday"]
                      ["have known" "knew" "had known" "him" "for 7 years"]
                      ["have known" "knew" "know" "him" "since 2 years ago"]
                      ["have been" "was" "am" "an engineer" "for 3 years now"]
                      ["have been" "was" "am" "a student" "for my entire life"]
                      ["have sent" "sent" "had sent" "the package" "since 3 days ago"]
                      ["have sent" "sent" "had sent" "the mail" "since 3 days ago"]
                      ["have posted" "posted" "had posted" "the story on ig" "since 2 hours ago"]
                      ["have posted" "posted" "had posted" "the ads" "since 2 hours ago"]
                      ["have watched" "watched" "had watched" "the new movie" "since last month"]])]
               (merge {:t  "present perfect tense"
                       :pb q1 :kw kw :o o :p1 q2 :p2 q3}))
             :past
             (let [[q1 q2 q3 o kw]
                   (rand-nth
                     [["haven't eaten" "didn't eat" "hadn't eaten" "anything" "yesterday"]
                      ["have been" "was" "am" "an engineer" "during the 90s"]
                      ["have been" "was" "am" "a student" "when I lived in Bandung"]
                      ["have sent" "sent" "had sent" "the package" "2 days ago"]
                      ["have sent" "sent" "had sent" "the mail" "2 days ago"]
                      ["have taken" "took" "had taken" "the books from him" "a week ago"]
                      ["have posted" "posted" "had posted" "the story on ig" "2 hours ago"]
                      ["have posted" "posted" "had posted" "the ads" "2 hours ago"]
                      ["have watched" "watched" "had watched" "the new movie" "last month"]])]
               (merge {:t  "simple past tense"
                       :p1 q1 :kw kw :o o :pb q2 :p2 q3})))))
       (repeatedly 200)
       distinct))

(defn grammar-14
  "Testing present perfect or past based on clue"
  []
  (->> (fn []
         (let [t (rand-nth [:simple :cont])]
           (condp = t
             :cont
             (let [[q1 q2 q3 o kw]
                   (rand-nth
                     [["was posting" "posted" "have posted" "a package" "when you came"]
                      ["was posting" "posted" "have posted" "the ads" "when you called"]
                      ["was watching" "watched" "have watched" "the new movie" "when my pager rang"]
                      ["was pretending" "pretended" "have pretended" "to be cool" "when my pants dropped"]
                      ["was playing" "played" "am playing" "the game on PC" "when it imploded"]
                      ["was riding" "rode" "am riding" "the bike" "when a tank got passed me"]])]
               (merge {:t  "present perfect tense"
                       :pb q1 :kw kw :o o :p1 q2 :p2 q3}))
             :simple
             (let [[q1 q2 q3 o kw]
                   (rand-nth
                     [["haven't eaten" "didn't eat" "hadn't eaten" "anything" "yesterday"]
                      ["have been" "was" "am" "an engineer" "during the 90s"]
                      ["have been" "was" "am" "a student" "when I lived in Bandung"]
                      ["have sent" "sent" "had sent" "the package" "2 days ago"]
                      ["have sent" "sent" "had sent" "the mail" "2 days ago"]
                      ["have taken" "took" "had taken" "the books from him" "a week ago"]
                      ["have posted" "posted" "had posted" "the story on ig" "2 hours ago"]
                      ["have posted" "posted" "had posted" "the ads" "2 hours ago"]
                      ["have watched" "watched" "had watched" "the new movie" "last month"]])]
               (merge {:t  "simple past tense"
                       :p1 q1 :kw kw :o o :pb q2 :p2 q3})))))
       (repeatedly 200)
       distinct))

(defn grammar-15
  "Testing present perfect or past based on clue"
  []
  (->> (fn []
         (let [t (rand-nth [:present :past])
               s (rand-nth ["We" "You" "They"])]
           (condp = t
             :present
             (let [[q1 q2 q3 o kw]
                   (rand-nth
                     [["haven't eaten" "didn't eat" "hadn't eaten" "anything" "since yesterday"]
                      ["have known" "knew" "had known" "him" "for 7 years"]
                      ["have known" "knew" "know" "him" "since 2 years ago"]
                      ["have been" "were" "had been" "engineers" "for 3 years now"]
                      ["have been" "were" "had been" "students" "for several years now"]
                      ["have sent" "sent" "had sent" "the package" "since 3 days ago"]
                      ["have sent" "sent" "had sent" "the mail" "since 3 days ago"]
                      ["have posted" "posted" "had posted" "the story on ig" "since 2 hours ago"]
                      ["have posted" "posted" "had posted" "the ads" "since 2 hours ago"]
                      ["have watched" "watched" "had watched" "the new movie" "since last month"]])]
               (merge {:t  "present perfect tense" :s s
                       :pb q1 :kw kw :o o :p1 q2 :p2 q3}))
             :past
             (let [[q1 q2 q3 o kw]
                   (rand-nth
                     [["haven't eaten" "didn't eat" "hadn't eaten" "anything" "yesterday"]
                      ["have been" "were" "had been" "engineers" "during the 90s"]
                      ["have been" "were" "had been" "students" "when the revolution started"]
                      ["have sent" "sent" "had sent" "the package" "2 days ago"]
                      ["have sent" "sent" "had sent" "the mail" "2 days ago"]
                      ["have taken" "took" "had taken" "the books from him" "a week ago"]
                      ["have posted" "posted" "had posted" "the story on ig" "2 hours ago"]
                      ["have posted" "posted" "had posted" "the ads" "2 hours ago"]
                      ["have watched" "watched" "had watched" "the new movie" "last month"]])]
               (merge {:t  "simple past tense" :s s
                       :p1 q1 :kw kw :o o :pb q2 :p2 q3})))))
       (repeatedly 200)
       distinct))

(defn objects
  [data]
  (->> (map #(% 5) data)
       (mapv #(cs/split % #" "))
       (mapv (fn [x] (map #(cs/replace % #"-" " ") x)))))

(defn read-csv
  [filenamepath]
  (->> (-> (slurp (str "resources/dumps/tenses/" filenamepath ".csv"))
           (cs/split-lines))
       (mapv #(cs/split % #","))
       rest
       vec))

(defn read-csv-col
  [filename]
  (->> (slurp (str "resources/dumps/tenses/" filename ".csv"))
       (cs/split-lines)
       (mapv #(cs/split % #","))
       (mapv (comp vec rest))))

(defn tobe
  [s t]
  (cond (#{:i} s)
        (condp = t :pres "am" :past "was" :presp "have")
        (#{:you :we :they} s)
        (condp = t :pres "are" :past "were" :presp "have")
        (#{:he :she} s)
        (condp = t :pres "is" :past "was" :presp "has")))

(def subjects [:i :he :she :you :we :they])

(defn submap
  [s cap?]
  (let [mapi {:i  "I" :you "you" :she "she"
              :he "he" :we "we" :they "they"}]
    (if cap?
      (cs/capitalize (mapi s))
      (mapi s))))

(defn which-v1
  [s]
  (if (#{:he :she} s) :v1s :v1))

(def tensemap
  (zipmap [:sim-pres :sim-past :sim-fut
           :pres-perf :past-perf :fut-perf
           :pres-con :past-con :fut-con]
          ["simple present" "simple past" "simple future"
           "present perfect" "past perfect" "future perfect"
           "present continous" "past continous" "future continous"]))

(defn grammar-16
  "Comparing simple present and simple past"
  []
  (let [data (read-csv "Tense - 01")
        obs (objects data)
        kws (read-csv-col "Tense - kw")]
    (->> (fn []
           (let [s (rand-nth subjects)
                 t (rand-nth [:sim-pres :sim-past])
                 i (rand-nth (range (count data)))
                 o (rand-nth (obs i))
                 tc (tensemap t)]
             (condp = t
               :sim-pres {:s  (submap s true)
                          :pb ((data i) ({:v1 0 :v1s 1} (which-v1 s)))
                          :o  o
                          :kw (rand-nth (kws 0))
                          :p1 ((data i) ({:v1 1 :v1s 0} (which-v1 s)))
                          :p2 (str (tobe s :pres) " " ((data i) 4))
                          :tc tc}
               :sim-past {:s  (submap s true)
                          :pb ((data i) 2)
                          :o  o
                          :kw (rand-nth (kws 1))
                          :p1 ((data i) 1)
                          :p2 (str (tobe s :past) " " ((data i) 4))
                          :tc tc})))
         (repeatedly 1000)
         distinct)))

(defn grammar-17
  "Comparing simple present and present cont"
  []
  (let [data (read-csv "Tense - 01")
        obs (objects data)
        kws (read-csv-col "Tense - kw")]
    (->> (fn []
           (let [s (rand-nth subjects)
                 t (rand-nth [:sim-pres :pres-con])
                 i (rand-nth (range (count data)))
                 o (rand-nth (obs i))
                 tc (tensemap t)]
             (condp = t
               :sim-pres {:s  (submap s true)
                          :pb ((data i) ({:v1 0 :v1s 1} (which-v1 s)))
                          :o  o
                          :kw (rand-nth (kws 0))
                          :p1 ((data i) ({:v1 1 :v1s 0} (which-v1 s)))
                          :p2 (str (tobe s :pres) " " ((data i) 4))
                          :tc tc}
               :pres-con {:s  (submap s true)
                          :pb (str (tobe s :pres) " " ((data i) 4))
                          :o  o
                          :kw (rand-nth (kws 3))
                          :p1 ((data i) ({:v1 0 :v1s 1} (which-v1 s)))
                          :p2 (str (tobe s :presp) " been " ((data i) 4))
                          :tc tc})))
         (repeatedly 1000)
         distinct)))

(defn grammar-18
  "Comparing simple past and past continous"
  []
  (let [data (read-csv "Tense - 01")
        obs (objects data)
        kws (read-csv-col "Tense - kw")]
    (->> (fn []
           (let [s (rand-nth subjects)
                 t (rand-nth [:sim-past :past-con])
                 i (rand-nth (range (count data)))
                 o (rand-nth (obs i))
                 tc (tensemap t)]
             (condp = t
               :sim-past {:s  (submap s true)
                          :pb ((data i) 2)
                          :o  o
                          :kw (rand-nth (kws 1))
                          :p1 ((data i) 1)
                          :p2 (str (tobe s :past) " " ((data i) 4))
                          :tc tc}
               :past-con {:s  (submap s true)
                          :pb (str (tobe s :past) " " ((data i) 4))
                          :o  o
                          :kw (rand-nth (kws 4))
                          :p1 ((data i) 2)
                          :p2 (str (tobe s :presp) " been " ((data i) 4))
                          :tc tc})))
         (repeatedly 1000)
         distinct)))

(defn grammar-19
  "Comparing simple past and present perfect"
  []
  (let [data (read-csv "Tense - 01")
        obs (objects data)
        kws (read-csv-col "Tense - kw")]
    (->> (fn []
           (let [s (rand-nth subjects)
                 t (rand-nth [:sim-past :past-perf])
                 i (rand-nth (range (count data)))
                 o (rand-nth (obs i))
                 tc (tensemap t)]
             (condp = t
               :sim-past {:s  (submap s true)
                          :pb ((data i) 2)
                          :o  o
                          :kw (rand-nth (kws 1))
                          :p1 (str (tobe s :presp) " " ((data i) 3))
                          :p2 (str (tobe s :past) " " ((data i) 4))
                          :tc tc}
               :past-perf {:s  (submap s true)
                           :pb (str (tobe s :past) " " ((data i) 3))
                           :o  o
                           :kw (rand-nth (kws 6))
                           :p1 ((data i) 2)
                           :p2 (str (tobe s :past) " " ((data i) 4))
                           :tc tc})))
         (repeatedly 1000)
         distinct)))

(defn grammar-20
  "Comparing present perfect and past perfect"
  []
  (let [data (read-csv "Tense - 01")
        obs (objects data)
        kws (read-csv-col "Tense - kw")]
    (->> (fn []
           (let [s (rand-nth subjects)
                 t (rand-nth [:past-perf :pres-perf])
                 i (rand-nth (range (count data)))
                 o (rand-nth (obs i))
                 tc (tensemap t)]
             (condp = t
               :past-perf {:s  (submap s true)
                           :pb (str "had " ((data i) 3))
                           :o  o
                           :kw (rand-nth (kws 7))
                           :p1 ((data i) 2)
                           :p2 (str (tobe s :presp) " " ((data i) 3))
                           :tc tc}
               :pres-perf {:s  (submap s true)
                           :pb (str (tobe s :presp) " " ((data i) 3))
                           :o  o
                           :kw (rand-nth (kws 6))
                           :p1 ((data i) 2)
                           :p2 (str "had " ((data i) 3))
                           :tc tc})))
         (repeatedly 1000)
         distinct)))










