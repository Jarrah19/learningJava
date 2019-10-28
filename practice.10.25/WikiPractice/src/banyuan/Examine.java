package banyuan;

/**
 * @author 崔英俊
 */
public abstract class Examine {

    private int number;
    private String title;


    public abstract boolean answerA();

    public abstract boolean answerB();

    public abstract boolean answerC();

    public abstract boolean answerD();


    public String getTitle() {

        return title;
    }

    public int getNumber() {

        return number;
    }


}
