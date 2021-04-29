package collections.naveenautolabs.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		// 1. synchronizedList() method
		List<String> namesList = Collections.synchronizedList(new ArrayList<>());
		
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		// add/remove - we don't need explicit synchronization
		
		// to fetch/traverse the values from the list - we need explicit synchronization
		
		synchronized(namesList) {
			Iterator<String> it = namesList.iterator();
					
			while (it.hasNext()) {
				System.out.println(it.next());
			}
		}
	
		System.out.println("---------------------");
		
		//2. CopyOnWriteArrayList class
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<>();
		
		// we don't need explicit synchronization for any operations : add / remove / traversed
		empList.add("Christy");
		empList.add("Naveen");
		empList.add("Lisa");
		
		Iterator<String> it = empList.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
