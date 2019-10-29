package banyuan.e02;

/**
 * @author 崔英俊
 */
public class Test {

    public static void main(String[] args) {

        Frog frog = new Frog("蛤");

        frog.aniEat();
        frog.aniSleep();
        frog.expandLife();

        Rabbit rabbit = new Rabbit("秃子");

        rabbit.aniEat();
        rabbit.aniSleep();
        rabbit.jump();

        Animal excited = new Frog("蛤");
        Frog a = (Frog) excited;
        a.expandLife();
    }
}
