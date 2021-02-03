package com.christy.arrays;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] arr = { 5, 1, 8, 3, 0, 2, 7, 6, 9, 4 };
        int[] arr2 = { 445, 12, 678, 23 };
        int[] arr3 = {100, 100, 100, 100};
        int[] arr4 = {45};

        System.out.println("The second largest element is at index: " +
                findIndexOfSecondLargestElement(arr));
        System.out.println("The second largest element is at index: " +
                findIndexOfSecondLargestElement(arr2));
        System.out.println("The second largest element is at index: " +
                findIndexOfSecondLargestElement(arr3));
        System.out.println("The second largest element is at index: " +
                findIndexOfSecondLargestElement(arr4));
    }

    static int findIndexOfSecondLargestElement(int[] arr) {
        int result = -1, largest = 0;

        for(int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[largest]) {
                result = largest;
                largest = i;
            } else if (arr[i] != arr[largest]) {
                if (result == -1 || arr[i] > arr[result])
                    result = i;
            }
        }
        return result;
    }
}
