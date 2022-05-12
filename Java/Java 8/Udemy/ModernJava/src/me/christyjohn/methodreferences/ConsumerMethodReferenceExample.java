package me.christyjohn.methodreferences;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    //static Consumer<Student> c1 = p -> System.out.println(p);
    static Consumer<Student> c2 = System.out::println;
    static Consumer<Student> c3 = Student::printListOfActivities;

    public static void main(String[] args) {
        //StudentDataBase.getAllStudents().forEach(c1);
        System.out.println("List all student by using method refernce.");
        StudentDataBase.getAllStudents().forEach(c2);
        System.out.println("List of activities of Students");
        StudentDataBase.getAllStudents().forEach(c3);
    }
}
