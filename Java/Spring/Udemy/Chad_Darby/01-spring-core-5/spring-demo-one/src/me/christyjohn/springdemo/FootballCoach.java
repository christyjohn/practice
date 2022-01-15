package me.christyjohn.springdemo;

public class FootballCoach implements Coach {

	// define a private field for dependency
	private FortuneService fortuneService;
	
	public FootballCoach() {
		
	}

	// define a constructor for dependency injection
	public FootballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Take 30 penalties and 25 freekicks";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return fortuneService.getFortune();
	}

}
