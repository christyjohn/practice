package ed10.book1.ch04.objects_and_classes;

import java.time.LocalDate;
import java.util.Random;

public class Employee {
	// static field
	private static int nextId = 1;

	// instance fields
	private int id;
	private String name;
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
	public Employee(String n, double s) {
		name = n;
		salary = s;
	}

	public Employee(double s) {
		// calls the Employee(String, double) constructor
		this("Employee #" + nextId, s);
	}

	// the default constructor
	public Employee() {
		// name initialized to ""--see above
		// salary not explicitly set--initialized to 0
		// id initialized in initialization block
	}

	public Employee(String n, double s, int year, int month, int day) {
		name = n;
		salary = s;
		hireDay = LocalDate.of(year, month, day);
	}

	public String getName() {
		return name;
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
}
