package log;

import org.apache.log4j.Logger;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 测试log4j日志功能, 结果条件控制，包含warn和error
 * @author hyf
 * @date 2026/6/3
 */
public class Test2 {
    private static Logger logger = Logger.getLogger(Test2.class);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("请输入被除数：");
            int dividend = input.nextInt();
            System.out.print("请输入除数：");
            int divisor = input.nextInt();

            if (divisor == 0) {
                logger.warn("除数不能为0");
                System.out.println("错误：除数不能为0");
            } else {
                int result = dividend / divisor;
                logger.info("计算结果为：" + result);
                System.out.println("结果是：" + result);
                System.out.println("感谢使用本程序！");
            }
        // 捕获输入非整数的情况
        } catch (Exception e) {
            logger.error("被除数和除数必须为整数");
            System.out.println("错误：请输入整数");
        } finally {
            input.close();
//            System.out.println("感谢使用本程序！");
        }
    }
}
