# Dependency Injection ( DI ) [!imp]

Tarih: October 14, 2022 10:19 AM
Tip: KonuNotu

<aside>
🌟 **Dependency**

</aside>

Nesneler arası bağımlılıktır . Birisindeki değişiklik değerini muhtemel şekilde değişikliğe zorlar ise buna bağımlılık diyebiliriz.

![ss1.png](Dependency%20Injection%20(%20DI%20)%20%5B!imp%5D%20e4043995d0774d7e94368ce5e8ca132d/ss1.png)

`A-C` ve `B-C` arasında bir `dependency` mevcut fakat `A-B` arasında yoktur .

`A-B` arasında `coupling` vardır.

---

![ss2.png](Dependency%20Injection%20(%20DI%20)%20%5B!imp%5D%20e4043995d0774d7e94368ce5e8ca132d/ss2.png)

Burada client doıt’istart fonksiyonu içinde kullanıyor . Client service’e bağımlıdır. 

Client çalışması için Service’e ihtiyacı var .

---

![dd1.png](Dependency%20Injection%20(%20DI%20)%20%5B!imp%5D%20e4043995d0774d7e94368ce5e8ca132d/dd1.png)

A P’yi extend etmiş abstraction var .  `(is a)`

I’yı implemente etmiş Realization var (soyut methodaları yazmış gerçekleştirmiş).  `(is a)`

A B,C,D’yi kullanıyor usage işlemidir.

<aside>
🌟 **Dependency Injection**

</aside>

nesneyi kendimiz oluşturabiliriz . pek tavsiye edilmez. Service clienta bağlıdır.  **`ss1`**

![ss1.png](Dependency%20Injection%20(%20DI%20)%20%5B!imp%5D%20e4043995d0774d7e94368ce5e8ca132d/ss1%201.png)

![ss2.png](Dependency%20Injection%20(%20DI%20)%20%5B!imp%5D%20e4043995d0774d7e94368ce5e8ca132d/ss2%201.png)

                     **`ss1`**                                                                                         **`ss2`**

---

`Çoğu zaman bir nesneyi oluşturmak kullanmaktan daha zordur.`

⭐ Service’ı başka yerde oluşturup ctor’a geçebilirz . bağımlılık hala vardır ama daha azdır.  **`ss2`**

> Kullanacağımız nesneyi başka yerde yaratıp bunu kullanılacak yere vermeye `Dependency Injection` denir.
> 

factoryler işimize yarar.