package me.christyjohn.functionalInterfaces;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    static Predicate<Student> isStudentGradeGreaterThanThree = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> isStudentGPAGreaterThan = student -> student.getGpa() >= 3.8;

    public static void main(String[] args) {
        System.out.println("------ List of students who are in grade level 3 or above -------");
        filterStudentByGradeLevel();
        System.out.println("------ List of students who are not in grade level 3 or above -------");
        negatefilterStudentByGradeLevel();
        System.out.println("------ List of students whose GPA is 3.8 or above -------");
        filterStudentByGPA();
        System.out.println("------ List of students whose GPA is 3.8 or above ans is in or above 3rd grade -------");
        filterStudentbyBothGradeAndGPA();
    }

    public static void filterStudentByGradeLevel() {
        studentList.forEach( student -> {
            if (isStudentGradeGreaterThanThree.test(student)) {
                System.out.println(student);
            }
        });
    }
    public static void negatefilterStudentByGradeLevel() {
        studentList.forEach( student -> {
            if (isStudentGradeGreaterThanThree.negate().test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentByGPA() {
        studentList.forEach( (student) -> {
            if (isStudentGPAGreaterThan.test(student)) {
                System.out.println(student);
            }
        });
    }

    public static void filterStudentbyBothGradeAndGPA() {
        studentList.forEach( (student) -> {
            if (isStudentGradeGreaterThanThree.and(isStudentGPAGreaterThan).test(student)) {
                System.out.println(student);
            }
        });
    }
}
