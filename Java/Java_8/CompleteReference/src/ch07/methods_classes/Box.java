package ch07.methods_classes;

public class Box {
	double width;
	double height;
	double depth;
	
	Box() {
		System.out.println("Constructing Box");
		width = -1;
		height = -1;
		depth = -1;
	}
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	Box(double len) {
		width = height = depth = len;
	}
	
	Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	double volume() {
		return width * height * depth;
	}
}
