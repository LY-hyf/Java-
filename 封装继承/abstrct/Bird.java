package abstrct;

/**
 * 鸟类 - 使用final修饰名字
 * @author hyf
 * @date 2026/6/1
 */
public class Bird {
    // final修饰的名字：一旦赋值就不能修改
    private final String name;  // 名字常量
    private int health;
    private int love;

    // 构造方法中初始化final变量
    public Bird(String name) {
        this.name = name;  // 只能在构造方法中赋值一次
        this.health = 60;
        this.love = 0;
    }

    // 获取名字（没有setName方法，因为name是final不能修改）
    public String getName() {
        return name;
    }

    public void setHealthBird(int health) {
        if (health >= 1 && health <= 100) {
            this.health = health;
        } else {
            this.health = 60;
        }
    }

    public void print() {
        System.out.println("鸟的名字：" + name);
        System.out.println("健康值：" + health);
        System.out.println("亲密度：" + love);
    }

    public static void main(String[] args) {
        // 创建鸟  对象时传入名字
        Bird bird1 = new Bird("小鸟");
        Bird bird2 = new Bird("大鸟");
        Bird bird3 = new Bird("老鸟");

        System.out.println("=== 鸟的信息 ===");
        bird1.print();
        System.out.println();
        bird2.print();
        System.out.println();
        bird3.print();

        // bird1.setName("小黄");  // ❌ 错误！name是final，不能修改
    }
}
