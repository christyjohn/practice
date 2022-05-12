package me.christyjohn.functionalInterfaces;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    static List<Student> studentList = StudentDataBase.getAllStudents();

    Predicate<Student> isStudentGradeGreaterThanThree = student -> student.getGradeLevel() >= 3;
    Predicate<Student> isStudentGPAGreaterThan = student -> student.getGpa() >= 3.8;

    BiConsumer<String, List<String>> studentBiConsumer =
            (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = (student -> {
        if (isStudentGPAGreaterThan.and(isStudentGradeGreaterThanThree).test(student)) {
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    });

    public void printNameAndActivities(List<Student> studentList) {
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
