package com.christy.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {
	
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
				
		// retrieve bean from spring container
		Coach trackCoach = context.getBean("trackCoach", Coach.class);
		
		System.out.println(trackCoach.getDailyWorkout());
		
		// close the context
		context.close();
	}
	
}
