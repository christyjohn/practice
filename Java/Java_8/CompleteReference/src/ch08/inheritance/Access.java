package ch08.inheritance;

class A1 {
	int i;
	private int j;
	
	void setij(int x, int y) {
		i = x;
		j = y;
	}
}

class B1 extends A1 {
	int total;
	int i; // this i hides the i in A1
	
	B1() {
		
	}
	
	B1(int a, int b) {
		super.i = a; // i in A
		i = b; // i in B
	}
		
	void show() {
		System.out.println("i in superclass: " + super.i);
		System.out.println("i in subclass: " + i);
	}
	
	void sum() {
		// total = i + j; // The field A1.j is not visible
	}
}

public class Access {
	public static void main(String[] args) {
		B1 subOb = new B1();
		
		subOb.setij(10, 12);
		
		subOb.sum();
		System.out.println("Total is " + subOb.total);
	}
}
