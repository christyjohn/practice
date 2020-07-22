package ch01.fundamentals.sec1.basic_programming_model.creative_problems;

import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_26 {

	public static void main(String[] args) {
		int a, b , c, t;
		a = 25;
		b = 15;
		c = 35;
		
		if(a > b) {
			t = a;
			a = b;
			b = t;
		}
		
		if (a > c) {
			t = a;
			a = c;
			c = t;
		}
		
		if (b > c) {
			t = b;
			b = c;
			c = t;
		}
			
		StdOut.println("a:" + a + ", b:" +b + ", c:" + c);
	}

}
