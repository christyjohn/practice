package me.christyjohn.functionalInterfaces;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
        Map<String, Double> studentGrademap = new HashMap<>();

        students.forEach(student -> {
            // filter the students who are in grade 3 and above
            if (PredicateStudentExample.isStudentGradeGreaterThanThree.test(student)) {
                studentGrademap.put(student.getName(), student.getGpa());
            }
        });

        return studentGrademap;
    });

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
