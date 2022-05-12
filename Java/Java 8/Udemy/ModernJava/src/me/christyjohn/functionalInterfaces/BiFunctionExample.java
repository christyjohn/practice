package me.christyjohn.functionalInterfaces;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    // Get name and gpa of students who are in grade 3 or above
    // input - list of students, and predicate which checks whether the student is in or above 3rd grade
    // output a map of name and grade
    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (
            ((studentList, studentPredicate) -> {
                Map<String, Double> studentGrademap = new HashMap<>();

                studentList.forEach(student -> {
                    if(studentPredicate.test(student)) {
                        studentGrademap.put(student.getName(), student.getGpa());
                    }
                });
                return studentGrademap;
            })
    );

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(),
                PredicateStudentExample.isStudentGradeGreaterThanThree));
    }
}
