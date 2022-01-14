package me.christyjohn.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Take 30 penalties and 25 freekicks";
	}

}
