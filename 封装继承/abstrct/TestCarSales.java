package abstrct;

/**
 * 测试类
 * @author hyf
 * @date 2025/6/1
 */
public class TestCarSales {
    public static void main(String[] args) {
        // 创建销售人员
        Salesman salesman = new Salesman("张三");

        // 创建可售车型
        Car car1 = new Car("凯越", "KY001");
        Car car2 = new Car("君威", "JW001");

        // 按车辆销售
        salesman.sellCar(car1);
        salesman.sellCar(car2);

        // 按车型批量销售
        salesman.sellCarByType("凯越", 5);
    }
}
