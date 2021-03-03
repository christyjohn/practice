package com.christy.recursion;

public class PrintFunTest {
	public static void main(String[] args) {
		printFun(3);
	}
	
	public static void printFun(int test) {
		if (test < 1)
			return;
		else {
			System.out.print(test + " ");
			printFun(test-1);
			System.out.print(test + " ");
			return;
		}
	}
}
