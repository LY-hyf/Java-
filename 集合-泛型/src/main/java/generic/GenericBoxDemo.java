package generic;

/**
 * 泛型类,可以存储任意数据的类型，实现get,set,clear方法
 * @author hyf
 * @date 2026/6/5
 * @param <T>
 */
public class GenericBoxDemo <T> {
    // T 表示任意类型,也可以在方法中表示任意返回值类型
    private T content;

    public void set(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public T clear(){
        T temp = content;
        content = null;
        return temp;
    }

    public static void main(String[] args){
        GenericBoxDemo<String> stringBox = new GenericBoxDemo<>();
        // 指定String类型
        stringBox.set("Hello World");
        String str = stringBox.get();
        System.out.println(str);

        GenericBoxDemo<Integer> intBox = new GenericBoxDemo<>();
        // 指定Integer类型
        intBox.set(123);
        Integer num = intBox.get();
        System.out.println(num);

        GenericBoxDemo<Double> doubleBox = new GenericBoxDemo<>();
        // 指定Double类型
        doubleBox.set(123.456);
        Double d = doubleBox.get();
        System.out.println(d);

        // 清空后，获取值为null
        stringBox.clear();
        System.out.println(stringBox.get());

        intBox.clear();
        System.out.println(intBox.get());

        doubleBox.clear();
        System.out.println(doubleBox.get());
    }
}

