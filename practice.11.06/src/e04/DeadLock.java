package e04;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-06
 */
public class DeadLock extends Thread {

    boolean flag;

    public DeadLock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        if (flag) {
            synchronized ("苹果") {
                System.out.println("你先交出梨子");
                synchronized ("梨子") {
                    System.out.println("交易达成");
                }
            }
        } else {
            synchronized ("梨子") {
                System.out.println("你先交出苹果");
                synchronized ("苹果") {
                    System.out.println("交易达成");
                }
            }
        }
    }
}
