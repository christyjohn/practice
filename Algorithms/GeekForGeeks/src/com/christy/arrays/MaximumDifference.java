package com.christy.arrays;

/*
 * Find the maximum difference in an array such that a[j] - a[i] is the greatest,
 * and j > i
 */

public class MaximumDifference {
	public static void main(String[] args) {
		int[] arr = { 2 , 3, 10, 6, 4, 8, 1 };
		int[] arr2 = { 7, 9, 5, 6, 3, 2 };
		int[] arr3 = { 10, 20, 30};
		int[] arr4 = { 30, 10, 8, 2 };
		
		int maxDiff = findMaxDiff(arr);
		int maxDiff2 = findMaxDiff(arr2);
		int maxDiff3 = findMaxDiff(arr3);
		int maxDiff4 = findMaxDiff(arr4);
		
		System.out.println("Max Diff: " + maxDiff);
		System.out.println("Max Diff: " + maxDiff2);
		System.out.println("Max Diff: " + maxDiff3);
		System.out.println("Max Diff: " + maxDiff4);
	}
	
	public static int findMaxDiff(int[] arr) {
		int maxDiff = arr[1]- arr[0];
		int lowest =  arr[0];
		
		for (int i = 1; i < arr.length; i++) {
			if ((arr[i] - lowest) > maxDiff)
				maxDiff = arr[i] - lowest;
			
			if (arr[i] < lowest)
				lowest = arr[i];
		}
		
		return maxDiff;
	}
}
