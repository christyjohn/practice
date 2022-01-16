package me.christyjohn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// retrieve bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		// check if they are the same
		boolean result = (theCoach == alphaCoach);

		// print out the results
		System.out.println("\nPointing to the same object: " + result);

		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");

		// retrieve bean from spring container
		Coach theCricketCoach = context.getBean("myCricketCoach", Coach.class);
		Coach alphaCricketCoach = context.getBean("myCricketCoach", Coach.class);

		// check if they are the same
		boolean result2 = (theCricketCoach == alphaCricketCoach);

		// print out the results
		System.out.println("\nPointing to the same object: " + result2);

		System.out.println("\nMemory location for theCricketCoach: " 
					+ theCricketCoach);
		System.out.println("\nMemory location for alphaCricketCoach: " 
					+ alphaCricketCoach + "\n");

		// close the context
		context.close();
	}
}
