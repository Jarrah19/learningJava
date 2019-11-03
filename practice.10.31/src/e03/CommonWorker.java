package e03;
/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class CommonWorker implements Worker{

    private String name;
    private int workHour;
    private int basicSalary;

    public CommonWorker(String name, int workHour, int basicSalary) {
        this.name = name;
        this.workHour = workHour;
        this.basicSalary = basicSalary;
    }

    public CommonWorker(int workHour) {
        this.workHour = workHour;
    }

    public CommonWorker(int workHour, int basicSalary) {
        this.workHour = workHour;
        this.basicSalary = basicSalary;
    }

    public void setWorkHour(int workHour) {
        this.workHour = workHour;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int salary() {

        int com = 0;
        if (this.workHour > 196) {

            com = ((this.workHour) - 196) * 200;
        }

        return this.basicSalary + com;
    }
}
