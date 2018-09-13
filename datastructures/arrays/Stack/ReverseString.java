import java.util.Scanner;

/*The base stack class is in separated out as a separate class as 
 * it is being used in multiple programs.
 *
 * It is present in the same package at 
 * https://github.com/christyjohn/practice/blob/master/datastructures/arrays/Stack/CharStack.java
 */
public class ReverseString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the word to be reversed");
		
		String word = null;
		if(scanner.hasNext()) {
			word = scanner.nextLine();
		}
		
		System.out.println("The entererd word is : " + word);
		
		int stringSize = word.length();
		
		CharStack stck = new CharStack(stringSize);
		
		// pushing char to stack
		for(int i = 0; i < stringSize; i++) {
			stck.push(word.charAt(i));
		}
		
		String reverseWord = null;
		
		// creating an array to get the items from stack in reverse order
		char[] revArr = new char[stringSize];
		
		for(int i = stringSize-1; i >= 0; i--) {
			revArr[stringSize - (i + 1)] = stck.pop();
		}
		
		System.out.println("The reversed word is : " + new String(revArr));
	}
}
