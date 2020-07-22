package ch01.fundamentals.sec1.basic_programming_model.exercises;

import edu.princeton.cs.algs4.StdIn;

public class Ex_1_1_20 {

	public static void main(String[] args) {
		System.out.print("Enter the digit for which you need factorial: ");
		int number = StdIn.readInt();
		System.out.println(factorial(number));
	}

	private static int factorial(int n) {
		
		if (n == 0 || n == 1) 
			return 1;
		else
			return n * factorial(n - 1);
	}
}
