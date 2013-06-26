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
        [:span.clojure "#clojure"]
        [:span.by "by"]]]
      [:h3 {:class "site-description"} "Clojure комьюнити"]]]]
   [:div
    {:id "main", :role "main"}
    [:aside
     {:id "widgets"}
     [:div {} [:img {:id "alien", :src "img/alien.png"}]]
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

     [:div
      {:class "feed"}
      [:div
       {:class "feed-header"}
       "\n\t      ЗАПИСЬ\n\t      "
       [:div {:class "line"}]]

      ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
      ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

      [:h2 (post-title)]
      (post-content)

          "<div id=\"disqus_thread\"></div>
    <script type=\"text/javascript\">
        /* * * CONFIGURATION VARIABLES: EDIT BEFORE PASTING INTO YOUR WEBPAGE * * */
        var disqus_shortname = 'clojureby'; // required: replace example with your forum shortname

        /* * * DON'T EDIT BELOW THIS LINE * * */
        (function() {
            var dsq = document.createElement('script'); dsq.type = 'text/javascript'; dsq.async = true;
            dsq.src = '//' + disqus_shortname + '.disqus.com/embed.js';
            (document.getElementsByTagName('head')[0] || document.getElementsByTagName('body')[0]).appendChild(dsq);
        })();
    </script>
    <noscript>Please enable JavaScript to view the <a href=\"http://disqus.com/?ref_noscript\">comments powered by Disqus.</a></noscript>
    <a href=\"http://disqus.com\" class=\"dsq-brlink\">comments powered by <span class=\"logo-disqus\">Disqus</span></a>"

      ]]]

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
