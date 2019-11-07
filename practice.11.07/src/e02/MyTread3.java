package e02;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-07
 */
public class MyTread3 extends Thread {

    private Order order;

    public MyTread3(String name, Order order) {
        super(name);
        this.order = order;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (order) {

                if (Order.order == 3) {

                    if (Order.number > 75) {

                        break;
                    }

                    for (int i = 0; i < 5; i++) {
                        System.out.println(Thread.currentThread().getName() + "----" + Order.number++);
                    }

                    Order.order = 1;
                    order.notifyAll();
                    if (Order.number > 75) {

                        break;
                    }

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
