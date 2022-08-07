package designmode.observer;

import java.util.ArrayList;
import java.util.List;

public class RealOffer implements Offer{
    List<Customer> customers = new ArrayList<Customer>();

    @Override
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void notifyCustomer(String msg) {
        for (Customer customer : customers) {
            customer.buy(msg);
        }
    }

    @Override
    public void removeCustomer(Customer customer) {
        customers.remove(customer);
    }
}
