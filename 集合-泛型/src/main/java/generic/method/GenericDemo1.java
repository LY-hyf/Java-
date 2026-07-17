package generic.method;

import java.util.Arrays;

/**
 * 泛型方法：交换数组中的两个元素
 * @author hyf
 * @date 2026/6/5
 */
public class GenericDemo1{

    public static <T> void swap(T[] array, int i, int j){
        T temp;
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5};
        swap(array, 1, 3);
        System.out.println(array[1]);
        System.out.println(array[3]);
        System.out.println("交换后");
        for(Integer i : array){
            System.out.println(i);
        }

        // 测试2：交换String数组，Arrays类包含多种操作数组的方法（如排序和搜索）。该类还包含一个静态工厂，允许数组被看作列表。
        String[] strArray = {"A", "B", "C", "D", "E"};
        System.out.println("\n交换前: " + Arrays.toString(strArray));
        swap(strArray, 0, 4);  // 交换第一个和最后一个
        System.out.println("交换后: " + Arrays.toString(strArray));
    }


}
