package book1.ch07.objects_classes;

import java.time.Instant;
import java.util.Objects;
import java.util.function.Supplier;

public class ObjectsTest {
	public static void main(String[] args) {
		// Compute hash code for two integers, a char, and a string
		int hash = Objects.hash(10, 8900, '\u20b9', "Hello");
		System.out.println("hash Code is " + hash);
		
		// Test for equality
		boolean isEqual = Objects.equals(null, null);
		System.out.println("null is equal to null: " + isEqual);
		
		isEqual = Objects.equals(null, "XYZ");
		System.out.println("null is equal to XYZ: " + isEqual);
		
		// Testing requireNonNull(T obj, String message)
		try {
			printName("Doug Dyer");
			printName(null);
		}
		catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		// requireNonNull(T obj, Supplier<String> messageSupplier)
		try {
			// Using a lambda expression to create a Supplier<String> object.
			// The Supplier returns a timestamped message.
			Supplier<String> messageSupplier = () -> "Name is required. Error generated	on "
					+ Instant.now();
					
			printNameWithSuplier("Babalu", messageSupplier);
			printNameWithSuplier(null, messageSupplier);
		}
		catch (NullPointerException e) {
		System.out.println(e.getMessage());
		}
	}
	
	public static void printName(String name) {
		// Test name for not null. Generate a NullPointerException if it is null.
		Objects.requireNonNull(name, "Name is required.");
		
		// Print the name if the above statement dod not throw an exception
		System.out.println("Name is " + name);
	}
	
	public static void printNameWithSuplier(String name, Supplier<String> messageSupplier) {
		// Test name for not null. Generate a NullPointerException if it is null.
		Objects.requireNonNull(name, messageSupplier);
		
		// Print the name if the above statement dod not throw an exception
		System.out.println("Name is " + name);
	}
}