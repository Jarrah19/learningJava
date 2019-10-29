package banyuan.e02;

/**
 * @author 崔英俊
 */
public class Rabbit extends Animal {

    private String aniName;

    public Rabbit(String aniName) {

        this.aniName = aniName;
    }


    @Override
    public void aniEat() {

        System.out.println("🐰吃草");
    }

    @Override
    public void aniSleep() {

        System.out.println("🐰三窟");
    }

    public void jump() {

        System.out.println("🐇瞎几把跳");
    }

}
