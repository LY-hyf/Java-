package reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;

/**
 * 获取构造方法
 * @author 韩永发
 * @date 2025/5/29
 * @version 1.0
 */
public class GetConstructorDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("reflect.Employee");

        // 1. 获取所有公有构造方法
        System.out.println("===== 公有构造方法 =====");
        Constructor<?>[] publicConstructors = clazz.getConstructors();
        for (Constructor<?> constructor : publicConstructors) {
            System.out.println(constructor);
        }

        // 2. 获取所有构造方法（包括私有）
        System.out.println("\n===== 所有构造方法（包括私有） =====");
        Constructor<?>[] allConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : allConstructors) {
            System.out.println(constructor + " - 修饰符：" +
                    Modifier.toString(constructor.getModifiers()));
        }

        // 3. 调用无参构造（公有）
        System.out.println("\n===== 3. 调用无参构造 =====");
        Constructor<?> noArgConst = clazz.getConstructor();
        Employee emp1 = (Employee) noArgConst.newInstance();
        emp1.display();

        // 4. 调用公有有参构造
        System.out.println("\n===== 4. 调用公有有参构造 =====");
        Constructor<?> publicConst = clazz.getConstructor(String.class);
        Employee emp2 = (Employee) publicConst.newInstance("李四");
        emp2.display();

        // 5. 调用私有构造方法（需要 setAccessible）
        System.out.println("\n===== 5. 调用私有构造方法 =====");
        Constructor<?> privateConst = clazz.getDeclaredConstructor(String.class, double.class);
        privateConst.setAccessible(true);  // 突破私有权限
        Employee emp3 = (Employee) privateConst.newInstance("王五", 8000.0);
        emp3.display();

        // 6. 调用受保护构造方法
        System.out.println("\n===== 6. 调用受保护构造方法 =====");
        Constructor<?> protectedConst = clazz.getDeclaredConstructor(String.class, double.class, String.class);
        protectedConst.setAccessible(true);
        Employee emp4 = (Employee) protectedConst.newInstance("赵六", 10000.0, "技术部");
        emp4.display();
    }
}
