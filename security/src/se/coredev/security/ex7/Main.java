package se.coredev.security.ex7;

public class Main {
	
	public static void main(String[] args) {
		String userAsString = "anca01;Anders;Carlsson";
		User anca01 = UserFactory.createUserFromString(userAsString);
		
		System.out.println(anca01);
	}
}
