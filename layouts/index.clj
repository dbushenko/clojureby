[:html
 {}
 [:head
  {}
  [:meta {:http-equiv "Content-Type", :content "text/html; charset=UTF-8"}]
  [:title {} "Clojure Enthusiasts Belarus - Clojure в Беларуси"]
  [:meta
   {:name "keywords",
    :content
    "Clojure, Belarus, Беларусь, user group, clojureby, Minsk, Минск, программисты, группа пользователей"}]
  [:meta
   {:name "description",
    :content
    "Community of Clojure programming language users in Belarus. Коммьюнити пользователей языка программирования Clojure в Беларуси (Минск)"}]
  [:meta {:name "viewport", :content "width=device-width,initial-scale=1"}]
  (for [css-file ["style.css" "codemirror.css"]]
    [:link
     {:rel "stylesheet", :type "text/css", :media "all", :href (str "css/" css-file)}])]
 [:body
  {}
  [:div
   {:id "container"}
   [:header
    {:class "page-header"}
    [:div
     {:class "wrap clearfix"}
     [:div
      {:class "page-header-info"}
      [:h1
       {:class "site-title"}
       [:a
        {:shape "rect", :href (url-for "index.html")}
        "#clojure"
        [:span {:class "by"} "by"]]]
      [:h3 {:class "site-description"} "Clojure комьюнити"]]]]
   [:div
    {:id "main", :role "main"}
    [:aside
     {:id "widgets"}
     [:div {} [:img {:style "margin-top:-100px;", :src "img/alien.png"}]]
     [:div
      {:class "past-meetups"}
      [:h3 {:align "center", :class "pm-header"} "Прошедшие встречи"]

      [:div {:align "center"} "Пока у нас не было ни одной встречи. Но скоро будут."]
      
      ;; [:div
      ;;  {:class "past-meetup clearfix"}
      ;;  [:div {:class "past-meetup-number"} "#10"]
      ;;  [:div
      ;;   {:class "past-meetup-info"}
      ;;   [:p {} "24/11/2012"]
      ;;   [:p
      ;;    {}
      ;;    [:a
      ;;     {:shape "rect",
      ;;      :class "wlink pm-media",
      ;;      :href (url-for "index.html")}
      ;;     "Медиа"]]
      ;;   [:p
      ;;    {}
      ;;    [:a
      ;;     {:shape "rect",
      ;;      :class "wlink pm-discuss",
      ;;      :href
      ;;      (url-for "index.html")}
      ;;     "Обсуждения"]]]]

      
      [:div
       {:class "past-meetup-more"}
       [:a
        {:shape "rect",
         :class "past-meetup-more-link",
         :href (url-for "meetup.html")}
        "Больше..."]]]


     [:div
      {:class "tags"}
      [:h3 {:align "center", :class "pm-header"} "Теги"]

      [:div
       {:class "past-meetup clearfix"}
       [:div
        {:class "past-meetup-info"}
        [:p {}
         [:a {:href (url-for "clojure_tips.html"), :class "past-meetup-more-link", :style "color:white;text-decoration: none; "} "Clojure tips &amp; tricks"]]]]

      [:div
       {:class "past-meetup clearfix"}
       [:div
        {:class "past-meetup-info"}
        [:p {}
         [:a {:href (url-for "clojure_web.html"), :class "past-meetup-more-link", :style "color:white;text-decoration: none; "} "Clojure &amp; Web"]]]]

      [:div
       {:class "past-meetup clearfix"}
       [:div
        {:class "past-meetup-info"}
        [:p {}
         [:a {:href (url-for "other_lisps.html"), :class "past-meetup-more-link", :style "color:white;text-decoration: none; "} "Другие Lisp-ы"]]]]

      [:div
       {:class "past-meetup clearfix"}
       [:div
        {:class "past-meetup-info"}
        [:p {}
         [:a {:href (url-for "emacs_elisp.html"), :class "past-meetup-more-link", :style "color:white;text-decoration: none; "} "Emacs &amp; EmacsLisp"]]]]
      
      ]
     ]

    [:section

     {:id "content"}
      ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
      ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

     (post-content)

     [:div
      {:class "feed"}
      [:div
       {:class "feed-header"}
       "\n\t      ЛЕНТА\n\t      "
       [:div {:class "line"}]]

      (let [news-post (first (posts-with-tag "news"))]
      [:div
       {:class "main-post"}
       [:h2 (link-for (:title news-post) (:html-file-name news-post))]
       (:contents news-post)])

      [:br]
      (inner-page "news.html" {:width "520px"})
      ]

     [:div
      {:class "feed"}
      [:div
       {:class "info-header"}
       "\n\t      ЧТО ТАКОЕ CLOJURE?\n\t      "
       [:div {:class "line"}]]

      "Clojure (произносится как closure) — современный диалект Лиспа. Это язык программирования общего назначения с поддержкой разработки в интерактивном режиме, поощряющий функциональное программирование, и упрощающий поддержку многопоточности. Clojure работает на платформах JVM, JavaScript и CLR. Clojure отличает философия «код как данные» и развитая система лисп-макросов."

      ]
     ]]

   [:footer
    {:class "page-footer"}
    [:section
     {:class "buttons"}
     [:div
      {:class "page-footer-button"}
      [:a
       {:shape "rect", :href (url-for "rss.xml")}
       [:img {:src "img/rss.png"}]]]]
    [:section
     {:class "copyright-info"}
     [:p {} [:strong {} "Clojure Enthusiasts Belarus"] ", 2013."]
     [:p {} "\n            Created by Dmitry Bushenko (d.bushenko@gmail.com)\n          "]
     [:p {} "Some rights reserved (c)."]]]

   (for [js-file ["//ajax.googleapis.com/ajax/libs/jquery/1.10.1/jquery.min.js"
                  "js/codemirror-with-clojure-compressed.js"
                  "js/clojureby.js"]]
     [:script {:src js-file}])
   ]]]
