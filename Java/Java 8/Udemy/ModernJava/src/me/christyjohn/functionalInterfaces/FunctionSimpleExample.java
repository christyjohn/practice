package me.christyjohn.functionalInterfaces;

import java.util.function.Function;

public class FunctionSimpleExample {

    static Function<String, String> toUpperCase = name -> name.toUpperCase();
    static Function<String, String> addSomeString = name -> name.toUpperCase().concat(" default");

    public static void main(String[] args) {

        System.out.println("Result is : " + toUpperCase.apply("java 8"));
        System.out.println("Result of andThen is : " + toUpperCase.andThen(addSomeString).apply("java 8"));
        System.out.println("Result of andThen is : " + toUpperCase.compose(addSomeString).apply("java 8"));
    }
}
