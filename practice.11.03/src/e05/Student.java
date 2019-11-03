package e05;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */
public class Student {

    private String name;
    private String gradeClass;
    private double score;

    public Student(String name, String gradeClass, double score) {
        this.name = name;
        this.gradeClass = gradeClass;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gradeClass='" + gradeClass + '\'' +
                ", score=" + score +
                '}';
    }
}
