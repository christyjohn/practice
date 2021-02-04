package book1.ch06.classes_objects;

import static java.lang.Math.*;
import static java.lang.System.out;

public class StaticImportTest2 {
	public static void main(String[] args) {
		double radius = 2.9;
		double area = PI * radius * radius;
		
		out.println("Vale of PI is: " + PI);
		out.println("Radius of circle: " + radius);
		out.println("Area of circle: " + area);
		out.println("Square root of 2.0: " + sqrt(2.0));
	}
}
