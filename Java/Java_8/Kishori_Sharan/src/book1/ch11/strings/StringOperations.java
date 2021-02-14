package book1.ch11.strings;

public class StringOperations {
	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = "Hello";
		
		// Get the length of string
		int len = str1.length();
		
		// Loop through all characters and print their indexes
		for (int i = 0; i < len; i++) {
			System.out.println(str1.charAt(i) + " has index " + i);
		}
		
		if (str1.equalsIgnoreCase(str2)) {
			System.out.println("Ignoring case str1 and str2 are equal");
		} else {
			System.out.println("Ignoring case str1 and str2 are not equal");
		}
		
		if (str1.equals(str2)) {
			System.out.println("str1 and str2 are equal");
		} else {
			System.out.println("str1 and str2 are not equal");
		}
		
		System.out.println("\n");
		
		str2 = "";
		
		// Using the isEmpty() method
		boolean empty1 = str1.isEmpty(); // Assigns false to empty1
		boolean empty2 = str2.isEmpty(); // Assigns true to empty1
		System.out.println(empty1);
		System.out.println(empty2);
		
		// Using the equals() method
		boolean empty3 = "".equals(str1); // Assigns false to empty3
		boolean empty4 = "".equals(str2); // Assigns true to empty4
		System.out.println(empty3);
		System.out.println(empty4);
		
		// Comparing length of the string with 0
		boolean empty5 = str1.length() == 0; // Assigns false to empty5
		boolean empty6 = str2.length() == 0; // Assigns true to empty6
		System.out.println(empty5);
		System.out.println(empty6);
		
		System.out.println("\n");
		
		// Changing case
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		System.out.println("\n");
		
		String str3 = new String("Apple");
		System.out.println(str3.indexOf('p'));
		System.out.println(str3.indexOf("pl"));
		System.out.println(str3.lastIndexOf('p'));
		System.out.println(str3.lastIndexOf("pl"));
		System.out.println(str3.indexOf("k"));		

		System.out.println("\n");
		
		//valueOf
		System.out.println(String.valueOf('C'));
		System.out.println(String.valueOf("10"));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(1969));

		System.out.println("\n");
				
		// Getting a sub string
		System.out.println("Hello".substring(1));
		System.out.println("Hello".substring(1, 4));

		System.out.println("\n");
		
		// trimming a String
		System.out.println(" hello ".trim());
		System.out.println("hello ".trim());
		System.out.println("\n \r \t hello\n\n\n\r\r".trim());
		System.out.println("h ello".trim());

		System.out.println("\n");
		
		// replacing part of a String
		String oldStr = new String("tooth");
		System.out.println(oldStr.replace('o', 'e'));

		System.out.println("\n");
		
		String str = "This is a Java program";
		// Test str, if it starts with "This"
		if (str.startsWith("This")){
		System.out.println("String starts with This");
		}
		else {
		System.out.println("String does not start with This");
		}
		// Test str, if it ends with "program"
		if (str.endsWith("program")) {
			System.out.println("String ends with program");
		}
		else {
			System.out.println("String does not end with program");
		}
		
		// Test str, if it ends with "program"
		if (str.endsWith("program")) {
			System.out.println("String ends with program");
		}
		else {
			System.out.println("String does not end with program");
		}
		
	}	
}
