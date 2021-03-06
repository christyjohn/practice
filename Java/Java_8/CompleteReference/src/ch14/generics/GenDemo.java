package ch14.generics;

class Gen<T> {
	T ob;
	
	Gen(T o) {
		ob = o;
	}
	
	T getob() {
		System.out.print("Gen's getob(): " );
		return ob;
	}
	
	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

public class GenDemo {
	public static void main(String[] args) {
		Gen<Integer> iOb = new Gen<>(88);
		iOb.showType();
		
		int v = iOb.getob();
		System.out.println("value: " + v);
		System.out.println();
		
		Gen<String> strOb = new Gen<>("Generics Test");
		strOb.showType();
		
		String str = strOb.getob();
		System.out.println("value: " + str);
	}
}
