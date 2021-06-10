package innerclasses.telusko;

public class LambdaTest {
	public static void main(String[] args) {
		FI obj = () -> System.out.println("Hello from anonymous inner class extended from FI");
				
		obj.show();
	}
}


@FunctionalInterface
interface FI {
	void show();	
}
