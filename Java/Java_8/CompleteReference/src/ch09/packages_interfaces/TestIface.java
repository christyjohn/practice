package ch09.packages_interfaces;

interface Callback {
	void callback(int param);
}

class Client implements Callback {
	public void callback(int p) {
		System.out.println("callback called with " + p);
	}
	
	void nonIfaceMeth() {
		System.out.println("Classes that implement interfaces " +
				"may also define other members, too.");
	}
}

class AnotherClient implements Callback {
	// Implement Callback's interface
	public void callback(int p) {
		System.out.println("Another version of callback");
		System.out.println("p squared is " + (p*p));
	}
}

public class TestIface {
	public static void main(String[] args) {
		Callback c = new Client();
		AnotherClient ob = new AnotherClient();
		
		c.callback(42);
		c = ob;
		c.callback(42);
	}
}
