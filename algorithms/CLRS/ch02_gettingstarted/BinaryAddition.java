package ch02_gettingstarted;

import java.util.Arrays;

public class BinaryAddition {
	public static void main(String[] args) {
		int[] arr1 = {1, 0 ,1, 0, 1};
		int[] arr2 = {1, 0 ,1, 0, 1};
		
		add(arr1, arr2);
	}
	
	public static void add(int[] arr1, int[] arr2) {
		int length = arr1.length;
		int[] arr3 = new int[length + 1];
		int sum = 0;
		int carry = 0;
		
		for(int i = length - 1; i >=0; i--) {
			if(carry == 0) {
				if(arr1[i] == 0 && arr2[i] == 0) {
					arr3[i+1] = 0;
					carry = 0;
				} else if(arr1[i] == 1 && arr2[i] == 1) {
					arr3[i+1] = 0;
					carry = 1;
				} else {
					arr3[i+1] = 1;
					carry = 0;					
				}
			} else if(carry == 1) {
				if(arr1[i] == 0 && arr2[i] == 0) {
					arr3[i+1] = 1;
					carry = 0;
				} else if(arr1[i] == 1 && arr2[i] == 1) {
					arr3[i+1] = 1;
					carry = 1;
				} else {
					arr3[i+1] = 0;
					carry = 1;					
				}
			}
		}
		arr3[0] = carry;
		System.out.println(Arrays.toString(arr3));
	}
}
