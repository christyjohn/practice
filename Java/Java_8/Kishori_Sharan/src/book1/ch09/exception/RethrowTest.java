package book1.ch09.exception;

public class RethrowTest {
	public static void main(String[] args) {
		try {
			m1();
		} catch(MyException e) {
			e.printStackTrace();
		}
	}
	
	public static void m1() throws MyException {
		try {
			m2();
		} catch(MyException e) {
			e.fillInStackTrace();
			throw e;
		}
	}
	
	public static void m2() throws MyException {
		throw new MyException("An error has occurred.");
	}
}
