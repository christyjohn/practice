package sec03.first_steps;

public class ByteShortIntLong {
    public static void main(String[] args) {
        int myValue = 10000;
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println("Integer minimum value = " + myMinIntValue);
        System.out.println("Integer maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        // int myMaxIntTest = 2147483648; // Integer number too large
        int myMaxIntTest = 2_147_483_647;

        byte myByteMinValue = Byte.MIN_VALUE;
        byte myByteMaxValue = Byte.MAX_VALUE;
        System.out.println("Byte minimum value = " + myByteMinValue);
        System.out.println("Byte maximum value = " + myByteMaxValue);

        short myShortMinValue = Short.MIN_VALUE;
        short myShortMaxValue = Short.MAX_VALUE;
        System.out.println("Short minimum value = " + myShortMinValue);
        System.out.println("Short maximum value = " + myShortMaxValue);

        long myLongValue = 100;
        long myLongMinValue = Long.MIN_VALUE;
        long myLongMaxValue = Long.MAX_VALUE;
        System.out.println("Long minimum value = " + myLongMinValue);
        System.out.println("Long maximum value = " + myLongMaxValue);
        // long bigLongLiteralValue = 2_147_483_647_123; // Integer number too large
        long bigLongLiteralValue = 2_147_483_647_123L;
        System.out.println(bigLongLiteralValue);

        short bigShortLiteralValue = 32767;
        int myTotal = (myMinIntValue / 2);

        // byte myNewByteValue = (myByteMinValue / 2); // Required type: byte Provided: int
        byte myNewByteValue = (byte) (myByteMinValue / 2);
        short myNewShortValue = (short) (myShortMinValue / 2);
    }
}
