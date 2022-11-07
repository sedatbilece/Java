# Spring JPA Database bağlantısı

Tarih: October 20, 2022 1:31 PM
Tip: KonuNotu

mysql üzerinden db’yi oluşturmak gerekli

Spring initializr üzerinde `Spring data jpa` ve `mysql driver` eklenmeli

![ss1.png](Spring%20JPA%20Database%20bag%CC%86lant%C4%B1s%C4%B1%205d6905bb85c449acb933d587568f78bd/ss1.png)

[application.properties](http://application.properties) içerisinde db configürasyonu yapılmalı

```java
//[application.properties](http://application.properties) içinde
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/quest_app
spring.datasource.username=root
spring.datasource.password=13271327
spring.datasource.driver-class-name=com.mysql.jdbc.Driver
```

Projeyi çalıştırınca her çalıştırmada entityler güncellenirse ona göre db güncelleniyor sanırım.