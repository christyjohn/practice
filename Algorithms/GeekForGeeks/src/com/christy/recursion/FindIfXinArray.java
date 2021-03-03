package com.christy.recursion;

public class FindIfXinArray {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		System.out.println(findIfXPresent(arr, 3, 0, 4));
		System.out.println(findIfXPresent(arr, 6, 0, 4));
	}
	
	static boolean findIfXPresent(int[] arr, int x, int leftIndex, int rightIndex) {
		if (rightIndex < 0)
			return false;
		if (arr[leftIndex] == x)
			return true;
		if (arr[rightIndex] == x)
			return true;
		
		return findIfXPresent(arr, x, leftIndex + 1, rightIndex - 1);
		
	}
}	
