package ch01.fundamentals.sec1.basic_programming_model;

import java.util.Arrays;

import edu.princeton.cs.algs4.StdDraw;
import edu.princeton.cs.algs4.StdRandom;

public class StdDrawExamples {

	public static void main(String[] args) {
		//drawFunctionValues();
		//drawArayOfRandomValues();
		drawSortedArrayOfRandomValues();
	}
	
	// draw function values
	public static void drawFunctionValues()
	{
		int n = 100;
		StdDraw.setScale(0, n);
		StdDraw.setYscale(0, n*n);
		StdDraw.setPenRadius(.01);
		for (int i = 1; i <= n; i++) {
			StdDraw.point(i,  i);
			StdDraw.point(i,  i*i);
			StdDraw.point(i,  i * Math.log(i));
		}
	}
	
	// array of random values
	public static void drawArayOfRandomValues() {
		int n = 50;
		double[] a = new double[n];
		for (int i = 0; i < n; i++)
			a[i] = StdRandom.random();
		for (int i = 0; i < n; i++) {
			double x = 1.0 * i / n;
			double y = a[i] / 2.0;
			double rw = 0.5 / n;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x,  y,  rw,  rh);
		}
	}
	
	// sorted array of random values
	public static void drawSortedArrayOfRandomValues() {
		int n = 50;
		double[] a = new double[n];
		for (int i = 0; i < n; i++)
			a[i] = StdRandom.random();
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			double x = 1.0 * i / n;
			double y = a[i] / 2.0;
			double rw = 0.5 / n;
			double rh = a[i] / 2.0;
			StdDraw.filledRectangle(x,  y,  rw,  rh);
		}
	}
}
