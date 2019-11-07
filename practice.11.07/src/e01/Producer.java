package e01;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-07
 */
public class Producer extends Thread {

    private Item item;

    public Producer(Item item) {
        this.item = item;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (item) {
                if (!"商品A".equals(item.getName())) {
                    item.setName("商品A");
                } else {
                    item.setName("商品B");
                }
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
