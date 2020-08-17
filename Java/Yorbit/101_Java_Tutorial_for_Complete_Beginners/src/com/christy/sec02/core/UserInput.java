package com.christy.sec02.core;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a line of text: ");
		String line = input.nextLine();
		System.out.println("Enter an integer: ");
		System.out.println("You entered : " + line);
		int value = input.nextInt();
		System.out.println("You entered : " + value);
	}

}
