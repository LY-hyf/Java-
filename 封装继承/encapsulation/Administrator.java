package encapsulation;

/**
 * 管理员类
 * @author hyf
 * @date 2025/5/30
 */
public class Administrator {
    String username;
    String password;

    public void show() {
        System.out.println("姓名: " + username + ", 密码: " + password);
    }

    public boolean login(String inputName, String inputPwd) {
        return username.equals(inputName) && password.equals(inputPwd);
    }

    public void changePassword(String newPwd) {
        this.password = newPwd;
        System.out.println("修改密码成功，您的密码为: " + password);
    }
}
