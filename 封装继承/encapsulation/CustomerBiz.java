package encapsulation;

/**
 * 客户业务类,定义客户信息
 * @author hyf
 * date 2025/5/30
 * @version 2.0
 */
public class CustomerBiz {
    Customer[] customers = new Customer[30];
    int count = 0;

    /**
     * 添加客户（对象作为参数）
     */
    public void addCustomer(Customer cust) {
        if (count < customers.length) {
            customers[count] = cust;
            count++;
        }
    }

    /**
     * 显示所有客户信息
     */
    public void showCustomers() {
        System.out.println("客户信息：");
        for (int i = 0; i < count; i++) {
            Customer c = customers[i];
            System.out.println(c.name + "\t" + c.age);
            System.out.println("\t" + c.hasCard);
        }
    }
}
