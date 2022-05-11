package me.christyjohn.lambda;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        // Prior to Java 8 - legacy way
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1");
            }
        };
        new Thread(runnable).start();

        // the above can be combined
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Inside Runnable 1.1");
            }
        }).start();

        // Java 8 lambda syntax , () -> {};
        Runnable runnableLambda = () -> {
            System.out.println("Inside Runnable 2");
        };

        new Thread(runnableLambda).start();

        // is similar to the above. If there is only one statement, there is no need for the curly braces
        Runnable runnableLambda1 = () -> System.out.println("Inside Runnable 2.1");
        new Thread(runnableLambda1).start();

        // we can combine both the above lines in a single statement
        new Thread(() -> System.out.println("Inside Runnable 2.2")).start();

        // if there are multiple statement it is a must that there should be curly braces
        new Thread(() -> {
            System.out.println("Inside Runnable 3.1");
            System.out.println("Inside Runnable 3.2");
        }).start();

    }
}
