package sec04.expressions_statements_blocks_methods;

public class BarkingDog {
    public static void main(String[] args) {
        System.out.println(shouldWakeUp (true, 1));     // true
        System.out.println(shouldWakeUp (false, 2));    // false
        System.out.println(shouldWakeUp (true, 8));     // false
        System.out.println(shouldWakeUp (true, -1));     // false
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay <= 23))) {
            return true;
        } else {
            return false;
        }
    }
}
