package ch15.lambda_expressions;

class MyStringOps2 {
	String strReverse(String str) {
		String result = "";
		int i;
		for(i = str.length()-1; i >= 0; i--)
			result += str.charAt(i);
		return result;
	}
}

public class MethodRefDemo2 {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		// Create a MyStringOps object.
		MyStringOps2 strOps = new MyStringOps2( );
		
		// Now, a method reference to the instance method strReverse
		// is passed to stringOp().
		outStr = stringOp(strOps::strReverse, inStr);
		
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
	}
}
