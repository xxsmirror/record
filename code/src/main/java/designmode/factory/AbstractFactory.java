package factory;

import designmode.factory.Coffee;

public interface AbstractFactory {
    public factory.Product createProduct();
    public Coffee createCoffee();

}
