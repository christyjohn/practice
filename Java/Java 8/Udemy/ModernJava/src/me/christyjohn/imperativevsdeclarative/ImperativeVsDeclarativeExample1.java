package me.christyjohn.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

    public static void main(String[] args) {

        // sum of integers for the range from 0 to 100
        /*
          Imperative style - how style of programming
         */
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            // shared mutable state and its sequential, and it will go step by step
            // and it will have issues if we try to run the code in multithreaded environment
        }
        System.out.println("Sum is : " + sum);

        /*
            Declarative style of programming (similar to functional programming.
            What style of programming
            You let the system do the job for you and get the result
         */
        sum = IntStream.rangeClosed(0, 100)
                //.parallel() // to parallelly run in multicore env
                .sum();
        System.out.println("Sum is : " + sum);
    }
}
