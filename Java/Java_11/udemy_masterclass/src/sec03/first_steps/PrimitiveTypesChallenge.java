package sec03.first_steps;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByteValue = 112;
        short myShortValue = (short) 36786;
        int myIntValue = 1_234_345;
        long myLongValue = 50_000 + (10 * (myByteValue + myShortValue + myIntValue));
        System.out.println(myLongValue);
    }
}
