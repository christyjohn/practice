package book1.ch08.wrapper_classes;

public class BooleanWrapperExample {
	public static void main(String[] args) {
		// Using constructors
		Boolean b11True = new Boolean(true);
		Boolean b21True = new Boolean("true");
		Boolean b31True = new Boolean("tRuE");
		Boolean b41False = new Boolean("false");
		Boolean b51False = new Boolean("how is this"); // false
		
		// Using the factory methods
		Boolean b12True = Boolean.valueOf(true);
		Boolean b22True = Boolean.valueOf("true");
		Boolean b32True = Boolean.valueOf("tRuE");
		Boolean b42False = Boolean.valueOf("false");
		Boolean b52False = Boolean.valueOf("how is this"); // false
		
		// Getting a boolean value from a Boolean object
		boolean bbTrue = b12True.booleanValue();
		
		// Parsing strings to boolean values
		boolean bTrue = Boolean.parseBoolean("true");
		boolean bFalse = Boolean.parseBoolean("This string evaluates to false");
		
		// Using constants
		Boolean bcTrue = Boolean.TRUE;
		Boolean bcFalse = Boolean.FALSE;
		
		// Printing some Boolean objects
		System.out.println("bcTrue = " + bcTrue);
		System.out.println("bcFalse = " + bcFalse);
	}
}
