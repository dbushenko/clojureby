#title: Как посмотреть список методов java-объекта
#tags: clojure_tips news
#date: 2013-06-26
<<<<<<< HEAD
#author: Д.Бушенко (d.bushenko@gmail.com)
=======
#author: Дмитрий Бушенко (d.bushenko@gmail.com)
>>>>>>> 5d4bd4d9ad4cfd4bae735947311339a1431a140f

Вообще стандартных средств для этого нет. Но мы же можем использовать Reflection. Например, так:

```clojure
(defn show-methods [obj]
  (doseq [m (.getMethods (type obj))]
    (println "Method Name: " (.getName m))
    (println "Parameters: " (vec (.getParameterTypes m)))
    (println "Return Type: " (.getReturnType m) "\n")))
```

Функция распечатает список методов объекта в таком виде:

Method Name:  equals
Parameters:  [java.lang.Object]
Return Type:  boolean

Method Name:  toString
Parameters:  []
Return Type:  java.lang.String

<<<<<<< HEAD
Method Name:  hashCode   
Parameters:  []   
Return Type:  int    
   
=======
Method Name:  hashCode
Parameters:  []
Return Type:  int
>>>>>>> 5d4bd4d9ad4cfd4bae735947311339a1431a140f
