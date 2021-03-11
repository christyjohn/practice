package ch07.methods_classes;

class Test2 {
	int a;
	public int b;
	private int c;
	
	void setc(int i) {
		c = i;
	}
	
	int getc() {
		return c;
	}
}

public class AccessTest {
	public static void main(String[] args) {
		Test2 ob = new Test2();
		
		ob.a = 10;
		ob.b = 20;
		// ob.c = 300; // c cannot be resolved or is not a field
		
		ob.setc(100);
		System.out.println("a, b, and c: " + ob.a + " " +
				ob.b + " " + ob.getc());
	}
}
