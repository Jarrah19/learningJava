package e01;

/**
 * @author 崔英俊
 * @date 2019-10-27
 * @version 1.0
 */
public class SchoolClass {

    public String className;
    public int classNo;

    public SchoolClass () {

    }

    public SchoolClass(String className, int classNo) {

        this.className = className;
        this.classNo = classNo;
    }

    public void setClassName(String className) {

        this.className = className;
    }

    public void setClassNO(int classNo) {

        this.classNo = classNo;
    }

    public String getClassName() {

        return className;
    }

    public int getClassNo() {

        return classNo;
    }

    @Override
    public String toString() {

        return "班级编号:" + classNo + "  班级名:" + className;
    }
}