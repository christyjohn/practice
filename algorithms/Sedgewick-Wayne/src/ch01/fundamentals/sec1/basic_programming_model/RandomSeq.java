package ch01.fundamentals.sec1.basic_programming_model;

import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomSeq {

	public static void main(String[] args) {
		// print n random values in (lo, hi)
		int n = Integer.parseInt(args[0]);
		double lo = Double.parseDouble(args[1]);
		double hi = Double.parseDouble(args[2]);
		for (int i = 0; i < n; i++)
		{
			double x = StdRandom.uniform(lo, hi);
			StdOut.printf("%.2f\n", x);
			
		}
	}

}
