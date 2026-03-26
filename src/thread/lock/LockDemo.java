package thread.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Counter {
    private int count = 0;
    private Lock lock = new ReentrantLock();

    public void increment() {
        lock.lock(); // acquire lock
        try {
            count++;
            System.out.println("Count: " + count);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock(); // release lock
        }
    }
}

public class LockDemo {
    public static void main(String[] args) {
        Counter c = new Counter();

        Runnable task = () -> {
            for (int i = 0; i < 5; i++) {
                c.increment();
            }
        };

        new Thread(task).start();
        new Thread(task).start();
    }
}