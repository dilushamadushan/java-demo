package thread.threadClass;

// This class calculates the MULTIPLICATION (factorial-like) from 1 to 100 using a thread
public class Multi implements Runnable {

    @Override
    public void run () {

        Double multi = 1.0;

        // Loop from 1 to 100 and multiply numbers
        for (int i = 1; i <= 100 ; i++) {
            multi = multi * i;
        }

        // Print current thread name + result
        System.out.println(Thread.currentThread().getName()
                + " Multiplication 1 to 100 : " + multi);
    }
}
