package com.christy.arrays;

import java.util.Arrays;

public class RemoveDuplicatesFromSorted_Naive {
	
	/* This solution is naive because it take O(n) time complexity and also
	 * O(n) space complexity as we are copying array elements
	 */
	public static void main(String[] args) {
		int[] arr = { 8, 8, 8, 8, 7, 8, 8, 10 };	
		Arrays.sort(arr);	
		int[] newArr = returnDuplicatesRemoved(arr);	 	
		System.out.println("Array before removing duplicates " + Arrays.toString(arr));
		System.out.println("Array after removing duplicates " + Arrays.toString(newArr));
		
		System.out.println();
		
		int[] arr2 = { 2, 2, 5, 3, 8, 8, 9, 1, 1, 1, 5, 2, 6};	
		Arrays.sort(arr2);		
		int[] newArr2 = returnDuplicatesRemoved(arr2);	 	
		System.out.println("Array before removing duplicates " + Arrays.toString(arr2));
		System.out.println("Array after removing duplicates " + Arrays.toString(newArr2));
		
		System.out.println();
		
		int[] arr3 = { 2 };	
		Arrays.sort(arr3);		
		int[] newArr3 = returnDuplicatesRemoved(arr3);	 	
		System.out.println("Array before removing duplicates " + Arrays.toString(arr3));
		System.out.println("Array after removing duplicates " + Arrays.toString(newArr3));
		
		System.out.println();
		
		int[] arr4 = {  };	
		Arrays.sort(arr4);		
		int[] newArr4 = returnDuplicatesRemoved(arr4);	 	
		System.out.println("Array before removing duplicates " + Arrays.toString(arr4));
		System.out.println("Array after removing duplicates " + Arrays.toString(newArr4));
	}
	
	public static int[] returnDuplicatesRemoved(int[] arr) {
		if (arr.length == 0)
			return arr;
		
		int[] temp = new int[arr.length];
		temp[0] = arr[0];
		int res = 1;
		
		for (int i = 1; i < arr.length; i++) {
			if (temp[res - 1] != arr[i]) {
				temp[res] = arr[i];
				res++;
			}
		}
		
		System.out.println("The size of the after removing duplicates: " + res);
		
		return temp;
	}
}
