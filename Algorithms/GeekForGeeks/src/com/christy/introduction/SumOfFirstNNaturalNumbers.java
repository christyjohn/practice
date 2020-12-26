package com.christy.introduction;

import java.util.Scanner;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {
        int number = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        sum = number  * (number + 1) / 2;

        System.out.println("The sum of first natural numbers till " + number + " = " + sum);
    }
}
