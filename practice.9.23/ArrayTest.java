package banyuan.com;

public class ArrayTest {

    public static void main(String[] args) {

        int [] oldArr = {1, 3, 4, 5, 0, 0, 6, 6, 0, 5, 4, 7, 6, 7, 0, 5};

        int quantityOfZero = 0;

        for (int i = 0; i < oldArr.length; i++) {

            if (oldArr[i] == 0) {

                quantityOfZero++;
            }
        }

        int []newArr = new int [oldArr.length -  quantityOfZero];

        for (int i = 0, j = 0; i < oldArr.length; i++) {

            if (oldArr[i] != 0) {

                newArr[j++] = oldArr[i];
            }
        }

        for(int i = 0; i < newArr.length / 2; i++) {

            newArr[i] = newArr[i] + newArr[newArr.length - i - 1];
            newArr[newArr.length - i - 1] = newArr[i] - newArr[newArr.length - i - 1];
            newArr[i] = newArr[i] - newArr[newArr.length - i - 1];
        }

        int max = -2147483648;
        int min = 2147483647;

        for (int i = 0; i < newArr.length; i++) {

            if (newArr[i] > max) max = newArr[i];
            if (newArr[i] < min) min = newArr[i];
        }
    }
}
