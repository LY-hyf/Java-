package interfacestudy;

// 鱼：实现 Eat, Move, Swim
public class Fish implements Eat, Move, Swim {
    private String name;
    private String color;

    public Fish(String name, String color) {
        this.name = name;
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println(name + " 正在吃鱼食");
    }

    @Override
    public void move() {
        System.out.println(name + " 摇动尾巴游动");
    }

    @Override
    public void swim() {
        System.out.println(name + " 在水中畅游");
    }
}
