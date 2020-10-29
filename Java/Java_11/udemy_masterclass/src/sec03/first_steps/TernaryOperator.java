package sec03.first_steps;

public class TernaryOperator {
    public static void main(String[] args) {
        boolean isCar = true;

        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasCar is true");
        }

    }
}
