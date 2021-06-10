package innerclasses.telusko;

public class AnonymousClassTest {
	public static void main(String[] args) {
		B b = new B();
		b.show();
		
		B b2 = new B() {
			public void show() {
				System.out.println("Hello from anonymous class,");
			}
		};
		b2.show();
	}
}

class B {
	public void show() {
		System.out.println("Hello");
	}
	
	
}
