package interfacestudy;

// ========== 测试类 ==========
public class CarInterfaceTest {
    public static void main(String[] args) {
        System.out.println("========== 使用接口实现汽车类 ==========\n");

        // 创建各种汽车
        FuelCar toyota = new FuelCar("丰田", "凯美瑞");

        CarRentalCompany rental = new CarRentalCompany("神州租车");

        // ========== 演示各种功能 ==========
        System.out.println("--- 燃油车演示 ---");
        toyota.start();
        toyota.accelerate(60);

        toyota.brake();
        toyota.stop();

        // ========== 能力检测 ==========
        System.out.println("\n========== 车辆能力检测 ==========");
        rental.showCarCapabilities(toyota);

        // ========== 能力矩阵 ==========
        System.out.println("\n========== 汽车能力矩阵 ==========");
        System.out.println("车型\t\t启动\t停止\t加速\t刹车\t空调\t导航\t自动驾驶\t充电\t越野");
        System.out.println("丰田凯美瑞\t✓\t✓\t✓\t✓\t✓\t✗\t✗\t✗\t✗");
        System.out.println("特斯拉Model3\t✓\t✓\t✓\t✓\t✓\t✗\t✗\t✓\t✗");
        System.out.println("宝马7系\t\t✓\t✓\t✓\t✓\t✓\t✓\t✓\t✗\t✗");
        System.out.println("路虎揽胜\t✓\t✓\t✓\t✓\t✓\t✗\t✗\t✗\t✓");

    }
}