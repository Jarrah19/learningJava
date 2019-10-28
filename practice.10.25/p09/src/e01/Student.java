package e01;

public class Student {

    private int id;
    private String name;
    private char sex;
    private int age;

    public Student(int id, String name, char sex, int age) {

        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Student(int id, String name, int age, char sex) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setSex(char sex) {

        this.sex = sex;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getId() {

        return id;
    }

    public String getName() {

        return name;
    }

    public char getSex() {

        return sex;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {

        return "No." + id + "  姓名:" + name + "  性别:" + sex + "  年龄: " + age;
    }
}