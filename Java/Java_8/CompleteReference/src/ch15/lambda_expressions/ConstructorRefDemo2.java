package ch15.lambda_expressions;

//MyFunc is now a generic functional interface.
interface MyFunc6<T> {
	MyClass3<T> func(T n);
}

class MyClass3<T> {
	private T val;
	
	// A constructor that takes an argument.
	MyClass3(T v) { val = v; }
	
	// This is the default constructor.
	MyClass3( ) { val = null; }
	
	T getVal() { return val; };
}

public class ConstructorRefDemo2 {
	public static void main(String[] args) {
		// Create a reference to the MyClass<T> constructor.
		MyFunc6<Integer> myClassCons = MyClass3<Integer>::new;
		
		// Create an instance of MyClass<T> via that constructor reference.
		MyClass3<Integer> mc = myClassCons.func(100);
		
		// Use the instance of MyClass<T> just created.
		System.out.println("val in mc is " + mc.getVal( ));
	}
}
