package e02;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class PartialReverse {

    public static void main(String[] args) {

        String str = "a34n6l8mb";

        System.out.println(partialReverse(str, 2,5));

    }

    public static String partialReverse(String str, int start, int end) {

        String part1 = str.substring(0, start);
        String part2 = str.substring(start, end);
        String part3 = str.substring(end);

        return part1 + new StringBuffer().append(part2).reverse().toString() + part3;

    }
}
