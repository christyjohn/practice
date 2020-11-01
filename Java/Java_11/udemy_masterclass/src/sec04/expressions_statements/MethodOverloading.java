package sec04.expressions_statements;

public class MethodOverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("Christy", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        System.out.println(calcFeetAndInchesToCentimeters(12.0, 12.0));
        System.out.println(calcFeetAndInchesToCentimeters(13 * 12));
    }

    private static int calculateScore() {
        System.out.println("No player name, no score.");
        return 0;
    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player  scored " + score + " points.");
        return score * 1000;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        double centimeters = -1;
        double newInches = 0;

        if ((feet < 0.0) || (inches < 0.0 || inches > 12.0))
            return -1;
        else {
            newInches += (feet * 12) + inches;
            centimeters = newInches * 2.54;
        }
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(int inches) {
        int feet = 0;
        double newInches = 0;
        double centimeters = 0;

        if (inches < 0.0)
            return -1;
        else {
            feet =  inches / 12;
            newInches = inches % 12;

            centimeters = calcFeetAndInchesToCentimeters(feet, newInches);
        }
        return centimeters;
    }
}
