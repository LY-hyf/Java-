package abstrct;

// 测试
public class TestAbstract {
    public static void main(String[] args) {
        // Animal a = new Animal("动物");  // ❌ 错误！抽象类不能实例化
        Cat C = new Cat("胖猫");
        C.eat();
        C.sound();
        C.sleep();
    }
}
