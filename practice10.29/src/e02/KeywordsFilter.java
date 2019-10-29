package e02;

import java.util.Arrays;

/**
 * @author 崔英俊
 */
public class KeywordsFilter {

    public static void main(String[] args) {

        String str = "瞬间爆炸, 完成三杀";

        for (int i = 0; i < getArray(keywords()).length; i++) {

            str = str.replaceAll(getArray(keywords())[i], "**");
        }

        System.out.println(str);
    }


    public static String keywords() {

        return "恐怖 爆炸 军火 色情";
    }

    public static String [] getArray(String keywords) {

        String[] words= keywords().split(" ");

        return words;
    }
}
