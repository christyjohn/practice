package me.christyjohn.functionalInterfaces;

import me.christyjohn.data.Student;
import me.christyjohn.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {

        Supplier<Student> studentSupplier =  () ->  new Student("James",4,3.9,"male",
                        Arrays.asList("swimming", "basketball","baseball","football"));

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();

        System.out.println("Student is ; " + studentSupplier.get());

        System.out.println("Students are : " + listSupplier.get());


    }
}
