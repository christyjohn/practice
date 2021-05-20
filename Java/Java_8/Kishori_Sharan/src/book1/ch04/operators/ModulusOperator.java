package book1.ch04.operators;

public class ModulusOperator {
	public static void main(String[] args) {
		
		/*
		 * If both operands of the modulus operator are integers, the following 
		 * rules are applied to compute the result.
		 * 
		 *  - It is a runtime error if the right-hand operand is zero.
		 *  - If the right-hand operand is not zero, the sign of the result is 
		 *    the same as the sign of the left-hand operand.
		 */
		
		int num;
		num = 15 % 0; // A runtime error
		// Exception in thread "main" java.lang.ArithmeticException: / by zero
		
		num = 15 % 6; // Assigns 3 to num
		num = -15 % 6; // Assigns -3 to num
		num = 15 % -6; // Assigns 3 to num
		num = -15 % -6; // Assigns -3 to num because left-hand operand is -15, which is negative
		num = 5 % 7; // Assigns 5 to num
		num = 0 % 7; // Assigns 0 to num
		
		
		/*
		 * If either operand of the modulus operator is a floating-point number,
		 *  the following rules are applied to compute the result.
		 *  
		 *  - The operation never results in an error even if the right-hand 
		 *    operand is a floating-point zero.
		 *  - The result is NaN if either operand is NaN.
		 */
		float f1;
		double d1;
		f1 = Float.NaN % 10.5F; // Assigns Float.NaN to f1
		f1 = 20.0F % Float.NaN; // Assigns Float.NaN to f1
		f1 = Float.NaN % Float.NaN; // Assigns Float.NaN to f1
		
		// A compile-time error. The expression is of the type double.
		// double to float assignment is not allowed
		//f1 = Float.NaN % Double.NaN;
		d1 = Float.NaN % Double.NaN; // Assigns Double.NaN to d1
		
		/* If the right-hand operand is zero, the result is NaN. */
		f1 = 15.0F % 0.0F; // Assigns Float.NaN to f1
		
		/* If the left-hand operand is infinity, the result is NaN. */
		f1 = Float.POSITIVE_INFINITY % 2.1F; // Assigns Float.NaN to f1
		
		/*
		 * If none of the above rules apply, the modulus operator returns the 
		 * remainder of the division of the left-hand operand and the right-hand
		 *  operand. The sign of the result is the same as the sign of the 
		 *  left-hand operand.
		 */
		f1 = 15.5F % 6.5F; // Assigns 2.5F to f1
		d1 = 5.5 % 15.65; // Assigns 5.5 to d1
		d1 = 0.0 % 3.78; // Assigns 0.0 to d1
		d1 = 85.0 % Double.POSITIVE_INFINITY; // Assigns 85.0 to d1
		d1 = -85.0 % Double.POSITIVE_INFINITY; // Assigns -85.0 to d1
		d1 = 85.0 % Double.NEGATIVE_INFINITY; // Assigns 85.0 to d1
		d1 = -85.0 % Double.NEGATIVE_INFINITY; // Assigns -85.0 to d1
	}
}
