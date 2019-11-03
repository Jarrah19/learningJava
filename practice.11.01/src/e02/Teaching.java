package e02;

import java.util.HashMap;
import java.util.Map;

/**
 * @author 崔英俊
 * date: 2019-11-1
 * version 1.0
 */

public class Teaching {

    public static void main(String[] args) {

//      使用一个Map，以老师的名字作为键，以老师教授的课程名作为值，表示课程安排
        Map map = new HashMap();

        map.put("Tom", "CoreJava");
        map.put("John", "Oracle");
        map.put("Susan", "Oracle");
        map.put("Jerry", "JDBC");
        map.put("Jim", "CoreJava");
        map.put("Kevin", "JSP");
        map.put("Lucy", "JSP");

//      增加了一位新老师Allen 教JDBC
        map.put("Allen", "JDBC");

//      Lucy 改为教CoreJava
        map.put("Lucy", "CoreJava");

//      遍历Map，输出所有的老师及老师教授的课程
        for (Object obj : map.keySet()) {
            System.out.println(obj + "老师教" + map.get(obj));
        }

//      利用Map，输出所有教JSP 的老师
        for (Object obj : map.keySet()) {

            if ("JSP".equals(map.get(obj))) {
                System.out.println(obj);
            }
        }
    }
}
