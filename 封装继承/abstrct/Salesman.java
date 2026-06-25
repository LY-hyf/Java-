package abstrct;

/**
 * 销售人员类（封装）
 */
public class Salesman {
    private final String name;   // 姓名，不可修改

    public Salesman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // 按车辆销售（每次一辆）
    public void sellCar(Car car) {
        System.out.println("销售人员【" + name + "】销售车辆：");
        car.showInfo();
        System.out.println("销售方式：按车辆销售，数量：1辆\n");
    }

    // 按车型销售（批量）
    public void sellCarByType(String carStyle, int count) {
        System.out.println("销售人员【" + name + "】销售车辆：");
        System.out.println("汽车款式：" + carStyle);
        System.out.println("销售方式：按车型销售，数量：" + count + "辆\n");
    }
}
