package coding3;

import java.util.Scanner;

/**
 * @author 崔英俊
 * @version 1.0
 * @date 2019/11/12
 */
public class Test {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入球员姓名");
        String input = sc.next();
        Object obj = Tool.map.get(input);

        if(obj != null) {
            System.out.println(input + "所属" + (String) obj);
        }
        else {
            System.out.println("未找到该球员");
        }
    }
}
