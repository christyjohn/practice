package ch11.multithreading;

class Caller2 implements Runnable {
	String msg;
	Callme target;
	Thread t;
	
	public Caller2(Callme targ, String s) {
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		synchronized (target) {
			target.call(msg);
		}
	}
}

public class Synch1 {
	public static void main(String[] args) {
		Callme target = new Callme();
		Caller2 ob1 = new Caller2(target, "Hello");
		Caller2 ob2 = new Caller2(target, "Synchronized");
		Caller2 ob3 = new Caller2(target, "World");
		
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch(InterruptedException e) {
			System.out.println("Interrupted");
		}
	}
}
