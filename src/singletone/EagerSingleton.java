package singletone;

public class EagerSingleton {
    //Egale instantiation
    private static final EagerSingleton demo = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance(){
        return demo;
    }
}
