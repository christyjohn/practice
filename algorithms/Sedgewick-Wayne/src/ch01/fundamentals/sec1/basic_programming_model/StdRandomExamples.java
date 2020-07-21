package ch01.fundamentals.sec1.basic_programming_model;

import edu.princeton.cs.algs4.StdRandom;

public class StdRandomExamples {

	public static void main(String[] args) {
		System.out.println("Random double value: " + uniform(3.5, 6.7));
		System.out.println("Random int value: " + uniform(6));
		System.out.println("Random int value: " + uniform(4, 9));
		double[] a = { 0.23, 0.03, 0.52, 0.051, 0.14, 0.029 };
		System.out.println("Random i from discrete distribution: " 
				+ discrete(a));
		System.out.println("Before shuffling a:");
		printArray(a);
		System.out.println("After shuffling a: ");
		shuffle(a);
		printArray(a);
	}
	
	// random double value in [a, b)
	public static double uniform(double a, double b) {
		return a + StdRandom.random() * (b - a);
	}

	// random int value in [0...n)
	public static int uniform(int n) {
		return (int) (StdRandom.random() * n);
	}
	
	// random int value in [lo...hi)
	public static int uniform(int lo, int hi) {
		return lo + StdRandom.uniform(hi - lo);
	}
	
	// random int value drawn from discrete distribution
	// (i with probability a[i]
	public static int discrete(double[] a) {
		// entries in a must sum to 1.
		double r = StdRandom.random();
		double sum = 0.0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
			if (sum >= r)
				return i;
		}
		return -1;
	}
	
	// randomly shuffle the elements in an array of double values
	public static void shuffle(double[] a)
	{
		int n = a.length;
		for (int i = 0; i < n-1; i++) {
			// exchange a[i] with random elements in a[i..n-1]
			int r = i + StdRandom.uniform(n-i);
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
	}
	
	// print array
	public static void  printArray(double[] a) {
		System.out.print("{ " + a[0]);
		for (int i = 1; i < a.length; i ++)
			System.out.print(", " + a[i]);
		System.out.println(" }");
	}
}
