package e02;

import java.io.Serializable;

/**
 * @author 崔英俊
 * @date 2019-11-05
 * @version 1.0
 */
public class Student implements Serializable, Comparable{

    private int stuNum;
    private String stuName;
    private String stuPassWord;
    private int stuAge;
    private String stuClass;

    public Student(int stuNum, String stuName, String stuPassWord, int stuAge, String stuClass) {
        this.stuNum = stuNum;
        this.stuName = stuName;
        this.stuPassWord = stuPassWord;
        this.stuAge = stuAge;
        this.stuClass = stuClass;
    }

    public int getStuNum() {
        return stuNum;
    }

    public String getStuName() {
        return stuName;
    }

    public String getStuPassWord() {
        return stuPassWord;
    }

    public int getStuAge() {
        return stuAge;
    }

    public String getStuClass() {
        return stuClass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stuNum=" + stuNum +
                ", stuName='" + stuName + '\'' +
                ", stuAge=" + stuAge +
                ", stuClass='" + stuClass + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {

        Student s = (Student) o;
        int number = this.stuAge - s.stuAge;
        number = number == 0 ? this.stuNum - s.stuNum : number;
        number = number == 0 ? this.stuName.compareTo(s.stuName) : number;
        number = number == 0 ? this.stuClass.compareTo(s.stuClass) : number;

        return -number;
    }
}
