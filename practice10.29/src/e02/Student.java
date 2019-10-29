package e02;

/**
 * @author 崔英俊
 */
public class Student {

    private int number;
    private String name;
    private int age;

    public Student(int number, String name, int age) {

        this.number = number;
        this.name = name;
        this.age = age;
    }

    public void setNumber(int number) {

        this.number = number;
    }

    public void setName(String name) {

        this.name = name;
    }

    public void setAge(int age) {

        this.age = age;
    }

    public int getNumber() {

        return number;
    }

    public String getName() {

        return name;
    }

    public int getAge() {

        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public void searchStu(String name) {

        if (name.equals(this.getName())) {

           System.out.println(this.toString());
        }
    }

    public void modifyStu(String name1, String name2) {

        if (name1.equals(this.getName())) {

            this.setName(name2);
            System.out.println("修改成功");

        }
    }

    public static void cacuAge(int a, int b, int c, int d, int e) {

        int min = 2147483647;
        int max = -2147483648;
        if (a > b) {
            max = a;
            min = b;
        }
        else {
            max = b;
            min = a;
        }
        if (c > max) {
            max = c;
        }
        if (min > c) {

            min = c;
        }
        if (d > max) {
            max = d;
        }
        if (min > d) {

            min = d;
        }
        if (e > max) {
            max = e;
        }
        if (min > e) {

            min = e;
        }

        System.out.println("平均年龄" + ((a + b + c + d + e)/5.0) +
                "最大年龄" + max +
                "最小年龄" + min);
    }
}
