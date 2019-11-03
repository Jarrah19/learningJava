package e02;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author 崔英俊
 * date: 2019-11-1
 * version 1.0
 */
public class PackagingClass {

    public static void main(String[] args) {

        Map map1 = new HashMap();

        map1.put(new Integer(1), "金角大王");
        map1.put(new Integer(2), "银角大王");
        map1.put(new Integer(3), "青狮");
        map1.put(new Integer(4), "白象");
        map1.put(new Integer(5), "大鹏");

        Map map2 = new HashMap();
        map2.put(new Person("银角大王", 40), "诺维茨基");
        map2.put(new Person("大鹏金翅鸟", 35), "詹姆斯");
        map2.put(new Person("如来佛祖", 30), "汤普森");

        Set set1 = map1.keySet();
        Set set2 = map2.keySet();

        for (Object obj1 : set1) {

            System.out.println(obj1 + "----" + map1.get(obj1));
        }

        for (Object obj2 : set2) {

            System.out.println(obj2.toString() + "----" + map2.get(obj2));
        }
    }
}
