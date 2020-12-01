package com.christy.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		FortuneService fortune = new HappyFortuneSevice();
		
		Coach theCoach = new BaseBallCoach(fortune);
		System.out.println(theCoach.getDailyWorkout());
		
		theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
