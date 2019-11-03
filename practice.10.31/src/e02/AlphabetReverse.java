package e02;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class AlphabetReverse {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        sb.append("abcdefghijklmnopqrstuvwxyz");
        System.out.println(sb.reverse());

        System.out.println(sb.reverse().delete(0, 6));
    }
}
