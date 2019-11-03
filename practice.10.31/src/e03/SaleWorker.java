package e03;
/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class SaleWorker implements Worker {

    private String name;
    private int sales;
    private int basicSalary;

    public SaleWorker(String name, int sales, int basicSalary) {
        this.name = name;
        this.sales = sales;
        this.basicSalary = basicSalary;
    }

    public SaleWorker(int sales) {
        this.sales = sales;
    }

    public SaleWorker(int sales, int basicSalary) {
        this.sales = sales;
        this.basicSalary = basicSalary;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int salary() {

        int com = 0;

        if (this.sales < 10000) {

            com = (int) (0.1 * this.sales);
        }

        if (this.sales >= 10000 && this.sales <= 100000) {

            com = (int) (0.15 * this.sales);
        }

        if (this.sales > 100000) {

            com = (int) (0.18 * this.sales);
        }

        return this.basicSalary + com;
    }
}
