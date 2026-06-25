package abstrct;

// 抽象类
public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 抽象方法（没有方法体）
    public abstract void eat();
    public abstract void sound();

    // 普通方法
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }
}

