package sec03.first_steps;

public class PoundsToKilograms {
    public static void main(String[] args) {
        double pounds = 4;
        double kgPerPound = 0.45359237;
        double kilograms = pounds * kgPerPound;
        System.out.println( pounds + " pounds = " + kilograms +
                " kilograms.");
    }
}
