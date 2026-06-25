package reflect;

/**
 * 获取类对象的三种方式
 * @author 韩永发
 * @date 2025/5/29
 * @version 1.0
 */
public class GetClassDemo {
    public static void main(String[] args) throws Exception {

        // 方式1：通过类名.class（最安全，编译时检查）
        Class<?> clazz1 = String.class;
        System.out.println("方式1：" + clazz1.getName());

        // 方式2：通过对象.getClass()（需要先有对象）
        String string = "hello";
        Class<?> clazz2 = string.getClass();
        System.out.println("方式2：" + clazz2.getName());

        // 方式3：通过 Class.forName()（最常用，动态加载）
        Class<?> clazz3 = Class.forName("java.lang.String");
        System.out.println("方式3：" + clazz3.getName());

        // 验证三个 Class 对象是同一个
        System.out.println("\nclazz1 == clazz2 : " + (clazz1 == clazz2));
        System.out.println("clazz2 == clazz3 : " + (clazz2 == clazz3));
    }
}
