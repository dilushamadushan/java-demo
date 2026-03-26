package singletone;

public class ThreadSingleton {
    //synchronized ensures no two threads create it at the same time
    private ThreadSingleton() {}

    private static ThreadSingleton instance;

//    public static synchronized ThreadSingleton getInstance(){
//        if (instance == null) instance = new ThreadSingleton();
//        return instance;
//    }

    public static ThreadSingleton getInstance(){
        if(instance == null) { // 1st check
            synchronized (ThreadSingleton.class) {
                if (instance == null) { //2nd check
                    instance = new ThreadSingleton();
                }
            }
        }
        return instance;
    }
}
