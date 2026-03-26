package singletone;

public class BillPughSingleton {
    // Manage memory Optimization
    private BillPughSingleton(){}

    private static class SingleHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingleHelper.INSTANCE;
    }
}
