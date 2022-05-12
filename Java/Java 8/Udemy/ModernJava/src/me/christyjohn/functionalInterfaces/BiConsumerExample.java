package me.christyjohn.functionalInterfaces;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void main(String[] args) {
        BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Christy", "John");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication : " +(a * b));
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division : " +(a / b));

        //Multiplication : 50
        //Division : 2
        multiply.andThen(division).accept(10, 5);
    }
}
