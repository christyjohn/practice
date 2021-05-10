package ds.lec01.stacks;

// Implementation of the Stack interface using an array
public class ArrayStack implements Stack {
    private static final int CAPACITY = 1024;   // default capacity of stack
    private int n;                              // maximum capacity of the stack
    private Object[] theStack;                  // theStack holds the elements of the stack
    private int top = -1;                       // the top element of the stack

    public ArrayStack() {
        this(CAPACITY);
    }

    public ArrayStack(int size) {
        n = size;
        theStack = new Object[size];
    }

    public Object[] getTheStack() {
        return theStack;
    }

    // returns the current stack size
    @Override
    public int size() {
        return top + 1;
    }

    @Override
    public boolean isEmpty() {
        //System.out.println("Current size: " + size());
        return (top == -1);
    }

    @Override
    public Object top() throws StackEmptyException {
        if (isEmpty()) {
            //System.out.println("Current size: " + size());
            throw new StackEmptyException("Stack is empty");
        } else {
            return theStack[top];
        }
    }

    @Override
    public void push(Object element) throws StackFullException {
        if (size() == n) {
            throw new StackFullException("The stack is full.");
        } else {
            theStack[++top] = element;
            // System.out.println("Pushing: Current size: " + size());
        }
    }

    @Override
    public Object pop() throws StackEmptyException {
        Object element;
        if (isEmpty())
            throw new StackEmptyException("Stack is empty");
        else
            element = theStack[top--];

        return element;
    }
}
