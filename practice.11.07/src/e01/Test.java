package e01;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-07
 */
public class Test {
    public static void main(String[] args) {

        Item item = new Item();
        Producer producer = new Producer(item);
        Consumer consumer = new Consumer(item);

        producer.start();
        consumer.start();
    }
}
