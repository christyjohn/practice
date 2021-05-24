package com.christy.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLeaders {
	
	/*
	 * An element is a leader in an array if there are no elements greater
	 * than or equal to it on the right side of it.
	 * 
	 * e.g., I/P:  { 7, 10, 4, 3, 10, 6, 5, 2 }
	 * 	     O/P:  { 10, 6, 5, 2 } // the second 10 is the leader
	 * 
	 * In this we are going to traverse from end and print the elements
	 * if the current leader is less than the element.
	 * Tip: the end element is always a leader
	 */
	public static void main(String[] args) {
		int[] nums = { 7, 10, 4, 3, 10, 6, 5, 2 };
		
		System.out.print("The elements in the numbers array are: [");
		for (int i : nums) {
			System.out.print(i + " ");
		}
		System.out.println("]");
		
		System.out.print("The leaders in the array are: ");
		findLeaders(nums);
	}
	
	public static void findLeaders(int[] numbers) {
		int length = numbers.length;
		int current_leader = numbers[length-1];
		System.out.print(current_leader + " ");
		
		for (int i = length-2; i >=0; i--) {
			if (numbers[i] > current_leader) {
				current_leader = numbers[i];
				System.out.print(current_leader + " ");
			}
		}
		System.out.println();
	}
}
