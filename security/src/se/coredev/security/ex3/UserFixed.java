package se.coredev.security.ex3;

public final class UserFixed {
	
	private String username;

	public UserFixed(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
	}

	public UserFixed setUsername(String username) {
		return new UserFixed(username);
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof UserFixed) {
			UserFixed u = (UserFixed) o;
			return username.equals(u.username);
		}

		return false;
	}

	@Override
	public int hashCode() {
		return 37 * username.hashCode();
	}

	@Override
	public String toString() {
		return username;
	}
}
