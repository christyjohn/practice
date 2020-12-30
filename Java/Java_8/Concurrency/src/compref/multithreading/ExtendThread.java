package compref.multithreading;

class NewThread2 extends Thread {
	
	NewThread2() {
		// create a new, second thread
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start();
	}
	
	// This is the entry point of the second thread
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread:" + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}

public class ExtendThread {
	public static void main(String[] args) {
		new NewThread(); // create a new thread
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("main Thread: " + i);
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("main thread exiting.");
	}
}
