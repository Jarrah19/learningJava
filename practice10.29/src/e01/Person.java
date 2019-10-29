package e01;

/**
 * @author 崔英俊
 */
public class Person  {

    private String name;
    private int age;
    private String address;
    private String phone;

    public Person(String name, int age, String address, String phone) {

        this.name = name;
        this.age = age;
        this.address = address;
        this.phone = phone;
    }

    public Person() {

    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setPhone(String phone) {

        this.phone = phone;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    public String getAddress() {

        return address;
    }

    public String getPhone() {

        return phone;
    }

    @Override
    public boolean equals(Object obj) {

        boolean flag = false;

        if(obj == null) {

            return flag;
        }
        if (this.getClass() != obj.getClass()) {

            return flag;
        }
        if (this == obj) {

            flag = true;
            return flag;
        }

        Person temp = (Person) obj;

        if (!temp.getName().equals(this.getName())) {

            return flag;
        }

        if (temp.getAge() != this.getAge()) {

            return flag;
        }

        if (!temp.getAddress().equals(this.getAddress())) {

            return flag;
        }

        if (temp.getPhone().equals(this.getPhone())) {

            flag = true;
            return flag;
        }

        return flag;
    }
}
