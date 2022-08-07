package designmode.observer;

public interface Offer {
    void addCustomer(Customer customer);
    void notifyCustomer(String msg);
    void removeCustomer(Customer customer);

}
