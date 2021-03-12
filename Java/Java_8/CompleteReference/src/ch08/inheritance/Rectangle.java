package ch08.inheritance;

public class Rectangle extends Figure {
	Rectangle() { }
	
	Rectangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		System.out.println("Inside Area for a rectangle.");
		return dim1 * dim2;
	}
}
