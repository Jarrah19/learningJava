package e05;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-06
 */
public class BankAccount extends Thread {

    public BankAccount(String name) {
        super(name);
    }

    static int balance = 1000;
    int takeMoney;
    static int atm = 0;
    static int court = 0;

    @Override
    public void run() {

        while (true) {
            if ("柜台".equals(Thread.currentThread().getName())) {
                takeMoney = 100;
                if (balance >= takeMoney) {
                    balance -= takeMoney;
                    court += takeMoney;
                    System.out.println("柜台");
                }
                else {
                    Thread.currentThread().stop();
                }
                if (balance < 100) {
                    Thread.currentThread().stop();
                }
                try {
                    Thread.sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if ("ATM".equals(Thread.currentThread().getName())) {
                takeMoney = 200;
                if (balance >= takeMoney) {
                    balance -= takeMoney;
                    atm += takeMoney;
                    System.out.println("ATM");
                }
                else {
                    Thread.currentThread().stop();
                }
                if (balance < 200) {
                    Thread.currentThread().stop();
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
