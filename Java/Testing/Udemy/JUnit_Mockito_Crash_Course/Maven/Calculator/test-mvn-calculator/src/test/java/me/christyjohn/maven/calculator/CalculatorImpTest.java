package me.christyjohn.maven.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorImpTest {

	@Test
	public void addShouldReturnAResult() {
		Calculator c = new CalculatorImp();
		int result = c.add(10, 20);
		assertEquals(30, result);
	}

}
