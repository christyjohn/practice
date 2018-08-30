package ch02_gettingstarted;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = { 23, 45, 1, 6, 5, 89, 43};
		sort(arr);
		System.out.println(Arrays.toString(arr));		
	}
	
	public static void sort(int[] arr) {
		int key = 0;
		int min = 0;
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			min = arr[i];
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] < min) {
					min = arr[j]; 
					temp = arr[i];
					arr[i] = min;
					arr[j] = temp;
				}
			}
			
		}
	}
}
