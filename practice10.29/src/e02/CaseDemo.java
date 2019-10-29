package e02;

/**
 * @author 崔英俊
 */
public class CaseDemo {

    public static void main(String[] args) {

        String str = "12fNeDfd38nf";

        int countCase = 0;
        int countNonCase = 0;
        String caseStr = "";
        String nonCaseStr = "";

        for(int i = 0; i < str.toCharArray().length; i++) {

            if ((str.toCharArray()[i] >= 65 && str.toCharArray()[i] <= 90)
                    ||
                    (str.toCharArray()[i] >= 97 && str.toCharArray()[i] <= 122)) {

                countCase++;
                caseStr += str.toCharArray()[i];

            }
            else {
                countNonCase++;
                nonCaseStr += str.toCharArray()[i];
            }

        }

        System.out.println(countCase + "个大小写字符, 字符串为" + caseStr +
                "\n-----------------\n" +
                countNonCase + "个非大小写字符, 字符串为" + nonCaseStr);

    }
}
