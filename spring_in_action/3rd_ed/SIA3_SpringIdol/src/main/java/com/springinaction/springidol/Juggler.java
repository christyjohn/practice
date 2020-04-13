package com.springinaction.springidol;

public class Juggler implements Performer {
	private int beanBags = 3;
	
	public Juggler() {
	}
	
	public Juggler(int beanBags)
	{
		this.beanBags = beanBags;
	}
	
	public void perform() throws PerformanceException {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
	}
	
	public String performForTest() throws PerformanceException {
		System.out.println("JUGGLING " + beanBags + " BEANBAGS");
		return "JUGGLING " + beanBags + " BEANBAGS";
	}
}
