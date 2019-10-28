package e02;

public class Dog {

    public static void yao() {
        System.out.println("汪汪叫");
    }

    public static void yao(String str) {
        System.out.println("咬骨头，好香啊");
    }

    public static void yao (Person person) {

        if("男".equals(person.getGender())) {
            System.out.println("扑上去撕咬");
        }

        if("女".equals(person.getGender())) {
            System.out.println("舔狗舔到最后应有尽有");
        }
    }

}
