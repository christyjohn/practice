package sec05.controlflow_statements;

public class SwitchCaseChallenge {
    public static void main(String[] args) {
        char switchValue = 'B';

        switch (switchValue) {
            case 'A':
                System.out.println("The switchValue is 'A'");
                break;
            case 'B':
                System.out.println("The switchValue is 'B'");
                break;
            case 'C':
                System.out.println("The switchValue is 'C'");
                break;
            case 'D': case 'E':
                System.out.println("The switchValue is either 'D' or 'E'");
                break;
            default:
                System.out.println("The switchValue is not of 'A, 'B', 'C', 'D' or 'E'");
                break;
        }
    }
}
