package e03;
/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class ProduceWorker implements Worker {

    private String name;
    private int produced;

    public ProduceWorker(String name, int produced) {
        this.name = name;
        this.produced = produced;
    }

    @Override
    public int salary() {
        return 50 * produced;
    }

    @Override
    public String getName() {
        return name;
    }


}
