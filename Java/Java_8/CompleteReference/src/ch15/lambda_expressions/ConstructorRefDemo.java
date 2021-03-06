package ch15.lambda_expressions;

interface MyFunc5 {
	MyClass2 func(int n);
}

class MyClass2 {
	private int val;
	
	// This constructor takes an argument.
	MyClass2(int v) { val = v; }
	
	// This is the default constructor.
	MyClass2() { val = 0; }
	
	int getVal() { return val; };
}

public class ConstructorRefDemo {
	public static void main(String[] args) {
		// Create a reference to the MyClass constructor.
		// Because func() in MyFunc takes an argument, new
		// refers to the parameterized constructor in MyClass,
		// not the default constructor.
		MyFunc5 myClassCons = MyClass2::new;
		
		// Create an instance of MyClass via that constructor reference.
		MyClass2 mc = myClassCons.func(100);
		
		// Use the instance of MyClass just created.
		System.out.println("val in mc is " + mc.getVal( ));
	}
}
