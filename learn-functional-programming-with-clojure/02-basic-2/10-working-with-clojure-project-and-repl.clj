;; Working with Clojure and REPL

;; Where to begin?
;; Set up your environment and access

;; 1) Install clojure dependencies and IDE of your choice! (vscode recommended)

;; 1. Leiningen
;; 2. Java
;; 3. vscode
;; 4. Calva extension on vscode


;; 2) Setup the created Gitlab account (contact admin for user creation)
;; 3) Install Github Desktop or use git terminal
;; 4) Get SSH key

;; 1. Open terminal
;; 2. Run ssh-keygen -t rsa command on terminal
;; 3. Just enter until you can type on terminal

;; 4. cat .ssh/id_rsa.pub select all and copy (except ssh-rsa in front)
;; 5. In gitlab search "SSH keys" and paste your ssh from id_rsa

;; Basic - Running the app
;; To run the app with the basic configuration

;; 1. Copy config.edn from config-template.edn
;; 2. Run repl and start with (start) or (start :generate)

;; a. lein repl on terminal
;; b. [VSCode - Calva] REPL button with lightning symbol on the bottom


;; 3. Open localhost:4000 on your browser

;; 4. To run the viewer with MathJax, copy paste MathJax directory into app/resources/public/
;; 5. Reset the app with (reset)


