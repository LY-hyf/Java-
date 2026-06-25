package encapsulation;

/**
 * 对AutoLion类的测试
 */
public class TestLion {
    public static void main(String[] args) {
        AutoLion lion = new AutoLion();
        System.out.println(lion.showLion());
        lion.run();
        System.out.println(lion.bark());
    }
}
