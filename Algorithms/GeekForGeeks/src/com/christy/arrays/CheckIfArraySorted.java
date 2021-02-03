package com.christy.arrays;

public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7 };
        int[] arr2 = { 234, 678, 1123, 4567, 6789 };
        int[] arr3 = { 78, 23, 678 };
        int[] arr4 = { 5 };
        int[] arr5 = { 34, 34, 34 };

        System.out.println("Sorted: " + isSorted(arr));
        System.out.println("Sorted: " + isSorted(arr2));
        System.out.println("Sorted: " + isSorted(arr3));
        System.out.println("Sorted: " + isSorted(arr4));
        System.out.println("Sorted: " + isSorted(arr5));
    }

    static boolean isSorted(int[] arr) {
        boolean result = true;
        if (arr.length == 1) {
            result = true;
        } else {
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] < arr[i-1])
                  result = false;
            }
        }
        return result;
    }
}
