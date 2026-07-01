package polymorphism;

/**
 * 朋友父类，定义抽象方法喜欢吃的食物和喜欢的运动，以及介绍的方法
 * @author hyf
 * @date 2026/6/2
 */
public abstract class Friend {
    protected String name;
    protected String nationality;

    public Friend(String name, String nationality) {
        this.name = name;
        this.nationality = nationality;
    }

    public abstract void eat();
    public abstract void sport();

    /**
     * 介绍方法，输出姓名和国籍，以及喜欢吃的食物和喜欢的运动
     */
    public void introduce() {
        System.out.println(name + "（" + nationality + "）");
        System.out.print("  饮食："); eat();
        System.out.print("  运动："); sport();
    }
}

