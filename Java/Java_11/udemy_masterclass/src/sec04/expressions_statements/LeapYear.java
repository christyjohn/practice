package sec04.expressions_statements;

public class LeapYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println( isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println( isLeapYear(2000));
    }

    public static boolean isLeapYear(int year) {
        boolean isLeapYear = false;

        if (year < 1 || year > 9999)
            return isLeapYear;
        else {
            if (year % 4 == 0 ) {
                if(year % 100 == 0) {
                    if (year % 400 == 0)
                        isLeapYear = true;
                    else
                        isLeapYear = false;
                } else {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = false;
            }
        }

        return isLeapYear;
    }
}
