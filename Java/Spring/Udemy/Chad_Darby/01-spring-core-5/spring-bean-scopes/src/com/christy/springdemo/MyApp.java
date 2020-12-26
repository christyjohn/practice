package com.christy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		Coach alphaCoach = context.getBean("trackCoach", Coach.class);
		
		// check if they are same
		boolean result = (trackCoach == alphaCoach);
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for trackCoach: " + trackCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// call methods on the bean
//		System.out.println(trackCoach.getDailyWorkout());
//		System.out.println("CricketCoach : "  + trackCoach.getDailyFortune());
				
		// close the context
		context.close();
	}
	
}
