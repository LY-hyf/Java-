package reflect;

// 自定义计算器类
public class Calculator {
    // 公有方法
    public int add(int a, int b) {
        System.out.println("调用公有方法 add");
        return a + b;
    }

    // 公有方法（无参）
    public void showInfo() {
        System.out.println("这是计算器类");
    }

    // 私有方法
    private int multiply(int a, int b) {
        System.out.println("调用私有方法 multiply");
        return a * b;
    }

    // 受保护方法
    protected int subtract(int a, int b) {
        System.out.println("调用受保护方法 subtract");
        return a - b;
    }

    // 静态方法
    public static void staticMethod() {
        System.out.println("调用静态方法");
    }

    // 带返回值的方法
    public String getMessage(String prefix, String suffix) {
        return prefix + "计算器" + suffix;
    }
}
