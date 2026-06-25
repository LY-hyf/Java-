//package array;
//
//import java.util.Arrays;
//
///**
// * 字符串数组倒序排序
// * @author 韩永发
// * @date 2026/5/28
// * @version 1.0
// * @param originalCharacter 原始字符串数组
// * @param descendingCharacter 降序字符串数组
// * @return 降序输出
// */
//public class ReverseOrderSort {
//
//    protected String[] originalCharacter;
//
//    public ReverseOrderSort(String[] originalCharacter) {
//        this.originalCharacter = originalCharacter.clone();
//    }
//
//    public static String[] main(String[] args){
//        String[] originalCharacter = {"a","c","u","b","e","p","f","z"};
//        Arrays.sort(originalCharacter);
//        System.out.println("升序输出：" + Arrays.toString(originalCharacter));
//        String[] descendingCharacter = new String[originalCharacter.length];
//        // 倒序循环赋值
//        for (int i = 0; i < originalCharacter.length; i++) {
//            descendingCharacter[i] = originalCharacter[originalCharacter.length - 1 - i];
//        }
//        System.out.println("降序输出：" + Arrays.toString(descendingCharacter));
//        return originalCharacter;
//    }
//}

package array;

import java.util.Arrays;

/**
 * 父类：提供升序和降序功能
 * @author 韩永发
 * @date 2026/5/28
 * @version 2.0
 */
public class ReverseOrderSort {

    // 实例变量（每个对象独立，不是 static）
    protected String[] originalCharacter;

    // 构造方法
    public ReverseOrderSort(String[] originalCharacter) {
        // 克隆数组，避免外部修改
        this.originalCharacter = originalCharacter.clone();
    }

    /**
     * 获取升序序列（这是子类需要调用的核心方法）
     * @return 升序排序后的数组
     */
    public String[] getAscendingSequence() {
        String[] ascending = this.originalCharacter.clone();
        Arrays.sort(ascending);
        return ascending;
    }

    /**
     * 获取降序序列
     * @return 降序排序后的数组
     */
    public String[] getDescendingSequence() {
        String[] ascending = getAscendingSequence();
        String[] descending = new String[ascending.length];

        // 倒序循环赋值
        for (int i = 0; i < ascending.length; i++) {
            descending[i] = ascending[ascending.length - 1 - i];
        }
        return descending;
    }

    /**
     * 打印升序序列
     */
    public void printAscending() {
        String[] ascending = getAscendingSequence();
        System.out.println("升序输出：" + Arrays.toString(ascending));
    }

    /**
     * 打印降序序列
     */
    public void printDescending() {
        String[] descending = getDescendingSequence();
        System.out.println("降序输出：" + Arrays.toString(descending));
    }

    /**
     * 程序入口 main 方法（用于测试）
     */
    public static void main(String[] args) {
        String[] original = {"a", "c", "u", "b", "e", "p", "f", "z"};

        ReverseOrderSort sort = new ReverseOrderSort(original);
        sort.printAscending();
        sort.printDescending();

        // 获取升序序列（演示子类将如何使用）
        String[] ascending = sort.getAscendingSequence();
        System.out.println("获取到的升序数组：" + Arrays.toString(ascending));
    }
}