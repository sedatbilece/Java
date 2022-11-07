# Maven Nedir ? Maven vs Gradle Farkı nelerdir ?

Tarih: October 20, 2022 12:43 PM
Tip: KonuNotu

<aside>
🌟 Maven Nedir ?

</aside>

Maven bir build otomasyon aracıdır .

Maven *build, reporting, dependency management* ve *documentation* işlemlerini gerçekleştirir.

Project Object Model ya da POM, Maven’ın en önemli parçalarından biridir. `Pom.xml`

<aside>
🌟 Gradle vs Maven

</aside>

| Gradle | Uzman |
| --- | --- |
| Performans açısından Gradle, sağlanan girdi veya çıktıyla değil, yalnızca mevcut çalışan görevle ilgilendiği için daha iyidir. | Maven, projeyi oluşturmak için önceki yapı yapılarını veya önbelleği kullanmaz, bu nedenle yeni bir proje oluşturmak için gereken süre daha fazladır. |
| Groovy'de geliştirilmiş bir otomasyon inşa sistemidir. | Bir inşa ve proje yönetimi aracıdır. |
| Gradle, proje derlemesi için herhangi bir xml dosyası tarafından yönlendirilmez, bunun yerine dili kullanır - etki alanına özgü Groovy. Proje bilgileri Gradle aracında tutulur. | Maven, bağımlılıklar, eklentiler ve profiller vb. Hakkında bilgiler içeren bir xml dosyası tarafından yönetilir. |
| Gradle aşamalı olarak çalışır ve daha hızlı bir yapı tamamlama sağlar. | Maven aşamalı bir yaklaşım benimsemez ve derleme zamanlamaları açısından Gradle'dan daha yavaştır. |
| Gradle betiği basittir, uzun değildir ve kolayca anlaşılabilir. | Maven, açıklayıcı, uzun ve kolay anlaşılamayan xml dosyasına sahiptir. |
| Gradle, IDE desteği ile araçta bulunan çok sayıda seçenek açısından çok fazla esnekliğe sahip olduğu için kolayca özelleştirilebilir. | Maven’ın özelleştirilmesi kolay değildir ve IDE desteğine sahip olmadığı için bazen mümkün değildir. |
| Bir Gradle aracının amacı, projede yeni özelliklere sahip olmaktır. | Bir Maven aracının amacı, bir projeyi belirli bir sürede bitirmektir. |
| Gradle'da Java derlemesi gerekli bir adım değildir. | Maven'de derleme gerekli bir adımdır. |
| Gradle, nispeten modern bir araçtır ve kullanıcılarının sayısı sınırlıdır. | Maven tanıdık bir araçtır ve Java geliştiricileri arasında popülerdir. |
| Gradle'a xml kullanılmadan proje için çok sayıda bağımlılık eklenebilir. | Projeye xml dosyasına (pom) eklenerek çok sayıda bağımlılık eklenebilir, böylece Gradle'dan daha karmaşık ve yönetilmesi zor hale gelir. |
| Build.gradle dosyası group, baseName ve version gibi öğeleri içerir. | Pom.xml dosyası, ve gibi öğeleri içerir. |

Gradle sanırım android tabanlı uygulamalarda kullanılıyor.