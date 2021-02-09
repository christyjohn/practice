package book1.ch11.strings;

public class StringOperations {
	public static void main(String[] args) {
		String str1 = "HELLO";
		String str2 = "Hello";
		
		// Get the length of string
		int len = str1.length();
		
		// Loopthrough all characters and print their indexes
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
	}	
}
