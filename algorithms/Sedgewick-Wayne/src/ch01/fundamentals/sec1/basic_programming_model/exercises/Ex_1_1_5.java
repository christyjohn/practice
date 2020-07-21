package ch01.fundamentals.sec1.basic_programming_model.exercises;

import edu.princeton.cs.algs4.StdIn;

public class Ex_1_1_5 {

	public static void main(String[] args) {
		double x = StdIn.readDouble();
		double y = StdIn.readDouble();
		
		if ((x > 0 && x < 1) && (y > 0 && y < 1))
			System.out.println("true");
		else
			System.out.println("false");
	}

}