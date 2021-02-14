package book1.ch11.strings;

public class StringBuilderTest {
	public static void main(String[] args) {
		// Create an empty StringBuilder
		StringBuilder sb = new StringBuilder();
		printDetails(sb);
		
		// Append "blessings"
		sb.append("blessings");
		printDetails(sb);
		
		// Insert "Good " in the beginning
		sb.insert(0, "Good ");
		printDetails(sb);
		
		// Delete the first o
		sb.deleteCharAt(1);
		printDetails(sb);
		
		// Append " be with you"
		sb.append(" be with you");
		printDetails(sb);
		
		// Set the length to 3
		sb.setLength(3);
		printDetails(sb);
		
		// Reverse the content
		sb.reverse();
		printDetails(sb);
	}
	
	public static void printDetails(StringBuilder sb) {
		System.out.println("Content: \"" + sb + "\"");
		System.out.println("Length: " + sb.length());
		System.out.println("Capacity: " + sb.capacity());
		
		// Print an empty line to separate results
		System.out.println();
	}
}
