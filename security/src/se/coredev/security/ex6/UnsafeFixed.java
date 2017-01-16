package se.coredev.security.ex6;

public final class UnsafeFixed {
	
	static {
		System.setSecurityManager(new OurSecurityManager());
	}

	private final String masterPassword = "ultr4zicrii3t";

	public String getSecretMessage(String password) {
		if (masterPassword.equals(password)) {
			return "Hello master!";
		} else {
			return "Unauthorized!";
		}
	}

}
