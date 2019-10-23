package banyuan;

import java.util.*;


public class TestPerson {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("请输入人数");

        int number = input.nextInt();

        Person[] people = new Person[number];

        String[] familyName = {"赵", "钱", "孙", "李", "周", "吴", "郑", "王"};
        String[] lastName = {"铁柱", "二蛋", "狗剩", "嘎子", "大毛", "驴头", "赖子", "栓子"};
        String[] gender = {"男", "女"};

        for (int i = 0; i < number; i++) {

            people[i] = new Person((familyName[(int) (Math.random() * 7)] + lastName[(int) (Math.random() * 7)]),
                    (int) (Math.random() * 10 + 19),
                    "地狱空荡荡，魔鬼在人间" + (int) (i + 1) + "号",
                    gender[(int) (Math.random() * 2)]);

            System.out.println(people[i].toString());
        }

        System.out.println("按年龄升序排列后：");

        for (int i = 0; i < number - 1; i++) {

            for (int j = 0; j < number - 1 - i; j++) {

                if (people[j].getAge() > people[j + 1].getAge()) {
                    people[j].swapPerson(people[j + 1]);
                }
            }
        }

        for (int i = 0; i < number; i++) {

            System.out.println(people[i].toString());
        }
    }
}