package designmode.build;

/**
 * @author mq
 * @date 2022/7/28 11:04
 */
public class Director {
    private Builder builder;

    public Director(Builder builder){
        this.builder=builder;
    }

    public Product construct(){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        return builder.getProduct();
    }
}
