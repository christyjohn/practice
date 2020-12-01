package com.christy.springdemo;

public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Bowl 5 overs";
	}

	@Override
	public String getDailyFortune() {
		return "You will get Man of the Match today";
	}

}
