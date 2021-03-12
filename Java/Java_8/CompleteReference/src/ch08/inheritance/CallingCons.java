package ch08.inheritance;

class A2 {
	A2() {
		System.out.println("Inside A's constructor.");
	}
}

class B2 extends A2 {
	B2() {
		System.out.println("Inside B's constructor");
	}
}

class C2  extends B2 {
	C2() {
		System.out.println("Inside C's constructor.");
	}
}

public class CallingCons {
	public static void main(String[] args) {
		C2 c = new C2();
	}
}
