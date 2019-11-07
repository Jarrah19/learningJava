package e02;

public class Test {
    public static void main(String[] args) {


    Order order = new Order();

    MyTread1 thread1 = new MyTread1("线程1", order);
    MyTread2 thread2 = new MyTread2("线程2", order);
    MyTread3 thread3 = new MyTread3("线程3", order);

    thread1.start();
    thread2.start();
    thread3.start();
    }

}
