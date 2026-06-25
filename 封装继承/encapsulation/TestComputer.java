package encapsulation;

/**
 * 测试类
 */
public class TestComputer {
    public static void main(String[] args) {
        Computer pc = new Computer("华硕B660M", 16, 512, "三星27寸");
        pc.showConfig();
    }
}
