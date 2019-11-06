package e03;

/**
 * @author 崔英俊
 * @date 2019-11-06
 * @version 1.0
 */
public class TrainThread extends Thread {

    public TrainThread(String name) {
        super(name);
    }

    static int i = 0;


    @Override
    public void run() {

        synchronized("av") {

            try {
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + "第" + ((i++) + 1) + "个通过了山洞");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
