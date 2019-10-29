package e02;

/**
 * @author 崔英俊
 */

import java.util.*;
public class SplitIntoSubString {

    public static void main(String[] args) {

        String str = "01#张三#20*02#李四#18*03#王五#22*04#赵六#20*05#田七#21";

        str = str.replaceAll("#", " ");
        String [] words = str.split("\\*");

        Student [] stu = new Student[words.length];
        for (int i = 0; i <words.length; i++) {
            stu[i] = new Student(Integer.parseInt(words[i].split(" ")[0]),
                    words[i].split(" ")[1],
                    Integer.parseInt(words[i].split(" ")[2]));
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查找的学生姓名");
        String tq = sc.next();
        for (Student st : stu) {

            st.searchStu(tq);
        }

        System.out.println((stu[0].getNumber() + 1));

        Student.cacuAge(stu[0].getAge(),
                stu[1].getAge(),
                stu[2].getAge(),
                stu[3].getAge(),
                stu[4].getAge() );

        String name1, name2;
        System.out.println("原名:");
        name1 = sc.next();
        System.out.println("修改为:");
        name2 = sc.next();

        for (Student s:
             stu) {
            s.modifyStu(name1, name2);
            s.searchStu(name2);
        }

    }
}
