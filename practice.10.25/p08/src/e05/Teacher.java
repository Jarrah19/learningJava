package e05;

public class Teacher {

    private int id;
    private String name;
    private String sex;
    private double height;

    Teacher(int id, String name, String sex, double height) {

        this.id = id;
        if (name.length() > 1 && name.length() < 4) {

            this.name = name;
        }

        if ("男".equals(sex) ^ "女".equals(sex)) {

            this.sex = sex;
        }

        if (height >= 1.5 && height <= 1.8) {

            this.height = height;
        }
    }

    public void setId(int id) {

            this.id = id;
    }

    public void setName(String name) {

        if (name.length() > 1 && name.length() < 4) {

            this.name = name;
        }
    }

    public void setSex(String sex) {

        if("男".equals(sex) ^ "女".equals(sex)) {

            this.sex = sex;
        }
    }


    public void  showData() {

        System.out.println( "No." + id + "  姓名：" + name + "  性别：" + sex + "身高：" + height );
    }
}