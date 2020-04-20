package com.christy;

public class Main {

    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("myMinFloatValue = " + myMinFloatValue);
        System.out.println("myMaxFloatValue = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("myMinDoubleValue = " + myMinDoubleValue);
        System.out.println("myMaxDoubleValue = " + myMaxDoubleValue);

        int myIntValue = 5 / 2;
        float myFloatValue = 5 / 2; // works 2.0
        double myDoubleValue = 5 / 2; // works 2.0
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        myFloatValue = 5f / 2; // works 2.5
        myDoubleValue = 5d / 2; // works 2.5
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // myFloatValue = 5.25; // need to cast to float or use 5.25f
        myFloatValue = 5.25f; // works
        myFloatValue = (float) 5.25; // works
        myDoubleValue = 5.25; // works
    }
}
