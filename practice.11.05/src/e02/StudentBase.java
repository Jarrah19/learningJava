package e02;

import java.io.*;
import java.util.TreeSet;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019-11-05
 */
public class StudentBase {

    static TreeSet<Student> treeSet = new TreeSet<Student>();
    static File file = new File("/Users/edz/project/java/practice.11.05/src/e02/StudentsData");

    static void start() throws IOException, ClassNotFoundException {

        File[] list = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()) {
                    return pathname.getName().endsWith("txt");
                }
                return false;
            }
        });

        try {
            for (File f : list) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
                treeSet.add((Student) ois.readObject());
                ois.close();
            }
        } catch (Exception e) {

        }
    }

    static void addStudent(Student stu) throws IOException {
        treeSet.add(stu);
        for (Object o : treeSet.toArray()) {
            Student s = (Student) o;
            File f = new File(file.getPath() + '/' + s.getStuNum() +
                    s.getStuName() + s.getStuPassWord() + s.getStuAge() + s.getStuClass() + ".txt");
            if(!f.exists()) {
                f.createNewFile();
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
                oos.writeObject(s);
                oos.close();
            }
        }
    }

    static void showAllStudents() {

        for (Object o : treeSet.toArray()) {
            Student s = (Student) o;
            System.out.println(s.toString());
        }
    }

    static void searchAndShow(String stuName) {

        for (Object o : treeSet.toArray()) {
            Student s = (Student) o;
            if (stuName.equals(s.getStuName())) {
                System.out.println(s.toString());
            }
        }
    }
}
