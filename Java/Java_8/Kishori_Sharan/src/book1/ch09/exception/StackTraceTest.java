package book1.ch09.exception;

public class StackTraceTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}
	
	public static void m1() throws MyException {
		m2();
	}
	
	public static void m2() throws MyException {
		throw new MyException("Some error has occurred.");
	}
}
