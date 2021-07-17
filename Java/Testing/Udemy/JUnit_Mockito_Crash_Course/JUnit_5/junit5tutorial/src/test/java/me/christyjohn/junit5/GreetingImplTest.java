package me.christyjohn.junit5;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GreetingImplTest {
	
	@Mock
	private GreetingService service;

	@InjectMocks
	private GreetingImpl greeting;

	@Test
	public void greetShouldReturnAValidOutput() {
		System.out.println("greetShouldReturnAValidOutput");
		String result = greeting.greet("Junit");
		Assertions.assertNotNull(result);
		Assertions.assertEquals("Hello Junit", result);
	}

	@Test
	public void greetShouldThrowAnException_For_nameIsNull() {
		System.out.println("greetShouldThrowAnException_For_nameIsNull");

		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greeting.greet(null);
		});
	}

	@Test
	public void greetShouldThrowAnException_For_nameIsBlank() {
		System.out.println("greetShouldThrowAnException_For_nameIsBlank");
		
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			greeting.greet("");
		});
	}
}
