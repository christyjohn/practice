package ed10.book1.ch02.javaprogenv;

/**
 * This program displays a greeting for the reader.
 * @version 1.00 2021-04-29
 * @author Christy John
 *
 */
public class Welcome {
	public static void main(String[] args) {
		String greeting = "Welcome to Core Java!";
		System.out.println(greeting);
		for (int i = 0; i < greeting.length(); i++)
			System.out.print("=");
		System.out.println();
	}
}
