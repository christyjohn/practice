package ch01.fundamentals.sec1.basic_programming_model.exercises;

import java.math.BigInteger;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_19 {

	
	public static void main(String[] args) {
		/*
		 *
		 * The largest value of n for which this program takes less than 1 hour
		 * is 55
		 * 
		for (int n = 0; n < 100; n++)
			StdOut.println(n + " " + F(n));
		 */
		System.out.println(Long.MAX_VALUE);
		
		BigInteger[] arr;
		for (int n = 0; n < 100; n++) {
			if (n == 0 || n == 1)
				arr = new BigInteger[2];
			else
				arr = new BigInteger[n + 1];
			
			arr[0] = new BigInteger("0");
			arr[1] = new BigInteger("1");
			
			StdOut.println(n + " " + F2(n, arr));
		}
	}

	private static long F(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return F(n - 1) + F(n - 2);
	}
	
	private static BigInteger F2(int n, BigInteger[] arr) {
		if (n == 0) 
			return arr[0];
		if (n == 1) 
			return arr[1];
		
		for (int i=2; i <= n; i++)
			arr[i] = arr[i - 1].add(arr[i - 2]);
				
		return arr[n];
	}
}
