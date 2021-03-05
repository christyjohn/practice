package ch11.multithreading;

class NewThread implements Runnable {
	Thread t;
	
	public NewThread() {
		t = new Thread(this, "Demo Thread");
		System.out.println("Child Thread: " + t);
		t.start();
	}
	
	public void  run() {
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

public class ThreadRunnableDemo {
	public static void main(String[] args) {
		new NewThread();
		
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
