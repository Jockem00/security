package se.coredev.security.ex2;

public final class UserFixed {
	
	private final String username;

	public UserFixed(String username) {
		this.username = username;
	}

	public String getUsername() {
		return username;
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
		return username.hashCode();
	}

	@Override
	public String toString() {
		return username;
	}
}
