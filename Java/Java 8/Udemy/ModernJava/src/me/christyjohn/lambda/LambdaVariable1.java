package me.christyjohn.lambda;

import java.util.function.Consumer;

public class LambdaVariable1 {

    public static void main(String[] args) {
        int i = 0;

        // Variable 'i' is already defined in the scope
        //Consumer<Integer> c1 = i ->  System.out.println("Value is " + i);

        Consumer<Integer> c1 = a ->  System.out.println("Value is " + a);

        c1.accept(3);
    }
}
