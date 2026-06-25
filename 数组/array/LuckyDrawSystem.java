package array;


import java.util.Scanner;

/**
 * 奖容富翁系统 —— 控制台交互式抽奖程序
 * <p>提供用户注册、登录验证、抽奖三大核心功能。
 * 用户注册后获得随机会员卡号，登录成功后可参与抽奖，
 * 系统随机生成5个幸运数字，匹配卡号即中奖。</p>
 *
 * @author 韩永发
 * @version 1.0
 * @date 2026/5/29
 */
public class LuckyDrawSystem {
    /** 已注册的用户名 */
    static String username = "";
    /** 已注册的密码 */
    static String password = "";
    /** 已注册的会员卡号（4位随机数，1000~9999） */
    static int cardNumber = 0;
    /** 是否已完成注册 */
    static boolean isRegistered = false;

    /** 当前是否已登录成功 */
    static boolean isLoggedIn = false;
    /** 当前登录尝试次数（最多3次） */
    static int loginAttempts = 0;

    /** 全局扫描器，用于接收用户控制台输入 */
    static Scanner sc = new Scanner(System.in);

    /**
     * 程序入口 —— 启动奖容富翁系统主循环
     * <p>循环展示菜单，根据用户选择的菜单项分发到注册、登录、抽奖功能，
     * 每次操作完成后询问用户是否继续，直到用户选择退出为止。</p>
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        System.out.println("***欢迎进入奖容富翁系统***");

        while (true) {
            showMenu();

            System.out.print("请选择菜单：");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    register();
                    break;
                case 2:
                    login();
                    break;
                case 3:
                    lottery();
                    break;
                default:
                    System.out.println("您的输入有误！");
            }

            if (!askContinue()) {
                System.out.println("系统退出，谢谢使用！");
                break;
            }
        }

        sc.close();
    }

    /**
     * 显示系统主菜单
     * <p>在控制台打印奖容富翁系统的三个功能选项菜单：
     * 1.注册、2.登录、3.抽奖。</p>
     */
    public static void showMenu() {
        System.out.println("\n******************************");
        System.out.println("1.注册");
        System.out.println("2.登录");
        System.out.println("3.抽奖");
        System.out.println("******************************");
    }

    /**
     * 用户注册
     * <p>引导用户输入用户名和密码，系统自动生成一个4位随机会员卡号（1000~9999），
     * 并将注册状态置为已注册。如果已经注册过，则提示不可重复注册。</p>
     */
    public static void register() {
        System.out.println("[奖容富翁系统 > 注册]");

        if (isRegistered) {
            System.out.println("您已注册过，请勿重复注册！");
            return;
        }

        System.out.println("请填写个人注册信息：");
        System.out.print("用户名：");
        username = sc.nextLine();
        System.out.print("密码：");
        password = sc.nextLine();

        // 生成4位随机卡号（1000-9999）
        cardNumber = (int)(Math.random() * 9000) + 1000;

        isRegistered = true;

        System.out.println("\n注册成功，请记好您的会员卡号");
        System.out.println("用户名：" + username);
        System.out.println("密码：" + password);
        System.out.println("会员卡号：" + cardNumber);
    }

    /**
     * 用户登录
     * <p>校验用户输入的用户名和密码是否与注册信息一致，最多允许尝试3次。
     * 登录成功后设置登录状态为 true；若3次均失败则锁定登录，需下次菜单再试。</p>
     */
    public static void login() {
        System.out.println("[奖容富翁系统 > 登录]");

        if (!isRegistered) {
            System.out.println("请先注册！");
            return;
        }

        loginAttempts = 0;
        while (loginAttempts < 3) {
            System.out.print("请输入用户名：");
            String inputUser = sc.nextLine();
            System.out.print("请输入密码：");
            String inputPwd = sc.nextLine();

            if (inputUser.equals(username) && inputPwd.equals(password)) {
                isLoggedIn = true;
                System.out.println("欢迎您：" + username);
                return;
            } else {
                loginAttempts++;
                System.out.println("用户名或密码错误，还剩" + (3 - loginAttempts) + "次机会");
            }
        }

        System.out.println("登录失败次数过多，请稍后再试！");
        isLoggedIn = false;
    }

    /**
     * 抽奖
     * <p>要求用户必须先注册并登录，然后输入本人的会员卡号进行验证。
     * 验证通过后，系统随机生成5个4位幸运数字，若用户的卡号与其中任意一个匹配，则中奖。</p>
     */
    public static void lottery() {
        System.out.println("[奖容富翁系统 > 抽奖]");

        if (!isRegistered) {
            System.out.println("请先注册！");
            return;
        }

        if (!isLoggedIn) {
            System.out.println("请先登录！");
            return;
        }

        System.out.print("请输入您的卡号：");
        int inputCard = sc.nextInt();

        if (inputCard != cardNumber) {
            System.out.println("卡号错误！");
            return;
        }

        // 生成5个4位随机幸运数字
        int[] luckyNumbers = new int[5];
        System.out.print("本日的幸运数字为：");
        for (int i = 0; i < 5; i++) {
            luckyNumbers[i] = (int)(Math.random() * 9000) + 1000;
            System.out.print(luckyNumbers[i] + " ");
        }
        System.out.println();

        // 判断是否中奖
        boolean isLucky = false;
        for (int num : luckyNumbers) {
            if (num == cardNumber) {
                isLucky = true;
                break;
            }
        }

        if (isLucky) {
            System.out.println("恭喜您！您是今日幸运会员！");
        } else {
            System.out.println("抱歉！您不是本日的幸运会员！");
        }
    }

    /**
     * 询问用户是否继续执行程序
     * <p>在每次主循环操作结束后调用，读取用户输入的 "y" 或 "n"，
     * 决定是继续执行下一次菜单操作还是退出程序。</p>
     *
     * @return true 表示用户输入 "y" 或 "Y"，程序继续执行；
     *         false 表示用户输入其他内容，程序退出
     */
    public static boolean askContinue() {
        System.out.print("继续吗？(y/n)：");
        String answer = sc.nextLine();
        return answer.equalsIgnoreCase("y");
    }
}