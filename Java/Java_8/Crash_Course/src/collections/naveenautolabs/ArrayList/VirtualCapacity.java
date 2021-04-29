package collections.naveenautolabs.ArrayList;

import java.util.ArrayList;

public class VirtualCapacity {

	public static void main(String[] args) {
		ArrayList<Object> ar = new ArrayList<>(20);
		System.out.println(ar.size()); 
		ar.add(100);
		System.out.println(ar.size()); 
		ar.add(200);
		ar.add(300);
		ar.add(300);
	}

}
