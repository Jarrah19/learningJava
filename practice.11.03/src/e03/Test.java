package e03;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */

import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Test {

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        TreeSet set = new TreeSet();
        Scanner sc = new Scanner(System.in);

        while (set.toArray().length < 5) {

            set.add(new Book(sc.next(), sc.nextDouble(), sc.next(), sc.next()));
        }

        for (Object o : set.toArray()) {

            list.add((Book) o);
        }

        Iterator it = list.iterator();

        while (it.hasNext()) {

            System.out.println(it.next());
        }
    }
}
