package thread.threadClass;

// This class calculates the SUM from 1 to 100 using a thread
public class Add implements Runnable {

    // run() method contains the task that will run inside the thread
    @Override
    public void run () {

        int sum = 0;

        // Loop from 1 to 100 and add numbers
        for (int i = 1; i <= 100 ; i++) {
            sum = sum + i;
        }

        // Print current thread name + result
        System.out.println(Thread.currentThread().getName()
                + " Sum of 1 to 100 : " + sum);
    }
}
