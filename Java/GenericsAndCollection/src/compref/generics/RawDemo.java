package compref.generics;

class Gen2<T> {
	T ob;
	
	Gen2 (T o) {
		ob = o;
	}
	
	T getob() {
		return ob;
	}
}

public class RawDemo {
	public static void main(String[] args) {
		Gen2<Integer> iOb = new Gen2<>(88);
		Gen2<String> strOb = new Gen2<>("generics test");
		Gen2 raw = new Gen2(new Double(98.6));
		
		double d = (Double) raw.getob();
		System.out.println("value: " + d);
		
		// int i = (Integer) raw.getob(); // Run-time error
		
		// This assignment overrides type safety.
		strOb = raw; // OK, but potentially wrong
		// String str = strOb.getob(); // run-time error
		
		// This assignment also overrides type safety.
		raw = iOb; // OK, but potentially wrong
		// d = (Double) raw.getob(); // run-time error
	}
}
