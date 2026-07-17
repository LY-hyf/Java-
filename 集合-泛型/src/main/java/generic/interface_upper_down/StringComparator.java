package generic.interface_upper_down;

/**
 * 字符串比较器,通过返回值状态码-1,0,1进行比较
 */

public class StringComparator implements Comparator<String> {
    // 实现cpmpare泛型接口中的方法，通过字符串的compareTo方法进行比较
    @Override
    public int compare(String s1, String s2) {
        return s1.compareTo(s2);
    }

    public static void main(String[] args) {
        StringComparator comparator = new StringComparator();
        System.out.println(comparator.compare("a", "b"));
    }
}
