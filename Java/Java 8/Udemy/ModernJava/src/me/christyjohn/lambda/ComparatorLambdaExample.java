package me.christyjohn.lambda;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {

        // Prior to Java 8 - legacy way
        Comparator<Integer> comparator = new Comparator<>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println(comparator.compare(1, 2)); // -1 as o2 > o1
        System.out.println(comparator.compare(2, 1)); //  1 as o2 < o1
        System.out.println(comparator.compare(2, 2)); //  0 as o2 == o1

        System.out.println("-------------------");

        // Java 8 lambda syntax , () -> {};
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> a.compareTo(b);
        System.out.println(comparatorLambda.compare(1, 2));

        // the above can be simplified as we can avoid types of parameters in the parenthesis as the type
        // can be deduced from the Comparator declaration
        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);
        System.out.println(comparatorLambda1.compare(2, 1));
    }
}
