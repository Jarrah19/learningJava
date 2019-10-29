package e02;

/**
 * @author 崔英俊
 */
public class CutString {

    public static void main(String[] args) {

        String st1 = "aa,bb,cc";
        String st3 = "aa bb cc";
        String st4 = "D:\\EclipseWorkSpace\\Day12\\src\\zhengze\\ZhengZeDemo5.java";

        String [] charSt1 = st1.split(",");
        String [] charSt2 = st3.split(" ");
        String [] charSt4 = st4.split("\\\\");

        for (String s : charSt1) {

            System.out.println(s);
        }

        for (String s : charSt2) {

            System.out.println(s);
        }

        for (String s : charSt4) {

            System.out.println(s);
        }

    }
}
