package com.christy.arrays;

import java.util.Arrays;

public class ReverseArray {
	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 7 };
        int[] arr2 = { 234, 678, 1123, 4567, 6789 };
        int[] arr3 = { 78, 78, 678 };
        int[] arr4 = { 5 };
        int[] arr5 = { 34, 34, 34 };
        
        System.out.println("Reversed arrays");
        System.out.println("---------------");
        
        printArray(reverseArray(arr));
        printArray(reverseArray(arr2));
        printArray(reverseArray(arr3));
        printArray(reverseArray(arr4));
        printArray(reverseArray(arr5));
	}
	
	public static int[] reverseArray(int[] arr) {
		int temp = 0;
		for (int i = 0; i < arr.length - i; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - (i + 1)];
			arr[arr.length - (i + 1)] = temp;
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		System.out.println(Arrays.toString(arr));
	}
}
