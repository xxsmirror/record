package designmode.sigleton;

public class LazySingleton5 {
    private LazySingleton5(){};
    private static class SingletonHolder{
        private static final LazySingleton5 INSTANCE = new LazySingleton5();
    }
    public static LazySingleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
