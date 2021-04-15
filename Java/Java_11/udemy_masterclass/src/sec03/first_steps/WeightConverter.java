package sec03.first_steps;

public class WeightConverter {
    public static void main(String[] args) {
        double pounds = 260.00;
        double kgs = 104;

        double kgPerPound = 0.45359237;

        System.out.println("Converting Pounds to kilograms");
        System.out.println(pounds + " pounds = " + pounds * kgPerPound + " kgs.");
        System.out.println("Converting Kgs to pounds.");
        System.out.println(kgs + " Kgs = " + kgs / kgPerPound + " pounds.");
    }
}
