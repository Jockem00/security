package se.coredev.security.ex7;

import java.util.Optional;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserFactoryFixed {

	public static Optional<User> createUserFromString(String userAsString) {

		String[] values = userAsString.split(";");

		if (values.length < 3) {
			return Optional.empty();
		}

		return Optional.of(new UserImpl(values[0], values[1], values[2]));
	}

	private static final class UserImpl implements User {

		private final String userName;
		private final String firstName;
		private final String lastName;

		public UserImpl(String userName, String firstName, String lastName) {
			this.userName = userName;
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String getUserName() {
			return userName;
		}

		public String getFirstName() {
			return firstName;
		}

		public String getLastName() {
			return lastName;
		}

		@Override
		public String toString() {
			return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
		}
	}
}
