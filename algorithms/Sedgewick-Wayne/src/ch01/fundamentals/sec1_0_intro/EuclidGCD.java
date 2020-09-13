package ch01.fundamentals.sec1_0_intro;

public class EuclidGCD {

	public static void main(String[] args) {
		System.out.println("The GCD of 24 and 36 is: " + gcd(24, 36));
	}

	public static int gcd(int p, int q) {
		if (q == 0)
			return p;
		int r = p % q;
		return gcd(q, r);
	}
}
