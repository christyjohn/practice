package me.christyjohn.maven.calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorImpTest {
	
	private int num1;
	private int num2;
	private int result;
	
	public CalculatorImpTest(int num1, int num2, int result) {
		this.num1 = num1;
		this.num2 = num2;
		this.result = result;
	}

	@Test
	public void addShouldReturnAResult() {
		Calculator c = new CalculatorImp();
		int result = c.add(10, 20);
		assertEquals(30, result);
	}

}
