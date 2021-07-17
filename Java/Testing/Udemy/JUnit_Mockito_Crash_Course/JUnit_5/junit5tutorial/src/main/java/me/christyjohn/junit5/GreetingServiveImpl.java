package me.christyjohn.junit5;

public class GreetingServiveImpl implements Greeting {

	@Override
	public String greet(String name) {
		if (name == null || name.length() == 0) {
			throw new IllegalArgumentException();
		}
		return "Hello " + name;
	}

}
