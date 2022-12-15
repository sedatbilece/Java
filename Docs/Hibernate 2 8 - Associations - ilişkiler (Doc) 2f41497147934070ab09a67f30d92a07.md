# Hibernate 2.8 - Associations - ilişkiler (Doc)

Tarih: November 24, 2022 11:55 AM
Tip: KonuNotu

<aside>
🌟 `@ManyToOne` ***Associations***

</aside>

bir telefonun ortak birden fazla sahibi olabilir ev telefonu gibi birkaç kişi tek bir telefona bağlı 

kategori mantığında 

```java
@Entity(name = "Person")
public static class Person {
	@Id
	@GeneratedValue
	private Long id;

}
@Entity(name = "Phone")
public static class Phone {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "`number`")
	private String number;

	@ManyToOne
	@JoinColumn(name = "person_id",foreignKey = @ForeignKey(name = "PERSON_ID_FK") )
	private Person person;

}
```

<aside>
🌟 **`@OneToMany` Associations**

</aside>

bir kişinin birden fazla telefon numarası olabilir.

kategorinin içindeki ürünler gibi

```java
@Entity(name = "Person")
public static class Person {
	@Id
	@GeneratedValue
	private Long id;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Phone> phones = new ArrayList<>();
}

@Entity(name = "Phone")
public static class Phone {
	@Id
	@GeneratedValue
	private Long id;

	@Column(name = "`number`")
	private String number;

}
```

<aside>
🌟 *Unidirectional* `@OneToOne` **Associations**

</aside>

her numaranın 1 açıklama özelliği bulunur.

```java
@Entity(name = "Phone")
public static class Phone {
	@Id
	@GeneratedValue
	private Long id;
	@Column(name = "`number`")
	private String number;

	@OneToOne
	@JoinColumn(name = "details_id")
	private PhoneDetails details;
}

@Entity(name = "PhoneDetails")
public static class PhoneDetails {
	@Id
	@GeneratedValue
	private Long id;
	private String provider;
	private String technology;
}
```

*Bidirectional* `@OneToOne` için Details içinde Phone tutar ve lazy load yaparız gibi birşey (burayı tam anlamadım)

<aside>
🌟  *Unidirectional***`@ManyToMany` Associations**

</aside>

```java
@Entity(name = "Person")
public static class Person {

	@Id
	@GeneratedValue
	private Long id;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Address> addresses = new ArrayList<>();
}

@Entity(name = "Address")
public static class Address {

	@Id
	@GeneratedValue
	private Long id;
	private String street;

	@Column(name = "`number`")
	private String number;
}
```

ara bir tablo ilede sağlanabilir bu yapı : `Bidirectional many-to-many with link entity`

<aside>
🌟 İlişki bulunamaz ise **`@NotFound`**

</aside>

```java
@NotFound(action = NotFoundAction.EXCEPTION) // hata fırlat (Default)
@NotFound(action = NotFoundAction.IGNORE) // ihmal et

```

```java
@Entity(name = "Person")
@Table(name = "Person")
public static class Person {
	@Id
	private Integer id;
	private String name;

	@ManyToOne
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name = "city_fk", referencedColumnName = "id")
	private City city;
}
@Entity(name = "City")
@Table(name = "City")
public static class City implements Serializable {
	@Id
	private Integer id;
	private String name;
}
```

<aside>
🌟 `@JoinFormula` *mapping usage*

</aside>

```java
@Entity(name = "User")
@Table(name = "users")
public static class User {
	@Id
	private Long id;
	private String firstName;
	private String lastName;
	private String phoneNumber;

	@ManyToOne
	@JoinFormula("REGEXP_REPLACE(phoneNumber, '\\+(\\d+)-.*', '\\1')::int")
	private Country country;
}

@Entity(name = "Country")
@Table(name = "countries")
public static class Country {
	@Id
	private Integer id;
	private String name;
}
```