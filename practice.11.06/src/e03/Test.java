package e03;

/**
 * @author 崔英俊
 * @date 2019-11-06
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        TrainThread m1 = new TrainThread("赵大");
        TrainThread m2 = new TrainThread("钱二");
        TrainThread m3 = new TrainThread("孙三");
        TrainThread m4 = new TrainThread("李四");
        TrainThread m5 = new TrainThread("周五");
        TrainThread m6 = new TrainThread("吴六");
        TrainThread m7 = new TrainThread("郑七");
        TrainThread m8 = new TrainThread("王八");
        TrainThread m9 = new TrainThread("冯九");
        TrainThread m10 = new TrainThread("蒋十");

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
