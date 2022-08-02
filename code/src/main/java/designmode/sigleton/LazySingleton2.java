package designmode.sigleton;

public class LazySingleton2 {
    private LazySingleton2(){};
    private static LazySingleton2 instance;
    public static synchronized LazySingleton2 getInstance(){
        if(instance==null){
            instance = new LazySingleton2();
        }
        return instance;
    }
}
