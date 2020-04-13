package com.springinaction.springidol;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IdolTest {
	@Test
	public void dukeShouldJuggle() throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol.xml");
		Juggler duke = (Juggler) ctx.getBean("duke");
		assertEquals("JUGGLING 15 BEANBAGS", duke.performForTest());
	}
	
	
}
