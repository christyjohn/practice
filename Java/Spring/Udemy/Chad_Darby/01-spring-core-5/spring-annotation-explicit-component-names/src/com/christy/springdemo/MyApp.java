package com.christy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach tennisCoach = context.getBean("myTennisCoach", Coach.class);
		
		System.out.println(tennisCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
	
}
