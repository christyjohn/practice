package me.christyjohn.functionalInterfaces;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    static Consumer<Student> c2 = (System.out::println);
    static Consumer<Student> c3 = student -> System.out.print(student.getName() + " -> ");
    static Consumer<Student> c4 = student -> System.out.println(student.getActivities());

    public static void main(String[] args) {

        /*Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("christy");*/

        System.out.println("--------Student Details---------");
        printStudentDetails();
        System.out.println("--------Student Details (Name and Activities)---------");
        printNameAndActivities();
        System.out.println("--------Student Details for grade >= 3 and gpa >= 3.9 (Name and Activities)---------");
        printNameAndActivitiesUsingCondition();
    }

    public static void printStudentDetails() {
        studentList.forEach(c2);
    }

    public static void printNameAndActivities() {
        studentList.forEach(c3.andThen(c4)); // consumer chaining
    }

    public static void printNameAndActivitiesUsingCondition() {
        studentList.forEach( student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9)
                c3.andThen(c4).accept(student);
        });
    }
}
