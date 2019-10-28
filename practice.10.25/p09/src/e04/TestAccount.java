package e04;

import java.util.Date;

public class TestAccount {

    public static void main(String[] args) {

        Account acc1 = new Account(12321232, "你打野", new Date(2019,10,27), "321101199912129999", 1.23);

        acc1.saveMoney(2.35);
        acc1.takeMoney(2);

        acc1.showCreatedDate();

        acc1.showBalance();
    }
}