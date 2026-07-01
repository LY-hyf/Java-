package polymorphism;

/**
 * 汽车租赁的测试类
 * @author hyf
 * @date 2026/6/1
 */
public class Test {
    public static void main(String[] args) {
        RentCompany company = new RentCompany("神州租车");

        // 需求：租5天
        System.out.println("=== 需求计算：宝马2辆 + 别克1辆 + 金龙1辆，租5天 ===");
        Vehicle[] vehicles = new Vehicle[4];
        vehicles[0] = new Car("宝马", "轿车", 500);
        vehicles[1] = new Car("宝马", "轿车", 500);
        vehicles[2] = new Car("别克", "商务舱", 600);
        vehicles[3] = new Bus("金龙", "客车", 34, 80);

        double total = company.calcTotalRent(vehicles, 5);

        // 扩展：卡车需求
        System.out.println("\n=== 新增卡车需求：卡车5吨，租3天 ===");
        Vehicle[] trucks = new Vehicle[1];
        trucks[0] = new Truck("解放", "卡车", 5, 50);
        company.calcTotalRent(trucks, 3);

         //改进系统：控制台交互（可选）
        company.calcTotalRentInteractive();
    }
}
