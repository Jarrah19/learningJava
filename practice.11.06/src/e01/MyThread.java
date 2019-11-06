package e01;

/**
 * @author 崔英俊
 * @date 2019-11-06
 * @version 1.0
 */
public class MyThread extends Thread{

    public MyThread(Runnable target, String name) {
        super(target, name);
    }
}
