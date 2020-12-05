package compref.generics;

class Gen9<T> {
	T ob; 
	
	Gen9(T o) {
		ob = o;
	}
	
	T getob() {
		System.out.print("Gen's getob(): " );
		return ob;
	}
}

class Gen10<T> extends Gen9<T> {
	Gen10(T o) {
		super(o);
	}
	
	T getob() {
		System.out.print("Gen2's getob(): ");
		return ob;
	}
}

public class OverrideDemo {
	public static void main(String[] args) {
		Gen9<Integer> iOb = new Gen9<>(88);
		Gen10<Integer> iOb2 = new Gen10<>(99);
		Gen10<String> strOb2 = new Gen10<>("Generics Test");
		
		System.out.println(iOb.getob());
		System.out.println(iOb2.getob());
		System.out.println(strOb2.getob());
	}
}
