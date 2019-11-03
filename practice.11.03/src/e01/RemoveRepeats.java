package e01;

/**
 * @author 崔英俊
 * @date 2019-11-03
 * @version 1.0
 */
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
public class RemoveRepeats {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Set set = new HashSet();

        String str = sc.nextLine();

        for (char c : str.toCharArray()) {

            set.add(c);
        }

        System.out.println(set);
    }
}
