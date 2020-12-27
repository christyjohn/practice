package com.christy.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
				
		// retrieve bean from spring container
		SwimCoach swimCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call a method on the bean
		System.out.println(swimCoach.getDailyWorkout());
		System.out.println(swimCoach.getDailyFortune());
		
		// call our new swim coach methods ... has the props values injected
		System.out.println("email: " + swimCoach.getEmail());
		System.out.println("team: " + swimCoach.getTeam());
		
		// close the context
		context.close();
	}
	
}
