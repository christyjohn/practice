package com.practicalunittesting.chp03.exercises;

import static junitparams.JUnitParamsRunner.$;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

@RunWith(JUnitParamsRunner.class)
public class StringReverseAppTest {

	private StringUtils stringUtils;
	
	@Before
	public void setUp() {
		stringUtils = new StringUtils();
	}
	
	private static final Object[] feedString() {
		return $(
				$("ytsirhC","Christy"),
				$("",""),
				$("c","c"),
				$("321",123+"")
			);
	}
	
	private static final Object[] getNullString() {
		return new String[]{ null };
	}
	
	@Test
	@Parameters(method = "feedString")
	public void testReverseString(String reversedString, String originalString) {
		assertEquals(reversedString, stringUtils.reverse(originalString));
	}
	
	@Test(expected = NullPointerException.class)
	@Parameters(method = "getNullString")
	public void testReverseStringShouldThrowNPEForNullString(String str) {
		stringUtils.reverse(str);
	}
}
