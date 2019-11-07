package e03;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/7
 */
public class Thread2 extends Thread {

    Order order;

    public Thread2(String name, Order order) {
        super(name);
        this.order = order;
    }

    @Override
    public void run() {

        while (true) {

            synchronized (order) {

                if (Order.order == 2) {
                    System.out.println(Thread.currentThread().getName() + "  加1, 结果为" + ++Order.number);
                    Order.order = 3;
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
