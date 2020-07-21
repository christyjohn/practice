package ch01.fundamentals.sec1.basic_programming_model.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_14 {

	public static void main(String[] args) {
		int n = StdIn.readInt();
		
		StdOut.println(lg(n));
		
	}
	
	public static int lg(int n) {
		int logn = 0;
		
		while (n > 0) {
			logn++;
			n /= 2;
		}
		
		
		return logn - 1;
	}

}
