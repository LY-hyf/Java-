package generic.interface_upper_down;
/**
 * 整数计算器,实现泛型Calculator接口上限
 */
public class IntegerCalculator implements Calculator<Integer>{
    @Override
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    @Override
    public Integer subtract(Integer a, Integer b) {
        return a - b;
    }

    @Override
    public Integer multiply(Integer a, Integer b) {
        return a * b;
    }

    @Override
    public Integer divide(Integer a, Integer b) {
        return a / b;
    }

    @Override
    public Integer getZero() {
        return 0;
    }

    public static void main(String[] args) {
        IntegerCalculator calculator = new IntegerCalculator();
        System.out.println(calculator.add(1, 2));
        System.out.println(calculator.subtract(1, 2));
        System.out.println(calculator.multiply(1, 2));
        System.out.println(calculator.divide(1, 2));
        System.out.println(calculator.getZero());
    }
}
