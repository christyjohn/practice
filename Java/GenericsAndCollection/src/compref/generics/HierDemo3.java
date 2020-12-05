package compref.generics;

class Gen7<T> {
	T ob;
	
	Gen7(T o) {
		ob = o;
	}
	
	T getob() {
		return ob;
	}
}

class Gen8<T> extends Gen7<T> {
	Gen8(T o) {
		super(o);
	}
}

public class HierDemo3 {
	public static void main(String[] args) {
		Gen7<Integer> iOb = new Gen7<>(88);
		Gen8<Integer> iOb2 = new Gen8<>(99);
		Gen8<String> strOb2 = new Gen8<>("Generics Test");
		
		if (iOb2 instanceof Gen8<?>)
			System.out.println("iOb2 is instance of Gen8");
		
		if (iOb2 instanceof Gen7<?>)
			System.out.println("iOb2 is instance of Gen7");
		System.out.println();
		
		if (strOb2 instanceof Gen8<?>)
			System.out.println("strOb2 is instance of Gen8");
		
		if (strOb2 instanceof Gen7<?>)
			System.out.println("strOb2 is instance of Gen7");
		System.out.println();
		
		if (iOb instanceof Gen8<?>)
			System.out.println("iOb is instance of Gen2");
		
		if (iOb instanceof Gen7<?>)
			System.out.println("iOb is instance of Gen7");
		
		
		// Cannot perform instanceof check against parameterized type 
		// Gen8<Integer>. Use the form Gen8<?> instead since further 
		// generic type information will be erased at runtime
		//if (iOb2 instanceof Gen8<Integer>)
		//	System.out.println("iOb2 is instance of Gen2<Integer>");
	}
}
