package ch01.fundamentals.sec0.intro;

import java.util.Scanner;

public class EuclidGCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter two numbers for which you need to find GCD: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int gcd = findGCD(num1, num2);
		System.out.println("The GCD of " + num1 + " and " + num2 +
				" is " + gcd);
	}

	private static int findGCD(int p, int q) {
		if (q == 0)
			return p;
		int r = p % q;
		return findGCD(q, r);
	}
}
