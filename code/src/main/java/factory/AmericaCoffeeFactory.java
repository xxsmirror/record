package factory;

public class AmericaCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericaCoffee();
    }
}
