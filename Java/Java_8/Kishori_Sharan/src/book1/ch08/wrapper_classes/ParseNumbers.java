package book1.ch08.wrapper_classes;

public class ParseNumbers {
	public static void main(String[] args) {
		String str = "01111111";
		int radix = 2;
		
		// Creates an Integer object from the string
		Integer intObject = Integer.valueOf(str, radix);
		
		// Extracts the int value from string
		int intValue = Integer.parseInt(str, 2);
		
		System.out.println("str = " + str);
		System.out.println("intObject = " + intObject);
		System.out.println("intValue = " + intValue);
		
		String str1 = "123.89";
		try {
			double value1 = Double.parseDouble(str1);
			System.out.println("value1 = " + value1);
		} catch (NumberFormatException e) {
			System.out.println("Error in parsing " + str1);
		}
		
		String str2 = "78H.90"; // An invalid double
		try {
			double value2 = Double.parseDouble(str2);
			System.out.println("value2 = " + value2);
		} catch (NumberFormatException e) {
			System.out.println("Error in parsing " + str1);
		}
	}
}
