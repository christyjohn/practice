package ch00.intro;

import java.util.Scanner;

public class EuclidGCD {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers for which you need the GCD");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		scanner.nextLine();
		
		int gcd = findGCD(num1, num2);
		System.out.println("The GCD for " + num1 + " and " + num2 + " is " + gcd);
	}
	
	public static int findGCD(int p, int q) {
		int r;
		if(q == 0)
			return p;
		r = p % q;
		 return findGCD(q, r);
	}
}
