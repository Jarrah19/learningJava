package e05;


/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-06
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {

        BankAccount court = new BankAccount("柜台");
        BankAccount atm = new BankAccount("ATM");
        court.start();
        atm.start();

        Thread.sleep(60);
        if(BankAccount.balance > 0) {

            BankAccount.court += 100;
            BankAccount.balance -= 100;
        }

        System.out.println("A在柜台一共取了" + BankAccount.court + "元, B在柜台一共取了" + BankAccount.atm + "元");
    }
}
