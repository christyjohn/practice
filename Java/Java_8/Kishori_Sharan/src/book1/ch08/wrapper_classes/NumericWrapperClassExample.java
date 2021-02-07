package book1.ch08.wrapper_classes;

public class NumericWrapperClassExample {
	public static void main(String[] args) {
		// Creates an Integer object
		Integer intObj = Integer.valueOf(100);
		
		// Gets byte from Integer
		byte b = intObj.byteValue();
		
		// Gets double from Integer
		double dd = intObj.doubleValue();
		System.out.println("intObj = " + intObj);
		System.out.println("byte from intObj = " + b);
		System.out.println("double from intObj = " + dd);
		
		// Creates a Double object
		Double doubleObj = Double.valueOf("329.78");
		
		// Gets different types of primitive values from Double
		double d = doubleObj.doubleValue();
		float f = doubleObj.floatValue();
		int i = doubleObj.intValue();
		long l = doubleObj.longValue();
		
		System.out.println("doubleObj = " + doubleObj);
		System.out.println("double from doubleObj = " + d);
		System.out.println("float from doubleObj = " + f);
		System.out.println("int from doubleObj = " + i);
		System.out.println("long from doubleObj = " + l);
		
		
		
	}
}
