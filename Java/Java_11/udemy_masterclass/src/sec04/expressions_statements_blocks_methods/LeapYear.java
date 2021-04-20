package sec04.expressions_statements_blocks_methods;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));      // false
        System.out.println(isLeapYear(1600));       // true
        System.out.println(isLeapYear(2017));       // false
        System.out.println(isLeapYear(2000));       // true
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;
        if (year < 1 || year > 9999) {
            isLeapYear = false;
        } else {
            if (year % 4 == 0) {
                isLeapYear = true;
                if (year % 100 == 0 && year % 400 == 0) {
                    isLeapYear = true;
                } else if (year % 100 == 0) {
                    isLeapYear = false;
                }
            } else {
                isLeapYear = false;
            }
        }
        return isLeapYear;
    }
}
