package com.practicalunittesting.chp03.exercises;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CourseTest {
	private Student chris = new Student("Christy");
	private Student cecil = new Student("Cecil");
	private Course course = new Course();
	
	@Test
	public void afterCreationShouldHaveNoStudent() {
		assertEquals(0, course.getStudents().size());
	}
	
	@Test
	public void shouldAllowToAddStudent() {
		course.addStudent(chris);
		
		assertEquals(1, course.getStudents().size());
		assertTrue(course.getStudents().contains(chris));
	}
	
	@Test
	public void shouldAllowToAddManyStudents() {
		course.addStudent(chris);
		course.addStudent(cecil);
		
		assertEquals(2, course.getStudents().size());
		assertTrue(course.getStudents().contains(chris));
		assertTrue(course.getStudents().contains(cecil));
	}
}
