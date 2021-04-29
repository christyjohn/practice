package collections.naveenautolabs.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(
				1,2,3,4,5,6,2,3,4,5,7,8,9,10
				));
		
		// 1. LinkedHashSet
		LinkedHashSet<Integer> linkedhashSet = new LinkedHashSet<>(numbers);
		System.out.println(linkedhashSet instanceof LinkedHashSet); // true
		System.out.println(linkedhashSet); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		ArrayList<Integer> newNumbers = new ArrayList<>(linkedhashSet);
		System.out.println(newNumbers instanceof ArrayList); // true
		System.out.println(newNumbers); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
		
		// 2. Streams
		ArrayList<Integer> marksList = new ArrayList<>(Arrays.asList(
				1,2,3,4,5,6,2,3,4,5,7,8,9,10
				));
		List<Integer> distinctMarks = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(distinctMarks); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
	}

}
