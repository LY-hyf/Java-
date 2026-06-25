package encapsulation;

/**
 * 姓名排序类
 * 使用数组作为参数，对客户姓名进行排序
 * @author hyf
 * @date 2026/6/1
 */
public class NameSorter {
    /**
     * 对姓名数组进行排序（冒泡排序，按字典序升序）
     * @param names 姓名数组（数组作为参数）
     */
    public void sortNames(String[] names) {
        // 冒泡排序
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = 0; j < names.length - 1 - i; j++) {
                // 字符串比较：如果前面的字符串大于后面的，则交换
                if (names[j].compareTo(names[j + 1]) > 0) {
                    String temp = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp;
                }
            }
        }
    }
    /**
     * 显示姓名数组
     * @param names 姓名数组
     * @param title 标题
     */
    public void displayNames(String[] names, String title) {
        System.out.print(title);
        for (String name : names) {
            System.out.print(name + "    ");
        }
        System.out.println();
    }
}