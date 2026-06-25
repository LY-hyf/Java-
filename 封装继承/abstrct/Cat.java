package abstrct;

// 子类实现抽象方法
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void sound() {
        System.out.println("喵喵喵！");
    }
}
