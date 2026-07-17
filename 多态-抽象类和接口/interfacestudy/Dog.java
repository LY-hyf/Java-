package interfacestudy;

// 狗：实现 Eat, MakeSound, Move, Swim
public class Dog implements Eat, MakeSound, Move, Swim {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void eat() {
        System.out.println(name + " 正在啃骨头");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 汪汪叫");
    }

    @Override
    public void move() {
        System.out.println(name + " 四条腿奔跑");
    }

    @Override
    public void swim() {
        System.out.println(name + " 狗刨式游泳");
    }

    // 狗特有方法
    public void wagTail() {
        System.out.println(name + " 摇尾巴");
    }
}
