package ch15.lambda_expressions;

interface NumericTest {
	boolean test(int n);
}

public class LambdaDemo2 {
	public static void main(String[] args) {
		// A lambda expression that tests if a number is even.
		NumericTest isEven = n -> (n % 2) == 0;
		
		if (isEven.test(10))
			System.out.println("10 is even");
		if (!isEven.test(23))
			System.out.println("23 is odd");
		
		// Now, use a lambda expression that tests if a number is non-negative.
		NumericTest isNonNeg = (n) -> n >= 0;
		
		if (isNonNeg.test(6))
			System.out.println("6 is non negative");
		if (!isNonNeg.test(-7))
			System.out.println("-7 is negative");
	}
}
