package ch11.multithreading;

class NewThread2 extends Thread {
	public NewThread2() {
		super("Demo Thread");
		System.out.println("Child Thread: " + this);
		this.start();
	}
	
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			System.out.println("Child thread interrupted.");
		}
		System.out.println("Exiting Child thread.");
	}
}

public class ExtendThread {
	public static void main(String[] args) {
		new NewThread2();
		
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
