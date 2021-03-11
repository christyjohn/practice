package ch07.methods_classes;

public class TestStack2 {
	public static void main(String[] args) {
		ImprovedStack mystack1 = new ImprovedStack(5);
		ImprovedStack mystack2 = new ImprovedStack(8);
		
		// push some numbers onto the stack
		for(int i=0; i<5; i++) mystack1.push(i);
		for(int i=0; i<8; i++) mystack2.push(i);
		
		// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for(int i=0; i<5; i++)
			System.out.println(mystack1.pop());
		
		System.out.println("Stack in mystack2:");
		for(int i=0; i<8; i++)
			System.out.println(mystack2.pop());
	}
}
