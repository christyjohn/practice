import java.util.Scanner;
import java.util.Arrays;

/*The base stack class is in separated out as a separate class as 
 * it is being used in multiple programs.
 *
 * It is present in the same package at 
 * https://github.com/christyjohn/practice/blob/master/datastructures/arrays/Stack/StackX.java
 */

public class StackApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the stack: ");	
		int size = scanner.nextInt();
		scanner.nextLine();
		
		StackX stck = new StackX(size);
		
		// Pushing to stack		
		System.out.println("Enter integer to push to stack.\n" +
			"Enter Q to finish entering.");	
			String token = scanner.nextLine();
		
		while(!token.equalsIgnoreCase("q"))
		{
			if(!stck.isFull()) {
				stck.push(Integer.parseInt(token));
			} else {
				System.out.println("Cannot add more. Stack is full.");
				break;
			}
			token = scanner.nextLine();
		}
		
		// printing stack
		stck.printStack();
		
		// Poping from stack
		if(!stck.isEmpty())
			System.out.println("Item poped: " + stck.pop());
		
		// printing stack
		stck.printStack();
		
		// peeking
		if(!stck.isEmpty())
			System.out.println("Item at top: " + stck.peek());
				
		// printing stack
		stck.printStack();
	}
}
