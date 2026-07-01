package polymorphism;

/**
 * 小明类，定义介绍朋友的方法
 * @author hyf
 * @date 2026/6/1
 */
public class XiaoMing {
    public void introduceFriends(Friend[] friends) {  // 多态参数
        System.out.println("小明向大家介绍朋友：");
        for (Friend f : friends) {
            f.introduce();
            System.out.println();
        }
    }
}
