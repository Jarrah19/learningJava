package banyuan.e02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class Student {

    private int stuNum;
    private String name;
    private Collection scores;

    public Collection getScores() {
        return scores;
    }

    public Student() {
    }

    public Student(int stuNum, String name, int chinese, int math, int english, int physical, int chemistry) {
        this.stuNum = stuNum;
        this.name = name;
        this.scores = new ArrayList();
        this.scores.add(new Subject("语文", chinese));
        this.scores.add(new Subject("数学", math));
        this.scores.add(new Subject("英语", english));
        this.scores.add(new Subject("物理", physical));
        this.scores.add(new Subject("化学", chemistry));
        this.scores.add(new Subject("总分", chinese + math + english + physical + chemistry));
    }

    public void addTen() {

        int [] s = new int [this.scores.toArray().length];

        for (int i = 0; i < s.length; i++){
            s[i] = ((Subject) this.getScores().toArray()[i]).getScore() + 10;
        }
        this.scores = new ArrayList();
        this.scores.add(new Subject("语文", s[0]));
        this.scores.add(new Subject("数学", s[1]));
        this.scores.add(new Subject("英语", s[2]));
        this.scores.add(new Subject("物理", s[3]));
        this.scores.add(new Subject("化学", s[4]));
        this.scores.add(new Subject("总分", s[0] + s[1] + s[2] + s[3] + s[4]));

    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", name='" + name + '\'' +
                ", scores=" + scores.toArray()[0].toString() +
                scores.toArray()[1].toString() +
                scores.toArray()[2].toString() +
                scores.toArray()[3].toString() +
                scores.toArray()[4].toString() +
                scores.toArray()[5].toString() +

                '}';
    }
}
