package book1.ch06.classes_objects;

public class MethodTypeTest {

	public static void main(String[] args) {
		// Create an instance of the MethodTYpe class
		MethodType mt = new MethodType();
		
		System.out.println("Invoking instance method...");
		
		mt.printMN();
		
		System.out.println("Invoking class method on class name...");
		
		MethodType.printM();
		
		System.out.println("Invoking class method on an instance...");
		
		mt.printM();
	}

}
