# React üzerindeki Cors hatası Çözümü

Tarih: October 26, 2022 10:47 AM
Tip: Hata

[](https://www.baeldung.com/spring-cors)

Controller üzerine @CrossOrigin yazarak çözülebilir

<aside>
🌟 Cors Nedir ?

</aside>

**Cross-Origin Resource Sharing farklı domain kullanan uygulamaların erişim iznini sağlayan uygulamadır**

[adomain.com](http://adomain.com) ve [bdoamin.com](http://bdoamin.com) arasındaki iletişim gibi

veya localdeki farklı portlardaki iki uygulama örnek verilebilir :

[localhost:8080](http://localhost:8080) ve [localhost:3000](http://localhost:3000) arasındaki bağlantı gibi

   `Spring`                   `React`

Farklı originlere erişimde cors ayarları yapılması gerekebilir.