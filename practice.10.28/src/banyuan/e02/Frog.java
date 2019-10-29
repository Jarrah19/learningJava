package banyuan.e02;

/**
 * @author 崔英俊
 */
public class Frog extends Animal {

    private String aniName;

    public Frog(String aniName) {

        this.aniName = aniName;
    }

    @Override
    public void aniEat() {

        System.out.println("🐸会吃所有嘴里塞得下的东西");
    }

    @Override
    public void aniSleep() {

        System.out.println("🐸会冬眠");
    }

    public void expandLife() {

        System.out.println("苟利国家生死以, 岂因祸福避趋之");
    }
}
