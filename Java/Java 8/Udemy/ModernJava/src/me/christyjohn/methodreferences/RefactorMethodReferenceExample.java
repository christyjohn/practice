package me.christyjohn.methodreferences;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {

    //static Predicate<Student> isGradeLevelGreaterThanThree = s -> s.getGradeLevel() >= 3;
    // doing the same below

    static Predicate<Student> isGradeLevelGreaterThanThree = RefactorMethodReferenceExample::isGradeLevelGreater;

    public static boolean isGradeLevelGreater(Student s) {
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(isGradeLevelGreaterThanThree.test(StudentDataBase.studentSupplier.get()));
    }
}
