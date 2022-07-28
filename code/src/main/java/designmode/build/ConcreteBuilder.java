package designmode.build;

/**
 * @author mq
 * @date 2022/7/28 11:03
 */
public class ConcreteBuilder extends Builder{
    @Override
    public void buildPartA() {
        product.setPartA("a");
    }

    @Override
    public void buildPartB() {
        product.setPartB("b");
    }

    @Override
    public void buildPartC() {
        product.setPartC("c");
    }
}
