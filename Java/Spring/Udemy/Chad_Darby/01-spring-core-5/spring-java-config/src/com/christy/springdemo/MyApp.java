package com.christy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
				
		// retrieve bean from spring container
		Coach tennisCoach = context.getBean("tennisCoach", Coach.class);
		
		// call a method on the bean
		System.out.println(tennisCoach.getDailyWorkout());
		System.out.println(tennisCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
	
}
