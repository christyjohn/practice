package sec15.concurrency;

import static java.lang.Thread.currentThread;
import static sec15.concurrency.ThreadColor.*;

public class SimpleThreadDemo {
    public static void main(String[] args) {
        System.out.println(ANSI_PURPLE + "1. Hello from the main thread. - " + currentThread().getName());
        AnotherThread anotherThread = new AnotherThread();
        anotherThread.setName("<----Another Thread---->");
        anotherThread.start();

        new Thread()  {
          public void run() {
              System.out.println(ANSI_GREEN + "Hello from anonymous class thread - " + currentThread().getName());
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                //super.run();
                System.out.println(ANSI_RED + "Hello from the anonymous class's implementation of run() - " + currentThread().getName());

                try {
                    anotherThread.join();
                    System.out.println(ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again." + currentThread().getName());
                } catch (InterruptedException e) {
                    System.out.println(ANSI_RED + "I couldn't wait after all. I was interrupted." + currentThread().getName());
                }
            }
        });
        myRunnableThread.start();
        //anotherThread.interrupt();

        System.out.println("2. Hello from the main thread. - " + currentThread().getName());
    }
}
