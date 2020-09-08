package book1.ch10.assertions;

public class AssertionStatusTest {

	public static void main(String[] args) {
		boolean enabled = false;
		assert enabled = true;
		
		if (enabled) {
			System.out.println("Assertion is enabled");
		} else {
			System.out.println("Assertion is disabled");
		}
	}

}
