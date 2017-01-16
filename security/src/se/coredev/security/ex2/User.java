package se.coredev.security.ex2;

public final class User {

	private final String username;

	public User(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof User) {
			User u = (User) o;
			return username.equals(u.username);
		}
		return false;
	}

	@Override
	public String toString() {
		return username;
	}
}