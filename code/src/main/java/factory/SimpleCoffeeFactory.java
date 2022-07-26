package factory;

public class SimpleCoffeeFactory {

    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if(type.equals("ame")){
            coffee = new AmericaCoffee();
        }else if (type.equals("lat")){
            coffee = new LatteCoffee();
        }
        return coffee;
    }
}
