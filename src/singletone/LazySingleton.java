package singletone;

public class LazySingleton {
    // leazy instantiation
    private static LazySingleton demo1;

    private LazySingleton() {
    }

    public static LazySingleton getInstance(){
        if(demo1 == null){
            demo1 = new LazySingleton();
        }
        return demo1;
    }
}