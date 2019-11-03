package e02;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */

import java.util.*;

public class ListSort {

    public static void main(String[] args) {

        Random ra = new Random();
        List list = new ArrayList();
        TreeSet set = new TreeSet();

        while (set.toArray().length < 10) {

            set.add(ra.nextInt(100) + 1);
        }

        for(Object o : set.toArray()) {

            list.add((Integer)o);
        }

        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
