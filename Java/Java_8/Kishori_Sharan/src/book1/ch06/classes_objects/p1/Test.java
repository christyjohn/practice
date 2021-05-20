package book1.ch06.classes_objects.p1;

import static book1.ch06.classes_objects.p2.A.test;

public class Test {
	public static void main(String[] args) {
		test(); // Will use p1.Test.test() method, not p2.A.test() method
	}

	public static void test() {
		System.out.println("p2.Test.test()");
	}
}
