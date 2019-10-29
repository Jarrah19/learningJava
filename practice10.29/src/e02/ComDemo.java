package e02;

/**
 * @author 崔英俊
 */
public class ComDemo {

    public static void main(String[] args) {

        String stri = "this is a test of java";
//          (1) 统计该字符串中字母s出现的次数
        System.out.println("该字符串中字母s出现的次数为:" + stri.indexOf('s'));
//          (2) 取出子字符串”test”
        String test = stri.substring(10, 15);
        System.out.println(test);
//          (3) 将本字符串复制到一个字符数组Char[] str中.
        char [] str = stri.toCharArray();
//          (4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。
        for (int i = 0; i < str.length; i++) {

            if (i == 0) {

                str[i] -= 32;
            }
            if (str[i] == ' ') {

                str[i + 1] -= 32;
            }
        }
        System.out.println(String.valueOf(str));
//         (5) 用两种方式实现该字符串的倒叙输出。(用StringBuffer和for循环方式分别实现)
        StringBuffer reStr = new StringBuffer(stri);
        reStr = reStr.reverse();
        System.out.println(reStr);

        char [] resStr = stri.toCharArray();
        for (int i = resStr.length - 1; i >= 0; i--) {

            System.out.print(resStr[i]);
        }
        System.out.println();
//        (6) 将本字符串转换成一个字符串数组，要求每个数组元素都是一个有意义的额英文单词,并输出到控制台
        String [] singleWords = stri.split(" ");
        for (String s: singleWords) {
            System.out.println(s);
        }

    }
}
