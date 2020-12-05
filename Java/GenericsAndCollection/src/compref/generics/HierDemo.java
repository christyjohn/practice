package compref.generics;

class Gen3<T> {
	T ob;
	
	Gen3(T o) {
		ob = o;
	}
	
	T getob() {
		return ob;
	}
}

class Gen4<T, V> extends Gen3<T> {
	V ob2;
	
	Gen4(T o, V o2) {
		super(o);
		ob2 = o2;
	}
	
	V getob2() {
		return ob2;
	}
}

public class HierDemo {
	public static void main(String[] args) {
		Gen4<String, Integer> x = new Gen4<>("Value is: ", 99);
		
		System.out.print(x.getob());
		System.out.println(x.getob2());
	}
}
