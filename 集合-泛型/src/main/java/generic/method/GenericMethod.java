package generic.method;

public class GenericMethod {
    // <T> 标识符声明这是一个泛型方法，返回值和参数都用 T
    public static <T extends Comparable<T> > T getMiddle(T ... array) {
        return array[array.length / 2];
    }

    public static void main(String[] args) {
        String middle = getMiddle("a", "b", "c");
        System.out.println(middle);
    }
}