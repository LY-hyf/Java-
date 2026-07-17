package generic.method;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型上限
 * 泛型上限：指定泛型T的上限类型，即T只能是Number及其子类和子类
 * 使用格式：<T extends 父类>
 * @author hyf
 * @date 2026/6/5
 */
public class GenericUpperLimit {
    // 泛型上限：T只能是Number及其子类和子类 , 返回值为double子类，传入参数为Number及其子类
    public static <T extends Number> double sum(List<T> list){
        double sum = 0;
        for (T t : list) {
            sum += t.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(sum(list));
    }
}
