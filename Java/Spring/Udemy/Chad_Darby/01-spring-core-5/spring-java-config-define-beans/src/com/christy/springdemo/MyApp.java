package com.christy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
				
		// retrieve bean from spring container
		Coach swimCoach = context.getBean("swimCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
	
}
