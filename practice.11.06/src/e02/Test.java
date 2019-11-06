package e02;

/**
 * @author 崔英俊
 * @date 2019-11-06
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        TrainRunnable m = new TrainRunnable();
        TrainThread m1 = new TrainThread(m,"赵大");
        TrainThread m2 = new TrainThread(m,"钱二");
        TrainThread m3 = new TrainThread(m,"孙三");
        TrainThread m4 = new TrainThread(m,"李四");
        TrainThread m5 = new TrainThread(m,"周五");
        TrainThread m6 = new TrainThread(m,"吴六");
        TrainThread m7 = new TrainThread(m,"郑七");
        TrainThread m8 = new TrainThread(m,"王八");
        TrainThread m9 = new TrainThread(m,"冯九");
        TrainThread m10 = new TrainThread(m,"蒋十");

        m1.start();
        m2.start();
        m3.start();
        m4.start();
        m5.start();
        m6.start();
        m7.start();
        m8.start();
        m9.start();
        m10.start();

    }
}
