package ed10.book1.ch05.inheritance;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

public class Employee extends Person {
	// static field
	private static int nextId = 1;

	// instance fields
	private int id;
	private double salary;
	private LocalDate hireDay;

	// static initialization block
	static {
		Random generator = new Random();
		// set nextId to a random number between 0 and 9999
		nextId = generator.nextInt(10000);
	}

	// object initialization block
	{
		id = nextId;
		nextId++;
	}

	// constructor
	public Employee(String name, double s) {
		super(name);
		salary = s;
	}

	public Employee(double s) {
		// calls the Employee(String, double) constructor
		this("Employee #" + nextId, s);
	}

	public Employee(String name, double s, int year, int month, int day) {
		super(name);
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}
	
	public double getSalary() {
		return salary;
	}

	public LocalDate getHireDay() {
		return hireDay;
	}

	public static int getNextId() {
		return nextId;
	}

	public void setId() {
		id = nextId;
		nextId++;
	}

	public int getId() {
		return id;
	}

	public void raiseSalary(double byPercent) {
		double raise = salary * byPercent / 100;
		salary += raise;
	}

	public String getDescription() {
		return String.format("an employee with a salary of $%.2f", salary);
	}
	
	public boolean equals(Object otherObject) {
		// a quick test to see if the objects are identical
		if (this == otherObject)
			return true;
		
		// must return false if the explicit parameter is null
		if (otherObject == null)
			return false;
		
		// if the classes don't match, they can't be equal
		if (getClass() != otherObject.getClass())
			return false;
		
		// now we know otherObject is a non-null Employee
		Employee other = (Employee) otherObject;
		
		// test whether the fields have identical values
		return Objects.equals(getName(), other.getName())
				&& salary == other.salary
				&& Objects.equals(hireDay, other.hireDay);
	}
	
	public int hashCode() {
		return Objects.hash(getName(), salary, hireDay);
	}
	
	public String toString() {
		return getClass().getName() + "[name=" + getName() + ", salary=" +
				salary + ", hireDay=" + hireDay + "]";
	}
}
