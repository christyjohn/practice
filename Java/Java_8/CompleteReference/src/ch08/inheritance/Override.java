package ch08.inheritance;

public class Override {
	public static void main(String[] args) {
		B subOb = new B(1, 2, 3);
		
		subOb.show();
		subOb.show("This is k: "); // this calls show() in B
	}
}	
