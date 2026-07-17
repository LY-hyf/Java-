package log;

import org.apache.log4j.Logger;
import java.util.Scanner;

/**
 * 测试log4j日志功能
 * @author hyf
 * @date 2026/6/3
 */
public class Test1 {
    private static Logger logger = Logger.getLogger(Test1.class);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.print("请输入被除数：");
            int dividend = input.nextInt();
            System.out.print("请输入除数：");
            int divisor = input.nextInt();
            int result = dividend / divisor;
            System.out.println("结果是：" + result);
            System.out.println("感谢使用本程序！");
//            throw new ArithmeticException("除数为0");
        }
        catch (Exception e) {
            System.out.println("除数不能为0且必须是有效数字");
            logger.error("除数不能为0且必须是有效数字",e);
        }
        finally {
            input.close();
//            System.out.println("感谢使用本程序！");
//            logger.error("error message");
        }

    }
}
