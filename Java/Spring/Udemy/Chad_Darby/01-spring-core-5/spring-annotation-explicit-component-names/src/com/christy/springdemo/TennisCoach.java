package com.christy.springdemo;

import org.springframework.stereotype.Component;

@Component("myTennisCoach")
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

}
