import java.util.Scanner;

/*The base stack class is in separated out as a separate class as 
 * it is being used in multiple programs.
 *
 * It is present in the same package at 
 * https://github.com/christyjohn/practice/blob/master/datastructures/arrays/Stack/CharStack.java
 */
 
class BracketChecker {
	private String input;
	private int inputSize;
	CharStack cStack;
	
	public BracketChecker(String input) {
		this.input = input;
		this.inputSize = input.length();
		cStack = new CharStack(inputSize);
	}
	
	public boolean checkValid() {
		char c;
		char popC='\0';
		boolean valid = true;
		
		for(int i = 0; i  < inputSize; i++) {	
			c = input.charAt(i);
			if(c == '{' || c == '[' || c == '(') {
				if(!cStack.isFull()) {
					cStack.push(c);
				}
			}
			
			if(c == '}' || c == ']' || c == ')') {
				if(!cStack.isEmpty()) {
					popC = cStack.pop();
				}
				
				if(c == '}' && popC != '{' || c == ']' && popC != '[' || c == ')' && popC != '(') 
				    valid = false;
				if(c == '}' && popC == '{' || c == ']' && popC == '[' || c == ')' && popC == '(') 
					valid = true;
				else
					valid = false;
			}
		}
		return valid;
	}
}

public class MatchDelimiter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input=null;
		
		System.out.println("Enter the string for delimiter checking.");
		input = scanner.nextLine();
		
		BracketChecker bc = new BracketChecker(input);
		boolean valid = bc.checkValid();
		
	
		
		if(valid)
			System.out.println("Valid input");
		else
			System.out.println("invalid input");
	}
}
