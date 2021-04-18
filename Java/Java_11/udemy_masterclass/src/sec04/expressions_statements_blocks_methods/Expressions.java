package sec04.expressions_statements_blocks_methods;

public class Expressions {
    public static void main(String[] args) {
        // mile is equal to 1.609344 kilometres
        double miles = 100.00;
        double kmsPerMile = 1.609344;
        double kilometres = (miles * kmsPerMile);
        System.out.println(miles + " miles = " + kilometres + " kilometres.");

        int highScore = 50;

        if(highScore == 50) {
            System.out.println("This is an expression");
        }
    }
}
