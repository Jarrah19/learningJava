package banyuan.cn;

public class Person {

    private String name;
    private String gender;
    private int age;

    public void person(String name, String gender, int age) {

        this.name =  name;
        this.gender = gender;
        this.age = age;
    }

    public void setName(String name) {

        this.name =  name;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public String getName() {

        return this.name;
    }

    public String getGender() {

        return this.gender;
    }

    public int getAge() {

        return this.age;
    }


    @Override
    public String toString() {

        return "姓名：" + name +
                " 性别：" + gender +
                " 年龄：" + age;
    }
}
