package me.christyjohn.springdemo;

public class TrackCoach implements Coach {

	// define a private field for dependency
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	// define a constructor for dependency injection
	public TrackCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// use my fortuneService to get a fortune
		return "Just do it!" + fortuneService.getFortune();
	}

}
