package e02;

/**
 * @author 崔英俊
 */
public class PokerGame {

    public static void main(String[] args) {

        String[] color = {"红桃", "黑桃", "方块", "草花"};
        String[] digit = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        int[] playerA;
        int[] playerB = new int[color.length * digit.length / 3];
        int[] playerC = new int[color.length * digit.length / 3];

        playerA = disCards(playerB, playerC);
        playerB = disCards(playerA, playerC);
        playerC = disCards(playerA, playerB);

        for (int i = 0; i < playerA.length; i++) {

            if ((playerA[i] - 1) % digit.length == 0) {
                playerA = getBoss(playerA, playerB, playerC);
                break;
            }
            if ((playerB[i] - 1) % digit.length == 0) {
                playerB = getBoss(playerB, playerA, playerC);
                break;
            }
            if ((playerC[i] - 1) % digit.length == 0) {
                playerC = getBoss(playerC, playerA, playerC);
                break;
            }
        }

        if (playerA.length > playerB.length) {
            System.out.print("A是地主, ");
        }
        System.out.print("A的手牌为: ");
        for (int value : playerA) {

            System.out.print(displayCard(value, color, digit) + " ");
        }

        System.out.println();
        System.out.println();

        if (playerB.length > playerC.length) {
            System.out.print("B是地主, ");
        }
        System.out.print("B的手牌为: ");
        for (int value : playerB) {

            System.out.print(displayCard(value, color, digit) + " ");
        }

        System.out.println();
        System.out.println();

        if (playerC.length > playerA.length) {
            System.out.print("C是地主, ");
        }
        System.out.print("C的手牌为: ");
        for (int value : playerC) {

            System.out.print(displayCard(value, color, digit) + " ");
        }

    }

    public static int[] disCards(int a[], int b[]) {

        int[] temp = new int[17];
        int tmp;

        outer:
        for (int i = 0; i < temp.length; ) {

            tmp = (int) (Math.random() * 54) + 1;

            for (int j = 0; j < a.length; j++) {

                if (tmp == a[j]) {
                    continue outer;
                }
                if (tmp == b[j]) {
                    continue outer;
                }
                if (tmp == temp[j]) {

                    continue outer;
                }
            }
            temp[i++] = tmp;

        }

        return temp;
    }

    public static String displayCard(int a, String[] color, String[] digit) {

        if (a == color.length * digit.length + 1) {

            return "小王";
        }
        if (a == color.length * digit.length + 2) {

            return "大王";
        }
        else {
            return color[(a - 1)/ digit.length] + "" + digit[(a - 1) % digit.length];
        }
    }

    public static int[] getBoss(int preBoss[], int peasant1[], int peasant2[]) {

        int[] boss = new int[preBoss.length + 3];

        for (int i = 0; i < preBoss.length; i++) {

            boss[i] = preBoss[i];
        }

        int temp;

        outer:
        for (int i = preBoss.length; i < boss.length; ) {

            temp = (int) (Math.random() * 54) + 1;

            for (int j = 0; j < preBoss.length; j++) {

                if (temp == preBoss[j]) {

                    continue outer;
                }

                if (temp == peasant1[j]) {

                    continue outer;
                }
                if (temp == peasant2[j]) {

                    continue outer;
                }
            }

            for (int k = preBoss.length; k < boss.length; k++) {

                if (temp == boss[k]) {

                    continue outer;
                }
            }
            boss[i++] = temp;
        }
        return boss;
    }
}
