package ch01.fundamentals.sec1.basic_programming_model;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Average {

	public static void main(String[] args) {
		// Average the number on StdIn
		double sum = 0.0;
		int cnt = 0;
		while (!StdIn.isEmpty())
		{
			// Read a number and cumulate the sum
			sum += StdIn.readDouble();;
			cnt++;
		}
		
		double avg = sum / cnt;
		StdOut.printf("Average is %.5f\n",  avg);
	}

}
