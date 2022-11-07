# Hibernate 2.3 - Embeddable Values (Doc)

Tarih: November 4, 2022 11:23 AM
Tip: KonuNotu

<aside>
🌟 `@Embeddable` Annotation

</aside>

```java
@Entity(name = "Book")
public static class Book {
	@Id
	@GeneratedValue
	private Long id;
	private String title;
	private String author;
	private Publisher publisher;
}

@Embeddable //buradaki entity içeriğini Book classına ekliyor
public static class Publisher {
	@Column(name = "publisher_name")
	private String name;
	@Column(name = "publisher_country")
	private String country;
}

//SQL KARŞILIĞI :
create table Book (
    id bigint not null,
    author varchar(255),
    publisher_country varchar(255),
    publisher_name varchar(255),
    title varchar(255),
    primary key (id)
)
```

<aside>
🌟 `@Target` Annotation

</aside>

interface’i  `city` içinde kullanmak istiyorum fakat implemente edilmiş bir değer olmalıki tutsun `gps`de gelen veriyi işleyip tutucağız fakat bunu `city` ye söylememiz lazım bunun için `@target` ile imğlementasyonu gösterilmiş olur

```java
@Entity(name = "City")
public static class City {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Embedded
	***@Target(GPS.class)***
	private Coordinates coordinates;

	//Getters and setters omitted for brevity

}

public interface Coordinates {
	double x();
	double y();
}

@Embeddable
public static class GPS implements Coordinates {

	private double latitude;

	private double longitude;

	private GPS() {
	}

	public GPS(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public double x() {
		return latitude;
	}

	@Override
	public double y() {
		return longitude;
	}
}

```