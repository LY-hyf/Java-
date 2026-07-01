package polymorphism;

/**
 * 公交车类，继承自Vehicle类,实现租金计算
 * @author hyf
 * @date 2026/6/1
 */
public class Bus extends Vehicle {
    private int seats;          // 座位数
    private double rentPerDay;  // 每日租金基数

    public Bus(String brand, String type, int seats, double rentPerDay) {
        super(brand, type);
        this.seats = seats;
        this.rentPerDay = rentPerDay;
    }

    @Override
    public double calcRent(int days) {
        // 按照座位数计算租金
        double seatFactor = seats / 10.0;  // 每10座增加一倍基数
        return rentPerDay * seatFactor * days;
    }
}
