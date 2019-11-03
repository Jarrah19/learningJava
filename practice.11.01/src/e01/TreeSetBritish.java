package e01;

import java.util.TreeSet;

/**
 * @author 崔英俊
 * date: 2019-11-1
 * version 1.0
 */
public class TreeSetBritish {

    public static void main(String[] args) {

        TreeSet british = new TreeSet();

        british.add( new British("James", 95));
        british.add( new British("LeBron", 95));
        british.add( new British("Stephen", 95));
        british.add( new British("Gannis", 95));
        british.add( new British("Kevin", 95));

        for (Object b : british.toArray()) {

            System.out.println(b.toString());
        }
    }
}
