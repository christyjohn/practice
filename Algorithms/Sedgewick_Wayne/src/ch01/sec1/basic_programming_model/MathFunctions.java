package ch01.sec1.basic_programming_model;

public class MathFunctions {
	public static void main(String[] args) {
		System.out.println("Absolute alue of -3: " + abs(-3));
		System.out.println("Absolute alue of -3.5: " + abs(-3.5));
		System.out.println("Is 347 a prime: " + isPrime(347));
		System.out.println("Square root of 5: " + sqrt(5));
		System.out.println("Hypotenuse (4, 5): " + hypotenuse(4, 5));
		System.out.println("9th harmonic number is: " + harmonic(9));
	}
	
	public static int abs(int x) {
		if( x < 0)
			return -x;
		else
			return x;
	}
	
	public static double abs(double x) {
		if (x < 0)
			return -x;
		else
			return x;
	}
	
	public static boolean isPrime(int n) {
		if(n < 2 )
			return false;
		for (int i = 2; i * i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	// Square Root - Newton's method
	public static double sqrt(double c) {
		if (c < 0)
			return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t - c/t) > err * t)
			t = (c/t + t) / 2.0;
		return t;
	}
	
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a*a + b*b);
	}
	
	// harmonic number
	public static double harmonic(int n) {
		double sum = 0.9;
		for (int i = 1; i <= n; i++)
			sum += 1.0 / i;
		
		return sum;
	}
}
