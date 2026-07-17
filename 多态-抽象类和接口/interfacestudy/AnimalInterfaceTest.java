package interfacestudy;

// ========== 测试类 ==========
public class AnimalInterfaceTest {
    public static void main(String[] args) {
        System.out.println("========== 使用接口实现动物类 ==========\n");

        // 创建动物对象
        Dog dog = new Dog("旺财", 3);

        Eat[] eaters = {dog};
        for (Eat eater : eaters) {
            eater.eat();
        }

        MakeSound[] soundMakers = {dog};
        for (MakeSound maker : soundMakers) {
            maker.makeSound();
        }

        Move[] movers = {dog};
        for (Move mover : movers) {
            mover.move();
        }

        Swim[] swimmers = {dog};
        for (Swim swimmer : swimmers) {
            swimmer.swim();
        }

        // ========== 动物特有方法 ==========
        System.out.println("\n--- 动物特有方法 ---");
        dog.wagTail();

        // ========== 展示能力矩阵 ==========
        System.out.println("\n--- 动物能力矩阵 ---");
        System.out.println("动物\t\t吃\t叫\t移动\t游泳");
        System.out.println("狗\t\t✓\t✓\t✓\t✓");

    }
}
