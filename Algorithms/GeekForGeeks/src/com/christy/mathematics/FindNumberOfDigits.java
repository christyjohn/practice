package com.christy.mathematics;

public class FindNumberOfDigits {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 7;
        int num3 = -678903;
        
        long start;
        long finish;
        long timeElapsed;

        System.out.println("Iterative way");
        System.out.println("-------------------");
        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num1 + " = " +
                findNumberOfDigitsIterative(num1));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);
        
        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num2 + " = " +
                findNumberOfDigitsIterative(num2));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);
        
        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num3 + " = " +
                findNumberOfDigitsIterative(num3));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);

        System.out.println("<<--------------------------------->>");

        System.out.println("Recursive way");
        System.out.println("-------------------");
        
        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num1 + " = " +
                findNumberOfDigitsRecursive(num1));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);
        
        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num2 + " = " +
                findNumberOfDigitsRecursive(num2));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);

        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num3 + " = " +
                findNumberOfDigitsRecursive(num3));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);
        

        System.out.println("<<--------------------------------->>");

        System.out.println("Logarithmic way");
        System.out.println("-------------------");
        
        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num1 + " = " +
        		findNumberOfDigitsLogarithmic(num1));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);
        
        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num2 + " = " +
        		findNumberOfDigitsLogarithmic(num2));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);

        start = System.currentTimeMillis();
        System.out.println("Number of digits in " + num3 + " = " +
        		findNumberOfDigitsLogarithmic(num3));
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("Time elapsed: " + timeElapsed);
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
    
    static int findNumberOfDigitsLogarithmic(int n) {
    	if (n < 0)
    		n = -n;
    	return  (int) Math.floor(Math.log10(n) + 1);
    }
}
