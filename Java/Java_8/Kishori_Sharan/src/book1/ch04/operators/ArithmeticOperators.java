package book1.ch04.operators;

public class ArithmeticOperators {
	public static void main(String[] args) {
		
		/*
		 * 	• If one of the operands is the data type double, the other operand 
		 * is converted to the double data type and the whole expression is of 
		 * type double. Otherwise,
		 * 
		 *	• If one of the operands is the data type float, the other operand 
		 * is converted to the float data type and the whole expression is of 
		 * type float. Otherwise,
		 * 
		 *	• If one of the operands is the data type long, the other operand is
		 * converted to the long data type and the whole expression is of type 
		 * long. Otherwise,
		 * 
		 *	• If none of the above three rules applies, all operands are 
		 * converted to int, provided they are not already of type int, and the 
		 * whole expression is of type int.
		 * 
		 */
		
		byte b1 = 2;
		byte b2 = 3;
		short s1 = 100;
		int i = 10;
		int j = 12;
		float f1 = 2.5F;
		double d1 = 20.0;
		
		
		// ---- addition ----
		
		b1 = 15 + 110; // Ok. 125 is in the range -128 and 127
		
		// An error. i is promoted to int and i + 5 is of the data type int.
		// int to byte assignment is not permitted
		// b1 = i + 5;
		b1 = (byte)(i + 5); // OK
		
		// An error. s1 is promoted to int and s1 + 2 is of the data type int.
		// int to byte assignment is not permitted
		// b1 = s1 + 2;
		
		// An error. b2 is promoted to float and f1 + b2 is of the data type float.
		// float to byte assignment is not permitted
		// b1 = f1 + b2;
		
		// An error. f1 is promoted to double and f1 + d1 is of the data type double
		// b1 = f1 + d1;
		
		// Ok. i is promoted to float and i + f1 is of the data type float
		f1 = i + f1;
		
		// An error. i is promoted to double and i + d1 is of data type double.
		// double to float assignment is not permitted
		// f1 = i + d1;
		f1 = (float)(i + d1); // OK
		
		// An error. 2.0 and 3.2 are of the type double. The result of 2.0 + 3.2 is 5.2,
		// which is also of the type double. double to float assignment is not permitted.
		// f1 = 2.0 + 3.2;
		
		// Ok. 2.0F and 3.2F are of the type float. The result of 2.0F + 3.2F,
		// which is 5.2F, is of the type float.
		f1 = 2.0F + 3.2F;
		
		// Ok. j is promoted to float and f1 + j is of the data type float.
		// float to double assignment is permitted.
		d1 = f1 + j;
		
		/*
		 * All rules that are discussed above about the numeric data conversion 
		 * of the operands and the determination of the data type
		 * of the expression involving the addition operator are also applicable
		 *  for an expression involving subtraction, multiplication, and
		 * division operators.
		 */
		
		// ---- subtraction ----
		
		// Ok. 200 - 173 will be replaced by 27.
		// b1 = 27 is ok, because 27 is in the range -128 and 127
		b1 = 200 - 173;
		
		// An error. i - 27 is of the type int. int to byte assignment is not allowed
		// b1 = i - 27;
		b1 = (byte)(i -27); // OK
		
		// ---- multiplication ----
		
		// Ok. 20 * 6 will be replaced by 120
		// b2 = 120 is ok, because 120 is in the range -128 and 127
		b2 = 20 * 6;
		
		// An error. i2 * 12 is of the type int. int to byte assignment is not allowed.
		// b2 = i * 12;
		b2 = (byte)(i * 12); // OK
		
		// Ok. i2 * b2 is of the type int and int to float assignment is allowed
		f1 = i * b2;
		
		// Error. d2 * i2 is of type double and double to float assignment is not allowed
		// f1 = d1 * i;
		f1 = (float)(d1 * i); // Ok
		
		// ---- division ----
		
		// ---- integer division ----
		/*
		 * If both the operands of the division operator are integers, that is, 
		 * byte, short, char, int, or long, the usual division operation is 
		 * carried out and the result is truncated towards zero to represent an 
		 * integer.
		 */
		int num;
		num = 5/2; // Assigns 2 to num
		num = 5/3; // Assigns 1 to num
		num = 5/4; // Assigns 1 to num
		num = 5/5; // Assigns 1 to num
		num = 5/6; // Assigns 0 to num
		num = 5/7; // Assigns 0 to num
		
		/*
		 * If either or both of the operands of the division operator are float 
		 * or double type, floating-point division is performed and the result 
		 * is not truncated.
		 */
		// 15.0F and 4.0F are of float type. So, the expression 15.0F/4.0F is of the type float.
		// The result 3.75F is assigned to f1.
		f1 = 15.0F/4.0F;
		
		// 15 is of type int and 4.0F is of type float. The expression 15/4.0F is of type float.
		// The result 3.75F is assigned to f1.
		f1 = 15/4.0F;
		
		// An error. 15.0 is of the type double and 4.0F is of the type float.
		// The expression 15.0/4.0F is of type double. The result 3.75 is of the
		// type double and cannot be assigned to f1.
		// f1 = 15.0/4.0F;
		f1 = (float)(15.0/4.0F); // Ok. 3.75F is assigned to f1
		
		// 15 and 4 are of the type int. The expression 15/4 is of type int.
		// An integer division is performed. The result 3 is assigned to f1,
		// because int to float assignment is allowed
		f1 = 15/4;
		
		f1 = 5.0F/0.0F; // Float.POSITIVE_INFINITY is assigned to f1
		f1 = -5.0F/0.0F; // Float.NEGATIVE_INFINITY is assigned to f1
		f1 = -5.0F/-0.0F; // Float.POSITIVE_INFINITY is assigned to f1
		f1 = 5.0F/-0.0F; // Float.NEGATIVE_INFINITY is assigned to f1
		d1 = 5.0/0.0; // Double.POSITIVE_INFINITY is assigned to d1
		d1 = -5.0/0.0; // Double.NEGATIVE_INFINITY is assigned to d1
		d1 = -5.0/-0.0; // Double.POSITIVE_INFINITY is assigned to d1
		d1 = 5.0/-0.0; // Double.NEGATIVE_INFINITY is assigned to d1
		
		// 5.0F is of the type float and 0 is of the type int. 5.0F/0 is of type float.
		// Float.POSITIVE_INFINITY is assigned to f1
		f1 = 5.0F/0;
		
		// A compile-time error. 5.0F is of the type float and 0.0 is of the type double
		// 5.0F/0.0 is of the type double. double to float assignment is not allowed.
		// f1 = 5.0F/0.0;
		f1 = (float)(5.0F/0.0); // f1 is assigned Float.POSITIVE_INFINITY
		
		f1 = 0.0F/0.0F; // Assigns Float.NaN to f1
		d1 = 0.0/0.0; // Assigns Double.NaN to d1
		d1 = -0.0/0.0; // Assigns Double.NaN to d1
	}
}

