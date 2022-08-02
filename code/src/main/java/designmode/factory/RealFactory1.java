package factory;

import designmode.factory.Coffee;

public class RealFactory1 implements factory.AbstractFactory {
    @Override
    public factory.Product createProduct() {
        return null;
    }

    @Override
    public Coffee createCoffee() {
        return null;
    }
}
