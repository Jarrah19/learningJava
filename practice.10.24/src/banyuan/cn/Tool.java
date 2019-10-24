package banyuan.cn;

import java.util.*;

public class Tool {

    static Scanner sc = new Scanner(System.in);


    //增加对象
    public static void addOne(Person[] arr) {

        System.out.println("依次输入姓名、性别、年龄，以回车分隔");
        arr[StaticArray.counter] = new Person();
        arr[StaticArray.counter ++].person(sc.next(), sc.next(), sc.nextInt());

    }

    //按名字查找并修改对象
    public static void modifyOne(Person[] arr) {

        System.out.println("请输入修改对象的姓名");
        String name = sc.next();

        for (int i = 0; i < StaticArray.counter; i++) {

            if (name.equals(arr[i].getName())) {
                System.out.println("依次输入姓名、性别、年龄，以回车分隔");
                arr[i].person(sc.next(), sc.next(), sc.nextInt());
            }
        }
    }

    //按位置查找并修改对象
    public static void modifyByPos(Person[] arr) {

        System.out.println("请输入修改对象的位置");
        int position = sc.nextInt();

        System.out.println("依次输入姓名、性别、年龄，以回车分隔");
        arr[position - 1].person(sc.next(), sc.next(), sc.nextInt());

    }


    //按名字查找并删除对象
    public static void deleteOne(Person[] arr) {

        System.out.println("请输入删除对象的姓名");
        String name = sc.next();

        for (int i = 0; i < StaticArray.counter; i++) {

            if (name.equals(arr[i].getName())) {

                for (; i < StaticArray.counter - 1; i++) {

                    arr[i] = arr[i++];
                }
            }
            StaticArray.counter--;
        }
    }

    //按位置查找并删除对象
    public static void deleteByPos(Person[] arr) {
        System.out.println("请输入删除对象的位置");
        int position = sc.nextInt();

        for (; position - 1 < StaticArray.counter; position++) {

            arr[position - 1] = arr[position];
        }
        StaticArray.counter--;
    }

    //按名字查找并显示
    public static void  searchOne(Person[] arr) {
        System.out.println("请输入查找对象的姓名");
        String name = sc.next();

        for (int i = 0; i < StaticArray.counter; i++) {

            if (name.equals(arr[i].getName())) {
                System.out.println(arr[i].toString());
            }
        }
    }

    //按位置查找并显示
    public static void searchByPos(Person[] arr) {
        System.out.println("请输入查找对象的位置");

        int position = sc.nextInt();
        System.out.println(arr[position - 1].toString());
    }
}
