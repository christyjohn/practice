package com.practicalunittesting.chp03.exercises;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private List<Student> students = new ArrayList<>();
	
	public Course(Student student) {
		
	}
	
	public Course() {
		
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public List<Student> getStudents() {
		return students;
	}
}
