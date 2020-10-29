package sec03.first_steps;

public class LogicalOperators {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the highest score!");
        }

        if (topScore != 100) {
            System.out.println("You didn't get the highest score!");
        }

        if (topScore > 100) {
            System.out.println("Your score is not greater than 100!");
        }

        if (topScore >= 100) {
            System.out.println("You got the highest score!");
        }

        if (topScore <= 100) {
            System.out.println("Your core is 100 or less!");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) {
            System.out.println("Top score greater than second top score and less than 100.");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true");
        }
    }
}
