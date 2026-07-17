package exception;

/**
 * 正常执行与频繁抛异常性能对比
 * @author hyf
 * @date 2026/6/3
 */
public class PerformanceTest {

    public static void main(String[] args) {
        // 测试1：正常执行（不抛异常）- 性能好
        long start1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            try {
                int result = 10 / 2;  // 正常计算，不抛异常
            } catch (Exception e) {
            }
        }
        long time1 = System.nanoTime() - start1;
        System.out.println("正常执行耗时: " + time1 + " ns");

        // 测试2：频繁抛异常 - 性能差
        long start2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            try {
                int result = 10 / 0;  // 每次都抛异常
            } catch (Exception e) {
            }
        }
        long time2 = System.nanoTime() - start2;
        System.out.println("频繁抛异常耗时: " + time2 + " ns");

        // 结论：异常只在真正发生时才有性能开销
        // 正常情况（不抛异常）性能几乎无影响
    }
}
