package me.christyjohn.functionalInterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> concatString = s -> s.concat(" default");

    public static void main(String[] args) {
        System.out.println(concatString.apply("Java 8"));
    }
}
