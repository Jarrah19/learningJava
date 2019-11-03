package e02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author 崔英俊
 * date: 2019-11-1
 * version 1.0
 */
public class CountEveryWord {

    public static void main(String[] args) {

        Map map = new HashMap();
//        String str = "If you want to change your fate I think you must come to the ujiuye to learn java";

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        str = str.toLowerCase() + " ";

        for (String s : str.split(" ")) {

            int count = (str.length() - str.replace(s.toLowerCase() + " ", "").length()) / (s + " ").length();
            if ("i".equals(s)) {
                s = s.toUpperCase();
            }
            map.put(s, count);
        }

        Set set = map.keySet();

        for (Object obj : set) {

            System.out.println(obj + " 出现了 " + map.get(obj) + "次");
        }
    }
}
