package book1.ch06.classes_and_objects;

public class ThisTestMethod {
	void m1() {
		// Invoke the m2() method
		this.m2(); // same as "m2();"
	}
	
	void m2() {
		// do something
	}
}
