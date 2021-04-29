package collections.naveenautolabs.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
	public static void main(String[] args) {
		// default class
		// dynamic array
		
		// default generics
		ArrayList<Object> ar = new ArrayList<>();
		
		ar.add(100);
		ar.add(200);
		ar.add("testing");
		ar.add('t');
		ar.add(12.34);
		ar.add(true);
		
		System.out.println(ar);
		
		System.out.println(ar.get(2));
		System.out.println("Size = " + ar.size());
		
		System.out.println("LO = " + 0);
		System.out.println("Hi = " + (ar.size()-1));
		
		ar.add(400);
		ar.add(600);
		System.out.println("Size = " + ar.size());
		
		// list with other collection
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 20, 30, 40)); 
		System.out.println(numbers);
	}
}
