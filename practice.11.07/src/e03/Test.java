package e03;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/7
 */
public class Test {
    public static void main(String[] args) {


        Order order = new Order();
        Thread1 thread1 = new Thread1("线程1", order);
        Thread2 thread2 = new Thread2("线程2", order);
        Thread3 thread3 = new Thread3("线程3", order);
        Thread4 thread4 = new Thread4("线程4", order);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }
}
