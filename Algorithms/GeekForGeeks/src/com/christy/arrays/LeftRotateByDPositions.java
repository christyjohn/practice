package com.christy.arrays;

import java.util.Arrays;

public class LeftRotateByDPositions {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 5, 7, 9 };
		int[] arr2 = { 2, 3, 5, 7, 9, 10, 13, 15 };
		int d = 3;
		
		System.out.println("Array before rotating: " + Arrays.toString(arr));
		rotateLeft(arr, d);
		System.out.print("Array after rotating " + d + " positions: ");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("------------");
		
		System.out.println("Array before rotating: " + Arrays.toString(arr2));
		rotateLeft(arr2, d);
		System.out.print("Array after rotating " + d + " positions: ");
		System.out.println(Arrays.toString(arr2));
	}
	
	public static void rotateLeft(int[] arr, int d) {
		reverse(arr, 0, d-1);
		reverse(arr, d, arr.length-1);
		reverse(arr, 0, arr.length -1);
	}
	
	public static void reverse(int[] arr, int startIndex, int endIndex) {
		while (startIndex < endIndex) {
			int temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
			
			startIndex++;
			endIndex--;
		}
	}
}
