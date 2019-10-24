package banyuan;
public class Person {

    private String name;
    private int age;
    private String address;
    private String gender;

    public Person (String name, int age, String address, String gender) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public void setInfo(String name, int age, String address, String gender) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getAddress () {

        return address;
    }

    public String getGender () {

        return gender;
    }


    public void swapPerson (Person one) {

        Person temp = new Person(one.getName(), one.getAge(), one.getAddress(), one.getGender());
        one.setInfo(this.getName(),this.getAge(), this.getAddress(), this.getGender());
        this.setInfo(temp.getName(),temp.getAge(), temp.getAddress(), temp.getGender());

    }

    public String toString() {

        return "姓名：" + name + "  年龄：" + age + "  地址：" + address + "  性别：" + gender;
    }
}
