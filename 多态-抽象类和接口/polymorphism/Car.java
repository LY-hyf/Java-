package polymorphism;

/**
 * 汽车类，继承自Vehicle类,实现租金计算
 * @author hyf
 * @date 2026/6/1
 */
public class Car extends Vehicle {
    private double dailyRent;   // 每日租金

    public Car(String brand, String type, double dailyRent) {
        super(brand, type);
        this.dailyRent = dailyRent;
    }

    @Override
    public double calcRent(int days) {
        return dailyRent * days;
    }
}
