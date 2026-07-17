package log;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

/**
 * 使用 Log4j 将异常信息记录到日志文件的演示类。
 *
 * <p>该类通过静态代码块加载 Log4j 配置文件，并提供了自定义的日志记录方法。
 * main 方法中模拟了三种常见异常（除零、空指针、数字格式化），
 * 演示如何捕获异常并使用 Log4j 将异常信息输出到日志文件中。</p>
 *
 * <h3>模拟的异常类型：</h3>
 * <ul>
 *     <li>{@link ArithmeticException} — 除零异常</li>
 *     <li>{@link NullPointerException} — 空指针异常</li>
 *     <li>{@link NumberFormatException} — 数字格式化异常</li>
 * </ul>
 *
 * @author hyf
 * @date 2026/6/3
 * @see Logger
 * @see PropertyConfigurator
 */
public class ExceptionToFileWithLog4j {

    /**
     * Log4j 日志记录器实例，用于输出异常日志。
     */
    private static Logger logger = Logger.getLogger(ExceptionToFileWithLog4j.class);

    static {
        // 加载 Log4j 配置文件
        PropertyConfigurator.configure("D:\\untitled3\\src\\main\\resources\\log4j.properties");
    }

    /**
     * 使用 Log4j 记录异常信息到日志文件。
     *
     * <p>如果传入的异常对象不为 {@code null}，则以 ERROR 级别记录异常消息和堆栈信息；
     * 如果为 {@code null} 则不执行任何操作。</p>
     *
     * @param e 需要记录的异常对象，可以为 {@code null}
     */
    public static void logException(Exception e) {
        if (e != null) {
            logger.error("捕获到异常：" + e.getMessage(), e);
        }
    }

    /**
     * 程序入口，依次模拟三种异常并调用 {@link #logException(Exception)} 记录到日志文件。
     *
     * @param args 命令行参数（本程序未使用）
     */
    public static void main(String[] args) {
        try {
            // 除零异常
            int result = 10 / 0;
        } catch (Exception e) {
            logException(e);
        }

        try {
            // 空指针异常
            String s = null;
            s.length();
        } catch (Exception e) {
            logException(e);
        }

        try {
            // 数字格式化异常
            int num = Integer.parseInt("abc");
        } catch (Exception e) {
            logException(e);
        }

        System.out.println("异常已记录到日志文件");
    }
}
