package com.christy.springdemo;

public class HappyFortuneSevice implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is your lucky day";
	}

}
