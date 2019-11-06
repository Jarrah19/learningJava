package e04;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-06
 */
public class Test {

    public static void main(String[] args) {

        DeadLock m1 = new DeadLock(true);
        DeadLock m2 = new DeadLock(false);

        m1.start();
        m2.start();
    }
}
