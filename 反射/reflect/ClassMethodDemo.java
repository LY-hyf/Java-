package reflect;

import java.lang.reflect.*;
import java.util.Arrays;

/**
 * Class 类常用方法
 * @author 韩永发
 * @date 2025/5/29
 */
public class ClassMethodDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("reflect.Student");

        // 1. 获取类名
        System.out.println("类名：" + clazz.getName());
        System.out.println("简单类名：" + clazz.getSimpleName());

        // 2. 获取包名
        System.out.println("包名：" + clazz.getPackage().getName());

        // 3. 获取修饰符
        int modifiers = clazz.getModifiers();
        System.out.println("修饰符：" + Modifier.toString(modifiers));

        // 4. 获取父类
        Class<?> superclass = clazz.getSuperclass();
        System.out.println("父类：" + superclass.getName());

        // 5. 获取接口
        Class<?>[] interfaces = clazz.getInterfaces();
        System.out.println("实现的接口：" + Arrays.toString(interfaces));

        // 6. 获取所有构造方法
        System.out.println("\n===== 所有构造方法 =====");
        Constructor<?>[] constructors = clazz.getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        // 7. 获取所有方法
        System.out.println("\n===== 所有方法 =====");
        Method[] allmethods = clazz.getDeclaredMethods();
        for (Method method : allmethods) {
            System.out.println(method.getName() + " - " +
                    Modifier.toString(method.getModifiers()));
        }

        // 8. 获取所有属性
        System.out.println("\n===== 所有属性 =====");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " - " +
                    field.getType().getSimpleName() + " - " +
                    Modifier.toString(field.getModifiers()));
        }
    }
}
