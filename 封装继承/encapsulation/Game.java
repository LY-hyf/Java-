package encapsulation;

/**
 * 游戏类，输出游戏信息
 * @author hyf
 * @date 2025/5/30
 */
public class Game {
    String name;
    String type;
    double price;
    String publisher;

    public Game(String name, String type, double price, String publisher) {
        this.name = name;
        this.type = type;
        this.price = price;
        this.publisher = publisher;
    }

    public void showInfo() {
        System.out.println("游戏名称：" + name);
        System.out.println("游戏类型：" + type);
        System.out.println("游戏价格：" + price + "元");
        System.out.println("发行商：" + publisher);
    }
}
