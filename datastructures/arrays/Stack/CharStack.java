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
  public int peek() {
		return stackArray[top];
	}
  
	public boolean isEmpty() {
		return(top == -1);
	}
	
	public boolean isFull() {
		return(top ==  maxSize-1);
	}
}
