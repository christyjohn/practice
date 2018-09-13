import java.util.Scanner;
import java.util.Arrays;

class StackX {
	private int maxSize;
	private int top ;
	private int[] stackArray;
	
	public StackX(int size) {
		stackArray = new int[size];
		maxSize = size;
		top = -1;
	}
	
	public void push(int val) {
		stackArray[++top] = val;
	}
	
	public int pop() {
		int toReturn = stackArray[top];
		stackArray[top--] = 0; // not in real case, just to demonstrate
		return toReturn;
	}
	
	public int peek() {
		return stackArray[top];
	}
	
	public boolean isEmpty() {
		if(stackArray[top] == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull() {
		if(top ==  maxSize-1)
			return true;
		else
			return false;
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(stackArray));
	}
}

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
