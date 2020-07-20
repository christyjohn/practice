package com.udemy.sec03.first_steps;

public class ByteShortIntlong {

	public static void main(String[] args) {
		int myValue = 10000;
		
		int myMinIntValue = Integer.MIN_VALUE;
		int myMaxIntValue = Integer.MAX_VALUE;
		System.out.println("Integer minimum value = " + myMinIntValue);
		System.out.println("Integer maximun value = " + myMaxIntValue);
		System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
		System.out.println("Busted MIN value = " + (myMinIntValue - 1));
		
		System.out.println("<-------------------------------->");
		
		byte myMinByteValue = Byte.MIN_VALUE;
		byte myMaxByteValue = Byte.MAX_VALUE;
		System.out.println("Byte minimum value = " + myMinByteValue);
		System.out.println("Byte maximun value = " + myMaxByteValue);
		
		System.out.println("<-------------------------------->");
		
		short myMinShortValue = Short.MIN_VALUE;
		short myMaxShortValue = Short.MAX_VALUE;
		System.out.println("Short minimum value = " + myMinShortValue);
		System.out.println("Short maximun value = " + myMaxShortValue);
		
		System.out.println("<-------------------------------->");
		
		long myLongValue = 100L;
		long myMinLongValue = Long.MIN_VALUE;
		long myMaxLongValue = Long.MAX_VALUE;
		System.out.println("Short minimum value = " + myMinLongValue);
		System.out.println("Short maximun value = " + myMaxLongValue);
		
		System.out.println("<-------------------------------->");
		
		int myTotal = (myMinIntValue / 2);
		byte myNewByteValue = (byte)(myMinByteValue / 2);
		short myNewShortValue = (short)(myMinShortValue / 2);
	}

}
