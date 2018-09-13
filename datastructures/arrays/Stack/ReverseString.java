import java.util.Scanner;
//import jav.util.Arrays;

class CharStack {
	private int maxSize;
	private int top ;
	private char[] stackArray;
	
	public CharStack(int size) {
		stackArray = new char[size];
		maxSize = size;
		top = -1;
	}
	
	public void push(char val) {
		stackArray[++top] = val;
	}
	
	public char pop() {
		char toReturn = stackArray[top];
		stackArray[top--] = 0; // not in real case, just to demonstrate
		return toReturn;
	}
}
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
