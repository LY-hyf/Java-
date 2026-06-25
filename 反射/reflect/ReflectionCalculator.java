package reflect;
import java.lang.reflect.Method;
import java.util.Scanner;

/**
 * @author 韩永发
 * @date 2026/5/29
 * @version 1.0
 */
public class ReflectionCalculator {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // 1. 通过反射获取 Class 对象
        Class<?> clazz = Class.forName("reflect.SimpleCalculator");

        // 2. 通过反射创建对象（无参构造）
        Object calculator = clazz.newInstance();

        System.out.println("========== 反射实现简单计算器 ==========");

        // 3. 获取用户输入
        System.out.print("请输入第一个数字：");
        double num1 = input.nextDouble();

        System.out.print("请输入运算符（+、-、*、/）：");
        String operator = input.next();

        System.out.print("请输入第二个数字：");
        double num2 = input.nextDouble();

        // 4. 根据运算符确定要调用的方法名
        String methodName = "";
        switch (operator) {
            case "+":
                methodName = "add";
                break;
            case "-":
                methodName = "subtract";
                break;
            case "*":
                methodName = "multiply";
                break;
            case "/":
                methodName = "divide";
                break;
            default:
                System.out.println("不支持的运算符：" + operator);
                input.close();
                return;
        }

        try {
            // 5. 通过反射获取方法
            Method method = clazz.getMethod(methodName, double.class, double.class);

            // 6. 通过反射调用方法
            double result = (double) method.invoke(calculator, num1, num2);

            // 7. 输出结果
            System.out.println("\n计算结果：" + num1 + " " + operator + " " + num2 + " = " + result);

        } catch (Exception e) {
            System.out.println("计算错误：" + e.getCause().getMessage());
        }

        input.close();
    }
}
