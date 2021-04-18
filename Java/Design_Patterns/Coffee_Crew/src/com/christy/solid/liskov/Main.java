package com.christy.solid.liskov;

public class Main {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(10, 20);
		System.out.println(rectangle.computeArea());
		
		Square square = new Square(10);
		System.out.println(square.computeArea());
		
		useRectangle(rectangle);
		
		useSquare(square);

	}

	private static void useSquare(Square square) {
		square.setSide(20);
		assert square.computeArea() == 400 : "Area not equal to 400";
	}

	private static void useRectangle(Rectangle rectangle) {
		rectangle.setHeight(20);
		rectangle.setWidth(30);
		assert rectangle.getHeight() == 20 : "Height Not equal to 20";
		assert rectangle.getWidth() == 30 : "Width Not equal to 30";
		assert rectangle.computeArea() == 600 : "Area not equal to 600";
	}
}
