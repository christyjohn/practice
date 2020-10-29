package sec03.first_steps;

public class FloatAndDouble {
    public static void main(String[] args) {
        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum  value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum  value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        //float myFloatValue = 5.25; // Required type: float Provided: double
        float myFloatValue = (float) 5.25; // or
        myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; // d is not required. By default double

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
    }
}
