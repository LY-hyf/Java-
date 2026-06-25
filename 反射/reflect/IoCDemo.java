package reflect;

import java.lang.annotation.*;
import java.util.*;

// 自定义注解
@Retention(RetentionPolicy.RUNTIME)
@interface Component {}

@Component
class UserService {
    public void sayHello() {
        System.out.println("Hello from UserService");
    }
}

@Component
class OrderService {
    public void createOrder() {
        System.out.println("创建订单");
    }
}

// 简易 IoC 容器
class SimpleIoC {
    private static Map<String, Object> container = new HashMap<>();

    public static void scan(String packageName) throws Exception {
        // 模拟扫描包下的类（实际需要遍历文件）
        Class<?>[] classes = {UserService.class, OrderService.class};

        for (Class<?> clazz : classes) {
            if (clazz.isAnnotationPresent(Component.class)) {
                String beanName = clazz.getSimpleName();
                // 首字母小写作为bean名称
                beanName = Character.toLowerCase(beanName.charAt(0)) + beanName.substring(1);
                Object instance = clazz.newInstance();
                container.put(beanName, instance);
            }
        }
    }

    public static Object getBean(String name) {
        return container.get(name);
    }
}

public class IoCDemo {
    public static void main(String[] args) throws Exception {
        SimpleIoC.scan("com.example");

        UserService userService = (UserService) SimpleIoC.getBean("userService");
        userService.sayHello();

        OrderService orderService = (OrderService) SimpleIoC.getBean("orderService");
        orderService.createOrder();
    }
}