package polymorphism;

/**
 * 美国朋友类，继承自Friend类，实现eat和sport方法
 * @author hyf
 * @date 2026/6/1
 */
public class AmericanFriend extends Friend {
    public AmericanFriend(String name) {
        super(name, "美国");
    }

    @Override
    public void eat() { System.out.println("披萨、汉堡"); }

    @Override
    public void sport() { System.out.println("网球"); }
}
