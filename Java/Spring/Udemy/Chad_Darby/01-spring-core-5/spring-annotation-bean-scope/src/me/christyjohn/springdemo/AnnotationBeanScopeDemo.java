package me.christyjohn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemo {

	public static void main(String[] args) {
		
		// load spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach", Coach.class);
		boolean result = (theCoach == alphaCoach);
		
		// print out the results
		System.out.println("\nPointing to the same object (theCoach and alphaCoach) : " 
					+ result); // true
		
		// both same
		System.out.println("\nMemory location for theCoach: " + theCoach); 
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach);
		
		// retrieve bean from spring container

		Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		Coach alphaCricketCoach = context.getBean("cricketCoach", Coach.class);		

		boolean result2 = (theCricketCoach == alphaCricketCoach);
		
		// check if they are the same
		System.out.println("\nPointing to the same object (theCricketCoach and alphaCricketCoach) : " 
					+ result2); // false
		// both different
		System.out.println("\nMemory location for theCricketCoach: " 
					+ theCricketCoach); 
		System.out.println("\nMemory location for alphaCricketCoach: " 
					+ alphaCricketCoach);
		
		// close the context
		context.close();
	}
}
