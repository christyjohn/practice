package me.christyjohn.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateSimpleExample {

    static Predicate<Integer> isEven = i -> i % 2 == 0;
    static Predicate<Integer> isDivisibleByFive = i -> i % 5 == 0;

    public static void main(String[] args) {
        System.out.println("------ Is Even ---------");
        System.out.println("Predicate result is : (4) -> " + isEven.test(4));
        System.out.println("Predicate result is : (5) -> " + isEven.test(5));

        System.out.println("------ Is Even and Divisible by 5 ---------");

        predicateAnd();
        System.out.println("------ Is Even or Divisible by 5 ---------");
        predicateOr();
        System.out.println("------ Negate result of Is Even and/or Divisible by 5 ---------");
        predicateNegate();
    }

    public static void predicateAnd() {
        System.out.println("Predicate And result is : (10) -> " + isEven.and(isDivisibleByFive).test(10));
        System.out.println("Predicate And result is : (12) -> " + isEven.and(isDivisibleByFive).test(12));
        System.out.println("Predicate And result is : (15) -> " + isEven.and(isDivisibleByFive).test(15));
    }

    public static void predicateOr() {
        System.out.println("Predicate Or result is : (10) -> " + isEven.or(isDivisibleByFive).test(10));
        System.out.println("Predicate Or result is : (12) -> " + isEven.or(isDivisibleByFive).test(12));
        System.out.println("Predicate Or result is : (15) -> " + isEven.or(isDivisibleByFive).test(15));
    }

    public static void predicateNegate() {
        System.out.println("Predicate And then Negate result is : (10) -> " + isEven.and(isDivisibleByFive).negate().test(10));
        System.out.println("Predicate Or then Negate result is : (12) -> " + isEven.and(isDivisibleByFive).negate().test(12));
    }
}
