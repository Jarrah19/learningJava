package e01.e04;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */
import java.util.HashSet;
import java.util.ArrayList;
public class RemoveRepeatsSave {

    public static void main(String[] args) {

        HashSet set = new HashSet();
        ArrayList list = new ArrayList();

        set.add("aaa");
        set.add("bbb");
        set.add("aaa");
        set.add("abc");
        set.add("xyz");
        set.add("123");
        set.add("xyz");

        for(Object o : set.toArray()) {

            list.add((String)o);
        }
    }

}
