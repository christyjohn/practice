package com.christy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		boolean result = (tennisCoach == alphaCoach);
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for tennisCoach: " + tennisCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// close the context
		context.close();
	}
	
}
