package ch08.inheritance;

class A {
	int i, j;
	
	A() {
		
	}
	
	A(int a, int b) {
		i = a;
		j = b;
	}
	
	// display i and j
	void show() {
		System.out.println("i and j: " + i + " " + j);
	}
	
	void callme() {
		System.out.println("Inside A's callme method");
	}
}