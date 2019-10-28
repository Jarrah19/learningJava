package e04;

import java.util.*;

public class Account {

        private int accNo;
        private String name;
        private Date createdDate;
        private String idNo;
        private double balance;

        public Account(int accNo, String name, Date createdDate, String idNo, double balance) {

            this.accNo = accNo;
            this.name = name;
            this.createdDate = createdDate;
            this.idNo = idNo;
            this.balance  = balance;
        }

        public void saveMoney(double amount) {

            this.balance = this.balance - amount;
        }

        public void takeMoney(double amount) {

            this.balance = this.balance + amount;
        }

        public void showCreatedDate() {

            System.out.println("开户时间为" + createdDate);
        }

        public void showBalance() {

            System.out.println("余额为" + balance);
        }
}

