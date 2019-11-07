package e01;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-07
 */
public class Consumer extends Thread {

    private Item item;

    public Consumer(Item item) {
        this.item = item;
    }


    @Override
    public void run() {
        while (true) {

            synchronized (item) {
                if (item.getName() == null) {

                    try {
                        item.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者购买了" + item.getName());
                item.notify();
                try {
                    item.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
