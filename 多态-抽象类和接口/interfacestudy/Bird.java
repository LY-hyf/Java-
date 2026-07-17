package interfacestudy;

// 鸟：实现 Eat, MakeSound, Move, Fly
public class Bird implements Eat, MakeSound, Move, Fly {
    private String name;
    private String species;

    public Bird(String name, String species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public void eat() {
        System.out.println(name + " 正在吃虫子");
    }

    @Override
    public void makeSound() {
        System.out.println(name + " 叽叽喳喳");
    }

    @Override
    public void move() {
        System.out.println(name + " 用爪子走路");
    }

    @Override
    public void fly() {
        System.out.println(name + " 展翅飞翔");
    }
}
