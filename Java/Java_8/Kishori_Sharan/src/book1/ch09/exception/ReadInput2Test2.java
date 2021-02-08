package book1.ch09.exception;

import java.io.IOException;

public class ReadInput2Test2 {
	public static void main(String[] args) {
		try {
			System.out.print("Enter some text and then press Enter key: ");
			char c = ReadInput2.readChar(); 
			System.out.print("The first character you entered is: " + c);
		} catch (IOException e) {
			System.out.println("Error occurred while reading input.");
		}
	}
}

