package banyuan;

/**
 * @author 崔英俊
 */

import java.util.Scanner;

public class Test {


    public static void main(String[] args) {

        Examine[] test = new Examine[30];

        for (int i = 0; i < test.length; i++) {

            switch (i % 4) {

                case 0:
                    test[i] = new Exam.ExamA(i + 1, "第" + (i + 1) + "题");
                    break;
                case 1:
                    test[i] = new Exam.ExamB(i + 1, "第" + (i + 1) + "题");
                    break;
                case 2:
                    test[i] = new Exam.ExamC(i + 1, "第" + (i + 1) + "题");
                    break;
                case 3:
                    test[i] = new Exam.ExamD(i + 1, "第" + (i + 1) + "题");
                    break;
                default:
                    break;
            }
        }

        Student[] stu = new Student[6];

        for (int i = 0; i < stu.length; i++) {

            stu[i] = new Student(i + 1, "爱沢有纱" + (i + 1), i + 1);

            System.out.println("学生编号:" + stu[i].getStuNum() +
                    "  学生姓名:" + stu[i].getStuName() +
                    "  年级:" + stu[i].getStuGrade());

            int[][] finished = new int[6][10];

            outer:
            for (int j = 0; j < 10; j++) {

                int temp = (int) (Math.random() * 30);

                for (int k = 0; k < 10; k++) {

                    if (test[temp].getNumber() == finished[i][k]) {

                        j--;
                        continue outer;
                    }
                }

                finished[i][j] = test[temp].getNumber();
                System.out.println(test[temp].getTitle() + " 请输入数组对应相关选项: [1]A [2]B [3]C [4]D");

                Scanner sc = new Scanner(System.in);

                switch (sc.nextInt()) {

                    case 1:
                        if (test[temp].answerA()) {
                            stu[i].setStuScore(stu[i].getStuScore() + 10);
                        }
                        break;
                    case 2:
                        if (test[temp].answerB()) {
                            stu[i].setStuScore(stu[i].getStuScore() + 10);
                        }
                        break;
                    case 3:
                        if (test[temp].answerC()) {
                            stu[i].setStuScore(stu[i].getStuScore() + 10);
                        }
                        break;
                    case 4:
                        if (test[temp].answerD()) {
                            stu[i].setStuScore(stu[i].getStuScore() + 10);
                        }
                        break;
                    default:
                        break;
                }
            }

            System.out.println(stu[i].toString());

        }
    }
}
