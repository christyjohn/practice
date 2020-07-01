package com.udemy.sec03.first_steps;

import java.util.Scanner;

public class PoundsToKilogram {

	public static void main(String[] args) {
		
		double pounds = 0.0;
		double kilograms = 0.0;
		
		System.out.println("Enter the number of pounds: ");
		Scanner scanner = new Scanner(System.in);
		pounds = scanner.nextDouble();
		
		kilograms = pounds * 0.45359237;
		System.out.println(pounds + " pounds = " + kilograms +
			" kilograms.");
	}

}
