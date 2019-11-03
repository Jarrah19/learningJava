package banyuan.e02;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class Subject {

    private String subName;
    private int score;

    public Subject(String subName, int score) {
        this.subName = subName;
        this.score = score;
    }

    int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return  subName + ":" +
                score + " ";
    }
}
