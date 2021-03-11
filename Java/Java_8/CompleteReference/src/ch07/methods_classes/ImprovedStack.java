package ch07.methods_classes;

public class ImprovedStack {
	private int[] stck;
	private int tos;
	
	// allocate and initialize stack
	ImprovedStack(int size) {
		stck = new int[size];
		tos = -1;
	}
	
	// Push an item onto the stack
	void push(int item) {
		if (tos == stck.length-1)
			System.out.println("Stack is full.");
		else
			stck[++tos] = item;
	}
	
	// Pop an item from the stack
	int pop() {
		if (tos < 0) {
			System.out.println("Stack Underflow.");
			return 0;
		} else {
			return stck[tos--];
		}
	}
}
