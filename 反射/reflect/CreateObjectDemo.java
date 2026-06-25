package reflect;

import java.lang.reflect.Constructor;

/**
 * 反射创建对象
 * @author 韩永发
 * @date 2025/12/10
 * @version 1.0
 */
public class CreateObjectDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("reflect.Product");

        // ========== 方式1：通过 newInstance() 调用无参构造 ==========
        System.out.println("========== 方式1：newInstance() 方法 ==========");
        Product product1 = (Product) clazz.newInstance();  // 需要有无参构造
        product1.display();

        // ========== 方式2：通过 Constructor 对象调用有参构造 ==========
        System.out.println("\n========== 方式2：Constructor.newInstance() 方法 ==========");
        Constructor<?> constructor = clazz.getConstructor(String.class, double.class);
        Product product2 = (Product) constructor.newInstance("iPhone 15", 5999.0);
        product2.display();

        // ========== 补充：调用私有构造方法创建对象 ==========
        System.out.println("\n========== 补充：通过私有构造方法创建对象 ==========");
        // 假设 Product 有私有构造方法，也可以通过反射调用
        // Constructor<?> privateConst = clazz.getDeclaredConstructor(String.class);
        // privateConst.setAccessible(true);
        // Product product3 = (Product) privateConst.newInstance("私有商品");
    }
}