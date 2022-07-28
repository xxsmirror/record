package designmode.build;

/**
 * @author mq
 * @date 2022/7/28 11:01
 */
public abstract class Builder {
    protected Product product = new Product();

    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    public Product getProduct(){
        return product;
    }
}
