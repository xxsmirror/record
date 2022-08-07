package designmode.observer;

public class FakeCustomer implements Customer{
    @Override
    public void buy(String s) {
        System.out.println("fake"+s);
    }
}
