package e03;
/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class PartTimeWorker implements Worker {

    private String name;
    private int workHours;
    private int hourly;

    public PartTimeWorker(String name, int workHours, int hourly) {
        this.name = name;
        this.workHours = workHours;
        this.hourly = hourly;
    }

    public PartTimeWorker(int workHours, int hourly) {
        this.workHours = workHours;
        this.hourly = hourly;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public void setHourly(int hourly) {
        this.hourly = hourly;
    }

    @Override
    public int salary() {

        return workHours * hourly;
    }
}
