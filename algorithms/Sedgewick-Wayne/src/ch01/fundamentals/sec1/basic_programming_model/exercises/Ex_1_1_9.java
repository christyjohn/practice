package ch01.fundamentals.sec1.basic_programming_model.exercises;

import edu.princeton.cs.algs4.StdIn;

public class Ex_1_1_9 {

	public static void main(String[] args) {
		int x = StdIn.readInt();
		String s = "";
		for (int n = x; n > 0; n /= 2)
			s = (n % 2) + s;
		
		System.out.println(s);
		System.out.println(Integer.toBinaryString(x));
	}

}
