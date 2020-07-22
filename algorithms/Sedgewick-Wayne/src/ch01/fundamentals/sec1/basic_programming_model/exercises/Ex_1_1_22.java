package ch01.fundamentals.sec1.basic_programming_model.exercises;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_22 {
	private static int rank(int key, int[] a, int indent) {
		return rank(key, a, 0, a.length - 1, indent);
	}
	
	private static int rank(int key, int[] a, int lo, int hi, int indent) {
		if (indent != 0) {
			StdOut.println();
		}
		
		for (int i = 0; i < indent; i++) {
			StdOut.print(" ");
		}
		
		StdOut.print("lo: " + lo + " - hi: " + hi);
		
		if (lo > hi)
			return -1;
		int mid = lo + (hi - lo) / 2;
		if (key < a[mid])
			return rank(key, a, lo, mid - 1, ++indent);
		if (key > a[mid])
			return rank(key, a, mid + 1, hi, ++indent);
		else
			return mid;
	}
	
	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		int key = 7;
		
		int indent = 0;
		int index = rank(key, arr, indent);
		
		StdOut.println();
		StdOut.println("Index of the key: " + index);
	}

}
