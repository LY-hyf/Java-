package exception;

/**
 * 测试异常
 */
public class TestException2 {
    public static void main(String[] args) {
        Person p = new Person();
        try {
            p.setAge(150); // 测试异常
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}