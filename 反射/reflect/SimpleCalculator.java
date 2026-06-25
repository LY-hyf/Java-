package reflect;

// 计算器类
public class SimpleCalculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("除数不能为0！");
        }
        return a / b;
    }

    // 私有方法示例
    @SuppressWarnings("unused")
    private double power(double a, double b) {
        return Math.pow(a, b);
    }
}
