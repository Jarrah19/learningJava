package banyuan.cn;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        int selection;
        Scanner sc = new Scanner(System.in);


        do {

            System.out.println("1.添加对象" + '\n' +
                            "2.按位置查找对象" + '\n' +
                    "3.按位置删除对象" + '\n' +
                    "4.按位置修改对象" + '\n' +
                    "5.退出程序"
            );

            selection = sc.nextInt();

            if (selection > 5 || selection < 1) {
                System.out.println("请输入 1 - 4 ");
            }

            switch (selection) {

                case 1:
                    Tool.addOne(StaticArray.arr);
                    break;
                case 2:
                    Tool.searchByPos(StaticArray.arr);
                    break;
                case 3:
                    Tool.deleteByPos(StaticArray.arr);
                    break;
                case 4:
                    Tool.modifyByPos(StaticArray.arr);
                default:
                    break;
            }

        } while (selection != 5);

    }
}
