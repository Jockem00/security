package se.coredev.security.ex5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class UserFixed {
	private static final SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
	private final String username;
	private final Date registrationDate;

	public UserFixed(String username, String registrationDateString) {
		this.username = username;
		this.registrationDate = toDate(registrationDateString);
	}

	public String getUsername() {
		return username;
	}

	public Date getRegistrationDate() {
		return new Date(registrationDate.getTime());
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof UserFixed) {
			UserFixed u = (UserFixed) o;
			return username.equals(u.username) && registrationDate.equals(u.registrationDate);
		}
		return false;
	}

	@Override
	public int hashCode() {
		int result = 1;
		result += 37 * username.hashCode();
		result += 37 * registrationDate.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SIMPLE_STYLE);
	}

	private static Date toDate(final String dateString) {
		try {
			return format.parse(dateString);
		} catch (ParseException e) {
			throw new IllegalArgumentException("Invalid date", e);
		}
	}
}
