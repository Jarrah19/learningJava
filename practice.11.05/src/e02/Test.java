package e02;

import java.io.*;
import java.util.Scanner;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-05
 */
public class Test {

    static int st = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        StudentBase.start();
        welcome();
    }

    public static void welcome() throws IOException {
        while (st != 2) {
            System.out.println("欢迎来到学生管理系统\n" +
                    "请选择:\n" +
                    "1. 学生登录\n" +
                    "2. 退出系统\n");
            st = sc.nextInt();
            switch (st) {
                case 1:
                    login();
                    break;
                case 2:
                    System.exit(0);
                default:
                    System.out.println("输入有误, 请重新输入!");
                    break;
            }
        }
    }

    public static void login() throws IOException {

        boolean flag = false;
        String name, password;
        System.out.print("请输入学生姓名:");
        name = sc.next().trim();

        for (Student s : StudentBase.treeSet) {
            if (name.equals(s.getStuName())) {
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("该学生不存在, 将前往注册页面");
            signUp(name);
        }
        System.out.print("请输入密码:");
        password = sc.next().trim();
        int count = 0;
        do {
            for (Student s : StudentBase.treeSet) {
                if (name.equals(s.getStuName()) && password.equals(s.getStuPassWord())) {
                    System.out.println("登录成功");
                    function();
                }
            }
            System.out.println("密码错误! 请重新输入: ");
            password = sc.next().trim();
            if (count++ == 1) {
                System.out.println("错误次数过多, 将退出系统");
                System.exit(0);
            }
        } while (flag);
    }

    public static void signUp(String name) throws IOException {
        System.out.println("您注册的学生姓名为 [" + name + "]");
        System.out.print("请输入密码");
        String password = sc.next();
        System.out.print("请输入学生编号");
        int number = sc.nextInt();
        System.out.print("请输入学生年龄");
        int age = sc.nextInt();
        System.out.print("请输入学生所属班级");
        String stuClass = sc.next();
        StudentBase.addStudent(new Student(number, name, password, age, stuClass));
        System.out.println("注册成功返回登录页面");
        login();
    }

    public static void function() throws IOException {
        do {
            System.out.println("请选择功能\n" +
                    "1. 查询学生\n" +
                    "2. 年龄排序\n" +
                    "3. 注销当前\n" +
                    "4. 退出系统\n");
            st = sc.nextInt();
            switch (st) {
                case 1:
                    System.out.print("请输入要查询学生的姓名:");
                    StudentBase.searchAndShow(sc.next().trim());
                    break;
                case 2:
                    StudentBase.showAllStudents();
                    break;
                case 3:
                    welcome();break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("输入有误, 请重新输入!");
                    break;
            }
        } while (st != 3);
    }
}
