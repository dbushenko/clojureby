[:html {}
 [:head {}
  [:meta {:http-equiv "Content-Type", :content "text/html; charset=UTF-8"}]]
 [:body {}
  [:div
   {:class "main-post"}

   (doall (map #(vector :div (parent-link-for (str (:date %) "&nbsp;" (:title %))
                                              (:html-file-name %))
                        [:br])
               (page-posts)))

   [:br]

   (if (page-next) (link-for "&lt;&lt; Next &nbsp;&nbsp; " (page-next)))
   (if (page-prev) (link-for "Prev &gt;&gt;" (page-prev)))
   ]
  ]]

