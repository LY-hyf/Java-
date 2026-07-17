package generic.method;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型下限
 * 泛型下限：指定泛型T的下限类型，即T只能是Integer及其父类
 * 使用格式：<T super 父类>
 * @author hyf
 * @date 2026/6/5
 */
public class GenericDownLimit {
    public static void addInteger(List<? super Integer> list){
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        addInteger(list);
    }
}
