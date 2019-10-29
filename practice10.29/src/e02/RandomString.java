package e02;

/**
 * @author 崔英俊
 */

public class RandomString {

    public static void main(String[] args) {

        char[] charArray = new char[(int) (Math.random() * 6) + 4];

        int n1 = 0, n2 = 0;

        for (int i = 0; i <charArray.length; i++) {

            charArray[i] = (char) ((Math.random() * 74) + 48);
            if (charArray[i] >= 48 && charArray[i] <= 57) {
                n1++;
            }
            if ((charArray[i] >= 65 && charArray[i] <= 90)) {
                n2++;
            }
            if ((charArray[i] >= 97 && charArray[i] <= 122)) {
                n2++;
            }
        }

        System.out.println("随机生成的字符串为" + String.valueOf(charArray) + "其中有" + n1 + "个数字字符, " + n2 + "和字母字符");

    }
}
