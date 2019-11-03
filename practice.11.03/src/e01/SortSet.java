package e01;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SortSet {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set set = new TreeSet();

        for (int i = 0; i < 5; i++) {
            set.add(new Student(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        for (Object s : set) {

            System.out.println(((Student)s));
        }
    }

    public static class Student implements Comparable {

        private String name;
        private int chinese;
        private int math;
        private int english;
        private int overAll;

        public Student(String name, int chinese, int math, int english) {
            this.name = name;
            this.chinese = chinese;
            this.math = math;
            this.english = english;
            this.overAll = chinese + math + english;
        }

        public String getName() {
            return name;
        }

        public int getChinese() {
            return chinese;
        }

        public int getMath() {
            return math;
        }

        public int getEnglish() {
            return english;
        }

        public int getOverAll() {
            return overAll;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", chinese=" + chinese +
                    ", math=" + math +
                    ", english=" + english +
                    ", overAll=" + overAll +
                    '}';
        }

        @Override
        public int compareTo(Object o) {
            Student s = (Student) o;
            int number = this.getOverAll() - s.getOverAll();
            number = number == 0 ? this.getChinese() - s.getChinese() : number;
            number = number == 0 ? this.getMath() - s.getMath() : number;
            number = number == 0 ? this.getEnglish() - s.getEnglish() : number;
            number = number == 0 ? this.getName().compareTo(s.getName()) : number;
            return -number;
        }
    }
}
