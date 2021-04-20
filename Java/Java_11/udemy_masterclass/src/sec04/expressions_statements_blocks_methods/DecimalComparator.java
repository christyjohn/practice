package sec04.expressions_statements_blocks_methods;

public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));      // true
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));         // false
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));             // true
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));        // false
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        boolean isSame = false;
        int newNum1 = (int) (num1 * 1000);
        int newNum2 = (int) (num2 * 1000);
        System.out.println(newNum1 + " : " + newNum2);

        if (newNum1  == newNum2) {
            isSame = true;
        }

        return isSame;
    }
}
