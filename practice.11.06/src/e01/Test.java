package e01;

/**
 * @author 崔英俊
 * @date 2019-11-06
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        MyRunnable m1 = new MyRunnable();
        Thread t1 = new Thread(m1,"售票口A");
        Thread t2 = new Thread(m1,"售票口B");
        Thread t3 = new Thread(m1,"售票口C");

        t1.start();
        t2.start();
        t3.start();
    }
}
