package book1.ch06.classes_objects;

public class InstanceInitializer {
	{
		System.out.println("Inside instance initializer 1.");
	}
	
	{
		System.out.println("Inside instance initializer 2.");
	}
	
	public InstanceInitializer() {
		System.out.println("Inside no-args constructor.");
	}
	
	public static void main(String[] args) {
		InstanceInitializer ii = new InstanceInitializer();
	}
}
