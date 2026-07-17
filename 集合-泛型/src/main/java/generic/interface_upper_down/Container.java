package generic.interface_upper_down;

import java.util.List;

/**
 * 容器接口
 * @param <T> 泛型类型
 */
public interface Container <T>{
    void add(T item);           // 添加元素
    List<T> getAll();           // 获取所有元素
}
