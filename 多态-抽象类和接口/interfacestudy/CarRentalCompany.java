package interfacestudy;

// ========== 汽车租赁公司（使用接口） ==========
public class CarRentalCompany {
    private String name;

    public CarRentalCompany(String name) {
        this.name = name;
    }

    // 多态：接受任何实现了 Start 接口的车
    public void testStart(Start car) {
        car.start();
    }
    

    // 展示车辆信息
    public void showCarCapabilities(Object car) {
        System.out.println("\n--- 车辆能力检测 ---");
        if (car instanceof Start) System.out.println("✓ 支持启动");
        if (car instanceof Stop) System.out.println("✓ 支持停止");
        if (car instanceof Accelerate) System.out.println("✓ 支持加速");
        if (car instanceof Brake) System.out.println("✓ 支持刹车");
        if (car instanceof Navigation) System.out.println("✓ 支持导航");
    }
}
