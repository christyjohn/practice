package com.practicalunittesting.chp03.exercises;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringReverseAppTest {

	@Test
	public void TestReversedString() {
		assertEquals("ytsirhC", StringReverseApp.reverse("Christy"));
	}
}
