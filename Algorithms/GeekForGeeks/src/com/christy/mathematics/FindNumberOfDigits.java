package com.christy.mathematics;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 7;
        int num3 = -67890;

        System.out.println("Iterative way");
        System.out.println("Number of digits in " + num1 + " = " +
                findNumberOfDigitsIterative(num1));
        System.out.println("Number of digits in " + num2 + " = " +
                findNumberOfDigitsIterative(num2));
        System.out.println("Number of digits in " + num3 + " = " +
                findNumberOfDigitsIterative(num3));

        System.out.println("---------------------------------");

        System.out.println("Recursive way");
        System.out.println("Number of digits in " + num1 + " = " +
                findNumberOfDigitsRecursive(num1));
        System.out.println("Number of digits in " + num2 + " = " +
                findNumberOfDigitsRecursive(num2));
        System.out.println("Number of digits in " + num3 + " = " +
                findNumberOfDigitsRecursive(num3));
    }

    static int findNumberOfDigitsIterative(int number) {
        int count = 0;

        while (number != 0) {
            number = number / 10;
            ++count;
        }
        return count;
    }

    static int findNumberOfDigitsRecursive(int n) {
        if (n == 0)
            return 0;
        return 1 + findNumberOfDigitsRecursive(n/10);
    }
}
