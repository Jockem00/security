package se.coredev.security.ex3;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Set<User> users = new HashSet<>();
		User master = new User("master");
		users.add(master);
		
//		users.add(new User("master"));
//		
//		System.out.println("Size: " + users.size());
		
		master.setUsername("xxx");
		users.add(new User("master"));
		master.setUsername("master");
		
		users.forEach(System.out::println);
		
		
		
	}
}
