package ch01.sec1.basic_programming_model;

import java.util.Arrays;

public class ArrayManipulation {
	public static void main(String[] args) {
		int[] a = {3, 6, 2, 8, 1, 9, 7, 0, 4, 5};
		
		// find max in an array
		int max = a[0];
		for(int i = 0; i < a.length; i++) {
			if(a[i] > max)
				max = a[i];
		}		
		System.out.println("The max element in array is: " + max);
		
		// compute the average of array values
		int n = a.length;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += a[i];
		}
		double average = sum / n;
		System.out.println("Average of the elements in array is: " +
				average);
		
		// copy to another array
		int[] b = new int[n];
		for (int i = 0; i < n; i++) {
			b[i] = a[i];
		}
		System.out.print("Array a => ");
		printArray(a);
		System.out.print("Array b => ");
		printArray(b);
		
		// reverse elements of array
		for (int i = 0; i < n/2 ; i++) {
			int temp = a[i];
			a[i] = a[n-1 - i];
			a[n-i - 1] = temp;
		}
		System.out.print("Reversed array a => ");
		printArray(a);
		
		// matrix multiplication (square matix)
		int[][] d = { {1,2}, {3,4} };
		int[][] e = { {5,6}, {7,8} };
		n = 2;
		int[][] mul = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				for (int k = 0; k < n; k++) {
					mul[i][j] += d[i][k] * e[k][j];
				}
			}
		}
		
		System.out.println("Matrix multiplication");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(mul[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void printArray(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}
