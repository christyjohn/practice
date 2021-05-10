package ds.lec01.stacks;

import java.lang.reflect.Array;

public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack theStack = new ArrayStack(10);

        System.out.println("Is the stack empty? : " + theStack.isEmpty());
        System.out.println("stack size : " + theStack.size());

        // popping when stack is empty
        try {
            theStack.pop();
        } catch (StackEmptyException e) {
            System.out.println(e);
        }

        for (int i = 0; i < 10; i++) {
            try {
                theStack.push((Integer) i);
            } catch (StackFullException e) {
                System.out.println(e);
             }
        }

        System.out.print("The initial stack: " );
        printStack(theStack);
        System.out.println();

        System.out.println("Is the stack empty? : " + theStack.isEmpty());
        System.out.println("stack size : " + theStack.size());

        // pushing when the stack is full
        try {
            theStack.push((Integer) 10);
        } catch (StackFullException e) {
            System.out.println(e);
        }


        Object topElement = 0;
        Object poppedElement = 0;
        try {
            topElement = theStack.top();
            poppedElement = theStack.pop();
        } catch (StackEmptyException e) {
            System.out.println(e);
        }
        System.out.println("The top of the stack: " + topElement.toString());
        System.out.println("The popped element  of the stack: " + poppedElement.toString());

        try {
            topElement = theStack.top();
            poppedElement = theStack.pop();
        } catch (StackEmptyException e) {
            System.out.println(e);
        }
        System.out.println("The top of the stack: " + topElement.toString());
        System.out.println("The popped element  of the stack: " + poppedElement.toString());

        System.out.print("The stack after popping elements: " );
        printStack(theStack);
        System.out.println();
    }

    public static void printStack(ArrayStack theStack) {
        for (int i = 0; i < theStack.size(); i++) {
            System.out.print(theStack.getTheStack()[i] + " ");
        }
        System.out.println();
    }
}
