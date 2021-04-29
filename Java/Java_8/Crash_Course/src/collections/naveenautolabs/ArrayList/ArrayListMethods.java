package collections.naveenautolabs.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		ArrayList<String> ar1 = new ArrayList<>();
		ar1.add("Java");
		ar1.add("Python");
		ar1.add("Ruby");
		ar1.add("JavaScript");

		ArrayList<String> ar2 = new ArrayList<>();
		ar2.add("Testing");
		ar2.add("DevOps");
		
		
		// addAll()
		//ar1.addAll(ar2); // [Java, Python, Ruby, JavaScript, Testing, DevOps]
		ar1.addAll(2, ar2); // [Java, Python, Testing, DevOps, Ruby, JavaScript]		
		System.out.println(ar1);
		
		// clear()
		//ar1.clear();	// []		
		//System.out.println(ar1);
		
		// clone()
		ArrayList<String> clonedList = (ArrayList<String>) ar1.clone();
		System.out.println(clonedList);	// [Java, Python, Testing, DevOps, Ruby, JavaScript]
		clonedList.add("PHP");
		System.out.println("ar1 = " + ar1);  // ar1 = [Java, Python, Testing, DevOps, Ruby, JavaScript]
		System.out.println("clonedList = " + clonedList);  // clonedList = [Java, Python, Testing, DevOps, Ruby, JavaScript, PHP]
		
		// contains() & indexOf()
		System.out.println(ar1.contains("Python"));  // true
		System.out.println(ar1.indexOf("Ruby"));  // 4
		
		// lastIndexOf()
		ArrayList<String> list1 = new ArrayList<>(
				Arrays.asList(
					"Chris", "Naveen", "Tom", "Chris", "Lisa", "Chris", "Cecil"
				));
		System.out.println(list1); // [Chris, Naveen, Tom, Chris, Lisa, Chris, Cecil]
		System.out.println(list1.lastIndexOf("Chris")); // 5
		System.out.println(list1.lastIndexOf("Test")); // -1
		System.out.println(list1.indexOf("Chris")); // 0
		
		// remove()
		list1.remove(list1.lastIndexOf("Chris"));
		System.out.println(list1); 
		//list1.remove(list1.lastIndexOf("Christy")); // java.lang.ArrayIndexOutOfBoundsException: -1
		list1.remove("Chris");
		System.out.println(list1); // [Naveen, Tom, Chris, Lisa, Cecil]
		
		// removeIf()
		ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num % 2 == 0);
		System.out.println(numbers); // [1, 3, 5, 7, 9]
		numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		numbers.removeIf(num -> num % 2 != 0);
		System.out.println(numbers); // [2, 4, 6, 8, 10]
		
		// retainAll()
		list1 = new ArrayList<>(Arrays.asList("Chris", "Naveen", "Tom","Lisa","Chris", "Cecil"));
		System.out.println(list1);
		list1.retainAll(Collections.singleton("Chris"));
		System.out.println(list1); // [Chris, Chris]
		
		// subList()
		numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15));
		ArrayList<Integer> subList = new ArrayList<>(numbers.subList(2, 6));
		System.out.println(subList); // [3, 4, 5, 6]
		
		// toArray()
		list1 = new ArrayList<>(
				Arrays.asList(
					"Chris", "Naveen", "Tom", "Chris", "Lisa", "Chris", "Cecil"
				));
		Object[] arr = list1.toArray();
		System.out.println(Arrays.toString(arr)); // [Chris, Naveen, Tom, Chris, Lisa, Chris, Cecil]
		System.out.println(arr); // [Ljava.lang.Object;@87aac27
	}

}
