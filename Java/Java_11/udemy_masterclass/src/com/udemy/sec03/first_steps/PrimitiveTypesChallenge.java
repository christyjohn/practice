package com.udemy.sec03.first_steps;

public class PrimitiveTypesChallenge {
	public static void main(String[] args) {
		
		byte myBytevalue = 78;
		short myShortValue = 11223;
		int myIntValue = 23456789;
		long myLongValue;
		
		myLongValue = 50000 + 10 * (myBytevalue + myShortValue + myIntValue);
		System.out.println(myLongValue);
	}
}
