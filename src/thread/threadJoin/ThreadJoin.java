package thread.threadJoin;

public class ThreadJoin implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " start");
        try{
            Thread.sleep(1000);
        }catch (Exception e){
            throw new RuntimeException();
        }
    }
}
