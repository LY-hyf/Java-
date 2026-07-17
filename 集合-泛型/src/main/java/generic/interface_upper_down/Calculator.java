package generic.interface_upper_down;

/**
 * 计算器接口,泛型接口上限示例
 */

// 接口上限，T必须是 Number及其子类
public interface Calculator <T extends Number> {
    T add(T a, T b);
    T subtract(T a, T b);
    T multiply(T a, T b);
    T divide(T a, T b);
    T getZero();
}
