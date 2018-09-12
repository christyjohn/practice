package ch02_gettingstarted;

import java.util.Arrays;

public class InsertionSortDesc {
	public static void main(String[] args) {
		int[] arr = { 23, 45, 1, 6, 5, 89, 43};
		sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void sort(int[] arr) {
		int key;
		int i, j;
		
		for(j = 1; j < arr.length; j++) {
			key = arr[j];
			i = j - 1;
			while(i >=0 && arr[i] < key) {
				arr[i+1] = arr[i];
				i = i - 1;
			}
			arr[i + 1] = key;
		}
	}
}