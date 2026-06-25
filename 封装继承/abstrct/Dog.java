package abstrct;

/**
 * Dog 类,定义Dog状态
 * @author hyf
 * @date 2026/6/1
 */
public class Dog {
    private String name;
    private int health;
    private int love;
    private String strain;

    // 默认构造方法
    public Dog() {
        this.health = 60;
        this.love = 0;
    }

    // 带参构造方法
    public Dog(String name, String strain) {
        this.name = name;
        this.strain = strain;
        this.health = 60;
        this.love = 0;
    }

    // Getter/Setter（带健康值有效性校验）
    public void setHealth(int health) {
        if (health >= 1 && health <= 100) {
            this.health = health;
        } else {
            this.health = 60;  // 默认值
            System.out.println("健康值应该在0至100之间，默认值为60。");
        }
    }

    public void setName(String name) { this.name = name; }
    public void setStrain(String strain) { this.strain = strain; }

    // 输出信息
    public void print() {
        String strainDesc = "";
        if ("1".equals(strain)) {
            strainDesc = "聪明的拉布拉多犬";
        } else if ("2".equals(strain)) {
            strainDesc = "酷酷的雪娜瑞";
        } else {
            strainDesc = strain;
        }
        System.out.println("我的名字叫" + name + "，健康值是" + health +
                "，和主人的亲密度是" + love + "，我是一只" + strainDesc + "。");
    }
}

