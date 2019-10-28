package e01;

/**
 * @author 崔英俊
 * @date 2019-10-27
 * @version 1.0
 */
public class Student {

    private String stuName;
    private int stuAge;
    private SchoolClass stuClass;

    public Student(String stuName, int stuAge) {

        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public void Student(String stuName, int stuAge) {

        this.stuName = stuName;
        this.stuAge = stuAge;
    }

    public void setStuName(String stuName) {

        this.stuName = stuName;
    }

    public void setStuAge(int stuAge) {

        this.stuAge = stuAge;
    }

    public void setStuClass(SchoolClass stuClass) {

        this.stuClass = stuClass;
    }

    public String getStuName() {

        return stuName;
    }

    public int getStuAge() {

        return stuAge;
    }

    public SchoolClass getStuClass() {

        return this.stuClass;
    }

    @Override
    public String toString() {

        return "学生姓名:" + stuName + "  年龄:" + stuAge + "  " + stuClass.toString();

    }

}