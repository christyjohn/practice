package book1.ch09.exception;

import java.io.IOException;

public class ReadInput2 {
	public static char readChar() throws IOException {
		char c = '\u0000';
		int input = 0;
		input = System.in.read();
		if (input != -1) {
			c = (char) input;
		}
		return c;
	}
}
