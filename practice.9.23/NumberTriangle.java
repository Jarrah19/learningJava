package banyuan.com;

public class NumberTriangle {

    public static void main(String[] args) {

        for (int i = 0, n = 0; i < 4; i++) {

            for (int j = 0; j < i + 1; j++) {
                System.out.print(++n);
            }
            System.out.println();
        }
    }
}