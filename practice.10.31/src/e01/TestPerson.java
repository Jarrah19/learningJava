package e01;

import java.util.*;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class TestPerson {

    public static void main(String[] args) {

        ArrayList<Person> people = new ArrayList();

        Scanner sc = new Scanner(System.in);

        int n = 2;

        Person[] guys = new Person[2 * n];
        for (int i = 0; i < n; i++) {

            people.add((new Person("233333666666" + i, 23 + i, "张三" + i, "南京市玄武区", "男")));
        }

        for (int i = n; i < 2 * n; i++) {

            people.add((new Person("2333336444444" + 1, 22 + i, "李四", "上海市静安区", "女")));

        }

        System.out.println("请输入城市名");

        String city = sc.next();
        System.out.println(searchByCity(city, people));

        System.out.println("请输入需要删除的完整城市名与区名");
        String cityAndDistrict = sc.next();
        System.out.println(deleteByCityDistrict(cityAndDistrict, people));

        System.out.println("请输入城市名");
        city = sc.next();
        System.out.println(expandIdNumber(city, people));


    }

    public static ArrayList<Person> searchByCity(String city, ArrayList<Person>  arrayList) {

        ArrayList<Person> people = new ArrayList();
        for (Object p : arrayList.toArray()) {
            Person temp = (Person) p;
            if (temp.getAddress().startsWith(city)) {

                people.add(temp);
            }
        }

        return people;
    }

    public static ArrayList<Person> deleteByCityDistrict (String cityAndDistrict, ArrayList<Person>  arrayList) {

        ArrayList<Person> people = new ArrayList();
        for (Object p : arrayList.toArray()) {
            Person temp = (Person) p;
            if (!temp.getAddress().equals(cityAndDistrict)) {

                people.add(temp);
            }
        }

        return people;
    }

    public static String getSuffix (String address) {

        if(address.contains("上海")) {
            return "shanghai";
        }
        if(address.contains("南京")) {
            return "nanjing";
        }
        return "chengshi";
    }

    public static ArrayList<Person> expandIdNumber (String city, ArrayList<Person> arrayList) {

        ArrayList<Person> people = new ArrayList();
        for (Object p : arrayList.toArray()) {
            Person temp = (Person) p;
            if (temp.getAddress().startsWith(city)) {

                temp.setIdNumber(temp.getIdNumber() + getSuffix(temp.getAddress()));
            }

            people.add(temp);

        }
        return people;
    }

}
