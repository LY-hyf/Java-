package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * 通过反射获取成员方法
 * @author 韩永发
 * @date 2026/5/29
 * @version 1.0
 */
public class GetMemberMethodDemo {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Class.forName("reflect.Calculator");
        Object obj = clazz.newInstance();

        // 1. 获取所有公有方法（包括继承的）
        System.out.println("===== 所有公有方法 =====");
        Method[] publicMethods = clazz.getMethods();
        for (Method method : publicMethods) {
            System.out.println(method.getName() + " - " +
                    Modifier.toString(method.getModifiers()));
        }

        // 2. 获取所有方法（包括私有、受保护）
        System.out.println("\n===== 所有声明的方法（包括私有） =====");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method.getName() + " - " +
                    Modifier.toString(method.getModifiers()));
        }

        // 3. 调用公有无参方法
        System.out.println("\n===== 3. 调用公有方法 showInfo =====");
        Method showMethod = clazz.getMethod("showInfo");
        showMethod.invoke(obj);

        // 4. 调用公有有参方法
        System.out.println("\n===== 4. 调用公有方法 add =====");
        Method addMethod = clazz.getMethod("add", int.class, int.class);
        int sum = (int) addMethod.invoke(obj, 10, 20);
        System.out.println("10 + 20 = " + sum);

        // 5. 调用私有方法（需要 setAccessible）
        System.out.println("\n===== 5. 调用私有方法 multiply =====");
        Method multiplyMethod = clazz.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);
        int product = (int) multiplyMethod.invoke(obj, 5, 6);
        System.out.println("5 * 6 = " + product);

        // 6. 调用受保护方法
        System.out.println("\n===== 6. 调用受保护方法 subtract =====");
        Method subtractMethod = clazz.getDeclaredMethod("subtract", int.class, int.class);
        subtractMethod.setAccessible(true);
        int diff = (int) subtractMethod.invoke(obj, 20, 8);
        System.out.println("20 - 8 = " + diff);

        // 7. 调用静态方法（不需要对象，传 null）
        System.out.println("\n===== 7. 调用静态方法 =====");
        Method staticMethod = clazz.getMethod("staticMethod");
        staticMethod.invoke(null);

        // 8. 调用带返回值的方法
        System.out.println("\n===== 8. 调用带返回值的方法 =====");
        Method getMessageMethod = clazz.getMethod("getMessage", String.class, String.class);
        String message = (String) getMessageMethod.invoke(obj, "欢迎使用", "！");
        System.out.println("返回值：" + message);
    }
}
