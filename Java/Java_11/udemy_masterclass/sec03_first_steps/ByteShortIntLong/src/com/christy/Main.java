package com.christy;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted maximum value = " + (myMaxIntValue + 1));
        System.out.println("Busted minimum value = " + (myMinIntValue - 1));

        // int myMaxIntTest = 2_147_483_648; // Integer number too large

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myMinByteValue);
        System.out.println("Byte maximum value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myMinShortValue);
        System.out.println("Short maximum value = " + myMaxShortValue);


        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myMinLongValue);
        System.out.println("Long maximum value = " + myMaxLongValue);

        // long bigLongLiteralValue = 2_147_483_647; // this works
        // long bigLongLiteralValue = 2_147_483_647_123; // Integer number too large
        long bigLongLiteralValue = 2_147_483_647_123_123L; // this works
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2); // works
        // byte myNewByteValue = (myMinByteValue / 2); // needed to be casted to byte
        byte myNewByteValue = (byte) (myMinByteValue / 2); // works

        //short myNewShortValue = (myMinShortValue / 2);  // needed to be casted to short
        // short myNewShortValue = (short) myMinShortValue / 2; // error same as above
        short myNewShortValue = (short) (myMinShortValue / 2);
    }
}
