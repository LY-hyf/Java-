package polymorphism;

/**
 * 卡车类，继承自Vehicle类,实现租金计算
 * @author hyf
 * @date 2026/6/1
 */
public class Truck extends Vehicle {
    private double tonnage;      // 吨位
    private double ratePerTon;   // 每吨每天租金（需求说明：50元）

    public Truck(String brand, String type, double tonnage, double ratePerTon) {
        super(brand, type);
        this.tonnage = tonnage;
        this.ratePerTon = ratePerTon;
    }

    @Override
    public double calcRent(int days) {
        // 租金 = 吨位 × 每吨每天租金 × 天数
        return tonnage * ratePerTon * days;
    }
}
