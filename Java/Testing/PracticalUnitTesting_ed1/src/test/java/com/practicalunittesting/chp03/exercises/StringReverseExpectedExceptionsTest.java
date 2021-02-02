package com.practicalunittesting.chp03.exercises;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class StringReverseExpectedExceptionsTest {
	private final static String VALID_STRING = "Christy";
	
	private static final Object[] getInvalidString() {
		return new String[] {"a", "b", "c" }; 
	}
	
	@Test(expected = IllegalArgumentException.class)
	@Parameters(method = "getInvalidString")
	public void methodShouldThrowIAEForInvalidString(String invalidString) {
		StringReverseApp.reverse(invalidString.toString());
	}
}
