package se.coredev.security.ex8;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {
		LonelyException lonelyException = LonelyException.INSTANCE;
		LonelyException clone = (LonelyException) deepCopy(lonelyException);

		System.out.println(lonelyException == clone);
	}

	private static Object deepCopy(final Object object) {
		try {
			ByteArrayOutputStream out = new ByteArrayOutputStream();
			new ObjectOutputStream(out).writeObject(object);
			ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
			return new ObjectInputStream(in).readObject();
		} catch (Exception e) {
			throw new RuntimeException("Ooops!");
		}
	}
}
