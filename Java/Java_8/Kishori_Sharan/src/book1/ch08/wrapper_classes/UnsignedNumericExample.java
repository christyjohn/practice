package book1.ch08.wrapper_classes;

public class UnsignedNumericExample {
	public static void main(String[] args) {
		byte b = -10;
		int x = Byte.toUnsignedInt(b);
		System.out.println("Signed value in byte = " + b);
		System.out.println("Unsigned value in byte = " + x);
		
		// Two negative ints
		x = -10;
		int y = -2;
		
		// Performs signed division
		System.out.println("Signed x = " + x);
		System.out.println("Signed y = " + y);
		System.out.println("Signed x/y = " + (x/y));
		
		// Performs unsigned division by treating x and y holding unsigned values
		long ux = Integer.toUnsignedLong(x);
		long uy = Integer.toUnsignedLong(y);
		int uQuotient = Integer.divideUnsigned(x, y);
		System.out.println("Unsigned x = " + ux);
		System.out.println("Unsigned y = " + uy);
		System.out.println("Unsigned x/y = " + uQuotient);
	}
}
