package book1.ch03.data_types;

public class DataTypesExampe {
	public static void main(String[] args) {
		// Integer data types
		System.out.println("int data type");
		System.out.println("<------------------>");
		int num1 = 21;
		int num2 = 021;
		int num3 = 0x123;
		int num4 = 0xdecafe;
		int num5 = 0x1A2B;
		int num6 = 0X0123;
		int num7 = 0b10101;
		int num8 = 0b00011;
		int num9 = 0b10;
		int num10 = 0b00000010;
		int maxInt = Integer.MAX_VALUE;
		int minInt = Integer.MIN_VALUE;
		System.out.println("21 = " + num1);
		System.out.println("021 = " + num2);
		System.out.println("0x123 = " + num3);
		System.out.println("0xdecafe = " + num4);
		System.out.println("0x1A2B = " + num5);
		System.out.println("0X0123 = " + num6);
		System.out.println("0b10101 = " + num7);
		System.out.println("0b00011 = " + num8);
		System.out.println("0b10 = " + num9);
		System.out.println("0b00000010 = " + num10);
		System.out.println("Integer min value = " + minInt);
		System.out.println("Integer max value = " + maxInt);	
		System.out.println();

		System.out.println("long data type");
		System.out.println("<------------------>");
		long num11 = 25L; // Decimal format
		long num12 = 031L; // Octal format
		long num13 = 0X19L; // Hexadecimal format
		long num14 = 0b11001L; // Binary format
		int castIntToLong;
		//castIntToLong = num11; // Type mismatch: cannot convert from long to int
		castIntToLong = (int) num11;
		long maxLong = Long.MAX_VALUE;
		long minLong = Long.MIN_VALUE;
		System.out.println("25L = " + num11);
		System.out.println("031L = " + num12);
		System.out.println("0X19L = " + num13);
		System.out.println("0b11001L = " + num14);
		System.out.println("castIntToLong = " + castIntToLong);
		System.out.println("Integer min value = " + minLong);
		System.out.println("Integer max value = " + maxLong);
		System.out.println();	
		
		System.out.println("byte data type");
		System.out.println("<------------------>");
		byte b1 = 125;
		byte b2 = -11;
		// byte b3 = 150; // Type mismatch: cannot convert from int to byte
		// byte b3 = num1; // Type mismatch: cannot convert from int to byte
		byte b3 = (byte) num1;
		byte b4 = (byte) 19L;
		byte byteMax = Byte.MAX_VALUE;
		byte byteMin = Byte.MIN_VALUE;
		System.out.println("125 = " + b1);
		System.out.println("-11 = " + b2);
		System.out.println("(byte) num1 = " + (byte) num1);
		System.out.println("(byte) 19L = " + (byte) 19L);
		System.out.println("Byte min value = " + byteMin);
		System.out.println("Byte max value = " + byteMax);
		System.out.println();	
		
		System.out.println("short data type");
		System.out.println("<------------------>");
		short s1 = 12905;
		short s2 = -11890;
		// s1 = num1; // Type mismatch: cannot convert from int to short
		s1 = (short)num1;
		// s1 = 35000; // Type mismatch: cannot convert from int to short
		// s1 = num11; // Type mismatch: cannot convert from long to short
		s1 = (short) num11;
		// s1 = 555L; // Type mismatch: cannot convert from long to short
		s1 = (short)555L;
		short shortMax = Short.MAX_VALUE;
		short shortMin = Short.MIN_VALUE;
		System.out.println("Short min value = " + shortMin);
		System.out.println("Short max value = " + shortMax);
		System.out.println();	
		
		System.out.println("char data type");
		System.out.println("<------------------>");
		char c1 = 'A';
		char c2 = 'L';
		char c3 = '5';
		char c4 = '/';
		// String str1 = 'A'; // Type mismatch: cannot convert from char to String
		String str2 = "A";
		// c2 = "A"; // Type mismatch: cannot convert from String to char
		// c4 = 'AB'; // Invalid character constant
		c1 = '\u0041'; // Same as c1 = 'A'
		// c3 = '\400'; // Invalid character constant Octal 400 is out of range
		c4 = '\42';
		System.out.println(c4);
		
		System.out.println();
		
		// byte and char
		// b1 = c1; // An error - Type mismatch: cannot convert from char to byte
		b1 = (byte)c1; // Ok
		// c1 = b1; // An error - ype mismatch: cannot convert from byte to char
		c1 = (char)b1; // Ok
		
		// short and char
		// s1 = c1; // An error - Type mismatch: cannot convert from char to short
		s1 = (short)c1; // Ok
		//c1 = s1; // An error - Type mismatch: cannot convert from short to char
		c1 = (char)s1; // Ok
		
		// int and char
		num1 = c1; // Ok
		num1 = (int)c1; // Ok. But, cast is not required. Use num1 = c1
		// c1 = num1; // An error - ype mismatch: cannot convert from int to char
		c1 = (char)num1; // Ok
		c1 = 255; // Ok. 255 is in the range of 0-65535
		// c1 = 70000; // An error. 70000 is out of range 0-65535
		c1 = (char)70000; // Ok. But, will lose the original value
		
		// long and char
		num2 = c1; // Ok
		num11 = (long)c1; // Ok. But, cast is not required. Use num2 = c1
		// c1 = num11; // An error - Type mismatch: cannot convert from long to char
		c1 = (char)num11; // Ok
		// c1 = 255L; // An error. 255L is a long literal - Type mismatch: cannot convert from long to char
		c1 = (char)255L; // Ok. But use c1 = 255 instead
	}
}
