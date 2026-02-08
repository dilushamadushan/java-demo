package thread;

public class ThreadMain {
    public static void main(String[] args) {

        // ================================
        // Runnable Example
        // ================================

        // Create Runnable task (ONLY job, no thread yet)
        MyRunnable runnableTask = new MyRunnable();

        // Pass Runnable into Thread → now thread created
        Thread t1 = new Thread(runnableTask);

        // Start thread → executes run() in NEW thread
        t1.start();


        // ================================
        // Thread Class Example
        // ================================

        // Create object of Thread subclass
        MyThread t2 = new MyThread();

        // Start thread → executes run() in NEW thread
        t2.start();


        // ================================
        // Main Thread
        // ================================

        System.out.println("Main running in: "
                + Thread.currentThread().getName());
    }
}
