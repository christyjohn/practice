package sec15.concurrency;

import static sec15.concurrency.ThreadColor.ANSI_GREEN;
import static sec15.concurrency.ThreadColor.ANSI_PURPLE;

public class SimpleThreadDemo {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "1. Hello from the main thread.");
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.start();

        new Thread()  {
          public void run() {
              System.out.println(ANSI_GREEN + "Hello from anonymous class thread");
            }
        }.start();

        System.out.println("2. Hello from the main thread.");
    }
}
