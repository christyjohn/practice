package me.christyjohn.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {

    static int valueInst = 5;

    public static void main(String[] args) {
        int value = 4; // local variable

        Consumer<Integer> c1 = (i) -> {
            // Variable used in lambda expression should be final or effectively final
            // value = i;
            System.out.println(value + i); // 9
            System.out.println(valueInst + i); // 12
        };

        // Even though we can do this, we cannot now use value inside our Consumer, it will show error
        // Variable used in lambda expression should be final or effectively final
        //value = 2;


        // we can change instance variables which are used inside lambda expressions.
        valueInst = 7;

        c1.accept(5);
    }
}
