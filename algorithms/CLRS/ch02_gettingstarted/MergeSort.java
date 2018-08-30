package ch02_gettingstarted;

import java.util.Arrays;

public class MergeSort {
	public static void main(String[] args) {
		int[] arr = { 34, 6, 12, 23, 4, 123, 5, 34, 23, 6, 18, 78, 90, 9, 25, 47, 234, 89, 98, 37 };
		mergesort(arr, 0, arr.length-1);
		System.out.println(Arrays.toString(arr));	
	}

	public static void mergesort(int[] a, int p, int r) {
		if(p <  r) {
			int q = (p + r) / 2;
			
			mergesort(a, p, q);
			mergesort(a, q+1, r);
			merge(a, p, q, r);
		}
	}
	
	public static void merge(int[] a, int p, int q, int r) {
		int n1 = q - p + 1;
		int n2 = r - q;
		
		int[] left = new int[n1];
		int[] right = new int[n2];
		
		for(int i = 0; i < n1; i++) {
			left[i] = a[p + i];
		}
		
		for(int j = 0; j < n2; j++) {
			right[j] = a[q+1 + j];
		}
		
		int i = 0;
		int j = 0;
		int k = p;
		
		while(i < n1 && j < n2) {
			if(left[i] < right[j]) {
				a[k] = left[i];
				i++;
				k++;
			} else {
				a[k] = right[j];
				j++;
				k++;
			}
		}
		
		while(i < n1 ){
			a[k++] = left[i++];
		}
		

		while(j < n2 ){
			a[k++] = right[j++];
		}
	}
}
