package com.christy.arrays;

import java.util.Arrays;

public class MoveZeroesToEnd {
	public static void main(String[] args) {
		int[] arr = {1,3,5,0,4,5,0,0,2,0,9};
		int[] arr2 = {0,0,0};
		int[] arr3 = {};
		int[] arr4 = {1,2,3};
		moveZeroesToEnd(arr);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
	}
	
	public static void moveZeroesToEnd(int[] arr) {
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
	}
}
