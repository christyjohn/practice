package sec05.controlflow_statements;

public class WhileLoop {
    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();

        count = 1;
        do {
            System.out.println("Count value is " + count);
            count++;
        } while (count != 6);
    }
}
