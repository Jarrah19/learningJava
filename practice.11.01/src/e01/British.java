package e01;

/**
 * @author 崔英俊
 * date: 2019-11-1
 * version 1.0
 */
public class British implements Comparable{

    private String name;
    private int score;

    public British(String name, int score) {

        this.name = name;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "British{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        British s = (British) o;
        int num = this.getName().compareTo(s.getName());
        num = num == 0 ? this.getScore() - s.getScore() : num;

        return num;
    }
}
