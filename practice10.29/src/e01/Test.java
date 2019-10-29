package e01;

import e01.Person;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Person[] group = new Person [5];
        Scanner sc = new Scanner(System.in);

        outer:
        for (int i = 0; i < group.length; i ++) {

            group[i] = new Person(sc.next(), sc.nextInt(), sc.next(), sc.next());

            for (int j = 0; j < i; j++) {

                if(group[j].equals(group[i])) {

                    System.out.println("重复,无法输入");
                    i--;
                    continue outer;
                }
            }
        }

    }
}
