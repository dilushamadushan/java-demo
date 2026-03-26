package singletone;

public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    public StaticBlockSingleton() {
    }

    static {
        try{
            if(instance == null){
                instance = new StaticBlockSingleton();
            }
        }catch (Exception e){
            throw new RuntimeException("Exception occurred in creating singleton");
        }
    }
    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}
