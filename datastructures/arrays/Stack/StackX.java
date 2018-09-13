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
		return(top == -1);
	}
	
	public boolean isFull() {
		return(top ==  maxSize-1);
	}
	
	public void printStack() {
		System.out.println(Arrays.toString(stackArray));
	}
}
