package ch01.fundamentals.sec1.basic_programming_model.exercises;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_24 {

	public static void main(String[] args) {
		int num1 = 105;
		int num2 = 5;
		int gcd = findGCD(num1, num2);
		StdOut.println("The GCD of " + num1 + " and " + num2 +
				" is " + gcd);
		StdOut.println("========================");
		num1 = Integer.parseInt(args[0]);
		num2 = Integer.parseInt(args[1]);
		gcd = findGCD(num1, num2);
		StdOut.println("The GCD of " + num1 + " and " + num2 +
				" is " + gcd);
	}

	private static int findGCD(int p, int q) {
		StdOut.println("p: " + p + " , q: " + q);
		if (q == 0)
			return p;
		int r = p % q;
		return findGCD(q, r);
	}
}
