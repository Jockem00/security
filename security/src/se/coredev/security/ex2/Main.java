package se.coredev.security.ex2;

import java.util.HashSet;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		
		Set<User> users = new HashSet<>();
		User user1 = new User("master");
		users.add(user1);
		User user2 = new User("master");
		System.out.println(users.contains(user2));
		System.out.println(user1.equals(user2));
	}
}
