package e04;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/7
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread("线程2");
        MyThread t3 = new MyThread("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}
