package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	
public static void main(String[] args) {
		
		System.out.println("hello world from java");
		
		List<User> users =new ArrayList<>();
		
		users.add(new User(1,"Sedat"));
		users.add(new User(2,"Fatma"));
		users.add(new User(3,"Aleyna"));
		users.add(new User(4,"Furkan"));
		users.add(new User(5,"Kadir"));
		users.add(new User(6,"Ceren"));
		users.add(new User(7,"Akif"));
		
		
		users.stream().forEach(user ->{
			System.out.println("java 8");
			System.out.println(user.toString());
		});
		
		users.stream().forEach(user->user.talk());
		users.stream().forEach(User::talk);//method reference
		
		int count = (int) users.stream().filter(user -> user.id>5).count(); 
		System.out.println("Count: "+count);
		
		List<User> filteredList =users.stream().filter(user -> user.id>5).collect(Collectors.toList());//a new list
		
		List<User> mappedList = users.stream()
				.map(user -> new User(user.id+100,user.name))
						.collect(Collectors.toList());
		mappedList.stream().forEach(user->System.out.println(user.toString()));
				

	}

}
