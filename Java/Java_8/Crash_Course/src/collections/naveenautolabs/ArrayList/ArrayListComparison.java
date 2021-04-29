package collections.naveenautolabs.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {

	public static void main(String[] args) {
		ArrayList<String> l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "F", "G", "D"));
		ArrayList<String> l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "F", "E", "D", "H"));
		ArrayList<String> l3 = new ArrayList<>(Arrays.asList("A", "B", "C", "F", "G", "D", "H"));
		
		// 1. sort and equals
		Collections.sort(l1);
		Collections.sort(l2);
		Collections.sort(l3);
		System.out.println(l1); // [A, B, C, D, F, G]
		System.out.println(l2); // [A, B, C, D, E, F]
		System.out.println(l1.equals(l2));  // false
		System.out.println(l1.equals(l3));  // true
		
		// 2. compare and find the additional elements
		l1.removeAll(l2);
		System.out.println(l1);  // [G]
		
		// 3. find out the missing element
		l1 = new ArrayList<>(Arrays.asList("A", "B", "C", "F", "G", "D"));
		l2.removeAll(l1);
		System.out.println(l2); // [E, H]
		
		// 4. find out common elements
		l2 = new ArrayList<>(Arrays.asList("A", "B", "C", "F", "E", "D", "H"));
		l1.retainAll(l2);
		System.out.println(l1); // [A, B, C, F, D]
	}

}
