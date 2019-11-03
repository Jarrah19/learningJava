package e02;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class WordReverse {

    public static void main(String[] args) {

        String str = "To be or not to be";

        System.out.println(wordReverse(str));
    }

    public static String wordReverse(String str) {

        String string = "";

        for (String s: str.split(" ")) {
            string += new StringBuffer().append(s).reverse().toString() + " ";
        }

        return string.trim();
    }
}
