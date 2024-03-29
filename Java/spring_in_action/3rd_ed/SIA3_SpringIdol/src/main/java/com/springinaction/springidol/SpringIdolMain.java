package com.springinaction.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringIdolMain {

	public static void main(String[] args) throws PerformanceException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/springinaction/springidol/spring-idol.xml");
		Performer performer;
		
		/* 
		 performer = (Juggler) ctx.getBean("duke");
		 performer.perform();
		
		performer = (PoeticJuggler) ctx.getBean("poeticDuke");
		performer.perform();
		
		
		performer = (Performer)ctx.getBean("kenny");
		performer.perform();
		*/
		performer = (Performer)ctx.getBean("hank");
		performer.perform();
	}

}
