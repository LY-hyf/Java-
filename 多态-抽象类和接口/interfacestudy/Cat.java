package interfacestudy;

// 猫：实现 Eat, MakeSound, Move
public class Cat implements Eat, MakeSound, Move {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(name + " 正在吃鱼");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 喵喵叫");
    }

    @Override
    public void move() {
        System.out.println(name + " 轻巧地走");
    }

    // 猫特有方法
    public void climb() {
        System.out.println(name + " 爬树");
    }
}
