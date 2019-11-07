package e03;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/7
 */
public class Thread4 extends Thread {

    Order order;

    public Thread4(String name, Order order) {
        super(name);
        this.order = order;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (order) {

                if (Order.order == 4) {
                    System.out.println(Thread.currentThread().getName() + "  减1, 结果为" + --Order.number);
                    Order.order = 1;
                    order.notifyAll();
                    try {
                        order.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
