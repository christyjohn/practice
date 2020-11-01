package sec04.expressions_statements;

public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println( hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        boolean hasTeen = false;

        if(isTeen(num1) || isTeen(num2) || isTeen(num3) )
            hasTeen = true;

        return hasTeen;
    }

    public static boolean isTeen(int num) {
        boolean isTeen = false;

        if ((num >= 13 && num <= 19))
            isTeen = true;

        return isTeen;

    }
}
