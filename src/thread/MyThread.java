package thread;

// Thread class = Thread + Task together
class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread class running in: "
                + Thread.currentThread().getName());
    }
}
