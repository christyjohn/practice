package book1.ch09.exception;

import java.io.IOException;

public class ReadInput2Test3 {
	public static void main(String[] args) throws IOException {
		char c = '\u0000';
		System.out.print("Enter some text and then press Enter key: ");
		c = ReadInput2.readChar();
		System.out.print("The first character you entered is: " + c);
	}
}
