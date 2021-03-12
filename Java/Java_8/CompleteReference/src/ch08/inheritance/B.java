package ch08.inheritance;

class B extends A {
	int k;
	
	B() {
		
	}
	
	B(int a, int b, int c) {
		super(a, b);
		k = c;
	}
	
	// display k – this overrides show() in A
	void show() {
		super.show();
		System.out.println("k: " + k);
	}
	
	// overload show()
	void show(String msg) {
		System.out.println(msg + k);
	}
	
	void sum() {
		System.out.println("i+j+k: " + (i+j+k));
	}
	
	// override callme()
	void callme() {
		System.out.println("Inside B's callme method");
	}
}