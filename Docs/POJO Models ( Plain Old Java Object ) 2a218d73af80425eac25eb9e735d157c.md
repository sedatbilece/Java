# POJO Models ( Plain Old Java Object )

Tarih: November 7, 2022 9:22 AM
Tip: KonuNotu

```java
public class SomePojo {
    private String fname;
    private String lname;

    public SomePojo(String fname, String lname) {
        this.fname = fname;
        this.lname = lname;
    }

    private String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
}
```

Oluşturmuş olduğumuz bu java sınıfı framework’lerden bağımsız istenildiği gibi kullanılabilir. Başka herhangi bir nesne ile bağlantısı olmayan, bünyesinde instance variable, constructor, getter, setter ve toString gibi metodları barındırabilen en temel objeye POJO ismi verilir

**Her Java Bean bir POJO’dur. Ancak her POJO bir Java Bean değildir .**

<aside>
🌟 *Simple* `@Entity` *with* `@Table`

</aside>

```java
@Entity(name = "Book")
 @Table(
         catalog = "public",
         schema = "store",
         name = "book"
)
 public static class Book {
     @Id
     private Long id;
     private String title;
     private String author;
 }
```

<aside>
🌟 **`@Subselect`** Annotation

</aside>

```java
@Entity(name = "Client")
@Table(name = "client")
public static class Client {
	@Id
	private Long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
}

@Entity(name = "Account")
@Table(name = "account")
public static class Account {
	@Id
	private Long id;
	@ManyToOne
	private Client client;
	private String description;
}

@Entity(name = "AccountTransaction")
@Table(name = "account_transaction")
public static class AccountTransaction 
	@Id
	@GeneratedValue
	private Long id;
	@ManyToOne
	private Account account;
	private Integer cents;
	private String description;
}

@Entity(name = "AccountSummary")
@Subselect(
	"select " +
	"	a.id as id, " +
	"	concat(concat(c.first_name, ' '), c.last_name) as clientName, " +
	"	sum(atr.cents) as balance " +
	"from account a " +
	"join client c on c.id = a.client_id " +
	"join account_transaction atr on a.id = atr.account_id " +
	"group by a.id, concat(concat(c.first_name, ' '), c.last_name)"
)
@Synchronize({"client", "account", "account_transaction"})
public static class AccountSummary {
	@Id
	private Long id;
	private String clientName;
	private int balance;
}
```