package me.christyjohn.tuts.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingImplTest {
	
	@Test
	public void greetShouldReturnAValidOutput() {
		Greeting greeting = new GreetingImpl();
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_nameIsNull() {
		Greeting greeting = new GreetingImpl();
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greetShouldThrowAnException_For_nameIsBlank() {
		Greeting greeting = new GreetingImpl();
		greeting.greet("");
	}
}
