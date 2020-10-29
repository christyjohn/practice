package sec03.first_steps;

public class PrimitiveTypesChallenge {
    public static void main(String[] args) {
        byte myByteValue = 123;
        short myShortValue = 24_567;
        int myIntValue = 6_789_078;

        long myLongValue = 50_000 + 10 * (myByteValue + myShortValue + myIntValue);
        System.out.println(myLongValue);
    }
}
