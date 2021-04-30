package ed10.book1.ch03.fundamentals;

import java.util.Scanner;

public class Retirement2 {
	public static void main(String[] args) {
Scanner in = new Scanner(System.in);
		
		System.out.print("How much money do you need to retire? ");
		double goal = in.nextDouble();
		
		System.out.print("How much money will you contribute every year? ");
		double payment = in.nextDouble();
		
		System.out.print("Interest rate in %: ");
		double interestRate = in.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		String input;
		
		// update account balance while user isn't ready to retire
		 do {
			// add this year's payment and interest
			balance += payment;
			double interest = balance * interestRate / 10;
			balance += interest;
			year++;
			
			// print current balance
			System.out.printf("After year %d, your balance is %, .2f%n", year, balance);
			
			// ask if ready to retire and get input
			System.out.println("Ready to retire? (Y/N) ");
			input = in.next();
		} while (input.equalsIgnoreCase("N"));
		
		System.out.println("You can retire in " + year + " years.");
	}
}
