package banyuan.cn;

public class StaticArray {

    static Person [] arr = new Person [10];
    static int counter = 0;

    static {

        for (int i = 0; i < 3; i ++ ) {

            arr[i] = new Person();
            arr[i].setName("米开朗琪罗");
            arr[i].setGender("男");
            arr[i].setAge(100);

            counter ++;
        }

    }


}
