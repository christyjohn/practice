package ch08.inheritance;

public class Triangle extends Figure {
	Triangle(double a, double b) {
		super(a, b);
	}
	
	double area() {
		System.out.println("Inside area of a triangle.");
		return dim1 * dim2 / 2;
	}
}
