package e05;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
public class Test {

    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        Scanner sc = new Scanner(System.in);
        int n = 6;

        for (int i = 0; i < n; i++) {

            list.add(new Student("武藤兰" + (i + 1), i + 1 + "班" , Math.random() * 50 + 51));
        }

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

    }
}
