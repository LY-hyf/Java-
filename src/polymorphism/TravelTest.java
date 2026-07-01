package polymorphism;

/**
 * 旅游测试类
 * @author hyf
 * @date 2026/6/1
 */
public class TravelTest {
    public static void main(String[] args) {
        XiaoMing xm = new XiaoMing();
        Friend[] friends = {new AmericanFriend("约翰"), new ChineseFriend("小强")};
        xm.introduceFriends(friends);
    }
}
