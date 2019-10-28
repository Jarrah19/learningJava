package e03;

public class Student {

    private String name;
    private char sex;
    private int age;
    private String dire;

    public Student(String name, char sex, int age, String dire) {

        if (name.length() <= 4) {

            this.name = name;
        }
        else  System.out.println("长度不能超过四位");

        if ((sex == '男') ^ (sex == '女')) {
            this.sex = sex;
        }
        else System.out.println("性别只能为【男】或者【女】");

        if (age > 1 && age < 60) {

            this.age = age;
        }

        else System.out.println("年龄应为 1 至 60");

        if(".net".equals(dire) ^ "java".equals(dire)) {

            this.dire = dire;
        }
        else System.out.println("方向只能为.net或者java");

    }

    public void setName(String name) {

        if (name.length() <= 4) {

            this.name = name;
        }
        else  System.out.println("长度不能超过四位");
    }

    public void setSex(char sex) {

        if ((sex == '男') ^ (sex == '女')) {
            this.sex = sex;
        }
        else System.out.println("性别只能为【男】或者【女】");
    }

    public void setDire(String dire) {

        if(".net".equals(dire) ^ "java".equals(dire)) {

            this.dire = dire;
        }
        else System.out.println("方向只能为.net或者java");
    }


    public void setAge(int age) {

        if (age > 1 && age < 60) {

            this.age = age;
        }

        else System.out.println("年龄应为 1 至 60");
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

    public String getDire() {

        return dire;
    }


    @Override
    public String toString() {

        return "姓名：" + name +
                "  性别：" + sex +
                "  年龄：" + age +
                "  方向：" + dire;
    }


}
