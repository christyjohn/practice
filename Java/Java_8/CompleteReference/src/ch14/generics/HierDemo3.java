package ch14.generics;

//A subclass of Gen.
class Gen4<T> extends Gen<T> {
	Gen4(T o) {
		super(o);
	}	

	// Override getob().
	T getob() {
		System.out.print("Gen2's getob(): ");
		return ob;
	}
}

public class HierDemo3 {
	public static void main(String[] args) {
		// Create a Gen object for Integers.
		Gen<Integer> iOb = new Gen<>(88);
		
		// Create a Gen4 object for Integers.
		Gen4<Integer> iOb2 = new Gen4<>(99);
		
		// Create a Gen4 object for Strings.
		Gen4<String> strOb2 = new Gen4<>("Generics Test");
		
		// See if iOb2 is some form of Gen4.
		if(iOb2 instanceof Gen4<?>)
			System.out.println("iOb2 is instance of Gen4");
		
		// See if iOb2 is some form of Gen.
		if(iOb2 instanceof Gen<?>)
			System.out.println("iOb2 is instance of Gen");
		
		System.out.println();
		
		// See if strOb2 is a Gen4.
		if(strOb2 instanceof Gen4<?>)
			System.out.println("strOb2 is instance of Gen4");
		
		// See if strOb2 is a Gen.
		if(strOb2 instanceof Gen<?>)
			System.out.println("strOb2 is instance of Gen");
		
		System.out.println();
		
		// See if iOb is an instance of Gen4, which it is not.
		if(iOb instanceof Gen4<?>)
			System.out.println("iOb is instance of Gen4");
		
		// See if iOb is an instance of Gen, which it is.
		if(iOb instanceof Gen<?>)
			System.out.println("iOb is instance of Gen");
	}
}
