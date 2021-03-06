package ch15.lambda_expressions;

//This class defines a static method called strReverse().
class MyStringOps {
	// A static method that reverses a string.
	static String strReverse(String str) {
		String result = "";
		
		for (int i = str.length()-1; i >= 0; i--)
			result += str.charAt(i);
		
		return result;
	}
}

public class MethodRefDemo {
	static String stringOp(StringFunc sf, String s) {
		return sf.func(s);
	}
	
	public static void main(String[] args) {
		String inStr = "Lambdas add power to Java";
		String outStr;
		
		// Here, a method reference to strReverse is passed to stringOp().
		outStr = stringOp(MyStringOps::strReverse, inStr);
		
		System.out.println("Original string: " + inStr);
		System.out.println("String reversed: " + outStr);
	}
}
