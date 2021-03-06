package ch14.generics;

class Stats2<T extends Number> {
	T[] nums;
	
	Stats2(T[] o) {
		nums = o;
	}
	
	double average() {
		double sum = 0.0;
		
		for (int i = 0; i < nums.length; i++)
			sum += nums[i].doubleValue();
		
		return sum / nums.length;
	}
	
	// Determine if two averages are the same.
	// Notice the use of the wildcard.
	boolean sameAvg(Stats2<?> ob) {
		if (this.average() == ob.average())
			return true;
		
		return false;
	}
}

//Demonstrate wildcard.
public class WildcardDemo {
	public static void main(String[] args) {
		Integer[] inums = { 1, 2, 3, 4, 5 };
		Stats2<Integer> iob = new Stats2<>(inums);
		double v = iob.average();
		System.out.println("iob average is " + v);
		
		Double[] dnums = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Stats2<Double> dob = new Stats2<>(dnums);
		double w = dob.average();
		System.out.println("dob average is " + w);
		
		Float[] fnums = { 1.0F, 2.0F, 3.0F, 4.0F, 5.0F };
		Stats2<Float> fob = new Stats2<>(fnums);
		double x = fob.average();
		System.out.println("fob average is " + x);
		
		// See which arrays have same average.
		System.out.print("Averages of iob and dob ");
		if(iob.sameAvg(dob))
			System.out.println("are the same.");
		else
			System.out.println("differ.");
		
		System.out.print("Averages of iob and fob ");
		if(iob.sameAvg(fob))
			System.out.println("are the same.");
		else
			System.out.println("differ.");
	}
}
