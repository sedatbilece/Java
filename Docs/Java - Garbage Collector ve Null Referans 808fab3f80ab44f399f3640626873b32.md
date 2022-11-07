# Java - Garbage Collector ve Null Referans

Tarih: October 13, 2022 10:32 AM
Tip: KonuNotu

![ss1.png](Java%20-%20Garbage%20Collector%20ve%20Null%20Referans%20808fab3f80ab44f399f3640626873b32/ss1.png)

```java
Dog d1= new Dog("coco");

sout(d1);

d1=null ; // burada nesne referansı boş alınıyor ve
// artık d1 heap'den garbage collector tarafından silinebilir

```

> Peki nasıl çalışır (GC =Garbage Collection)
> 

1. Tüm belleği gezer ve null referans varmı diye bakar.
2. Null referans olan bellek alanlarını işaretler.
3. Null referans olan alanlar bellekten kaldırılır ,arada boşluklar oluşur (minor GC)
4. Major GC ise kaydırarak boşlukları doldurur .

## SSS (mülakat soruları)

<aside>
🌟 Javada nesneyi kendimiz yok edebilir miyiz ?

</aside>

Kendimiz yok edemeyiz null atayarak GC gelip silmesini sağlarız

<aside>
🌟 Bir nesne hiçbir refererans tarafından kullanılmaz ise GC nesneyi temizler mi ?

</aside>

Jvm impllarına göre farklılık gösterebilir. Net bir süre veya işlem yok . Kod yazarken dikkat edilmeli

<aside>
🌟 GC nesnenin silinmesi gerektiğini nasıl anlar ?

</aside>

Nesneyi gösteren referans kalmaz ise siler . 

<aside>
🌟 GC programcı çağırabilir mi ?

</aside>

Direk çağıramaz fakat ilk fırsatta gel diyebilir. system.gc ile çağrı yapar