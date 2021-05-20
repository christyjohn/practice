package book1.ch06.classes_objects;

public class MethodTypeTest {
	public static void main(String[] args) {
		// Create an instance of the MethodTYpe class
		MethodType mt = new MethodType();
		
		System.out.println("Invoking instance method...");
		
		// invoke an instance method
		mt.printMN();
		
		System.out.println("Invoking class method on class name...");
		
		// Invoke the class method using the class name
		MethodType.printM();
		
		System.out.println("Invoking class method on instance...");
		
		// Invoke the class method using the instance reference
		mt.printM();
	}
}
