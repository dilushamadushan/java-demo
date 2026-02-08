package thread.threadClass;

public class MainThread {
    public static void main (String[] args) {

        // Create object of Add (SUM task)
        Add add = new Add();

        // Create thread and pass Add task to it
        Thread addTh = new Thread(add);

        // Start thread → run() executes in separate thread
        addTh.start();


        // Create object of Multi (MULTIPLY task)
        Multi mt = new Multi();

        // Create another thread for Multi task
        Thread mtTh = new Thread(mt);

        // Start second thread → runs parallel with first thread
        mtTh.start();
    }
}
