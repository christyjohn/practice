package com.christy;

public class Main {

    public static void main(String[] args) {
	    byte myByteVariable = 10;
        short myShortVariable = 20;
        int myIntVariable = 30;
        long myLongVariable = 50000L + 10 * (myByteVariable + myShortVariable + myIntVariable);

        System.out.println(" 50000" + " + 10 * (" + myByteVariable  + " + " + myShortVariable + " + " + myIntVariable
                        + ") = " + myLongVariable);
    }
}
