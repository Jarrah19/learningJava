package e01;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class Person {

    private String idNumber;
    private int age;
    private String name;
    private String address;
    private String gender;

    public Person(String idNumber, int age, String name, String address, String gender) {
        this.idNumber = idNumber;
        this.age = age;
        this.name = name;
        this.address = address;
        this.gender = gender;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "e01.TestPerson.Person{" +
                "idNumber='" + idNumber + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

}
