package e01;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */
public class Random20 {

    public static void main(String[] args) {

        Random ra = new Random();
        Set set = new HashSet();

        while (set.toArray().length < 10) {

            set.add(ra.nextInt(20) + 1);
        }

        System.out.println(set);
    }
}
