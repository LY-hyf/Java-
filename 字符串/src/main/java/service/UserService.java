package service;

import pojo.User;

import java.util.ArrayList;
import java.util.List;

/**
 * 用户业务逻辑层：处理注册、登录验证
 */
public class UserService {

    /** 模拟数据库，存储已注册用户 */
    private static final List<User> userDB = new ArrayList<>();

    /**
     * 用户注册
     *
     * @param username 用户名
     * @param password 密码
     * @param confirmPwd 确认密码
     * @return 注册成功返回 true，失败返回 false
     */
    public boolean register(String username, String password, String confirmPwd) {
        // 1. 校验用户名
        if (username == null || username.trim().length() < 3) {
            System.out.println("【失败】用户名长度不能小于3位");
            return false;
        }

        // 2. 校验密码
        if (password == null || password.length() < 6) {
            System.out.println("【失败】密码长度不能小于6位");
            return false;
        }

        // 3. 校验两次密码是否一致
        if (!password.equals(confirmPwd)) {
            System.out.println("【失败】两次密码输入不一致");
            return false;
        }

        // 4. 检查用户名是否已存在
        for (User user : userDB) {
            if (user.getUsername().equals(username)) {
                System.out.println("【失败】用户名已存在");
                return false;
            }
        }

        // 5. 保存用户
        User user = new User(username, password);
        userDB.add(user);
        System.out.println("【成功】注册成功！");
        return true;
    }

    /**
     * 用户登录验证
     *
     * @param username 用户名
     * @param password 密码
     * @return 验证通过返回 true，否则返回 false
     */
    public boolean login(String username, String password) {
        // 1. 非空校验
        if (username == null || password == null) {
            System.out.println("【失败】用户名或密码不能为空");
            return false;
        }

        // 2. 遍历查找匹配用户
        for (User user : userDB) {
            if (user.getUsername().equals(username) && user.getPassword().equals(password)) {
                System.out.println("【成功】登录成功！欢迎回来，" + username);
                return true;
            }
        }

        System.out.println("【失败】用户名或密码错误");
        return false;
    }

    /**
     * 获取已注册用户数量（辅助调试用）
     */
    public int getUserCount() {
        return userDB.size();
    }
}
