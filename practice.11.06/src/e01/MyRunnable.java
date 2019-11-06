package e01;

/**
 * @author 崔英俊
 * @date 2019-11-06
 * @version 1.0
 */
public class MyRunnable implements Runnable{

    int tickets = 200;


    @Override
    public void run() {
        while (true) {

            synchronized("av") {

                if(tickets < 401) {
                    if(tickets % 2 == 1) {
                    System.out.println(Thread.currentThread().getName() + " 卖出第" + (tickets ++) + "张票");
                    }
                    else{
                        System.out.println("卖出" + (tickets++) + "张票");
                    }
                    try {
                        Thread.sleep(20);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
