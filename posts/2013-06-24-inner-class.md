#title: Как импортировать внутренние java-классы
#tags: news clojure_tips
#date: 2013-06-24

На текущем проекте понадобилось воспользоваться классом [com.google.api.services.plus.Plus](http://javadoc.google-api-java-client.googlecode.com/hg/apis/plus/v1/com/google/api/services/plus/Plus.html) и его вложенным билдером -- com.google.api.services.plus.Plus.Builder. Оказалось, что импортировать вложенные классы нужно не так, как обычные. При компиляции вложенные java-классы именуются так: _родительский класс$вложенный класс.class_. Поэтому импорт класса билдера выглядит так:

```clojure
...
(import com.google.api.services.plus.Plus)
(import com.google.api.services.plus.Plus$Builder)
...
```
Автор: Д.Бушенко (d.bushenko@gmail.com)