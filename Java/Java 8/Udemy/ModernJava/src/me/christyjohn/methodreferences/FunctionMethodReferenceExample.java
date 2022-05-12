package me.christyjohn.methodreferences;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

    static Function<String, String> toUpperCaseLambda = s -> s.toUpperCase();
    static Function<String, String> toUpperCaseMethodRef = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(toUpperCaseLambda.apply("christy"));
        System.out.println(toUpperCaseMethodRef.apply("christy"));
    }
}
