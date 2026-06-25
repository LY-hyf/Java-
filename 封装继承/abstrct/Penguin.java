package abstrct;

/**
 * Penguin 类, 企鹅类，定义了企鹅的基本属性
 * @author hyf
 * @date 2025/6/1
 */
public class Penguin {
    // 静态常量（性别）
    public static final String SEX_MALE = "雄";
    public static final String SEX_FEMALE = "雌";

    private String name;
    private int health;
    private int love;
    private String sex;

    // 默认构造方法
    public Penguin() {
        this.health = 100;
        this.love = 20;
    }

    // 带参构造方法
    public Penguin(String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.health = 100;
        this.love = 20;
    }

    public void setHealth(int health) { this.health = health; }
    public void setName(String name) { this.name = name; }
    public void setSex(String sex) { this.sex = sex; }

    // 输出信息
    public void print() {
        System.out.println("我的名字叫" + name + "，健康值是" + health +
                "，和主人的亲密度是" + love + "，性别是" + sex + "。");
    }
}
