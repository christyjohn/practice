package ch01.sec1.basic_programming_model;

public class EuclidGCD {
	public static void main(String[] args) {
		int p = 15, q = 24;
		System.out.println("GCD of " + p + " and " + q + " is " +
				gcd(p, q));
	}
	
	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		else {
			int r = p % q;
			return gcd(q, r);
		}
	}
}
