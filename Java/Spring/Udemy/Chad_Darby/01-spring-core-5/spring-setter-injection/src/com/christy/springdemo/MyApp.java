package com.christy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		Coach cricketCoach = context.getBean("cricketCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println("CricketCoach : "  + cricketCoach.getDailyFortune());
		
		// close the context
		context.close();
	}
	
}
