package me.christyjohn.maven.calculator;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculatorImpTest {
	
	private int num1;
	private int num2;
	private int expectedResult;
	
	public CalculatorImpTest(int num1, int num2, int result) {
		this.num1 = num1;
		this.num2 = num2;
		this.expectedResult = result;
	}
	
	// parameterized tests
	@Parameters
	public static Collection<Integer[]> data() {
		return Arrays.asList(new Integer[][] { {-1, 2, 1}, {1, 2, 3}, {6, 7, 13} });
	}
	
	@Test
	public void addShouldReturnAResult_Parameterized() {
		Calculator c = new CalculatorImp();
		int result = c.add(num1, num2);
		assertEquals(expectedResult, result);
	}

	@Test
	public void addShouldReturnAResult() {
		Calculator c = new CalculatorImp();
		int result = c.add(10, 20);
		assertEquals(30, result);
	}

}
