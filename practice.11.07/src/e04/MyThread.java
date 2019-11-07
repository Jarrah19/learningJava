package e04;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/7
 */
public class MyThread extends Thread {

    public MyThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        while (true) {
                System.out.println(Thread.currentThread().getName());
                try {
                    sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
            }
        }
    }
}
