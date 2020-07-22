package ch01.fundamentals.sec1.basic_programming_model.exercises;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Ex_1_1_23 {
	public static int rank(int key, int[] a) {
		int lo  = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid])
				hi = mid - 1;
			else if (key > a[mid])
				lo = mid + 1;
			else
				return mid;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		//System.out.println(args[0] + " , " + args[1] 
		//		+ " , " + args[2] + " , " + args[3]);
		
		
		int[] whitelist = In.readInts(args[0]);
		
		Arrays.sort(whitelist);
		char selection = args[3].charAt(0);
		
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if(selection == '+') {
				if  (rank(key, whitelist) == -1)
					StdOut.println(key);
			} else if(selection == '-')
				if  (rank(key, whitelist) != -1)
					StdOut.println(key); 
		}
		
	}
}
