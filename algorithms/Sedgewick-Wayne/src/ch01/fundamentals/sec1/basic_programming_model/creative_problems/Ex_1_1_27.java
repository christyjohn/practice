package ch01.fundamentals.sec1.basic_programming_model.creative_problems;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_27 {

	public static void main(String[] args) {
		double binomial = binomial(100, 50, 0.25);
		StdOut.println(binomial);
	}

	public static double binomial(int n, int k, double p) {
		if ((n == 0) || (k < 0))
			return 1.0;
		return (1.0 - p) * binomial(n-1, k, p) + p * binomial(n-1, k-1, p);
	}
}
