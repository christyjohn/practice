package book1.ch06.classes_objects;

public class StaticInitializer {
	private static int num;
	
	// An instance initializer
	{
		System.out.println("Inside instance initializer.");
	}
	
	// A static initializer
	static {
		num = 1234;
		System.out.println("Inside static initializer.");
	}
	
	public StaticInitializer() {
		System.out.println("Inside constructor.");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main() #1. num: " + num);
		
		StaticInitializer si;
		
		System.out.println("Inside main() #2. num: " + num);
		
		new StaticInitializer();
		
		System.out.println("Inside main() #3. num: " + num);
		
		new StaticInitializer();
	}
}
