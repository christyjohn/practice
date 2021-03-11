package ch06.intro_classes;

public class Box {
	double width;
	double height;
	double depth;
	
	Box() {
		System.out.println("Constructing Box");
		width = 10;
		height = 10;
		depth = 10;
	}
	
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
	
	void printVolume() {
		System.out.print("Volume is ");
		System.out.println(width * height * depth);
	}
	
	double volume() {
		return width * height * depth;
	}
	
	// sets dimensions of box
	void setDim(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
	}
}
