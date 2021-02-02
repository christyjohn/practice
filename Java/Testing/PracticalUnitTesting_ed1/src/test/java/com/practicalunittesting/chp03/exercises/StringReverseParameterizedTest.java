package com.practicalunittesting.chp03.exercises;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class StringReverseParameterizedTest {
	
	private static final Object[] getReversed() {
		return $(
			$("Christy"),
			$("Cecil"),
			$("Elizabeth")
		);
	}

	
	@Test
	@Parameters(method = "getReversed")
	public void reversedMatch(String s) {
		String[] reversed = { "ytsirhC", "liceC", "htebazilE" };
		
		switch(s) {
			case "Christy":
				assertEquals(StringReverseApp.reverse(s), reversed[0]);
				break;
			case "Cecil":
				assertEquals(StringReverseApp.reverse(s), reversed[1]);
				break;
			case "Elizabety":
				assertEquals(StringReverseApp.reverse(s), reversed[2]);
				break;
		}
		
	}
}
