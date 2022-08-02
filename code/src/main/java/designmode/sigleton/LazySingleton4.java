package designmode.sigleton;

public class LazySingleton4 {
    private LazySingleton4(){};
    private static volatile LazySingleton4 instance;
    public static LazySingleton4 getInstance(){
        if(instance == null){
            synchronized (LazySingleton4.class){
                if (instance==null){
                    instance = new LazySingleton4();
                }
            }
        }
        return instance;
    }
}
