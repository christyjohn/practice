package ch09.packages_interfaces;

interface A1 {
	void meth1();
	void meth2();
}

// B1 now includes meth1() and meth2() -- it adds meth3().
interface B1 extends A1 {
	void meth3();
}

//This class must implement all of A and B
class MyClass implements B1 {
	public void meth1() {
		System.out.println("Implement meth1().");
	}
	
	public void meth2() {
		System.out.println("Implement meth2().");
	}
	
	public void meth3() {
		System.out.println("Implement meth3().");
	}
}

public class IFExtend {
	public static void main(String[] args) {
		MyClass ob = new MyClass();
		
		ob.meth1();
		ob.meth2();
		ob.meth3();
	}
}
