package co.edu.java.reflection.classes;

import java.lang.reflect.Field;

public class Reflection {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		
		Class fooClass = "foo".getClass();
		System.out.println("Foo String: " + fooClass);
		
		byte[] bytes = new byte[1024];
		Class bytesClass = bytes.getClass();
		System.out.println("Bytes: " + bytesClass);
		
		Class superClassJButton = javax.swing.JButton.class.getSuperclass();
		System.out.println("Super class: " + superClassJButton);
		
		Class<?>[] classesCharacter = Character.class.getClasses();
		for(Class c : classesCharacter ){
			System.out.println("Character: " + c);
		}
		
		Class<?>[] classesReflection = ReflectionClass.class.getClasses();
		for(Class c : classesReflection ){
			System.out.println("Public: " + c);
		}
		
		Class<?>[] allClassesReflection = ReflectionClass.class.getDeclaredClasses();
		for(Class c : allClassesReflection ){
			System.out.println("All: " + c);
		}
		
		try {
			Field attributeField = ReflectionClass.class.getField("attribute");
			Class c = attributeField.getDeclaringClass();
			System.out.println("Declaring classes: " + c + " - " + attributeField);
		} catch (NoSuchFieldException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		}
		
	}

}
