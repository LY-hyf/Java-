package polymorphism;

/**
 * 父类，提供品牌，计算租金方法
 * @author hyf
 * @date 2026/6/1
 */
public abstract class Vehicle {
    private String brand;      // 品牌
    private String type;       // 车型

    public Vehicle(String brand, String type) {
        this.brand = brand;
        this.type = type;
    }

    // 抽象方法：计算租金（子类必须实现）
    public abstract double calcRent(int days);

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public void showInfo() {
        System.out.print(brand + " " + type);
    }
}
