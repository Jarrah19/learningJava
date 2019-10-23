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

        int temp = this.getAge();
        this.age = one.getAge();
        one.age = temp;

        String tempStr = this.getName();
        this.name = one.getName();
        one.name = tempStr;

        tempStr = this.getAddress();
        this.address = one.getAddress();
        one.address = tempStr;

        tempStr = this.getGender();
        this.gender = one.getGender();
        one.gender = tempStr;
    }

    public String toString() {

        return "姓名：" + name + "  年龄：" + age + "  地址：" + address + "  性别：" + gender;
    }
}
