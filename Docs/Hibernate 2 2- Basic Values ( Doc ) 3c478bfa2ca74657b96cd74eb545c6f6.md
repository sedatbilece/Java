# Hibernate 2.2- Basic Values ( Doc )

Tarih: November 4, 2022 10:15 AM
Tip: KonuNotu

![Untitled](Hibernate%202%202-%20Basic%20Values%20(%20Doc%20)%203c478bfa2ca74657b96cd74eb545c6f6/Untitled.png)

<aside>
🌟 Mapping types

</aside>

basit bir tablo ve domain modeli 

```sql
create table Contact (
    id integer not null,
    first varchar(255),
    last varchar(255),
    middle varchar(255),
    notes varchar(255),
    starred boolean not null,
    website varchar(255),
    primary key (id)
)
```

```java
@Entity(name = "Contact")
public static class Contact {
	@Id
	private Integer id;

	private Name name;

	private String notes;

	private URL website;

	private boolean starred;
@Embeddable
public class Name {

	private String firstName;

	private String middleName;

	private String lastName;

}
```

<aside>
🌟 Veri Tipleri

</aside>

| Category | Package | Types |
| --- | --- | --- |
| Java primitive types |  | boolean, int, double, etc. |
| Primitive wrappers | java.lang | Boolean, Integer, Double, etc. |
| Strings | java.lang | String |
| Arbitrary-precision numeric types | java.math | BigInteger and BigDecimal |
| Date/time types | java.time | LocalDate, LocalTime, LocalDateTime, OffsetTime, OffsetDateTime, Instant |
| Deprecated date/time types | java.util | Date and Calendar |
| Deprecated date/time types from | java.sql | Date, Time, Timestamp |
| Byte and character arrays |  | byte[] or Byte[], char[] or Character[] |
| Java enumerated types |  | Any enum |
| Serializable types |  | Any type that implements java.io.Serializable[1] |

<aside>
🌟 `**@Basic**` Annotation

</aside>

```java
@Entity(name = "Product")
public class Product {
	@Id
	private Integer id;
	private String sku;
	private String name;
	private String description;
}
```

Şu şekilde yazıldığında aslında her nesne @Basic kullanır fakat gözükmez

alttaki kod ile aynı

```java
@Entity(name = "Product")
public class Product {
	@Id
	@Basic
	private Integer id;
	@Basic
	private String sku;
	@Basic
	private String name;
	@Basic
	private String description;
}
```

2 parametresi bulunur.

`optional`  : true(default) or false : null değer almak üzerine

`fetch` : Eager(def.) or Lazy  : verinin data çekilirken mi geleceği(eager) yoksa daha sonra istek ile mi geleceği(lazy)

<aside>
🌟 `@Column` Annotation

</aside>

colon ismi tanımlamamızı sağlar diğer türlü default kolon ismi değişkenin ismi verilir.

```java
@Entity(name = "Product")
public class Product {

	@Id
	private Integer id;

	private String sku;

	private String name;

	@Column(name = "NOTES")
	private String description;
}
```

<aside>
🌟 `@Formula` Annotation

</aside>

Diğer değerleri sanal okur ve üzerinden işlem yapmamızı sağlar

```java
@Entity(name = "Account")
public static class Account {
	@Id
	private Long id;
	private Double credit;
	private Double rate;
	@Formula(value = "credit * rate")
	private Double interest;
}
```

post vb işlemlerde interest değerini vermesek bile credit ve rate’i çarparak o kolonu doldurur.

<aside>
🌟 `@Enumerated` Annotation

</aside>

```java
@Entity(name = "Phone")
public static class Phone {

	@Id
	private Long id;

	@Column(name = "phone_number")
	private String number;

	@Enumerated(EnumType.ORDINAL)
	@Column(name = "phone_type")
	private PhoneType type;
}

//java
Phone phone = new Phone();
phone.setId(1L);
phone.setNumber("123-456-78990");
phone.setType(PhoneType.MOBILE);
entityManager.persist(phone);

//sql
INSERT INTO Phone (phone_number, phone_type, id)
VALUES ('123-456-78990', 1, 1)
```

<aside>
🌟 Boolean

</aside>

```java
// this will be mapped to BIT or BOOLEAN on the database
@Basic
boolean implicit;
```

tanımlama yaparken db ‘den dönecek boolean için farklı tanımlamalar yapılabilir 

```java
//tip:CHAR or NCHAR value 'Y' or 'N'
@Convert(converter = org.hibernate.type.YesNoConverter.class)
boolean convertedYesNo;

//tip:CHAR or NCHAR value 'T' or 'F'
@Convert(converter = org.hibernate.type.TrueFalseConverter.class)
boolean convertedTrueFalse;

//tip:TINYINT value 1 or 0
@Convert(converter = org.hibernate.type.NumericBooleanConverter.class)
boolean convertedNumeric;
```

<aside>
🌟 Diğer türler ve tanımları

</aside>

```java
// these will both be mapped using TINYINT
Byte wrapper;
byte primitive;

// these will both be mapped using SMALLINT
Short wrapper;
short primitive;

// these will both be mapped using INTEGER
Integer wrapper;
int primitive;

// these will both be mapped using BIGINT
Long wrapper;
long primitive;

// will be mapped using NUMERIC
BigInteger wrapper;

// these will be mapped using DOUBLE, FLOAT, REAL or NUMERIC
// depending on the capabilities of the database
Double wrapper;
double primitive;

// these will be mapped using FLOAT, REAL or NUMERIC
// depending on the capabilities of the database
Float wrapper;
float primitive;

// will be mapped using NUMERIC
BigDecimal wrapper;

// these will be mapped using CHAR
Character wrapper;
char primitive;

// will be mapped using VARCHAR
String string;

// will be mapped using CLOB
@Lob
String clobString;

// mapped as NVARCHAR
@Nationalized
char[] primitiveNVarchar;
@Nationalized
Character[] wrapperNVarchar;

// mapped as NCLOB
@Lob
@Nationalized
char[] primitiveNClob;
@Lob
@Nationalized
Character[] wrapperNClob;
```

<aside>
🌟 Date and Time

</aside>

```java
// INTERVAL_SECOND SQL
private Duration duration;

// mapped as TIMESTAMP
private Instant instant;

// mapped as DATE
private LocalDate localDate;

// mapped as TIMESTAMP
private LocalDateTime localDateTime;

// mapped as TIME
private LocalTime localTime

// mapped as TIMESTAMP or TIMESTAMP_WITH_TIMEZONE
private OffsetDateTime offsetDateTime;

// mapped as VARCHAR
private TimeZone timeZone;
```