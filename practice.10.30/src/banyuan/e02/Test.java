package banyuan.e02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class Test {

    public static void main(String[] args) {

        Student[] students = new Student[8];
        Random ra = new Random();

        for (int i = 0; i < students.length; i++) {

            students[i] = new Student(i + 1, "香山圣" + (i + 1), ra.nextInt(50) + 51,
                    ra.nextInt(50) + 51,
                    ra.nextInt(50) + 51,
                    ra.nextInt(50) + 51,
                    ra.nextInt(50) + 51);
            System.out.println(students[i].toString());
        }

        Subject a = new Subject("123", 50);


        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j < students.length - 1; j++) {

                if (((Subject) students[j].getScores().toArray()[5]).getScore() < ((Subject) students[j + 1].getScores().toArray()[5]).getScore()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("按总成绩排序");
        for (Student s: students) {

            System.out.println(s.toString());
        }

        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j < students.length - 1; j++) {

                if (((Subject) students[j].getScores().toArray()[1]).getScore() < ((Subject) students[j + 1].getScores().toArray()[1]).getScore()) {

                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }

        System.out.println("数学前5的信息");
        for (Student s: students) {

            System.out.println(s.toString());
        }

        int sum = 0;
        double average = 0;

        for (int i = 0; i < students.length; i++) {

            sum += ((Subject) students[i].getScores().toArray()[5]).getScore();
            average = sum / (i + 1.0);
        }

        System.out.println(average);

        for (Student s: students) {

            if(((Subject)s.getScores().toArray()[5]).getScore() < average) {
                s.addTen();
            }
        }

        System.out.println("总分不足平均分的, 各科加十分");

        for (Student s: students) {

            System.out.println(s.toString());
        }
    }
}
