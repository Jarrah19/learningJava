package banyuan.com;

import java.util.Scanner;

public class SignAndLogin {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String username;

        do {
            System.out.println("请输入用户名");
             username = sc.next();

        } while ( ! username.equals("HandsomeCui"));

        System.out.println("请输入密码");

        for (int i = 0;; i++) {

            String password;
            password = sc.next();

            if ( ! password.equals("vladmir")) {

                if (i == 2) System.exit(0);
                System.out.println("您输入的密码不一致，请重新输入");
            }

            else break;
        }
    }
}