package me.christyjohn.junit5;

public class GreetingServiceImpl implements Greeting {

	@Override
	public String greet(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}

}
