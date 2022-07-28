package designmode.build;

/**
 * @author mq
 * @date 2022/7/28 11:13
 */
public class Client {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        Product product = director.construct();
        product.show();
    }
}
