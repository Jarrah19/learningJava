package e03;
/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class JewelryCompany {

    private Worker[] worker;

    public JewelryCompany() {
        this.worker = new Worker[0];
    }

    public JewelryCompany(Worker[] worker) {
        this.worker = worker;
    }

    public Worker[] getWorker() {
        return worker;
    }

    public void addWorker(Worker worker) {

        Worker [] temp = new Worker[this.getWorker().length + 1];

        temp[this.getWorker().length] = worker;

        for (int i = 0; i < this.getWorker().length; i++) {

            temp[i] = this.getWorker()[i];
        }
        this.worker = temp;
    }

    public void deleteWorker(String name) {

        for (int i = 0; i < this.worker.length; i++) {

            if (name.equals(this.worker[i].getName())) {

                for (int j = i; j < this.worker.length - 1; j++) {

                    this.worker[i] = this.worker[i+1];
                }
            }
        }

        Worker [] temp = new Worker [this.worker.length - 1];

        for (int i = 0; i < temp.length; i++) {

            temp[i] = this.worker[i];
        }

        this.worker = temp;
    }

    public void showSalaryByName(String name) {

        for (int i = 0; i < this.worker.length; i++) {

            if (name.equals(this.worker[i].getName())) {

                System.out.println("姓名: " + this.worker[i].getName() + "薪水: " + this.worker[i].salary());
            }
        }
    }

    public void showEverySalary() {

        for (int i = 0; i < this.worker.length; i++) {

                System.out.println("姓名: " + this.worker[i].getName() + "薪水: " + this.worker[i].salary());

        }
    }

    public void showAllSalary() {

        int sum = 0;

        for (int i = 0; i < this.worker.length; i++) {

            sum += this.worker[i].salary();
        }

        System.out.println("所有员工薪金总和为: " + sum);
    }

}
