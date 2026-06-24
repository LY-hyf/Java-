package org;

import java.util.Scanner;

/**
 * 迷你DVD管理器的主启动类，负责显示菜单和处理用户交互。
 * <p>
 * 通过控制台菜单驱动，用户可选择：
 * 新增、查看、删除、借出、归还DVD，以及退出系统。
 * 每个操作完成后会等待用户输入 0 返回主菜单。
 *
 * @author hyf
 * @date 2026/6/3
 */
public class Start {
    /** 未使用的DVD数据对象 */
    DVDSet dvdSet = new DVDSet();
    /** DVD管理器，负责核心业务逻辑 */
    DVDMgr dvdMgr = new DVDMgr();
    /** 控制台输入扫描器 */
    Scanner scanner = new Scanner(System.in);
    /**
     * 显示主菜单界面。
     * <p>输出包含 6 个功能选项及退出选项。
     */
    public void showMenu() {
        System.out.println("欢迎使用迷你DVD管理器");
        System.out.println("----------------------------------");
        System.out.println("1. 新增DVD");
        System.out.println("2. 查看DVD");
        System.out.println("3. 删除DVD");
        System.out.println("4. 借出DVD");
        System.out.println("5. 归还DVD");
        System.out.println("6. 退\t出");
        System.out.println("----------------------------------");
    }

    /**
     * 启动菜单循环。
     * <p>
     * 循环显示主菜单，读取用户选择并分发到对应的业务方法。
     * 每次操作完成后调用 {@link #returnMenu()} 等待用户输入 0 返回主菜单。
     * 输入 6 退出循环，结束程序。
     */
    public void startMenu() {
        int choice;
        do {
            System.out.println("");
            showMenu();
            System.out.print("请输入您的选择：");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    dvdMgr.addDVD();
                    returnMenu();
                    break;
                case 2:
                    dvdMgr.searchDVD();
                    returnMenu();
                    break;
                case 3:
                    dvdMgr.deleteDVD();
                    returnMenu();
                    break;
                case 4:
                    dvdMgr.borrowDVD();
                    returnMenu();
                    break;
                case 5:
                    dvdMgr.returnDVD();
                    returnMenu();
                    break;
                case 6:
                    System.out.println("感谢使用");
                    break;
                default:
                    System.out.println("输入错误，请重新输入");
                    break;
            }
        } while (choice != 6);
    }

    /**
     * 返回主菜单确认方法。
     * <p>
     * 循环等待用户输入 0，输入其他数字则提示重新输入。
     * 输入 0 后返回，由外层 {@link #startMenu()} 循环自然显示主菜单。
     */
    public void returnMenu() {
        int choice;
        do {
            System.out.print("输入0返回主菜单：");
            choice = scanner.nextInt();
            scanner.nextLine();
            if (choice != 0) {
                System.out.println("输入错误，请重新输入");
            }
        } while (choice != 0);
        // 直接返回，外层 do-while 会自动调用 showMenu
    }

    /**
     * 程序入口。
     * <p>
     * 创建 Start 实例，初始化DVD库的示例数据，然后启动菜单循环。
     *
     * @param args 命令行参数（未使用）
     */
    public static void main(String[] args) {
        Start start = new Start();
        start.dvdMgr.initial();
        start.startMenu();
    }
}
