package thread.poolExecutor;

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

public class LockThreadPool {
    public static void main(String[] args) {
        ScheduledThreadPoolExecutor executor = new ScheduledThreadPoolExecutor(3);
        MyTimer timer = new MyTimer();

        executor.execute(timer);
        executor.execute(timer);
        executor.execute(timer);

        executor.shutdown();
    }
}

class MyTimer extends Thread{
    ReentrantLock lock = new ReentrantLock();

    public void run(){
        lock.lock();
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        lock.unlock();
    }

}