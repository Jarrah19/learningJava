package banyuan.com;

import java.util.Scanner;

public class PrintDiamond {

    public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	    
	int n = sc.nextInt();

        if( n % 2 == 0) {
		
		n --;
        }
	    
        /* 实心菱形 */
	    
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (((i <= n / 2 ) && ((j >= n / 2 - i) && (j <= i + n / 2))) || ((i > n/2 ) && ((j >= i - n / 2) && (j <= (2 * n - 1)- n /2 - i - 1)))) {
                    System.out.print('*');
                }
                else System.out.print(' ');
            }
            System.out.println();
        }

        System.out.println();

        /* 空心菱形 */

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (((i <= n / 2 ) && ((j == n / 2 - i) || (j == i + n / 2))) || ((i > n/2 ) && ((j == i - n / 2) || (j == (2 * n - 1)- n / 2 - i -1)))) {
                    System.out.print('*');
                }
                else System.out.print(' ');
            }
            System.out.println();
        }
    }
}
