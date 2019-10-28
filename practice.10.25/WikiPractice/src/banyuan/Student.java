package banyuan;

/**
 * @author 崔英俊
 */
public class Student {

    private int stuNum;
    private String stuName;
    private int stuGrade;
    private int stuScore;

    public Student(int stuNum, String stuName, int stuGrade) {

        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuGrade = stuGrade;
    }

    public void setStuNum(int stuNum) {

        this.stuNum = stuNum;
    }

    public void setStuName(String stuName) {

        this.stuName = stuName;
    }

    public void setStuGrade(int stuGrade) {

        this.stuGrade = stuGrade;
    }

    public void setStuScore(int stuScore) {

        this.stuScore = stuScore;
    }

    public int getStuNum() {

        return stuNum;
    }

    public String getStuName() {

        return stuName;
    }

    public int getStuGrade() {

        return stuGrade;
    }

    public int getStuScore() {

        return stuScore;
    }

    @Override
    public String toString() {

        return "学生编号:" + stuNum + "  学生姓名:" + stuName + "  年级:" + stuGrade + "  分数" + stuScore;
    }
}
