package com.christy.arrays;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 3, 0, 2, 7, 6, 9, 4 };
        int[] arr2 = { 445, 12, 678, 23 };
        int[] arr3 = {100, 100, 100, 100};
        int[] arr4 = {45};

        System.out.println("The largest element is at index: " + findIndexOfLargestElement(arr));
        System.out.println("The largest element is at index: " + findIndexOfLargestElement(arr2));
        System.out.println("The largest element is at index: " + findIndexOfLargestElement(arr3));
        System.out.println("The largest element is at index: " + findIndexOfLargestElement(arr4));
    }

    static int findIndexOfLargestElement(int[] arr) {
        int largest = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest])
                largest = i;
        }

        return largest;
    }
}
