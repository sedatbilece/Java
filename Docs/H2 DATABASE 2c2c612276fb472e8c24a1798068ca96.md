# H2 DATABASE

Tarih: November 10, 2022 2:31 PM
Tip: KonuNotu

[https://github.com/sedatbilece/Spring-h2db](https://github.com/sedatbilece/Spring-h2db)

Spring initalizr’da h2 Database eklenmeli 

[application.properties](http://application.properties) üzerinde

```
spring.datasource.url=jdbc:h2:mem:testdb;NON_KEYWORDS=USER
spring.h2.console.enabled=true
spring.data.jpa.repositories.bootstrap-mode=default
spring.jpa.defer-datasource-initialization=true
```

yapılmalı 

[http://localhost:8080/h2-console](http://localhost:8080/h2-console) diyince gelen menude 

url [app.properties](http://app.properties) ile aynı olmalı

<aside>
⚠️ H2 database özelliği

</aside>

uygulamayı her başlattığımızda yeniden kurulur yani içindeki veriler silinir

`Resources` klasörü altında `data.sql` dosyası oluşturup db fieldlarını burda doldurabiliriz.

```sql
//data.sql
create table person (
id integer not null,
name varchar(255) not null,
location varchar(255) not null,
birth_date timestamp,
primary key(id)
);

 INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (0001 , 'vedat1' , 'ord' , CURRENT_TIMESTAMP);
 INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (0002 , 'vedat2' , 'ord' , CURRENT_TIMESTAMP);
 INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (0003 , 'sedat' , 'ist' , CURRENT_TIMESTAMP);
 INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (0004 , 'sedat2' , 'ord' , CURRENT_TIMESTAMP);
 INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES (0005 , 'sedat3' , 'Ank' , CURRENT_TIMESTAMP);
```

<aside>
⚠️ jpa kullanırkern table create etmeye gerek yok @Entity oto create ediyor

</aside>