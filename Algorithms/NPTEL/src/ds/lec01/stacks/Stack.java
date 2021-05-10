package ds.lec01.stacks;

public interface Stack {
    // accessor methods
    public int size();
    public boolean isEmpty();
    public Object top() throws StackEmptyException;

    // update methods
    public void push(Object element) throws StackFullException;
    public Object pop() throws StackEmptyException;
}
