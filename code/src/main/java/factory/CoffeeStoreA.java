package factory;

public class CoffeeStoreA {
    private CoffeeFactory factory;
    public CoffeeStoreA(CoffeeFactory factory){
        this.factory=factory;
    }

    public Coffee orderCoffee(){
        Coffee coffee = factory.createCoffee();
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
