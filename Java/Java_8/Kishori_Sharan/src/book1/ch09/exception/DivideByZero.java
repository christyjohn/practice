package book1.ch09.exception;

public class DivideByZero {
	public static void main(String[] args) {
		int x = 10, y = 0, z;
		z = x/y;
		System.out.println("z = " + z);
	}
}