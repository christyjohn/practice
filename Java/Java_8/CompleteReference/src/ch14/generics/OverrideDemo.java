package ch14.generics;

public class OverrideDemo {
	public static void main(String[] args) {
		// Create a Gen object for Integers.
		Gen<Integer> iOb = new Gen<>(88);
		
		// Create a Gen4 object for Integers.
		Gen4<Integer> iOb2 = new Gen4<>(99);
		
		// Create a Gen2 object for Strings.
		Gen4<String> strOb2 = new Gen4<> ("Generics Test");
		
		System.out.println(iOb.getob());
		System.out.println(iOb2.getob());
		System.out.println(strOb2.getob());
	}
}
