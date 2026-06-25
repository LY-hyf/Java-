package encapsulation;

/**
 * 旅游景点
 * @author hyf
 * @since 2026-5-30
 */
public class Tourist {
    String name;
    int age;

    void show() {
        System.out.print(name + "的年龄为：" + age + "，");
        if (age < 6) {
            System.out.println("门票免费");
        } else if (age <= 18) {
            System.out.println("门票价格为：半价");
        } else if (age <= 60) {
            System.out.println("门票价格为：20元");
        } else {
            System.out.println("门票价格为：10元");
        }
    }
}
