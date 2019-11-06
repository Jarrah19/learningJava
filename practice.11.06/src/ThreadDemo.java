/**
 * @author 崔英俊
 * @date 2019-11-06
 * @version 1.0
 */
public class ThreadDemo extends Thread {
    public ThreadDemo(String name) {
        super(name);
    }
    @Override
    public void run() {

        System.out.println("aaa");
        Thread.yield();

    }
 }


