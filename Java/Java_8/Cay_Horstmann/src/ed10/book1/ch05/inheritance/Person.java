package ed10.book1.ch05.inheritance;

public abstract class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public abstract String getDescription();
	
	public String getName() {
		return name;
	}
}
