package e02;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */

import java.util.*;

public class CutChineseCharacter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(cutChineseCharacter(sc.next(), sc.nextInt()));

    }

    public static String cutChineseCharacter(String str, int cut) {

        if (str.getBytes()[cut - 1] < 0) {

            return str.substring(0, cut - 1);
        }
        else {
            return str.substring(0, cut);
        }
    }
}
