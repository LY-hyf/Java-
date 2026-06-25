package reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 获取属性
 * @author 韩永发
 * @date 2025/5/29
 * @version 1.0
 */
public class GetFieldsDemo {
    public static void main(String[] args) throws Exception {
        // 1. 获取 Class 对象
        Class<?> clazz = Class.forName("reflect.Person");

        // 2. 创建对象
        Person person = (Person) clazz.newInstance();

        // 3. 获取公有属性（包括继承的）
        System.out.println("===== 公有属性 =====");
        Field[] publicFields = clazz.getFields();
        for(Field field : publicFields){
            System.out.println(field.getName() + "(类型: " + field.getType().getSimpleName() + ")");
        }

        // 4. 获取所有属性（包括私有、受保护、默认）
        System.out.println("\n===== 所有属性（包括私有） =====");
        Field[] allFields = clazz.getDeclaredFields();
        for (Field field : allFields) {
            System.out.println(field.getName() + " - " +
                    Modifier.toString(field.getModifiers()) + " - " +
                    field.getType().getSimpleName());
        }

        // 5. 操作公有属性
        Field nameField = clazz.getField("name");
        nameField.set(person,"张三");
        System.out.println("\n公有属性 name = " + nameField.get(person));

        // 6. 操作私有属性（需要 setAccessible(true)）
        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true);  // 暴力反射，突破私有权限
        ageField.setInt(person,18);
        System.out.println("私有属性 age = " + ageField.getInt(person));

        // 7. 操作受保护属性
        Field addressField = clazz.getDeclaredField("address");
        addressField.setAccessible(true);
        addressField.set(person,"北京市");
        System.out.println("受保护属性 address = " + addressField.get(person));

        // 8. 操作默认属性
        Field emailField = clazz.getDeclaredField("email");
        emailField.set(person,"zhangsan@example.com");
        System.out.println("默认属性 email = " + emailField.get(person));

        System.out.println("\n最终对象：" + person);
    }
}