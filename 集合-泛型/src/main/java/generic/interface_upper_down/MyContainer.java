package generic.interface_upper_down;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器实现,泛型下限示例，下限 super 不能用在接口的类型参数上，下限只能用在方法参数和变量声明里
 * @param <T> 泛型类型
 * @author hyf
 * @date 2026/6/5
 */
public class MyContainer<T> implements Container<T> {
    private List<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(list);
    }

    // 这个方法参数使用了下限
    // 可以接收任何能装 Integer 的容器（Integer、Number、Object都可以）
    public static void addNumbers(Container<? super Integer> container) {
        container.add(1);
        container.add(2);
        container.add(3);
    }

    public static void main(String[] args) {
        // 创建不同类型的容器
        Container<Integer> intContainer = new MyContainer<>();
        Container<Number> numContainer = new MyContainer<>();
        Container<Object> objContainer = new MyContainer<>();

        // 全部都可以传入 addNumbers 方法
        addNumbers(intContainer);   // Integer容器
        addNumbers(numContainer);   // Number容器（Integer的父类）
        addNumbers(objContainer);   // Object容器（Integer的父类）

        // 验证结果
        System.out.println("Integer容器: " + intContainer.getAll());  // [1,2,3]
        System.out.println("Number容器: " + numContainer.getAll());   // [1,2,3]
        System.out.println("Object容器: " + objContainer.getAll());   // [1,2,3]
    }
}
