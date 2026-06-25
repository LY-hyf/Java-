package encapsulation;

/**
 * 测试管理员类
 * @author hyf
 * @date 2025/5/30
 */
public class TestAdministrator {
    public static void main(String[] args) {
        Administrator admin1 = new Administrator();
        admin1.username = "admin1";
        admin1.password = "111111";

        Administrator admin2 = new Administrator();
        admin2.username = "admin2";
        admin2.password = "222222";

        admin1.show();
        admin2.show();
    }
}
