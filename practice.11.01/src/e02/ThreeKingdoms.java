package e02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author 崔英俊
 * date: 2019-11-1
 * version 1.0
 */
public class ThreeKingdoms {

    public static void main(String[] args) {
        Set kingdoms = new HashSet();
        Map leader = new HashMap();

        Map off1 = new HashMap();
        Map off2 = new HashMap();
        Map off3 = new HashMap();


        off1.put("关羽", "赵夫人");
        off1.put("张飞", "钱夫人");
        off1.put("赵云", "孙夫人");
        off1.put("黄忠", "李夫人");
        off1.put("马超", "周夫人");

        off2.put("典韦", "吴夫人");
        off2.put("郭嘉", "郑夫人");
        off2.put("张辽", "王夫人");
        off2.put("许褚", "冯夫人");
        off2.put("荀彧", "蒋夫人");

        off3.put("周瑜", "楚夫人");
        off3.put("黄盖", "魏夫人");
        off3.put("鲁肃", "何夫人");
        off3.put("陆逊", "吕夫人");
        off3.put("吕蒙", "施夫人");

        leader.put("刘备", off1);
        leader.put("曹操", off2);
        leader.put("孙权", off3);

        kingdoms.add(off1);
        kingdoms.add(off2);
        kingdoms.add(off2);


        for (Object obj1 : kingdoms) {

            Map m1 = (Map) obj1;
            Set s1 = m1.keySet();

            for (Object obj2 : s1) {
                String str = (String) obj2;
                System.out.println(str + " 的老婆是 " + m1.get(obj2));

            }
        }
    }

}


