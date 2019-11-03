package e03;

import java.util.Random;

/**
 * @author 崔英俊
 * date: 2019-10-31
 * version: 1.0
 */
public class Test {

    public static void main(String[] args) {

        JewelryCompany jewelryCompany = new JewelryCompany();

        jewelryCompany.addWorker(new PartTimeWorker("Tony", 10,200));
        jewelryCompany.addWorker(new PartTimeWorker("Kevin", 10,230));
        jewelryCompany.addWorker(new SaleWorker("Ashley", 5000,3000));
        jewelryCompany.addWorker(new SaleWorker("Coco", 200000,3000));
        jewelryCompany.addWorker(new CommonWorker("Mike", 205,4000));

        jewelryCompany.showEverySalary();
        jewelryCompany.showAllSalary();

        jewelryCompany.addWorker((new ProduceWorker("Jack", 30)));

        jewelryCompany.showEverySalary();
        jewelryCompany.showAllSalary();

    }
}
