package com.christy.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		Coach theCoach = new BaseBallCoach();
		System.out.println(theCoach.getDailyWorkout());
		
		theCoach = new TrackCoach();
		System.out.println(theCoach.getDailyWorkout());
		
	}

}
