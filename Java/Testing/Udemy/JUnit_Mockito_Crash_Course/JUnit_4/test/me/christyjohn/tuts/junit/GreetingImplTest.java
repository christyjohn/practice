package me.christyjohn.tuts.junit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {
	
	private Greeting greeting;

	@Before
	public void setup() {
		System.out.println("Setup");
		greeting = new GreetingImpl();	
	}

	@Test
	public void greetShouldReturnAValidOutput() {
		System.out.println("greetShouldReturnAValidOutput");
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_nameIsNull() {
		System.out.println("greetShouldThrowAnException_For_nameIsNull");
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_nameIsBlank() {
		System.out.println("greetShouldThrowAnException_For_nameIsBlank");
		greeting.greet("");
	}
	
	@After
	public void teardown() {
		System.out.println("teardown");
		greeting = null;
	}
}
