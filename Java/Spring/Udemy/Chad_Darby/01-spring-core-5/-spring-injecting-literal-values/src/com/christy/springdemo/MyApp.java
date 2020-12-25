package com.christy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		CricketCoach cricketCoach = context.getBean("cricketCoach", CricketCoach.class);
		
		// call methods on the bean
		System.out.println(cricketCoach.getDailyWorkout());
		System.out.println("CricketCoach : "  + cricketCoach.getDailyFortune());
		
		System.out.println(cricketCoach.getEmailAddress());
		System.out.println(cricketCoach.getTeam());
		
		// close the context
		context.close();
	}
	
}
