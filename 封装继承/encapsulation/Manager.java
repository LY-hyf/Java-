package encapsulation;

/**
 * 管理员类,输出管理员信息
 * @author hyf
 * @date 2025/5/30
 */
public class Manager {
    String username;
    String password;

    // 返回管理员信息
    public String show() {
        return "管理员信息用户名为：" + username + "    密码为：" + password;
    }
}
