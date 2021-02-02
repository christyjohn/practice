package com.practicalunittesting.chp03.testfixture;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.practicalunittesting.chp03.exercises.Student;

public class StudentTest {

	Student student = new Student("Christy", 18);
	
	@Test
	public void constructorShouldSetAmountAndCurrency() {
		Student student = new Student("Cecil", 16);
		
		assertEquals("Cecil", student.getName());
		assertEquals(16, student.getAge());
	}
	
	@Test
	public void checkIfEqual() {
		Student student2 = new Student("Christy", 18);
		assertEquals(student, student2);
		assertEquals(new Student("Christy", 18), student2);
	}
}
