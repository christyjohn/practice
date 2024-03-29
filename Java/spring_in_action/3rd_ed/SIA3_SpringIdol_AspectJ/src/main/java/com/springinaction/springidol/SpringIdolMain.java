package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx;
		/*
		ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol.xml");
		
		ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol2.xml");
		*/
		ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol-around.xml");
		
		Performer performer = (Performer)ctx.getBean("eddie");
		performer.perform();
	}

}
