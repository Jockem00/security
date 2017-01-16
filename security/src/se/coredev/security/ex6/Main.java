package se.coredev.security.ex6;

import java.lang.reflect.Field;

public class Main {
	public static void main(String[] args) throws Exception {
		
		Unsafe unsafe = new Unsafe();
		Class<? extends Unsafe> clazz = unsafe.getClass();
		
		Field[] fields = clazz.getDeclaredFields();
		
		for(int i = 0; i < fields.length; i++){
			fields[i].setAccessible(true);
			System.out.println("Field name:" + fields[i]);
			System.out.println("Field value:" + fields[i].get(unsafe));
		}
	}
}
