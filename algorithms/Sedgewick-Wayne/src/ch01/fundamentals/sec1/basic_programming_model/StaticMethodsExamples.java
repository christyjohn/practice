package ch01.fundamentals.sec1.basic_programming_model;

public class StaticMethodsExamples {

	public static void main(String[] args) {
		System.out.println(abs(-87)); 
		System.out.println(abs(-87.65)); 
		System.out.println(isPrime(17107)); 
		System.out.println(isPrime(17108));  
		System.out.println(sqrt(17108));  
		System.out.println(hypotenuse(23, 45)); 
		System.out.println(harmonicNumber(24));
	}
	
	// absolute value of an int value
	public static int abs(int x) {
		if (x < 0)
			return -x;
		else
			return -x;
	}
	
	// absolute value of a double value
	public static double abs(double x) {
		if ( x < 0)
			return -x;
		else
			return x;
	}
	
	// primality test
	public static boolean isPrime(int n) {
		if (n < 2)
			return false;
		for (int i = 2; i * i <= n; i++)
			if (n % i == 0)
				return false;
		return true;
	}
	
	// square root Newton's method)
	public static double sqrt(double c)	{
		if (c < 0)
			return Double.NaN;
		double err = 1e-15;
		double t = c;
		while (Math.abs(t - c/t) > err * t)
			t = (c/t + t) / 2.0;
		return t;
	}
	
	// hypotenuse of a right triangle
	public static double hypotenuse(double a, double b) {
		return Math.sqrt(a*a + b*b);
	}
	
	
	// harmonic number
	public static double harmonicNumber(int n) {
		double sum = 0.0;
		for (int i = 1; i <= n; i++)
			sum += 1.0/i;
		return sum;
	}
}
