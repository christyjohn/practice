package ch10.exception_handling;

public class Exc2 {
	public static void main(String[] args) {
		int d, a;
		
		try {
			d = 0;
			a = 42 / d;
			System.out.println("This will not be printed.");
		} catch (Exception e) {
			System.out.println("Division by zero.");
			System.out.println("After catch statement.");
		}
	}
}
