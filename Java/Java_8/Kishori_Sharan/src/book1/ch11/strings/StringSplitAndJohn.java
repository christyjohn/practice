package book1.ch11.strings;

public class StringSplitAndJohn {
	public static void main(String[] args) {
		String str = "AL,FL,NY,CA,GA";
		
		// Split str using a comma as the delimiter
		String[] parts = str.split(",");
		
		// Print the the string and its parts
		System.out.println(str);
		
		for(String part : parts) {
			System.out.println(part);
		}
		
		// Join some strings using a colon as the delimiter
		str = String.join(":", "AL", "FL", "NY", "CA", "GA");
		System.out.println(str);
	}
}
