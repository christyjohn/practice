package me.christyjohn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve a bean from the spring container
		Coach theCoach = context.getBean("myBaseballCoach", Coach.class);
		Coach theFootballCoach = context.getBean("myFootballCoach", Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theFootballCoach.getDailyWorkout());
		
		// let's call or new method for fortunes
		System.out.println("Hey Baseball Coach: " + theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
