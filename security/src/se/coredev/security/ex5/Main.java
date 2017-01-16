package se.coredev.security.ex5;

import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String args[]) throws Exception {
		User user = new User("master", "2000-06-01");
		User clone = new User("master", "2000-06-00");

		Set<User> users = new HashSet<>();
		users.add(user);
		users.add(clone);
		clone.getRegistrationDate().setTime(user.getRegistrationDate().getTime());
		
		System.out.println(users.size());
	}
}
