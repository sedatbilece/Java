# Java - Stream API

Tarih: December 14, 2022 2:08 PM
Tip: KonuNotu

Gezinilebilecek bir nesne üzerinden `.stream()` ile akış başlatılır.

<aside>
🌟 liste için basic bir user classı oluşturuldu aynı paket içinde

</aside>

```java
package streamapi;
public class User {
		int id;
		String name;
		
		public User(int id,String name) {
			this.id=id;
			this.name=name;
		}
	@Override
	public String toString() {
		return "User [id:" + id +"name: "+ name  + "]";
	}
	public void talk() {
		System.out.println("Hi I'm "+this.name);
	}
}
```

```java
//main
List<User> users =new ArrayList<>();
		
		users.add(new User(1,"Sedat"));
		users.add(new User(2,"Fatma"));
		users.add(new User(3,"Aleyna"));
		users.add(new User(4,"Furkan"));
		users.add(new User(5,"Kadir"));
		users.add(new User(6,"Ceren"));
		users.add(new User(7,"Akif"));
//listeye elemanlar eklendi
```

<aside>
🌟 ForEach - Gezinme

</aside>

```java
users.stream().forEach(user ->{
			System.out.println("java 8");
			System.out.println(user.toString());
		});
		
		users.stream().forEach(user->user.talk());

		users.stream().forEach(User::talk);//method reference
```

<aside>
🌟 Filter - Filtreleme syntaxı

</aside>

```java
int count = (int) users.stream().filter(user -> user.id>5).count(); 
System.out.println("Count: "+count);
		
List<User> filteredList =users.stream().filter(user -> user.id>5)
.collect(Collectors.toList());//a new list
```

<aside>
🌟 Map - değişiklik yapma

</aside>

```java
List<User> mappedList = users.stream()
				.map(user -> new User(user.id+100,user.name))
						.collect(Collectors.toList());
//for print
		mappedList.stream().forEach(user->
System.out.println(user.toString()));
```