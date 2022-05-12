package me.christyjohn.functionalInterfaces;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();
    static BiConsumer<String, List<String>> biConsumer = (name, activities) ->
            System.out.println(name + " : " + activities);

    public static void printNameAndActivites() {
        studentList.forEach(student -> biConsumer.accept(student.getName(), student.getActivities()));
    }

    public static void main(String[] args) {
        /*BiConsumer<String, String> biConsumer = (a, b) -> System.out.println(a + " " + b);
        biConsumer.accept("Christy", "John");

        BiConsumer<Integer, Integer> multiply = (a, b) -> System.out.println("Multiplication : " +(a * b));
        BiConsumer<Integer, Integer> division = (a, b) -> System.out.println("Division : " +(a / b));

        //Multiplication : 50
        //Division : 2
        multiply.andThen(division).accept(10, 5);*/

        printNameAndActivites();
    }
}
