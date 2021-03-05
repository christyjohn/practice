package ch11.multithreading;

class NewThread3 implements Runnable {
	String name;
	Thread t;
	
	public NewThread3(String threadName) {
		name = threadName;
		t = new Thread(this, name);
		System.out.println("New Thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " interrupted.");
		}
		System.out.println("Exiting " + name);
	}
}

public class MultiThreadDemo {
	public static void main(String[] args) {
		new NewThread3("One");
		new NewThread3("Two");
		new NewThread3("Three");

		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Exiting Main thread.");
	}
}	
