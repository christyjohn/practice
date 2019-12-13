import java.util.Arrays;

import edu.princeton.cs.algs4.StdRandom;

public class RandomNumberExamples {

	public static void main(String[] args) {
		System.out.println("Random number between 5 and 9: " + uniform(5.89, 9.76));
		System.out.println("Random number between 0 and 70: " + uniform(70));
		System.out.println("Random number between 0 and 70: " + uniform(70, 134));
		System.out.println("Random int value drawn from discrete distribution: "
				+ discrete(new double[] { 0.35, 0.025, 0.43, 0.15, 0.45 }));
		System.out.println("Randomly shuffling [0.35, 0.025, 0.43, 0.15, 0.45]: "
				+ Arrays.toString(shuffle(new double[] { 0.35, 0.025, 0.43, 0.15, 0.45 })));

	}

	// random double value in [a, b)
	public static double uniform(double a, double b) {
		return a + StdRandom.random() * (b - a);
	}

	// random int value in [0..N)
	public static int uniform(int n) {
		return (int) (StdRandom.random() * n);
	}

	// random int value in [lo..hi)
	public static int uniform(int lo, int hi) {
		return lo + StdRandom.uniform(hi - lo);
	}

	// random int value drawn from discrete distribution (i with probability a[i])
	public static int discrete(double[] a) { // Entries in a[] must sum to 1.
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
	public static double[] shuffle(double[] a) {
		int N = a.length;
		for (int i = 0; i < N; i++) { // Exchange a[i] with random element in a[i..N-1]
			int r = i + StdRandom.uniform(N - i);
			double temp = a[i];
			a[i] = a[r];
			a[r] = temp;
		}
		return a;
	}
}
