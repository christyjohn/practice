package ch01.fundamentals.sec1.basic_programming_model.exercises;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_21 {

	public static void main(String[] args) {
		
		System.out.println("Enter a name followed by two marks: ");
		
		String[] arr;
		
		while (StdIn.hasNextLine()) {
			String line = StdIn.readLine();
			arr = line.split(" ");
			printValues(arr);
		}
	}

	public static void printValues(String[] arr) {
		StdOut.printf("%s\t", arr[0]);
		StdOut.printf("%d\t", Integer.parseInt(arr[1]));
		StdOut.printf("%d\t", Integer.parseInt(arr[2]));
		StdOut.printf("%4.3f", 
				Double.parseDouble(arr[1]) / Double.parseDouble(arr[2]));
		StdOut.println();
	}
}
