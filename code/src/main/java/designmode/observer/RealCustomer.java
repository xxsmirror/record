package designmode.observer;

public class RealCustomer implements Customer{
    @Override
    public void buy(String s) {
        System.out.println("real"+s);
    }
}
