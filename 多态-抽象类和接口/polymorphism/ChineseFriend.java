package polymorphism;

/**
 * 中国朋友，继承自Friend类，实现吃喝玩乐
 * @author hyf
 * @date 2026/6/1
 */
public class ChineseFriend extends Friend {
    public ChineseFriend(String name) {
        super(name, "中国");
    }

    @Override
    public void eat() { System.out.println("川菜、粤菜、湘菜（喜欢吃辣）"); }

    @Override
    public void sport() { System.out.println("太极拳"); }
}
