package singletone;

public class Main {
    public static void main(String[] args) {

        EagerSingleton sin = EagerSingleton.getInstance();
        LazySingleton sin1 = LazySingleton.getInstance();
        StaticBlockSingleton sin3 = StaticBlockSingleton.getInstance();
        ThreadSingleton sin4 = ThreadSingleton.getInstance();

        System.out.println(sin.hashCode());
        System.out.println(sin1.hashCode());
        System.out.println(sin3.hashCode());
        System.out.println(sin4.hashCode());
    }
}
